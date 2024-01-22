package empresa;

import java.time.LocalDate;

public class Operario extends Empleado {
    public String area;
    protected String nave;
    
    public Operario(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave) {
        super(nombre, salario, fechaIncorporacion);
        this.area = area;
        this.nave = nave;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado [nombre=" + nombre + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion +"]\n\tOperario [area=" + area + ", nave=" + nave + "]";
    }

}
