package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        String texto = pedirTexto();
        while (true) {
            comprobarCaracter(texto);
        }
    }

    public static void comprobarCaracter(String t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCaracter a seleccionar");
        try {
            int p = sc.nextInt() - 1;
            if (p > t.length() || p < 0)
                throw new Excepciones("Posicion invalida");
            System.out.println(t.charAt(p));
        } catch (Excepciones e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("numero invalido");
        }
    }

    public static String pedirTexto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un texto");
        return sc.next();
    }
}