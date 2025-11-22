package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    @Query("SELECT e FROM EmployeeEntity e WHERE e.lastName = :lastName")
    List<EmployeeEntity> findByLastName(@Param("lastName") String lastName);

    List<EmployeeEntity> findByLastNameContainingIgnoreCase(String lastName);

    @Query(value = """
            select * from employee1 where last_name like  concat('%', :lastName, '%')
            """, nativeQuery = true)
    List<EmployeeEntity> getEmployeeByLastName(String lastName);

    @Query("select e from AddressEntity e where e.city like concat('%', :lastName, '%')")
    List<EmployeeEntity> getEmployeeByLastNameV2(String lastName);

    List<EmployeeEntity> findByFirstNameAndLastName(String firstName, String lastName);

    // select * from employee1 where last_name = '%huseyn%'

}
