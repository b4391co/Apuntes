package empresa;

import java.time.LocalDate;

public class Empleado {
    protected String nombre;
    protected double salario;
    protected LocalDate fechaIncorporacion;

    public Empleado(String nombre, double salario, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado [nombre=" + nombre + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion
                + "]";
    }

}

