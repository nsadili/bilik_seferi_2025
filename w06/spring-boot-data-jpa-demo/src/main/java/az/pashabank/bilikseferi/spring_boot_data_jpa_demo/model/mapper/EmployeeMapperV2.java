package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;

public enum EmployeeMapperV2 {
    INSTANCE;

    public EmployeeResponseDto toResponseDto(EmployeeEntity entity) {
        return EmployeeResponseDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .hireDate(entity.getHireDate())
                .email(entity.getEmail()).build();
    }

    public EmployeeEntity toEntity(EmployeeSaveRequestDto dto) {
        return EmployeeEntity.builder()
                .firstName(dto.getAd())
                .lastName(dto.getSoyad())
                .salary(dto.getSalary())
                .hireDate(dto.getHireDate())
                .email(dto.getEmail())
                .build();
    }
}
