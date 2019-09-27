package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.domain.Profesores;
import com.example.tutorial.spring.web.app.models.Services.ProfesoresService;
import com.example.tutorial.spring.web.app.models.dto.ProfesoresDTO;
import com.example.tutorial.spring.web.app.repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class ProfesoresController {
    public  static final  String PROFESORES = "profesores";
    @Autowired
    @Qualifier("profesoresService")
    private ProfesoresService profesoresService;
    private  ProfesoresRepository profesoresRepository;

    @GetMapping( "/profesores")
        public String listar (Model model){
        model.addAttribute("profesores", profesoresService.ListarProfesores());
        return PROFESORES;
        }

    @GetMapping("/facturas/{id}")
    public Optional<ProfesoresDTO> show(@PathVariable Long id) {
        return profesoresService.findById(id);
    }

}
