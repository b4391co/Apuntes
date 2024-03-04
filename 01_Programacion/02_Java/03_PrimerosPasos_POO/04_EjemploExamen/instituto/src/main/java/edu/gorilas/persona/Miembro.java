package edu.gorilas.persona;
import java.time.LocalDate;

public class Miembro extends Persona{
    private LocalDate fechaIncorporacion;

    public Miembro() {
        super("00000000A", "nombre", 18, "direccion");
        this.fechaIncorporacion = LocalDate.now();
    }

    public Miembro(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tMiembro [fechaIncorporacion=" + fechaIncorporacion + "]";
    }

}
