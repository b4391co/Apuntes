import java.util.Random;

public class _02_paresImpares {
    public static void main(String[] args) {
        /* Crear 20 números random. Depspués contar de esos 20 números cuantos pares e impares hay.
	    El programa creará 2 arrays, uno de pares y otro de impares con el tamaño correcto en
	    base al número de pares e impares que haya en esos 20 números random.
	    Por último, imprimir por pantalla estos 2 arrays. */

        int[] numeros = generarNumeros(20);
        int[] pares = comprobarPares(numeros, "par");
        int[] impares = comprobarPares(numeros, "impar");

        System.out.println("\n\n---------- NUMEROS ----------");
        mostrarNumeros(numeros);
        System.out.println("\n\n---------- PARES ----------");
        mostrarNumeros(pares);
        System.out.println("\n\n---------- IMPARES ---------- ");
        mostrarNumeros(impares);

    }

    public static int[] generarNumeros(int cantidadNumeros){
        Random rand = new Random();
        int[] numerosGenerados = new int[cantidadNumeros];
        
        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = rand.nextInt((10 - 0) + 1) + 0;
        }
        return numerosGenerados;
    }

    public static int[] comprobarPares(int[] numeros, String operacion){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ( numeros[i]%2 == 0 && operacion.equals("par")){
                contador++;
            }
            if ( numeros[i]%2 != 0 && operacion.equals("impar")){
                contador++;
            }
        }
        int[] resultado = new int[contador];
        contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if ( numeros[i]%2 == 0 && operacion.equals("par")){
                resultado[contador] = numeros[i];
                contador++;
            }
            if ( numeros[i]%2 != 0 && operacion.equals("impar")){
                resultado[contador] = numeros[i];
                contador++;
            }
        }
        return resultado;
    }

    public static void mostrarNumeros(int[] numeros){
        for (int i : numeros) {
            System.out.printf(i + ",");
        }
    }
}