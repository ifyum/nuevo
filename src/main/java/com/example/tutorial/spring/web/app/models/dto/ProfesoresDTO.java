package com.example.tutorial.spring.web.app.models.dto;



import java.time.Instant;

public class ProfesoresDTO {

  private long id;
  private String apellido;
  private String nombre;
    private Long cursoId;
  private String rut;
 private String foto;
    private Instant fechahoy;

    private Instant fechafinal;
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

  public Long getCursoId() {
    return cursoId;
  }

  public void setCursoId(Long cursoId) {
    this.cursoId = cursoId;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

    public Instant getFechahoy() {
        return fechahoy;
    }

    public void setFechahoy(Instant fechahoy) {
        this.fechahoy = fechahoy;
    }

    public Instant getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Instant fechafinal) {
        this.fechafinal = fechafinal;
    }

    @Override
    public String toString() {
        return "ProfesoresDTO{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cursoId=" + cursoId +
                ", rut='" + rut + '\'' +
                ", foto='" + foto + '\'' +
                ", fechahoy=" + fechahoy +
                ", fechafinal=" + fechafinal +
                '}';
    }
}
