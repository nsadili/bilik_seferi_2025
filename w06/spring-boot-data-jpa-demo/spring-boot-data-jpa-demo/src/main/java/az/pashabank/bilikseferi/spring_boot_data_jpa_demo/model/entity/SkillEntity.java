package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "skill")
public class SkillEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "skills")
    @ToString.Exclude
    @JsonIgnore
//    @JoinTable(name = "skills_employees",
//            joinColumns = {@JoinColumn(name = "skill_id")},
//            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Set<EmployeeEntity> employees;
}
