package tmosq.com.androidworkshop.model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @SerializedName("id")
    private Integer id;

    private String name;
    private Double minimumSalary;
    private Double maximumSalary;
    private String position;
    private String description;
}
