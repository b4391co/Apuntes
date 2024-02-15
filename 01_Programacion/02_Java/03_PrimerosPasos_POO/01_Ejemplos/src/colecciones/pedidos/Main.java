package colecciones.pedidos;
import java.util.LinkedList;

public class Main {
    static LinkedList<Pedido> Pedidos = new LinkedList<>();

    static Cliente c1 = new Cliente("Pepe I", "1");
    static Cliente c2 = new Cliente("Pepe II", "2");
    static Cliente c3 = new Cliente("Pepe III", "3");
    static Cliente c4 = new Cliente("Pepe IV", "4");
  
    static  Producto p1 = new Producto("Producto I", 1);
    static Producto p2 = new Producto("Producto II", 2);
    static Producto p3 = new Producto("Producto III", 3);
    static Producto p4 = new Producto("Producto IV", 4);

    public static void main(String[] args) {
        nuevoPedido(p1, c1, "I", 2);
        mostrar();
        nuevoPedido(p3, c2, "I", 2);
        nuevoPedido(p2, c3, "I", 2);
        mostrar();
        finalizarPedido();
        mostrar();
    }
    
    public static void nuevoPedido(Producto px, Cliente cx, String tipo, int cantidad) {
        Pedidos.add(new Pedido(px, cx, tipo, cantidad));
    }

    public static void finalizarPedido() {
        Pedidos.removeFirst();
    }

    public static void mostrar() {
        System.out.println("\n");
        for (Pedido pedido : Pedidos) {
            System.out.println(pedido.toString());
        }
    }
}