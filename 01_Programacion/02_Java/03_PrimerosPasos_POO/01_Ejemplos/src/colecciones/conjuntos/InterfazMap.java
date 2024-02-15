package colecciones.conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InterfazMap {
    static ArrayList<Character> letras = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter:");
        String value = sc.nextLine();
        while (value != "") {
            almacenar(value);
            value = sc.nextLine();
        }
        mostrar();
        getLast();
    }

    public static void almacenar(String value) {
        for (int i = 0; i < value.length(); i++) {
            letras.add(value.charAt(i));
        }
    }

    public static void mostrar() {
        System.out.println(letras);
    }

    public static void getLast() {
        Collections.reverse(letras);
        System.out.println(letras.get(0));
        Collections.reverse(letras);
    }
}
