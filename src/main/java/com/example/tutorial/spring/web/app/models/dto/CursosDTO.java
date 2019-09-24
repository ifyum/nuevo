package com.example.tutorial.spring.web.app.models.dto;

import com.example.tutorial.spring.web.app.domain.enumeration.CursosEnum;
import com.example.tutorial.spring.web.app.domain.enumeration.LetrasEnum;

public class CursosDTO {

    private Long id;


    private Long Sala;


    private ProfesoresDTO profesorJefe;


    private Integer cantidadAlumnos;


    private LetrasEnum letra;


    private CursosEnum Curso;

    public CursosDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSala() {
        return Sala;
    }

    public void setSala(Long sala) {
        Sala = sala;
    }

    public ProfesoresDTO getProfesorJefe() {
        return profesorJefe;
    }

    public void setProfesorJefe(ProfesoresDTO profesorJefe) {
        this.profesorJefe = profesorJefe;
    }

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public LetrasEnum getLetra() {
        return letra;
    }

    public void setLetra(LetrasEnum letra) {
        this.letra = letra;
    }

    public CursosEnum getCurso() {
        return Curso;
    }

    public void setCurso(CursosEnum curso) {
        Curso = curso;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "id=" + id +
                ", Sala=" + Sala +
                ", profesor=" + profesorJefe +
                ", cantidadAlumnos=" + cantidadAlumnos +
                ", letra=" + letra +
                ", Curso=" + Curso +
                '}';
    }


}
