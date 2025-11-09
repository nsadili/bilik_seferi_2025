package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperMapStruct;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV2;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV1;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Setter
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeResponseDto> getAllEmps() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapperMapStruct.INSTANCE::toResponseDto)
                .toList();
    }

    @Override
    public EmployeeResponseDto save(EmployeeSaveRequestDto employeeSaveRequestDto) {
        var newEntity = employeeRepository.save(
                EmployeeMapperV2.INSTANCE.toEntity(employeeSaveRequestDto)
        );

        return EmployeeMapperV1.toResponseDto(newEntity);
    }

    @Override
    public EmployeeResponseDto getById(Integer empId) {
        var res = employeeRepository.findById(empId);

        return EmployeeMapperMapStruct.INSTANCE.toResponseDto(res.orElse(null));
    }
}
