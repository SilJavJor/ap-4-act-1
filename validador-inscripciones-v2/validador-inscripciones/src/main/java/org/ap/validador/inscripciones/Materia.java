package org.ap.validador.inscripciones;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia() {
        this.nombre = "";
//        this.correlativas = new Correlativas();
    }

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
}
