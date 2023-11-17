import java.util.Scanner;

/* Crea una aplicación que dados 5 números por teclado los vaya sumando hasta
que el valor sea mayor que 3000. Cuando finalice se quiere saber cuántas
iteraciones tuvo que hacer. */

public class _04_Ejercicio {
    public static void main(String[] args) {
        int[] numerosSolicitados = solicitarNumeros(5);
        contarVecesSuma(numerosSolicitados);
    }


    public static int[] solicitarNumeros(int cantidadNumeros) {
        Scanner scan = new Scanner(System.in);
        int[] numerosSolicitados = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Introduce el " + (i + 1) + "º número: ");
            numerosSolicitados[i] = scan.nextInt();
        }
        
        return numerosSolicitados;
    }

    public static void contarVecesSuma(int[] numerosSolicitados){
        int suma = 0;
        int contador = 0;
        
        while (suma < 3000) {
            for (int i = 0; i < numerosSolicitados.length; i++) {
                suma += numerosSolicitados[i];
            }
            contador++;
        }
        System.out.println("----------------------------------");
        System.out.println("contador: " + contador);
        System.out.println("suma: " + suma);
    }
}