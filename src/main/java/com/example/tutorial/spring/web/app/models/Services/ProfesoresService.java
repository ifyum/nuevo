package com.example.tutorial.spring.web.app.models.Services;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.repository.CursosRepository;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;




@Service
@Transactional

public class ProfesoresService {
    private final Logger log = LoggerFactory.getLogger(ProfesoresService.class);

   private Profesores profesores;
    private Cursos cursos;
    private ProfesoresRepository profesoresRepository;
    private CursosRepository cursosRepository;

     public String creado(){

  profesoresRepository.findAll();

        return    " desde el service";
    }


}
