package com.example.tutorial.spring.web.app.models.Services;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.Mapper.ProfesoresMapper;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import com.example.tutorial.spring.web.app.repository.CursosRepository;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("profesoresService")
//@Transac1tional

public class ProfesoresService {
    private final Logger log = LoggerFactory.getLogger(ProfesoresService.class);


    private ProfesoresRepository profesoresRepository;

private final ProfesoresMapper profesoresMapper;

    public ProfesoresService(

            ProfesoresRepository profesoresRepository,
            CursosRepository cursosRepository,
            ProfesoresMapper profesoresMapper) {

        this.profesoresRepository = profesoresRepository;

        this.profesoresMapper = profesoresMapper;
    }

    public List<ProfesoresDTO> ListarProfesores(){

        log.debug("weada:"+profesoresRepository.findAll().stream().map(this.profesoresMapper::toDto).collect(Collectors.toList()));
        return profesoresRepository.findAll().stream().map(this.profesoresMapper::toDto).collect(Collectors.toList());
    }

    public Optional<ProfesoresDTO> findById(Long id){
     return  profesoresRepository.findById(id).map(this.profesoresMapper::toDto);
    }

}
