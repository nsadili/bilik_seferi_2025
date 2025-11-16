package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.SkillEntity;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.AddressMapper;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperMapStruct;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV2;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV1;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.AddressRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.DepartmentRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.SkillRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
//@Setter
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AddressMapper addressMapper;
    private final EmployeeMapperMapStruct employeeMapper;
    private final DepartmentRepository departmentRepository;
    private final SkillRepository skillRepository;

    @Transactional
    @Override
    public List<EmployeeResponseDto> getAllEmps() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapperMapStruct.INSTANCE::toResponseDto)
                .toList();
    }

    @Override
    public EmployeeResponseDto save(EmployeeSaveRequestDto employeeSaveRequestDto) {
        var address = addressMapper.toEntity(employeeSaveRequestDto.getAddress());

        var employeeToInsert = employeeMapper.toEntity(employeeSaveRequestDto);

        var deptObj = departmentRepository.findById(employeeSaveRequestDto.getDeptId())
                .orElseThrow(() -> new RuntimeException("Dept id is not found"));

        employeeToInsert.setDepartment(deptObj);

        var skills = new HashSet<>(skillRepository.findAllById(employeeSaveRequestDto.getSkillIds()));

        employeeToInsert.setSkills(skills);

        var newEntity = employeeRepository.save(employeeToInsert);

        return employeeMapper.toResponseDto(newEntity);
    }

    @Override
    public EmployeeResponseDto getById(Integer empId) {
        var res = employeeRepository.findById(empId);

        return EmployeeMapperMapStruct.INSTANCE.toResponseDto(res.orElse(null));
    }
}
