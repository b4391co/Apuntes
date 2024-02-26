package excepciones.empleados;

public abstract class Empleado {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected double salario;

    protected final double PLUS = 300;

    public Empleado(String dni, String nombre, int edad, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public static String verificarDni(String dni) {
        try {
            if (dni.length() != 9)
                throw new ExcepcionDni("logitud invalida");
            if (!Character.isAlphabetic(dni.charAt(dni.length())))
                throw new ExcepcionDni("no contine letra");
            return dni;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPLUS() {
        return PLUS;
    }

    public abstract boolean plus();

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
    }
}