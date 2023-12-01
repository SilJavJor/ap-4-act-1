package org.ap.validador.inscripciones;

import java.util.List;

public class Inscripcion {
        private Alumno alumno;
        private Materia materia;

        public Inscripcion(Alumno alumno, Materia materia) {
            this.alumno = alumno;
            this.materia = materia;
        }

        public boolean aprobada(List<Materia> materiasAprobadas) {
            return materia.tieneCorrelativas(materiasAprobadas);
        }
}
