package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect.annotation.CustomCacheable;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect.annotation.CustomRetryable;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.exceptions.EmployeeNotFoundException;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeUpdateRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.AddressMapper;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperMapStruct;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.DepartmentRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.SkillRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

@Component
//@Setter
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AddressMapper addressMapper;
    private final EmployeeMapperMapStruct employeeMapper;
    private final DepartmentRepository departmentRepository;
    private final SkillRepository skillRepository;

    @Override
    @CustomCacheable
    @CustomRetryable
    public List<EmployeeResponseDto> getAllEmps() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::toResponseDto)
                .toList();
    }

    @Override
    public EmployeeResponseDto save(EmployeeSaveRequestDto employeeSaveRequestDto) {
        var address = addressMapper.toEntity(employeeSaveRequestDto.getAddress());

        var employeeToInsert = employeeMapper.toEntity(employeeSaveRequestDto);

        var deptObj = departmentRepository.findById(employeeSaveRequestDto.getDeptId())
                .orElseThrow(() -> new RuntimeException("Dept id is not found"));

        employeeToInsert.setDepartment(deptObj);

        if (!employeeSaveRequestDto.getSkillIds().isEmpty()) {
            var skills = new HashSet<>(skillRepository.findAllById(employeeSaveRequestDto.getSkillIds()));
            employeeToInsert.setSkills(skills);
        }

        var newEntity = employeeRepository.save(employeeToInsert);

        return employeeMapper.toResponseDto(newEntity);
    }

    @Override
    public EmployeeResponseDto getById(Integer empId) {
        var res = employeeRepository.findById(empId);

        return employeeMapper.toResponseDto(res.orElse(null));
    }

    public void deleteById(Integer id) {
//        if(employeeRepository.findById(id).isEmpty())
//            throw new EmployeeNotFoundException("Employee with id " + id + " does not exist");

        if (!employeeRepository.existsById(id))
            throw new EmployeeNotFoundException("Employee with id " + id + " does not exist");

        employeeRepository.deleteById(id);
    }

    @Override
    @Transactional
    @SneakyThrows
    public EmployeeResponseDto updateById(Integer id, EmployeeUpdateRequestDto employeeUpdateRequestDto) throws Exception {

//        try {
        var employee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " does not exist"));

        employeeMapper.updateDtoToEntity(employeeUpdateRequestDto, employee);

        var response = employeeMapper.toResponseDto(employeeRepository.save(employee));

        if (response.getSalary() > 1000)
            throw new Exception("Salary is greater than 1000");

        return response;

//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException("smth");
//        }
    }
}
