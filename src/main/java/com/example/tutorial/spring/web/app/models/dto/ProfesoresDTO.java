package com.example.tutorial.spring.web.app.models.dto;


public class ProfesoresDTO {

  private long id;
  private String apellido;
  private String nombre;
  private String rut;
  private long idCurso;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }


  public long getIdCurso() {
    return idCurso;
  }

  public void setIdCurso(long idCurso) {
    this.idCurso = idCurso;
  }

  @Override
  public String toString() {
    return "Profesores{" +
            "id=" + id +
            ", apellido='" + apellido + '\'' +
            ", nombre='" + nombre + '\'' +
            ", rut='" + rut + '\'' +
            ", idCurso=" + idCurso +
            '}';
  }
}
