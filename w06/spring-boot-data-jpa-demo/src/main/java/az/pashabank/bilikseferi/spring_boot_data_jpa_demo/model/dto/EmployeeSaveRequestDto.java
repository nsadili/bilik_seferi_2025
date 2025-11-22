package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSaveRequestDto {
    @NotBlank
    @Size(min = 2, max = 30)
    private String ad;

    @NotBlank
    @Size(min = 2, max = 30)
    private String soyad;

    @Email
    private String email;

    @NotNull
    @Min(3000)
    @DecimalMax(value = "50000", inclusive = false)
    private Double salary;

    @NotNull
    @Past
    private LocalDate hireDate;

    @NotNull
    private Integer deptId;

    private Set<Integer> skillIds;

    @NotNull
    @Valid
    private AddressDto address;

}
