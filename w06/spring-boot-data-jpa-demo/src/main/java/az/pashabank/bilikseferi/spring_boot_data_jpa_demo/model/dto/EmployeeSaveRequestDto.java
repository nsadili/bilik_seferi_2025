package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSaveRequestDto {

    @NotBlank
    @Size(min = 3, max = 30)
    private String ad;

    @NotBlank
    @Size(min = 2, max = 30)
    private String soyad;

    @NotNull
    @Email
    private String email;

    @NotNull
    @DecimalMin(value = "3000")
    @DecimalMax("50000")
    private Double salary;

    @NotNull
    @PastOrPresent
    private LocalDate hireDate;

    @NotNull
    private Integer deptId;

    private Set<@NotNull Integer> skillIds = new HashSet<>();

    @Valid
    private AddressDto address;
}
