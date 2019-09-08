package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.domain.enumeration.CursosEnum;
import com.example.tutorial.spring.web.app.domain.enumeration.LetrasEnum;
import com.example.tutorial.spring.web.app.models.Services.ProfesoresService;
import com.example.tutorial.spring.web.app.repository.CursosRepository;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@Controller

public class IndexController {


@Autowired
 private ProfesoresService profesoresService;



    @GetMapping({"/index", "/" , "/home"})
    public String index(Model model){ //ModelMap hace lo mismo que Model
        String texto = "-esto es una variable-";
        model.addAttribute("titulo","Ifyum");
//        model.addAttribute("cuerpo","hola esto viene desde el back a la vista "+texto);

        model.addAttribute("cuerpo","hola ");

       return "index";
    }


}

