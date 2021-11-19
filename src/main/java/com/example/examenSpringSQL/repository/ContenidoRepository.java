package com.example.examenSpringSQL.repository;

import com.example.examenSpringSQL.entity.Alumno;
import com.example.examenSpringSQL.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContenidoRepository {

    @Autowired

    ContenidoRepositoryDao contenidoRepositoryDao;

    public void addContenido(Contenido contenido) {
        contenidoRepositoryDao.save(contenido);
    }

    public void deleteContenido(Integer id) {
        contenidoRepositoryDao.deleteById(id);
    }

    public Optional<Contenido> getContenido(Integer dni) {
        return contenidoRepositoryDao.findById(dni);
    }

    public List<Contenido> getAll() {
        return (List<Contenido>) contenidoRepositoryDao.findAll();
    }

    public void updateContenido(Contenido contenido) {
        contenidoRepositoryDao.save(contenido);
    }

    public void deleteAll() {
        contenidoRepositoryDao.deleteAll();
    }


}
