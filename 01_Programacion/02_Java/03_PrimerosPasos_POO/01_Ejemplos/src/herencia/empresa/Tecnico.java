package herencia.empresa;

import java.time.LocalDate;

public class Tecnico extends Operario {
    private String seccion;

    public Tecnico(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave,
            String seccion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.seccion = seccion;
    }
    
    @Override
    public String toString() {
        return "\n\nEmpleado [nombre=" + nombre + ", salario=" + salario + ", fechaIncorporacion=" + fechaIncorporacion +"]" +
                "\n\tOperario [area=" + area + ", nave=" + nave + "]\n\t\tTecnico [seccion=" + seccion + "]";
    }
    
}
