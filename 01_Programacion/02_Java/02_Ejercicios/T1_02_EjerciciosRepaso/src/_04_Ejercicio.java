import java.util.Scanner;

/* Pedir solo un número. Determinar si es un número es primo o no. */

public class _04_Ejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = scan.nextInt();

        for (int i = 2; i < num; i++) {
            if ( num % i == 0 ){
                System.out.println("El numero no es primo");
                break;
            } 
            if ( i == num - 1) {
                System.out.println("El numero es primo");
            }
        }


    }    
}