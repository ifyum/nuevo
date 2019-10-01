package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.models.Services.DiaDelaSemanaService;
import com.example.tutorial.spring.web.app.models.Services.FechasService;
import com.example.tutorial.spring.web.app.models.Services.ProfesoresService;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiProfesoresController {
    public  static final  String PROFESORES = "profesores";
    @Autowired
    @Qualifier("profesoresService")
    private ProfesoresService profesoresService;
    @Autowired
    @Qualifier("diaDelaSemanaService")
    private DiaDelaSemanaService diaDelaSemanaService;

        private ProfesoresRepository profesoresRepository;
    @Autowired
    @Qualifier("fechasService")
    private FechasService fechasService;

    @GetMapping( "/profesores")
    public List<ProfesoresDTO> listar (){

        return profesoresService.ListarProfesores();
    }


    @GetMapping("/profesores/{id}")
    public Optional<ProfesoresDTO>
    show(@PathVariable Long id) {
        return profesoresService.findById(id);
    }

    @GetMapping("/fechas")
    public String fechas(){
    String[] annos= new String[20];
    annos[0]="2019";
//        annos[1]="2020";
        diaDelaSemanaService.fecha( annos);
        return null;
    }

    @GetMapping("/fecha1y2")
    public String fechas1y2(){


       
        Calendar fechaHoy = Calendar.getInstance();

        Calendar fechadeldia=Calendar.getInstance();
fechadeldia.add(Calendar.DAY_OF_MONTH, 20);
        List<Date> lista = null;
//        annos[1]="2020";
        fechasService.diasHabiles( fechaHoy,fechadeldia,lista);
        return null;
    }



}
