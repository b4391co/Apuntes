import java.util.Arrays;
import java.util.Random;

public class _03_ordenarArray {
    /* Pide 5 números por pantalla y crea un algoritmo que ordene estos números de menor a mayor. */
    public static void main(String[] args) {

        int[] numeros = generarNumeros(5);
        int[] numerosOrdenados = ordenarNumeros(numeros.clone());

        System.out.println("\n\n---------- NUMEROS ----------");
        mostrarNumeros(numeros);
        System.out.println("\n\n---------- ORDENADOS ----------");
        mostrarNumeros(numerosOrdenados);

    }

    public static int[] generarNumeros(int cantidadNumeros){
        Random rand = new Random();

        int[] numerosGenerados = new int[cantidadNumeros];

        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = rand.nextInt((10 - 0) + 1) + 0;
        }
        return numerosGenerados;
    }

    public static int[] ordenarNumeros(int[] nums){
        Arrays.sort(nums);
        return nums;
    }

    public static void mostrarNumeros(int[] numeros){
        for (int i : numeros) {
            System.out.printf(i + ",");
        }
    }
}