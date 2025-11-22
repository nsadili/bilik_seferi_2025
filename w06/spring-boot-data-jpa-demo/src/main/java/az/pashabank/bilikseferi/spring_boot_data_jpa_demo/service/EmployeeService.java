package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeUpdateRequestDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDto> getAllEmps()
            ;

    EmployeeResponseDto save(EmployeeSaveRequestDto employeeSaveRequestDto);

    EmployeeResponseDto getById(Integer empId);

    void deleteById(Integer id);

    EmployeeResponseDto updateById(Integer id, EmployeeUpdateRequestDto employeeUpdateRequestDto) throws Exception;

}
