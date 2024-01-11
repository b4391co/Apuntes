package satelites;

public class Satelite {

    private boolean orbita;
    private double paralelo;
    private double meridiano;
    private double distanciaTierra;

    public Satelite(boolean orbita, double paralelo, double meridiano, double distanciaTierra) {
        this.orbita = orbita;
        this.paralelo = paralelo;
        this.meridiano = meridiano;
        this.distanciaTierra = distanciaTierra;
    }

    public double getDistanciaTierra() {
        return this.distanciaTierra;
    }
    
    public double getParalelo() {
        return this.paralelo;
    }

    public double getMeridiano() {
        return this.meridiano;
    }

    public void variaAltura(double desplazamiento) {
        this.distanciaTierra += desplazamiento;
    }
    
    public boolean enOrbita() {
        return this.orbita;
    }
    
    public void variaPosicion(double variap, double variam) {
        this.paralelo += variap;
        this.meridiano += variam;
    }
}