package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

@Controller
public class ProfesoresController {
    @Autowired
    private ProfesoresRepository profesoresRepository;


    @RequestMapping( value ="/profesores",method=RequestMethod.GET)
        public String listar(Model model){
        model.addAttribute("titulo","Ifyum");
        model.addAttribute("profesores",profesoresRepository.findAll());
        return "profesores";
        }
}
