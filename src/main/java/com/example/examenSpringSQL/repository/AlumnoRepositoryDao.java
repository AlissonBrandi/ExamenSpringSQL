package com.example.examenSpringSQL.repository;

import com.example.examenSpringSQL.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AlumnoRepositoryDao extends CrudRepository<Alumno,Integer> {


}
