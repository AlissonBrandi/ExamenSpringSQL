package com.example.examenSpringSQL.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "contenidos")
    private List<Contenido> contenidos;

    public Curso(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public Curso() {
    }
}
