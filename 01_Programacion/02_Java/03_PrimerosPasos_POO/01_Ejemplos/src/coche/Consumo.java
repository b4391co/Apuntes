package coche;

public class Consumo {
    final int KMS_CONSUMO_MEDIO = 100;
    private double kms;
    private double litros;
    private double vmedia;
    private double pgas;

    public Consumo(double kms, double litros, double vmedia, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmedia = vmedia;
        this.pgas = pgas;
    }

    public double getKms() {
        return this.kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return this.litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmedia() {
        return this.vmedia;
    }

    public void setVmedia(double vmedia) {
        this.vmedia = vmedia;
    }

    public double getPgas() {
        return this.pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    public int getTiempo() {
        return this.kms / this.vmedia;
    }

    public double consumoMedio() {
        return (this.litros * KMS_CONSUMO_MEDIO)/ this.kms;
    }

    public double consumoEuros() {
        return this.pgas * this.consumoMedio();
    }
}