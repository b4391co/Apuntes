package edu.gorilas.persona;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Miembro implements MetodosMiembros {
    private String ciclo;
    private double media;
    private double importeMatricula;
    
    public Alumno() {
        super("00000000A", "nombre", 18, "direccion", LocalDate.now());
        this.ciclo = "ciclo";
        this.media = 0;
        this.importeMatricula = 0;
    }

    public Alumno(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, String ciclo, double media, double importeMatricula) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.ciclo = ciclo;
        this.media = media;
        this.importeMatricula = importeMatricula;
        aplicarBonificacion();
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlumno [ciclo=" + ciclo + ", media=" + media + ", importeMatricula=" + importeMatricula + "]";
    }

    @Override
    public void aplicarBonificacion() {
        importeMatricula -= ((ChronoUnit.YEARS.between(getFechaIncorporacion(), LocalDate.now())) >= 2) ? importeMatricula * 0.1 : 0;
    }
}
