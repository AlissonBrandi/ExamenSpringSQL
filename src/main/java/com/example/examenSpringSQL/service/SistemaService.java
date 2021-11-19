package com.example.examenSpringSQL.service;

import com.example.examenSpringSQL.entity.Alumno;
import com.example.examenSpringSQL.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaService {


    @Autowired
    AlumnoRepository repo;


    //Alumno

    public void addAlumno(Alumno alumno) {
        repo.addAlumno(alumno);
    }

    public void deleteAlumno(Integer dni) {
        repo.deleteAlumno(dni);
    }


    public List<Alumno> getLista() {
        return null;
    }


    public Alumno getAlumno(Integer dni) {
        return repo.getAlumno(dni).get();
    }

    public List<Alumno> getAlumnos() {

        return  repo.getAll();
    }


    public void updateAlumno(Alumno alumno) {
        repo.updateAlumno(alumno);
    }


    public void deleteAll() {
        repo.deleteAll();
    }

    //Contenido
}
