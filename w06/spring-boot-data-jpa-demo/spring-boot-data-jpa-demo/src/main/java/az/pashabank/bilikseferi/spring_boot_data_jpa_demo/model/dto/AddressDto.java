package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String street;
    private String city;
    private String country;
}
