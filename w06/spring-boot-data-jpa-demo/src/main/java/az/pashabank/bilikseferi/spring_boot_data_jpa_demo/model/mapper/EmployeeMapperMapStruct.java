package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeSaveRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.EmployeeUpdateRequestDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {AddressMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmployeeMapperMapStruct {
//    EmployeeMapperMapStruct INSTANCE = Mappers.getMapper(EmployeeMapperMapStruct.class);

    EmployeeResponseDto toResponseDto(EmployeeEntity entity);

//    @Mapping(target = "firstName", source = "requestDto.ad")
//    @Mapping(target = "lastName", source = "requestDto.soyad")
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "address", source = "addressEntity")
//    EmployeeEntity toEntity(EmployeeSaveRequestDto requestDto, AddressEntity addressEntity);

    @Mapping(target = "firstName", source = "ad")
    @Mapping(target = "lastName", source = "soyad")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "skills", ignore = true)
    EmployeeEntity toEntity(EmployeeSaveRequestDto requestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "skills", ignore = true)
    @Mapping(target = "address", ignore = true)
    void updateDtoToEntity(EmployeeUpdateRequestDto requestDto, @MappingTarget EmployeeEntity entity);

}
