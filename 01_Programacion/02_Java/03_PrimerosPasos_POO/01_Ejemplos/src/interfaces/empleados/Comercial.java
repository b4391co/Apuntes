package interfaces.empleados;

public class Comercial extends Empleado {
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
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