package org.ap.validador.inscripciones;

import java.util.ArrayList;
import java.util.List;

public class CreacionDeInstancias {
    public static List<Alumno> crearAlumnos(String[] nombresAlumnos) {
        List<Alumno> alumnos = new ArrayList<>();

        for (String nombre : nombresAlumnos) {
            alumnos.add(new Alumno(nombre));
        }

        return alumnos;
    }

    public static List<Materia> crearMaterias(String[] nombresMaterias) {
        List<Materia> materias = new ArrayList<>();

        for (String nombre : nombresMaterias) {
            materias.add(new Materia(nombre, new ArrayList<>()));
        }

        return materias;
    }

    public static List<Inscripcion> crearInscripciones(List<Alumno> alumnos, List<Materia> materias) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        for (int i = 0; i < alumnos.size(); i++) {
            inscripciones.add(new Inscripcion(alumnos.get(i), materias.get(i)));
        }
        return inscripciones;
    }
}
