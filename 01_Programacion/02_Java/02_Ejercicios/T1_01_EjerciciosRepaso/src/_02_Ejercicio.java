import java.util.ArrayList;
import java.util.Scanner;

public class _02_Ejercicio {
    /* Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introdce el numero");
        int numero = scan.nextInt();
        while ( numero != -1 ) {
            numeros.add(numero);
            System.out.println("Introdce el numero");
            numero = scan.nextInt();
        }


        System.out.println("----------------------------------");

        int contadorMultiplos = 0;
        for (int i : numeros) {
            if ( i % 3 == 0){
                contadorMultiplos++;
                System.out.println(i);
            }
        }

        System.out.println("el total de multiplos de 3 es: " + contadorMultiplos);
    }
}