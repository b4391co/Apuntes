package interfaces.biblioteca;

public class Revista extends Articulo implements Prestable {
    private int numero;

    public Revista(int codigo, String titulo, int anho, int numero) {
        super(codigo, titulo, anho);
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return "Revista " + super.toString() + "\nRevistas{" + this.numero + "}";
    }
    
    @Override
    public void prestar() {
        System.out.println("Revista prestada " + getTitulo());
    }

    @Override
    public void devolver() {
        System.out.println("Revista devuelta " + getTitulo());
    }

}