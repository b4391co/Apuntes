import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int puertaGanadora = rand.nextInt(100);
        System.out.println("\n\n\n---------- PUERTAS ----------");
        System.out.println("selecciona una caja del 1 al 100");
        int puertaSeleccion = sc.nextInt();

        System.out.println("El premio esta en la puerta " + puertaSeleccion + " o en la " + puertaGanadora);
        System.out.println("mantienes la puerta ( 1 ) o cambias a la " + puertaGanadora + " ( 2 )");
        
        if ( puertaSeleccion != puertaGanadora ){
            int opcion;
            if ( (opcion = sc.nextInt()) == 1 ) System.out.println("Has perdido, la puerta ganadora era: " + puertaGanadora);
            if ( opcion == 2 ) System.out.println("Has Ganado");
        }
        else System.out.println("Has Ganado");
    }
}
