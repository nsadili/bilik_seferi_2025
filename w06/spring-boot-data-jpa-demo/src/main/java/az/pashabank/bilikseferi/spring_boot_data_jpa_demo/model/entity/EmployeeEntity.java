package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

@Entity
@Table(name = "employee1")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;

    @Column(name = "maas")
    private Double salary;
    private LocalDate hireDate;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private AddressEntity address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dept_id", referencedColumnName = "id")
    private DepartmentEntity department;

    @ManyToMany
    @JoinTable(
            name = "skills_employees",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id")}
    )
    @JsonIgnore
    @Builder.Default
    private Set<SkillEntity> skills = Set.of();
}
