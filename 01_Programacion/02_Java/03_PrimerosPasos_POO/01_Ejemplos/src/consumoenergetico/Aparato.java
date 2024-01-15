package consumoenergetico;

public class Aparato {
    static double consumoTotal = 0;
    private double consumo;
    private boolean encendido;
    
    public Aparato(double consumo) {
        this.consumo = consumo;
        this.encendido = false;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            consumoTotal += consumo;
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            consumoTotal -= consumo;
        }
    }

    static double getConsumoTotal() {
        return consumoTotal;
    }
}