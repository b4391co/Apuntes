package edu.gorila;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n =====================[ Cursos ]=====================");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Sergio", "34245454T");
        alumnos.add(alumno1);
        Alumno alumno2 = new Alumno("Pepe", "34245454T");
        alumnos.add(alumno2);
        Alumno alumno3 = new Alumno("Ramiro", "34245454T");
        alumnos.add(alumno3);
        Alumno alumno4 = new Alumno("María", "34245454T");
        alumnos.add(alumno4);

        ArrayList<Curso> cursos = new ArrayList<>();
        Curso curso1 = new Curso("Programacion");
        cursos.add(curso1);
        Curso curso2 = new Curso("BBDD");
        cursos.add(curso2);
        Curso curso3 = new Curso("Redes");
        cursos.add(curso3);

        matricularAlumno(alumno1, cursos);

        for (Curso c : alumno1.getCursos()) {
            System.out.println(c.getName());
        }
    }

    public static void matricularAlumno(Alumno alumno, ArrayList<Curso> cursos) {
        for (Curso c : cursos) {
            alumno.addCurso(c);
            c.addAlumno(alumno);
        }
    }
}