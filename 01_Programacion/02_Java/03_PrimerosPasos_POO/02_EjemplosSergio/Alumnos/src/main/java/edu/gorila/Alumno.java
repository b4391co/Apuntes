package edu.gorila;

import java.util.ArrayList;

public class Alumno {
    String name;
    String dni;


    ArrayList<Curso> cursos = new ArrayList<>();

    public Alumno(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
