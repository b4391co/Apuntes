package colecciones.pedidos;

public class Cliente {
    private String nombre;
    private String dni;
    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }
    
}