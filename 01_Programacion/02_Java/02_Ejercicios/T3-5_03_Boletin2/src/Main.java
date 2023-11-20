import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nEJERCICIO 2");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nEJERCICIO 3");
        int longitud = 7;
        for (int i = 1; i <= longitud; i += 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = longitud-2; i >= 1; i -= 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nEJERCICIO 4");
        longitud = 7;
        for (int i = 1; i <= longitud; i += 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i/2; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = longitud-2; i >= 1; i -= 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
