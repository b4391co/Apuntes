package colecciones.pedidos;

public class Pedido {
    private Producto producto;
    private Cliente cliente;
    private String tipo;
    private int cantidad;

    public Pedido(Producto producto, Cliente cliente, String tipo, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Pedido [producto=" + producto.toString() + ", cliente=" + cliente.toString() + ", tipo=" + tipo + ", cantidad=" + cantidad
                + "]";
    }
    
}