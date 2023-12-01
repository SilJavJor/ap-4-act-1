package org.ap.validador.inscripciones;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private double calificacionMinima;

    public Inscripcion(Alumno alumno, Materia materia, double calificacionMinima) {
        this.alumno = alumno;
        this.materia = materia;
        this.calificacionMinima = calificacionMinima;
    }

    public Materia getMateria() {
        return materia;
    }

    public boolean aprobada() {
        return alumno.obtenerCalificacion(materia) >= calificacionMinima && cumpleCorrelatividades();
    }

    private boolean cumpleCorrelatividades() {
        for (Materia correlativa : materia.obtenerCorrelativas()) {
            if (alumno.obtenerCalificacion(correlativa) < calificacionMinima) {
                return false;
            }
        }

        return true;
    }
}

