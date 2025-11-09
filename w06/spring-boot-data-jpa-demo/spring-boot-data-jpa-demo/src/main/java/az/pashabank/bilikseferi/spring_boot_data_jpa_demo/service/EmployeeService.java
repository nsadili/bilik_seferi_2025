package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDto> getAllEmps();
    EmployeeResponseDto save(EmployeeSaveRequestDto employeeSaveRequestDto);

    EmployeeResponseDto getById(Integer empId);
}
