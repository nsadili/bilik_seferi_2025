package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.controller;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperMapStruct;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/fake")
@RequiredArgsConstructor
public class FakeController {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapperMapStruct employeeMapper;

    @GetMapping("/search/by-firstname")
    List<EmployeeResponseDto> getEmployees(@RequestParam("lastName") String lastName) {
//        return employeeRepository.findByLastNameContainingIgnoreCase(lastName).stream()
//                .map(employeeMapper::toResponseDto)
//                .collect(Collectors.toList());

//        return employeeRepository.getEmployeeByLastName(lastName).stream()
//                .map(employeeMapper::toResponseDto)
//                .collect(Collectors.toList());

        return employeeRepository.getEmployeeByLastNameV2(lastName).stream()
                .map(employeeMapper::toResponseDto)
                .collect(Collectors.toList());
    }


    // ..../fake/huseynov
    // ..../fake/3
}
