package empresa;

import java.time.LocalDate;

public class Oficial extends Operario {
    private String lineaFabricacion;

    public Oficial(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave,
            String lineaFabricacion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.lineaFabricacion = lineaFabricacion;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado [nombre=" + nombre + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion +"]\n\t" + //
                "Operario [area=" + area + ", nave=" + nave + "]\n\t\tOficial [lineaFabricacion=" + lineaFabricacion + "]";
    }
}
