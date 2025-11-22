package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddressDto {
    @NotBlank
    @Size(max = 50)
    private String street;

    @NotBlank
    @Size(max = 50)
    private String city;
    
    @NotBlank
    @Size(max = 50)
    private String country;
}
