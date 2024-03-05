package edu.gorilas.menu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.gorilas.excepciones.Excepciones;
import edu.gorilas.excepciones.ExcepcionesMenu;
import edu.gorilas.persona.Alumno;
import edu.gorilas.persona.Miembro;
import edu.gorilas.persona.Profesor;

public class UtilsMenu {
    public static void mostrarTodos(ArrayList<Miembro> miembros) {
        System.out.println();
        miembros.stream()
                .map(p -> p.toString())
                .forEach(System.out::println);
    }

    public static void mostrarProfesores(ArrayList<Miembro> miembros) {
        System.out.println();
        miembros.stream().filter(m -> m instanceof Profesor)
                .map(p -> p.toString())
                .forEach(System.out::println);
    }

    public static void mostrarAlumnos(ArrayList<Miembro> miembros) {
        System.out.println();
        miembros.stream().filter(m -> m instanceof Alumno)
                .map(t -> t.toString())
                .forEach(System.out::println);
    }

    public static void edadMediaProfesores(ArrayList<Miembro> miembros) {

        System.out.println("\n" + miembros.stream()
                .filter(m -> m instanceof Profesor)
                .mapToInt(m -> ((Profesor) m).getEdad())
                .average()
        );
    }

    public static int verificarFecha(String patron, int ex) {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca una fecha: ");
                String num = sc.next();
                Pattern pat = Pattern.compile(patron);
                match = pat.matcher(num);
                if (!match.matches())
                    throw new ExcepcionesMenu(ex);
                return Integer.parseInt(num);
            } catch (ExcepcionesMenu e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static void notaMedia(ArrayList<Miembro> miembros, String curso) {
        System.out.println(miembros.stream()
                .filter(m -> m instanceof Alumno)
                .mapToDouble(m -> ((Alumno) m).getMedia())
                .average());
    }

    public static String verificarDni() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca un dni: ");
                String dni = sc.next();
                Pattern pat = Pattern.compile("[0-9]{8}[A-Z]{1}");
                match = pat.matcher(dni);
                if (dni.length() != 9)
                    throw new ExcepcionesMenu(ExcepcionesMenu.DNI_LENGHT);
                if (!match.matches())
                    throw new ExcepcionesMenu(ExcepcionesMenu.DNI_INCORRECTO);
                return dni;
            } catch (ExcepcionesMenu e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
    
    public static int verificarEspec() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca un número: ");
                String num = sc.next();
                Pattern pat = Pattern.compile("[0-4]{1}");
                match = pat.matcher(num);
                if (!match.matches())
                    throw new ExcepcionesMenu(ExcepcionesMenu.ESPECIALIDAD_INCORRECTA);
                return Integer.parseInt(num);
            } catch (ExcepcionesMenu e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}
