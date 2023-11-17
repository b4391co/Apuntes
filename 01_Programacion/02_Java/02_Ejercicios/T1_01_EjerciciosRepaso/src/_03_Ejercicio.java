import java.util.Scanner;

public class _03_Ejercicio {
    public static void main(String[] args) {
        /* Leer 5 números y mostrarlos en orden inverso al introducido */
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("----------------------------------");

        for (int i = numeros.length - 1 ; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}