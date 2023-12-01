package org.ap.validador.inscripciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Alumnos
        Alumno alumnoJuan = new Alumno("Juan");
        Alumno alumnoMaria = new Alumno("María");

        // Crear instancias de Materia y definir correlativas
        Materia algoritmos = new Materia("Algoritmos", new ArrayList<>());
        Materia paradigmas = new Materia("Paradigmas de Programación", List.of(algoritmos));
        Materia diseñoDeSistemas = new Materia("Diseño de Sistemas", List.of(paradigmas));

        // Crear instancias de Inscripcion
        Inscripcion inscripcionJuan = new Inscripcion(alumnoJuan, algoritmos);
        Inscripcion inscripcionMaria = new Inscripcion(alumnoMaria, paradigmas);

        // Operaciones
        List<Materia> materiasAprobadasAlumnoJuan = new ArrayList<>();
        materiasAprobadasAlumnoJuan.add(algoritmos);
        materiasAprobadasAlumnoJuan.add(diseñoDeSistemas);

        List<Materia> materiasAprobadasAlumnoMaria = new ArrayList<>();
        materiasAprobadasAlumnoMaria.add(algoritmos);
        materiasAprobadasAlumnoMaria.add(paradigmas);

        // Verificar si las materias están aprobadas
        System.out.println("Alumno Juan puede cursar Diseño de Sistemas: " + inscripcionJuan.aprobada(materiasAprobadasAlumnoJuan));
        System.out.println("Alumno Maria puede cursar Diseño de Sistemas: " + inscripcionMaria.aprobada(materiasAprobadasAlumnoMaria));

        System.out.println("Alumno Juan puede cursar Algoritmos: " + inscripcionJuan.aprobada(materiasAprobadasAlumnoJuan));
        System.out.println("Alumno Juan puede cursar Paradigmas: " + inscripcionJuan.aprobada(materiasAprobadasAlumnoJuan));
        System.out.println("Alumno Juan puede cursar Lenguaje C: " + inscripcionJuan.aprobada(materiasAprobadasAlumnoJuan));
    }
}