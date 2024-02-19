package colecciones.almacen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Almacen {
    static ArrayList<Producto> almacen = new ArrayList<>();

    public static void main(String[] args) {
        llenarAlmacen();
        while (true)
            menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Precio Total\t ( 2 ) Precio Bebidas\t ( 3 ) Precio x marca");
        System.out.println("\t( 4 ) Añadir\t ( 5 ) Eliminar\t ( 6 ) Mostrar");
        switch (sc.nextInt()) {
            case 1:
                System.out.println(getPrecioTotalProductos());
                break;
            case 2:
                System.out.println(getPrecioTotalBebidas());
                break;
            case 3:
                System.out.println("\n\nIntroduzca una marca");
                System.out.println(getPrecioPorMarca(sc.next()));
                break;
            case 4:
                System.out.println("\n\n\n ================================ MENU ================================");
                System.out.println("( 1 ) Alimentacion\t( 2 ) Agua\t ( 3 ) Refresco");
                int opcion = sc.nextInt();
                System.out.println("(int) id");
                int identificador = sc.nextInt();
                System.out.println("nombre");
                String nombre = sc.next();
                System.out.println("(double) precio");
                Double precio = sc.nextDouble();
                System.out.println("marca");
                String marca = sc.next();
                System.out.println("localizacion");
                String envase;
                String localizacion = sc.next();
                switch (opcion) {
                    case 1:
                        System.out.println("categoria");
                        String categoria = sc.next();
                        System.out.println("(bool) gluten");
                        boolean gluten = sc.nextBoolean();
                        almacen.add(new Alimentacion(identificador, nombre, precio, marca, localizacion, categoria,
                                gluten));
                        break;
                    case 2:
                        System.out.println("envase");
                        envase = sc.next();
                        almacen.add(new AguaMineral(identificador, nombre, precio, marca, localizacion, localizacion,
                                envase));
                        break;
                    case 3:
                        System.out.println("envase");
                        envase = sc.next();
                        System.out.println("(int) porcentaje azucar");
                        int azucar = sc.nextInt();
                        System.out.println("(bool) Promocion");
                        boolean promocion = sc.nextBoolean();
                        almacen.add(new Refresco(identificador, nombre, precio, marca, localizacion, envase, azucar,
                                promocion));
                        break;
                    default:
                        System.out.println("Valor incorrecto");
                        break;
                }
                break;
            case 5:

                System.out.println("ID a borrar");
                borrarProductoPorIdentificador(sc.nextInt());
                break;
            case 6:
                mostrar();
                break;
            default:
                System.out.println("Valor incorrecto");
                break;
        }
    }

    public static void borrarProductoPorIdentificador(int id) {
        almacen.stream().filter(p -> p.getIdentificador() == id).findFirst().ifPresent(producto -> almacen.remove(producto));
    }

    public static void mostrar() {
        almacen.stream().forEach(p -> System.out.println(p.toString()));
    }

    public static void anhadirProducto(Producto p) {
        almacen.add(p);
    }

    public static double getPrecioTotalBebidas() {
        return (almacen.stream().filter(Bebida.class::isInstance).mapToDouble(Producto::getPrecio).sum());
    }

    public static double getPrecioTotalProductos() {
        return (almacen.stream().mapToDouble(Producto::getPrecio).sum());
    }

    public static double getPrecioPorMarca(String marca) {
        return (almacen.stream().filter(p -> p.getMarca().equalsIgnoreCase(marca)).mapToDouble(Producto::getPrecio)
                .sum());
    }

    public static void llenarAlmacen() {
        almacen.add(new AguaMineral(10, "Agua nor", 2, "Aguanromal", "I", "Plastico", "I"));
        almacen.add(new AguaMineral(11, "aguaron", 1, "aguaron", "I", "plastico", "I"));
        almacen.add(new AguaMineral(12, "Agua nor", 1, "aguaron", "I", "cristal", "I"));

        almacen.add(new Refresco(13, "coca-cola 0", 3, "coca-cola", "I", "lata", 10, false));
        almacen.add(new Refresco(14, "pepsi", 3, "pepsi", null, "plastico", 20, true));
        almacen.add(new Refresco(15, "pepsi", 3, "pepsi", null, "lata", 20, false));

        almacen.add(new Alimentacion(16, "pan", 5, "bimbo", "I", "pan", true));
        almacen.add(new Alimentacion(17, "pan natural", 5, "bimbo", "I", "pan", false));
    }
}