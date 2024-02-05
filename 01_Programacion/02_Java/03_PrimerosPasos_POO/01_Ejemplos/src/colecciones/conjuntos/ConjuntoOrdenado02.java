package colecciones.conjuntos;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado02 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new TreeSet<>();
        Set<Integer> conjunto2 = new TreeSet<>();
        Set<Integer> conjunto3 = new TreeSet<>();
        
        conjunto1.add(5);
        conjunto1.add(4);
        conjunto1.add(11);
        conjunto1.add(8);

        conjunto2.add(-116);
        conjunto2.add(-3);
        conjunto2.add(-10);
        conjunto2.add(9);

        System.out.println("\n\n");
        System.out.println(conjunto1.stream().mapToInt(Integer::intValue).sum());
        System.out.println(conjunto2.stream().mapToInt(Integer::intValue).sum());

        conjunto3.addAll(conjunto1);
        conjunto3.addAll(conjunto2);

        SortedSet<Integer> diferenciaConjuntos = new TreeSet<>(conjunto1);
        diferenciaConjuntos.removeAll(conjunto2);

        System.out.println(conjunto3);
        System.out.println(diferenciaConjuntos);
    }
}