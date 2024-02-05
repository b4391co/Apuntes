package interfaces.empleados;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    protected final double PLUS = 300;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS + "]";
    }

    public abstract boolean plus();
}