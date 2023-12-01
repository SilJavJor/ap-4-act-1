package org.ap.validador.inscripciones;

import java.util.ArrayList;
import java.util.HashMap;

public class Alumno {
    private String nombre;
    private ArrayList<Inscripcion> inscripciones;
    private HashMap<Materia, Double> calificaciones;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
        this.calificaciones = new HashMap<>();
    }

    public void inscribir(Materia materia, double calificacionMinimaParaAprobacion) {
        Inscripcion inscripcion = new Inscripcion(this, materia, calificacionMinimaParaAprobacion);
        inscripciones.add(inscripcion);
    }

    public void asignarCalificacion(Materia materia, double calificacion) {
        calificaciones.put(materia, calificacion);
    }

    public double obtenerCalificacion(Materia materia) {
         return calificaciones.getOrDefault(materia, 0.0);
    }

    public void mostrarMateriasInscriptas() {
        System.out.println("");
        System.out.println("Materias inscriptas y estado de aprobación para " + nombre + ":");
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}
