package tmosq.com.androidworkshop.helper;


import android.content.Context;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
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
        InputStream inputStream = context.getResources().openRawResource(+ R.raw.companies);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        Type listType = new TypeToken<ArrayList<Company>>() {
        }.getType();

        GsonBuilder gsonBuilder = new GsonBuilder();

        Gson gson = gsonBuilder.create();

        return gson.fromJson(bufferedReader, listType);
    }
}
