package org.ap.validador.inscripciones;

import java.util.List;

public class Alumno {
    private String nombre;

    public Alumno() {
        this.nombre = "";
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
}
