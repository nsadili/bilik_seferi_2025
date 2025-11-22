package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
}
