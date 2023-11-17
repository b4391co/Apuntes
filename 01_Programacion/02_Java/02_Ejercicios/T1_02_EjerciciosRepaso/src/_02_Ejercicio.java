import java.util.Scanner;

/* Pedir un número N, y mostrar todos los números del 1 al N. */

public class _02_Ejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = scan.nextInt();
        System.out.println("");

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        
    }
}