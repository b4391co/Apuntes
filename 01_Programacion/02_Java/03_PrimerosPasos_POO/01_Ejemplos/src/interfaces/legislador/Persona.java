package interfaces.legislador;

public abstract class Persona {
    private String dni;
    private String nombre;
    private int edad;
    
    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void getCamaraEnQueTrabaja();
}
