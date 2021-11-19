package com.example.examenSpringSQL.repository;

import com.example.examenSpringSQL.entity.Alumno;
import com.example.examenSpringSQL.entity.Contenido;
import org.springframework.data.repository.CrudRepository;


public interface ContenidoRepositoryDao extends CrudRepository<Contenido,Integer> {


}
