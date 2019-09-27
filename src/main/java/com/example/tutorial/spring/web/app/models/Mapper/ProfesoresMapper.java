package com.example.tutorial.spring.web.app.models.Mapper;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {})
public interface ProfesoresMapper extends EntityMapper<ProfesoresDTO, Profesores>{


//        @Mapping(source="cursos.id",target = "cursosId")
        ProfesoresDTO toDto(Profesores profesores);
//        @Mapping(source="cursosId",target = "cursos")
        Profesores toEntity(ProfesoresDTO profesoresDTO);

}
