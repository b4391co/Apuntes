public class Cuenta {
    public String titular;
    public double cantidad;

    public CuentaVacia(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
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