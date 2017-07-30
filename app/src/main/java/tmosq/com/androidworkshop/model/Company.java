package tmosq.com.androidworkshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Integer id;
    private String name;
    private Double minimumSalary;
    private Double maximumSalary;
    private String position;
    private String description;
}
