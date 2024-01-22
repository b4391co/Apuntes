package empresa;

import java.time.LocalDate;

public class Directivo extends Empleado {
    private String cargo;
    private String departamento;

    public Directivo(String nombre, double salario, LocalDate fechaIncorporacion, String cargo, String departamento) {
        super(nombre, salario, fechaIncorporacion);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado [nombre=" + nombre + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion +"]\n\tDirectivo [cargo=" + cargo + ", departamento=" + departamento + "]";
    }
    
}
