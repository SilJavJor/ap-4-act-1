package org.ap.validador.inscripciones;

public class Main {
    public static void main(String[] args) {
        double calificacionMinimaParaAprobacion = 75.00;

        // Alumnos
        Alumno juan = new Alumno("Juan");
        Alumno maria = new Alumno("Maria");

        // Materias
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        Materia diseñoSistemas = new Materia("Diseño");

        // Agregar materia por alumno
        juan.inscribir(algoritmos, calificacionMinimaParaAprobacion);
        juan.inscribir(paradigmas, calificacionMinimaParaAprobacion);
        juan.inscribir(diseñoSistemas, calificacionMinimaParaAprobacion);
        // Asignar valores a las materias
        juan.asignarCalificacion(algoritmos, 75.0);
        juan.asignarCalificacion(paradigmas, 80.0);
        juan.asignarCalificacion(diseñoSistemas, 90.0);

        maria.inscribir(algoritmos, calificacionMinimaParaAprobacion);
        maria.inscribir(paradigmas,calificacionMinimaParaAprobacion);
        maria.asignarCalificacion(algoritmos, 70.0);
        maria.asignarCalificacion(paradigmas, 75.0);

        // Mostrar materias inscritas y verificar si están aprobadas
        juan.mostrarMateriasInscriptas();
        verificarEstadoAprobacion(juan);

        maria.mostrarMateriasInscriptas();
        verificarEstadoAprobacion(maria);
    }

    private static void verificarEstadoAprobacion(Alumno alumno) {
        String aprobadaDesaprobada;

        for (Inscripcion inscripcion : alumno.getInscripciones()) {
            if (inscripcion.aprobada()) {
                aprobadaDesaprobada = "Aprobada";
            } else {
                aprobadaDesaprobada = "Desaprobada";
            }

            System.out.println("- " + inscripcion.getMateria().getNombre() + ": " + aprobadaDesaprobada);
        }
    }
}
