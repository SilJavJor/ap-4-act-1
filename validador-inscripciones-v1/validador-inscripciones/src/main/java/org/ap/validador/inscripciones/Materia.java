package org.ap.validador.inscripciones;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;
    private double calificacionPromedio;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
        this.calificacionPromedio = 0.0;
    }
    public String getNombre() {
        return nombre;
    }

    public void agregarCorrelativa(Materia correlativa) {
        correlativas.add(correlativa);
    }

    public ArrayList<Materia> obtenerCorrelativas() {
        return correlativas;
    }

    // Otros métodos y getters/setters según sea necesario

    public double obtenerCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void asignarCalificacionPromedio(double nuevaCalificacionPromedio) {
        this.calificacionPromedio = nuevaCalificacionPromedio;
    }
}

