package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String city;

    private String country;

    @OneToOne(mappedBy = "address")
    private EmployeeEntity employee;
}
