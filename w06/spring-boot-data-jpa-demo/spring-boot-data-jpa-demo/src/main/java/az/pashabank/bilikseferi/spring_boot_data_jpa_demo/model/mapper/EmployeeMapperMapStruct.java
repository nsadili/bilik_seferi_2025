package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapperMapStruct {
    EmployeeMapperMapStruct INSTANCE = Mappers.getMapper(EmployeeMapperMapStruct.class);

    EmployeeResponseDto toResponseDto(EmployeeEntity entity);

    @Mapping(target = "firstName", source = "ad")
    @Mapping(target = "lastName", source = "soyad")
    @Mapping(target = "id", ignore = true)
    EmployeeEntity toEntity(EmployeeSaveRequestDto requestDto);
}
