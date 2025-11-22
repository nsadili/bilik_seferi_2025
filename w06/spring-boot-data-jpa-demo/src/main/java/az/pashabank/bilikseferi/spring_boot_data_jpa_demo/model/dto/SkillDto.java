package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
public class SkillDto {

    private Integer id;

    private String name;
}
