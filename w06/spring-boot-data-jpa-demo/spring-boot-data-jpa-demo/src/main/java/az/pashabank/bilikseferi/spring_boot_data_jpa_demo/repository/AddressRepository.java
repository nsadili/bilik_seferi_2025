package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
