package com.example.tutorial.spring.web.app.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class IndexController {
    @GetMapping(value="/index")
    public String index(Model model){
        model.addAttribute("titulo","Ifyum");
        model.addAttribute("cuerpo","hola esto viene desde el back a la vista");
      return "index";
    }
}

