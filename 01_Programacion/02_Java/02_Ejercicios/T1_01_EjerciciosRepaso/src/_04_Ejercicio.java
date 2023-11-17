import java.util.Scanner;

public class _04_Ejercicio {
    public static void main(String[] args) {
        /* Realizar una aplicación que devuelva si una palabra es un palíndromo o no */
        Scanner scan = new Scanner(System.in);

        System.out.println("introduce una palabra");
        String palabra = scan.nextLine();

        for (int i = 0; i <= (palabra.length() / 2) - 1; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                System.out.println("La palabra no es palíndromo");
                break;
            }
        }

        System.out.println("La palabra palíndromo");
    }
}