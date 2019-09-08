package com.example.tutorial.spring.web.app.repository;


import com.example.tutorial.spring.web.app.domain.Profesores;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesoresRepository extends JpaRepository<Profesores, Long> {

//    @Query(value = "select * from profesores",nativeQuery = true)
//    List<Profesores> FindbyAll ();



}
