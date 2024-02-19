package colecciones.conjuntos;

import java.util.ArrayList;

public class CadenasDeTexto01 {

    static ArrayList<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        anhadirNombres();
        verLista();
        System.out.println("\n==============\nBUSCAR POR NOMBRE:\n" + buscarPorNombre("Pepe V") + "\n==============\n");
        eliminarPorNombre("Pepe V");
        verLista();
    }

    public static void eliminarPorNombre(String nombre) {
        lista.remove(buscarPorNombre(nombre));
    }

    public static int buscarPorNombre(String nombre) {
        return lista.indexOf(lista.stream().filter(n -> n.equalsIgnoreCase("Pepe V")).findFirst().orElse("No encontrado"));
    }

    public static void anhadirNombres() {
        lista.add("Pepe I");
        lista.add("Pepe II");
        lista.add("Pepe III");
        lista.add("Pepe IV");
        lista.add("Pepe V");
    }

    public static void verLista() {
        // lista.stream().forEach(System.out::println);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " => " + lista.get(i));
        }
    }

}