package calculadoradivisas;

public class Finanzas {
    final double USD_EUR = 1.36;
    private double dolarEuro;

    public Finanzas() {
        this.dolarEuro = USD_EUR;
    }

    public Finanzas(double dolarEuro) {
        this.dolarEuro = dolarEuro;
    }

    public double dolarToEuro(double dolar){
        return dolar * this.dolarEuro;
    }

    public double euroToDolar(double euro){
        return euro / this.dolarEuro;
    }
}