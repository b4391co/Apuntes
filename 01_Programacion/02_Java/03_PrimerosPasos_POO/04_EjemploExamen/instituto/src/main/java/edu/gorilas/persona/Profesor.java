package edu.gorilas.persona;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import edu.gorilas.especialidad.Especialidad;

public class Profesor extends Miembro implements MetodosMiembros {
    private String jornada;
    private double sueldo;
    private Especialidad especialidad;

    public Profesor() {
        super("00000000A", "nombre", 18, "direccion", LocalDate.now());
        this.jornada = "jornada";
        this.sueldo = 0;
        this.especialidad = new Especialidad(0, "Especialidad");
    }

    public Profesor(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, String jornada,
            double sueldo, Especialidad especialidad) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.jornada = jornada;
        this.sueldo = sueldo;
        this.especialidad = especialidad;
        aplicarBonificacion();
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tProfesor [jornada=" + jornada + ", sueldo=" + sueldo + ", especialidad="
                + especialidad;
    }

    @Override
    public void aplicarBonificacion() {
        sueldo += ((ChronoUnit.YEARS.between(getFechaIncorporacion(), LocalDate.now())) >= 3) ? sueldo * 0.15 : 0;
    }
}
