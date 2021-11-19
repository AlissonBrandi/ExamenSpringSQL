package com.example.examenSpringSQL;

import com.example.examenSpringSQL.entity.*;
import com.example.examenSpringSQL.repository.AlumnoRepositoryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ExamenSpringSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenSpringSqlApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AlumnoRepositoryDao alumnoRepositoryDao) {
        return args -> {
        /*
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

            Modulo submodulo = new Modulo();
            submodulo.setNombre("Modulo I");
            submodulo.setDescripcion("Introducción a la programación");
            submodulo.setDuracion(6);
            submodulo.setContenidos(List.of(t, t2, t3));

            Modulo modulo = new Modulo();
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

            alumnoRepositoryDao.save(a);
            */

        };
    }

}
