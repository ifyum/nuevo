package com.example.tutorial.spring.web.app.models.Services;

import com.example.tutorial.spring.web.app.models.Mapper.CursosMapper;
import com.example.tutorial.spring.web.app.models.dto.CursosDTO;

import com.example.tutorial.spring.web.app.repository.CursosRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("cursosService")

public class CursosService {
    private CursosRepository cursosRepository;
    private final CursosMapper cursosMapper;

    public CursosService(CursosRepository cursosRepository, CursosMapper cursosMapper) {
        this.cursosRepository = cursosRepository;
        this.cursosMapper = cursosMapper;
    }

    public List<CursosDTO> ListarCursos(){


        return cursosRepository.findAll()
                .stream().map(this.cursosMapper::toDto)
                .collect(Collectors.toList());
    }
}
