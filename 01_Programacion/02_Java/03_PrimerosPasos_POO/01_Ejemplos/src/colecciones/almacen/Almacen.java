package colecciones.almacen;

import java.util.ArrayList;

public class Almacen {
    static ArrayList<Producto> almacen = new ArrayList<>();
    public static void main(String[] args) {
        llenarAlmacen();
        System.out.println("\nPrecio Total Productos" +precioTotalProductos());
        System.out.println("\nPrecio Total Bebidas" + precioTotalBebidas());
        System.out.println(precioPorMarca("aguaron"));
    
    }
    
    public static void anhadirProducto(Producto p) {
        almacen.add(p);
    }

    public static double precioTotalBebidas() {
        return (almacen.stream().filter(Bebida.class::isInstance).mapToDouble(Producto::getPrecio).sum());
    }
    
    public static double precioTotalProductos() {
        return (almacen.stream().mapToDouble(Producto::getPrecio).sum());
    }
    
    public static double precioPorMarca(String marca) {
        return (almacen.stream().filter(p -> p.getMarca().equalsIgnoreCase(marca)).mapToDouble(Producto::getPrecio).sum());
    }

    public static void llenarAlmacen() {
        almacen.add(new AguaMineral(0, "Agua nor", 2, "Aguanromal", "I", "Plastico", "I"));
        almacen.add(new AguaMineral(1, "aguaron", 1, "aguaron", "I", "plastico", "I"));
        almacen.add(new AguaMineral(2, "Agua nor", 1, "aguaron", "I", "cristal", "I"));

        almacen.add(new Refresco(3, "coca-cola 0", 3, "coca-cola", "I", "lata", 10, false));
        almacen.add(new Refresco(4, "pepsi", 3, "pepsi", null, "plastico", 20, true));
        almacen.add(new Refresco(5, "pepsi", 3, "pepsi", null, "lata", 20, false));
    
        almacen.add(new Alimentacion(6, "pan", 5, "bimbo", "I", "pan", true));
        almacen.add(new Alimentacion(7, "pan natural", 5, "bimbo", "I", "pan", false));
    }
}