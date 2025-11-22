package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<SkillEntity,Integer> {
}
