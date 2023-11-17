import java.util.Arrays;
import java.util.Random;

public class _04_tablaBidimensional {
    public static void main(String[] args) {
        /* Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
	debe contener n+m. Después se debe mostrar su contenido. */
    
        int[][] tabla = generarMatrix(7, 7);
        System.out.println("\n\n Tabla");
        mostrarMatrix(tabla);
    }

    public static int[][] generarMatrix(int x, int y){
        Random rand = new Random();

        int[][] matrix = new int[x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = i+j;
            }
        }
        return matrix;
    }

    public static void mostrarMatrix(int[][] matrix){
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}