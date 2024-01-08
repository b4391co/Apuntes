import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] test =  {{ 12, 4, 3, 5 },{ 11, 1, 3, 4 }} ; 
        int[] tt = getMinColumNum(test);
        for (int i = 0; i < tt.length; i++) {
            System.out.println(tt[i]);
        }
        System.out.println("=========");
        int[] test2 =  { 11, 12, 3, 4 } ;
        int tt2 = getMax(test2);
        System.out.println(tt2);
    }

    public static int[] getMinColumNum(int[][] matrix) {
        int[] resultado = new int[matrix[0].length];
        int menor = 999999999;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                menor = (menor > matrix[j][i]) ? matrix[j][i] : menor;
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
