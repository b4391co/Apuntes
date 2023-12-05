import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] test =  { 11, 12, 3, 4 } ;
        int tt = getMax(test);
        System.out.println(tt);
    }

    public static int[] getMinColumNum(int[][] matrix) {
        int[] resultado = new int[matrix.length];
        int menor = 999999999;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                menor = (menor > matrix[i][j]) ? matrix[i][j] : menor;
            }
            resultado[i] = menor;
            menor = 999999999;
        }
        return resultado;
    }
    
    public static int[] getMaxNums(int[][] matrix) {
        int contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 10)
                    contador++;
            }
        }
        int[] resultado = new int[contador];
        contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 10)
                    resultado[contador++] = matrix[i][j];
            }
        }
        return resultado;
    }

    public static int getMax(int[] array) {
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            mayor = (array[i] > mayor) ? array[i] : mayor;
        }
        return mayor;
    }
}
