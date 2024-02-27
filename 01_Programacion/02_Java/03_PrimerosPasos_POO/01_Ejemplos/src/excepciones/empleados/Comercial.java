package excepciones.empleados;

public class Comercial extends Empleado {
    private int comision;

    public Comercial(String dni, String nombre, int edad, int salario, int comision) throws ExcepcionEmpleado {
        super(dni, nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tComercial [comision=" + comision + "]";
    }

    @Override
    public boolean plus() {
        if (edad < 30 && comision < 200) {
            salario += PLUS;
            System.out.println("Se le ha añadido el plus, al empleado " + super.getNombre());
            return true;
        } else
            return false;
    }
}