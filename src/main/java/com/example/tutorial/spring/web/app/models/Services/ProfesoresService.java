package com.example.tutorial.spring.web.app.models.Services;

import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.Mapper.ProfesoresMapper;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("profesoresService")
//@Transac1tional

public class ProfesoresService {
    private final Logger log = LoggerFactory.getLogger(ProfesoresService.class);


    private ProfesoresRepository profesoresRepository;
    @Autowired
    @Qualifier("fechasService")
    private FechasService fechasService;

private final ProfesoresMapper profesoresMapper;




    public ProfesoresService(

            ProfesoresRepository profesoresRepository,

            ProfesoresMapper profesoresMapper) {

        this.profesoresRepository = profesoresRepository;

        this.profesoresMapper = profesoresMapper;

    }

    public List<ProfesoresDTO> ListarProfesores(){

        log.debug("weada:"+profesoresRepository.findAll().stream().map(this.profesoresMapper::toDto).collect(Collectors.toList()));
        return profesoresRepository.findAll().stream().map(this.profesoresMapper::toDto).collect(Collectors.toList());
    }


    public List<ProfesoresDTO> filtro(){

        log.debug("weada:"+profesoresRepository.findAll().stream().map(this.profesoresMapper::toDto).collect(Collectors.toList()));


        return filtro();
    }



    public Optional<ProfesoresDTO> findById(Long id){
     return  profesoresRepository.findById(id).map(this.profesoresMapper::toDto);
    }


    public void dias(Long id, Integer dias){
        Profesores profesores = profesoresRepository.buscardId(id);
          profesores.setFechahoy(Instant.now());
       log.debug("resultado qlo: "+profesores.getFechahoy());
       log.debug("fecha hoy: "+ profesores.getFechahoy());
        Date diahoy = Date.from(profesores.getFechahoy());
        log.debug("fechad e hoy: "+diahoy);
        fechasService.sumarRestarDias(diahoy,dias);

        log.debug("resultado qlo: "+ fechasService.sumarRestarDias(diahoy,dias)+".");

        Date fechaqla =fechasService.sumarRestarDias(diahoy,dias);
Instant fechadehoy =   fechaqla.toInstant();

         profesores.setFechafinal(fechadehoy);
          profesoresRepository.save(profesores);


    }



}
