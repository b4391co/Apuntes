import java.util.Random;

public class _01_DesplazarNumeros {
    public static void main(String[] args) {
    /* Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
	la derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. 
	El último pasa a ser el primero. */
        System.out.println("Desplazar tabla");

        int[] tabla = generarNumeros(10);
        int[] tablaModificada = modificarTabla(tabla);

        System.out.println("\n\n---------- NUMEROS ----------");
        mostrarNumeros(tabla);
        System.out.println("\n\n---------- TABLA MODIFICADA ----------");
        mostrarNumeros(tablaModificada);
    }

    public static int[] generarNumeros(int cantidadNumeros){
        Random rand = new Random();
        int[] numerosGenerados = new int[cantidadNumeros];
        
        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = rand.nextInt((10 - 0) + 1) + 0;
        }
        return numerosGenerados;
    }

    public static int[] modificarTabla(int[] numeros){
        int[] tablaModificada = new int[numeros.length];
        int primerNumero = numeros[numeros.length - 1];

        for (int i = 1; i < tablaModificada.length; i++) {
            tablaModificada[i] = numeros[i-1];
        }
        tablaModificada[0] = primerNumero;

        return tablaModificada;
    }

    public static void mostrarNumeros(int[] numeros){
        for (int i : numeros) {
            System.out.printf(i + ",");
        }
    }
}