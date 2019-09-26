package com.example.tutorial.spring.web.app.models.Mapper;

import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring", uses = {  })
public interface ProfesoresMapper extends EntityMapper<ProfesoresDTO, Profesores>{

        ProfesoresDTO toDto(Profesores profesores);

        Profesores toEntity(ProfesoresDTO profesoresDTO);

}
