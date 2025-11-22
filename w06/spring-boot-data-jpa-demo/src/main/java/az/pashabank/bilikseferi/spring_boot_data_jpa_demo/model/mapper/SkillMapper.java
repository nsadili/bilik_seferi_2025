package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.mapper;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.SkillDto;
import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.entity.SkillEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SkillMapper {

    SkillDto toDto(SkillEntity entity);
}
