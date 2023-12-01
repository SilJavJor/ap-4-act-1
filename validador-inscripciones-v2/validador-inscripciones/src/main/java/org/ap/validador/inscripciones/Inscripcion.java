package org.ap.validador.inscripciones;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
        this.alumno = new Alumno();
        this.materia = new Materia();
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }
    // Métodos getters para alumno y materia
}
