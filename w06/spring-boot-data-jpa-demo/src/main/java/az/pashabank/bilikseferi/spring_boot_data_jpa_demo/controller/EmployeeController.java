package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.controller;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeUpdateRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    public void setEmployeeService(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    //    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public EmployeeResponseDto saveEmployee(@RequestBody @Valid EmployeeSaveRequestDto employeeSaveRequest) {
        return employeeService.save(employeeSaveRequest);
    }

    //    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping(value = "/list")
    public List<EmployeeResponseDto> listAll() {
        return employeeService.getAllEmps();
    }

    @GetMapping("/byId/{id}")
    public EmployeeResponseDto getEmployee(@PathVariable("id") Integer empId) {
        return employeeService.getById(empId);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteById(id);
    }

    //employee id
    //updated employee info
    @PutMapping("/{id}")
    public void updateEmployee(@RequestBody EmployeeUpdateRequestDto employeeUpdateRequestDto,
                               @PathVariable Integer id) throws Exception {
        employeeService.updateById(id, employeeUpdateRequestDto);
    }
}
