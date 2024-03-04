package edu.gorilas.especialidad;

public class Especialidad {
    private int id;
    private String nombre;

    public Especialidad() {
        this.id = 0;
        this.nombre = "Especialidad";
    }

    public Especialidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especialidad [id=" + id + ", nombre=" + nombre + "]";
    }
}