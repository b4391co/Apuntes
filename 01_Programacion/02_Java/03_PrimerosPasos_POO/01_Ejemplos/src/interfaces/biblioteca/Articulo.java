package interfaces.biblioteca;

public class Articulo {
    private int codigo;
    private String titulo;
    private int anho;

    public Articulo(int codigo, String titulo, int anho) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Articulos [codigo=" + codigo + ", titulo=" + titulo + ", anho=" + anho + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnho() {
        return anho;
    }

    public String getTitulo() {
        return titulo;
    }
    
}