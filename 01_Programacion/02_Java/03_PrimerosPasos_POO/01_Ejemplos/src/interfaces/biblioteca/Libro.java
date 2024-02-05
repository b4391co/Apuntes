package interfaces.biblioteca;


public class Libro extends Articulo implements Prestable {
    private boolean prestado = false;

    public Libro(int codigo, String titulo, int anho) {
        super(codigo, titulo, anho);
    }

    @Override
    public String toString() {
        return "Libros " + super.toString() + "\n{ Prestado: " + this.prestado + "}";
    }

    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

}