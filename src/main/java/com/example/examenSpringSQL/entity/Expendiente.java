package com.example.examenSpringSQL.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="expedientes")
public class Expendiente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String fechaInsc;
    private int calificacion;
    private String fechaFin;

    @OneToOne(cascade = CascadeType.ALL)
    private Curso curso;

    public Expendiente() {
    }


}
