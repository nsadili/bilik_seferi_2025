package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSaveRequestDto {
    private String ad;
    private String soyad;
    private String email;
    private Double salary;
    private LocalDate hireDate;

    private Integer deptId;

    private Set<Integer> skillIds;

    private AddressDto address;

}
