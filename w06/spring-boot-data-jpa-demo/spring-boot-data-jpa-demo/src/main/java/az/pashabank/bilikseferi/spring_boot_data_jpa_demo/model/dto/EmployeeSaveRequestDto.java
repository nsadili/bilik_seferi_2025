package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import lombok.*;

import java.time.LocalDate;

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
}
