package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddressDto {

    @NotBlank
    @Size(min = 5, max = 50)
    private String street;

    @NotBlank
    @Size(min = 5, max = 30)
    private String city;

    @NotBlank
    @Size(min = 5, max = 40)
    private String country;
}
