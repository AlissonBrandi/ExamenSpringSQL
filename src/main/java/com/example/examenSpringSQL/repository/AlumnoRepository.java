package com.example.examenSpringSQL.repository;

import com.example.examenSpringSQL.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlumnoRepository {

    @Autowired

    AlumnoRepositoryDao alumnoRepositoryDao;


    public void addAlumno(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }

    public void deleteAlumno(Integer dni) {
        alumnoRepositoryDao.deleteById(dni);
    }

    public Optional<Alumno> getAlumno(Integer dni) {
       return alumnoRepositoryDao.findById(dni);
    }

    public List<Alumno> getAll() {
       return (List<Alumno>) alumnoRepositoryDao.findAll();
    }

    public void updateAlumno(Alumno alumno) {
        alumnoRepositoryDao.save(alumno);
    }

    public void deleteAll() {
        alumnoRepositoryDao.deleteAll();
    }

}
