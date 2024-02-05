package colecciones.conjuntos;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado01 {
    public static void main(String[] args) {
        Set<String> conjunto1 = new TreeSet<>();
        Set<String> conjunto2 = new TreeSet<>();
        Set<String> conjuntoMix = new TreeSet<>();
        Set<String> conjuntoMix2 = new TreeSet<>();

        conjunto1.add("Manzana");
        conjunto1.add("Banana");
        conjunto1.add("Naranja");
        conjunto1.add("Uva");

        conjunto2.add("Pera");
        conjunto2.add("Manzana");
        conjunto2.add("Kiwi");
        conjunto2.add("Uva");

        SortedSet<String> diferenciaConjuntos = new TreeSet<>(conjunto1);
        diferenciaConjuntos.removeAll(conjunto2);
        
        //conjunto1.remove("Naranja");

        conjuntoMix.addAll(conjunto1);
        conjuntoMix.addAll(conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println(conjuntoMix);
        System.out.println(diferenciaConjuntos);
    }
}