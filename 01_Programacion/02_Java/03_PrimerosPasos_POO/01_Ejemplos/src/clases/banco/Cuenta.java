package clases.banco;

public class Cuenta {
    private Titular titular;
    private double cantidad;

    public Cuenta(Titular titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(Titular titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Titular getTitular() {
        return this.titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0)
            this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0)
            this.cantidad -= cantidad;
    }

}