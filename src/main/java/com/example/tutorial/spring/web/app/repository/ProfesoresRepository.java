package com.example.tutorial.spring.web.app.repository;


import com.example.tutorial.spring.web.app.domain.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesoresRepository extends JpaRepository<Profesores,Long> {

    @Query("select p from Profesores p where p.id =:id")
    Profesores buscardId(@Param("id") Long id);

}
