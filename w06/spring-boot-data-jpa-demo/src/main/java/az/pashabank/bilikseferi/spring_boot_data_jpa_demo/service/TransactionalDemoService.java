package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.AddressMapper;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperMapStruct;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.DepartmentRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.SkillRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionalDemoService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final SkillRepository skillRepository;
    private final AddressMapper addressMapper;
    private final EmployeeMapperMapStruct employeeMapper;

    /**
     * Bütün addımlar tək tranzaksiyada gedir:
     * 1) Address mapla → Employee yarat → Department bağla → Skill-ləri bağla → SAVE
     * 2) Əgər fail=true gəlibsə, sonda qəsdən Exception at → ROLLBACK hamısı geri dönür
     */
    @Transactional
    public EmployeeResponseDto hireEmployeeAtomic(EmployeeSaveRequestDto dto, boolean fail) {
        var address = addressMapper.toEntity(dto.getAddress());

        var employee = employeeMapper.toEntity(dto);

        var dept = departmentRepository.findById(dto.getDeptId())
                .orElseThrow(() -> new IllegalArgumentException("Department tapılmadı: " + dto.getDeptId()));
        employee.setDepartment(dept);

        var skills = new HashSet<>(skillRepository.findAllById(dto.getSkillIds()));
        employee.setSkills(skills);

        var saved = employeeRepository.save(employee);

        // BURADA qəsdən səhv: rollback-i nümayiş etdirmək üçün
        if (fail) {
            throw new IllegalStateException("Qəsdən səhv atıldı: demo rollback");
        }

        return employeeMapper.toResponseDto(saved);
    }

    @Transactional(Transactional.TxType.SUPPORTS) // readOnly ekvivalenti
    public List<EmployeeResponseDto> listAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::toResponseDto)
                .toList();
    }
}

