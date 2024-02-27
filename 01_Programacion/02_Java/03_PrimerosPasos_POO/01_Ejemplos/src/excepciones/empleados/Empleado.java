package excepciones.empleados;

public abstract class Empleado {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected int salario;

    protected final int PLUS = 300;

    public Empleado(String dni, String nombre, int edad, int salario) throws ExcepcionEmpleado {
        verificarDni(dni);
        verificarNombre(nombre);
        verificarEdad(edad);
        verificarSalario(salario);
    }

    private void verificarSalario(int s) throws ExcepcionEmpleado {
        if ( String.valueOf(s).length() >= 5)
            throw new ExcepcionEmpleado(ExcepcionEmpleado.SALARIO_LENGHT);
        else
            this.salario = s;
    }

    private void verificarEdad(int e) throws ExcepcionEmpleado {
        if (String.valueOf(e).length() >= 3)
            throw new ExcepcionEmpleado(ExcepcionEmpleado.EDAD_LENGHT);
        else if (!isNumeric(String.valueOf(e)))
            throw new ExcepcionEmpleado(ExcepcionEmpleado.EDAD_LETRA);
        else
            this.edad = e;
    }

    private void verificarNombre(String n) throws ExcepcionEmpleado {
        if (n != null && n.length() > 20 )
            throw new ExcepcionEmpleado(ExcepcionEmpleado.NOMBRE_LENGHT);
        else if ( !n.matches("^[a-zA-Z]*$"))
            throw new ExcepcionEmpleado(ExcepcionEmpleado.NOMBRE_LETRAS);
        else {
            this.nombre = n;
        }
    }

    private void verificarDni(String dni) throws ExcepcionEmpleado {
        if (dni != null && dni.length() != 9)
            throw new ExcepcionEmpleado(ExcepcionEmpleado.DNI_LONGITUD_INVALIDA);
        else if (!Character.isAlphabetic(dni.charAt(dni.length() - 1)))
            throw new ExcepcionEmpleado(ExcepcionEmpleado.LETRA_DNI);
        else
            this.dni = dni;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public abstract boolean plus();

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
    }
}