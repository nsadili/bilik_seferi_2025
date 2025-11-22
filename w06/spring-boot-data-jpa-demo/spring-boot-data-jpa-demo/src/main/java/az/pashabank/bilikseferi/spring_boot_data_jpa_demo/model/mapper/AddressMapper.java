package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.AddressDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.AddressResponseDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressResponseDto toDto(AddressEntity addressEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "employee", ignore = true)
    AddressEntity toEntity(AddressDto addressDto);
}
