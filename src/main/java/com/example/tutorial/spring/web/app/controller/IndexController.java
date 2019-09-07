package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.domain.Cursos;
import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.domain.enumeration.CursosEnum;
import com.example.tutorial.spring.web.app.domain.enumeration.LetrasEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class IndexController {

   Profesores profesores;
   Cursos cursos;

    @GetMapping({"/index", "/" , "/home"})
    public String index(Model model){ //ModelMap hace lo mismo que Model
        String texto = "-esto es una variable-";
        model.addAttribute("titulo","Ifyum");
        model.addAttribute("cuerpo","hola esto viene desde el back a la vista"+texto);
       return "index";
    }


}

