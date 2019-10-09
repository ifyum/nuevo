package com.example.tutorial.spring.web.app.models.Services;

import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import static org.junit.Assert.*;

public class ProfesoresServiceTest {
    @Autowired
            @Qualifier("profesoresService")
ProfesoresService profesoresService;


    @Test
    public void listarProfesores() {

   System.out.println( "hola");

    }


    @Test
    public void filtro() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void dias() {
    }
}