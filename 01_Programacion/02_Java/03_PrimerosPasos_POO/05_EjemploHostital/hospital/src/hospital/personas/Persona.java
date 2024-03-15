package hospital.personas;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String direccion;
    
    public Persona() {
        this.dni = "00000000A";
        this.nombre = "nombre";
        this.edad = 18;
        this.direccion = "direccion";
    }

    public Persona(String dni, String nombre, int edad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nPersona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }

}