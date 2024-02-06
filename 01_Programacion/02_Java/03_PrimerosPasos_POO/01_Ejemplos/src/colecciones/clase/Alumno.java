package colecciones.clase;

public class Alumno {
    private String nombre;
    private String dni;
    private int edad;
    private String direccion;
    
    public Alumno(String nombre, String dni, int edad, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion + "]";
    }

    
}