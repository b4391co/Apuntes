package edu.gorilas.menu;

import java.util.ArrayList;

import edu.gorilas.persona.Alumno;
import edu.gorilas.persona.Miembro;
import edu.gorilas.persona.Profesor;

public class UtilsMenu {

    @SuppressWarnings("unchecked")
    public static void mostrarTodos(ArrayList<Miembro> miembros) {
        miembros.stream()
                .map(p -> p.toString())
                .forEach(System.out::println);
    }

    @SuppressWarnings("unchecked")
    public static void mostrarProfesores(ArrayList<Miembro> miembros) {
        miembros.stream().filter(m -> m instanceof Profesor)
                .map(p -> p.toString())
                .forEach(System.out::println);
    }

    @SuppressWarnings("unchecked")
    public static void mostrarAlumnos(ArrayList<Miembro> miembros) {
        miembros.stream().filter(m -> m instanceof Alumno)
                .map(t -> t.toString())
                .forEach(System.out::println);
    }

    public static void edadMediaProfesores(ArrayList<Miembro> miembros) {
        System.out.println(miembros.stream()
                .filter(m -> m instanceof Profesor)
                .mapToInt(m -> ((Profesor) m).getEdad())
                .average()
        );
    }

    public static void notaMedia(ArrayList<Miembro> miembros, String curso) {
        System.out.println(miembros.stream()
                .filter(m -> m instanceof Alumno)
                .mapToDouble(m -> ((Alumno) m).getMedia())
                .average()
        );
    }

}
