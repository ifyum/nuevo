package com.example.tutorial.spring.web.app.models.Mapper;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.models.dto.CursosDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProfesoresMapper.class})
public interface CursosMapper  extends EntityMapper<CursosDTO, Cursos>{


            @Mapping(source="profesor.id",target = "profesorId")
    CursosDTO toDto(Cursos cursos);
              @Mapping(source="profesorId",target = "profesor")
    Cursos toEntity(CursosDTO cursosDTO);
    default Cursos fromId(Long id) {
        if (id == null) {
            return null;
        }
        Cursos cursos = new Cursos();
        cursos.setId(id);
        return cursos;
    }

}
