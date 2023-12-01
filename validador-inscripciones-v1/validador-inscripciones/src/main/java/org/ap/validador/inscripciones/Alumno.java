package org.ap.validador.inscripciones;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Inscripcion> inscripciones;


    public Alumno(String juan) {
    }

    public Alumno(String nombre, List<Inscripcion> inscripciones) {
        this.nombre = nombre;
        this.inscripciones = inscripciones;
    }

}
