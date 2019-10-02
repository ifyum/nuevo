package com.example.tutorial.spring.web.app.controller;


import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.Services.DiaDelaSemanaService;

import com.example.tutorial.spring.web.app.models.Services.CursosService;


import com.example.tutorial.spring.web.app.models.Services.FechasService;
import com.example.tutorial.spring.web.app.models.Services.ProfesoresService;
import com.example.tutorial.spring.web.app.models.dto.CursosDTO;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiProfesoresController {
    private final Logger log = LoggerFactory.getLogger(ApiProfesoresController.class);
    @Autowired
    @Qualifier("profesoresService")
    private ProfesoresService profesoresService;
    @Autowired
    @Qualifier("diaDelaSemanaService")
    private DiaDelaSemanaService diaDelaSemanaService;
    @Autowired
    @Qualifier("cursosService")
    private CursosService cursosService;
    @Autowired
    @Qualifier("fechasService")
    private FechasService fechasService;


    @GetMapping( "/profesores")
    public List<ProfesoresDTO> listarProfesores (){

        return profesoresService.ListarProfesores();
    }

    @GetMapping( "/cursos")
    public List<CursosDTO> listarCursos (){

        return cursosService.ListarCursos();
    }

    @GetMapping("/profesores/{id}")
    public Optional<ProfesoresDTO>
    show(@PathVariable Long id) {
        return profesoresService.findById(id);
    }

    @GetMapping("/fechas")
    public List fechas(){
    String[] annos= new String[20];
    annos[0]="2019";
//        annos[1]="2020";
//        diaDelaSemanaService.fecha( annos);
        return diaDelaSemanaService.fecha( annos);
    }

    @GetMapping("/fecha1y2/{id}/{dias}")
     public Optional<ProfesoresDTO> fechas1y2(@PathVariable("id") Long id,@PathVariable("dias") Integer dias){
        log.debug("id: "+id+" dias: "+dias);
        profesoresService.dias(id,dias);
//      Optional  profesoresDTO = profesoresService.findById(id);
        return profesoresService.findById(id);

    }



}
