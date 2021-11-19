package com.example.examenSpringSQL.controller;

import com.example.examenSpringSQL.entity.*;
import com.example.examenSpringSQL.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SistemaController {

    @Autowired
    private SistemaService service;

    // ALUMNO

    @PostMapping("/AregarAlumno")
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {
        System.out.println("Solicitud Realizada");
        service.addAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }
/*
    @PostMapping("/AregarAlumnoPrueba")
    public ResponseEntity<Alumno> addAlumnoPrueba() {
        System.out.println("Solicitud Realizada");

        Tema t = new Tema();
        t.setNombre("Ciclo For");
        t.setDescripcion("...");
        t.setDuracion(2);

        Tema t2 = new Tema();
        t2.setNombre("Switch");
        t2.setDescripcion("...");
        t2.setDuracion(2);

        Tema t3 = new Tema();
        t3.setNombre("If - else");
        t3.setDescripcion("bla");
        t3.setDuracion(2);

        Modulo submodulo= new Modulo();
        submodulo.setNombre("Modulo I");
        submodulo.setDescripcion("Introducción a la programación");
        submodulo.setDuracion(6);
        submodulo.setContenidos(List.of(t, t2, t3));

        Modulo modulo= new Modulo();
        modulo.setNombre("Programación I");
        modulo.setDescripcion("hey");
        modulo.setDuracion(6);
        modulo.setContenidos(List.of(submodulo));


        Curso curso = new Curso(List.of(modulo));

        Expendiente expendiente = new Expendiente();
        expendiente.setCalificacion(10);
        expendiente.setFechaFin("12/12/2021");
        expendiente.setFechaInsc("01/01/2021");
        expendiente.setCurso(curso);

        Alumno a = new Alumno();
        a.setNombre("Ali");
        a.setApellido("Reynoso");
        a.setDireccion("Jerez");
        a.setMail("@");
        a.setExpendientes((List<Expendiente>) expendiente);

        service.addAlumno(a);
        return ResponseEntity.ok(a);
    }*/


    @DeleteMapping("/eliminarAlumno/{id}")
    public void deleteAlumno(@PathVariable("id") Integer id) {
        System.out.println("Solicitud Realizada");
        service.deleteAlumno(id);
    }

    @DeleteMapping("/eliminarTodos")
    public void deleteAll() {
        System.out.println("Solicitud Realizada");
        service.deleteAll();
    }

    @PutMapping("/modificarAlumno")
    public ResponseEntity<Alumno> updateAlumno(@RequestBody Alumno alumno) {
        System.out.println("Solicitud Realizada");
        service.updateAlumno(alumno);

        return ResponseEntity.ok(alumno);
    }


    @GetMapping("/Alumnos")
    public List<Alumno> getAlumnos() {
        return service.getAlumnos();
    }

    @GetMapping("/Alumno/{id}")
    public Alumno getAlumno(@PathVariable("id") Integer dni) {
        return service.getAlumno(dni);
    }

    // Contenido





}
