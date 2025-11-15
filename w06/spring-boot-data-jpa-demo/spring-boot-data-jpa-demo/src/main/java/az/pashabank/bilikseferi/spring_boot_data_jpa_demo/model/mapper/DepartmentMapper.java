package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.DepartmentResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentResponseDto toDto(DepartmentEntity department);

}
