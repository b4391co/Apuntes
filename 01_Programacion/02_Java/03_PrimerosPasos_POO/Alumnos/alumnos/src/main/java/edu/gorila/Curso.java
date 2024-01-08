package edu.gorila;

import java.util.ArrayList;

public class Curso {
    String name;
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public Curso(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
}
