package interfaces.empleados;

public class Repartidor extends Empleado{
    private int zona;

    public Repartidor(String nombre, int edad, double salario, int zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tRepartidor [zona=" + zona + "]";
    }

    @Override
    public boolean plus() {
        if (edad > 25 && zona == 3) {
            salario += PLUS;
            System.out.println("Se le ha añadido el plus, al empleado " + super.getNombre());
            return true;
        } else
            return false;
    }
}