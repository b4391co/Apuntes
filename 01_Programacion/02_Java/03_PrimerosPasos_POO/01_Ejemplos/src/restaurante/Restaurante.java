package restaurante;

public class Restaurante {
    private double papas;
    private double chocos;

    public Restaurante(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }

    public double disponibilidadClientes() {
        return ((this.papas / 3) > ((this.chocos * 0.5) / 3)) ? ((this.chocos * 0.5) / 3) : (this.papas / 3);
    }
}