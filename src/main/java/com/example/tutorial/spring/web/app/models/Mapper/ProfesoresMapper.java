package com.example.tutorial.spring.web.app.models.Mapper;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {CursosMapper.class})
public interface ProfesoresMapper extends EntityMapper<ProfesoresDTO, Profesores>{


        @Mapping(source="curso.id",target = "cursoId")
        ProfesoresDTO toDto(Profesores profesores);
        @Mapping(source="cursoId",target = "curso")
        Profesores toEntity(ProfesoresDTO profesoresDTO);

        default Profesores fromId(Long id) {
                if (id == null) {
                        return null;
                }
                Profesores profesores = new Profesores();
                profesores.setId(id);
                return profesores;
        }
}
