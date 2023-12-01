package org.ap.validador.inscripciones;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = CreacionDeInstancias.crearAlumnos();
        List<Materia> materias = CreacionDeInstancias.crearMaterias();
        List<Inscripcion> inscripciones = CreacionDeInstancias.crearInscripciones(alumnos, materias);

        // Realiza operaciones con las listas de alumnos, materias e inscripciones según sea necesario
    }
}