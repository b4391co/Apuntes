package colecciones.videojuegos;

public class Serie implements Entrega{
    private String tutulo;
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;
    
    public Serie() {
    }
        
    public Serie(String tutulo, String creador) {
        this.tutulo = tutulo;
        this.creador = creador;
    }

    public Serie(String tutulo, int numTemporadas, String genero, String creador) {
        this.tutulo = tutulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTutulo() {
        return tutulo;
    }

    public void setTutulo(String tutulo) {
        this.tutulo = tutulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie [tutulo=" + tutulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
                + genero + ", creador=" + creador + "]";
    }
    
    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolover() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }
}