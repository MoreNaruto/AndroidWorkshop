package tmosq.com.androidworkshop.helper;


import android.content.Context;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import tmosq.com.androidworkshop.R;
import tmosq.com.androidworkshop.model.Company;

public class CompanyConverter {
    private Context context;

    public CompanyConverter(Context context) {
        this.context = context;
    }

    public List<Company> getAllCompanies() {
        JsonArray jsonObject = new JsonArray();

        try {
            JsonParser parser = new JsonParser();
            JsonElement jsonElement = parser.parse(new FileReader("/Users/tmosq/Projects/AndroidWorkshop/app/src/main/java/tmosq/com/androidworkshop/helper/companies.json"));
            jsonObject = jsonElement.getAsJsonArray();
        } catch (FileNotFoundException e) {

        } catch (IOException ioe){

        }
        
        Type listType = new TypeToken<ArrayList<Company>>() {
        }.getType();

        GsonBuilder gsonBuilder = new GsonBuilder();

        Gson gson = gsonBuilder.create();

        return gson.fromJson(jsonObject, listType);
    }
}
