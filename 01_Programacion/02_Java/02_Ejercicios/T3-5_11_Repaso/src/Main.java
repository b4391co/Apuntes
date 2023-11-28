public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n========== EJ 1 ==========\n\n");
        // 5 minutos
        String[] frases = { "hola que tal", "hola buenas","adios" };
        System.out.println(countContainWords(frases, "Adios"));

        System.out.println("\n\n\n========== EJ 2 ==========\n\n");
        // 8 min
        System.out.println(getFinalNum(20, 50));

        System.out.println("\n\n\n========== EJ 3 ==========\n\n");
        // 7 min
        int[][] nums = { {1,2,3,5},{5,6,7,8}};
        int[] Rows = getFirstRow(nums, 4);
        for (int i : Rows) {
            System.out.println(i);
        }
    }
    
    public static int countContainWords(String[] phrases, String words) {
        int contador = 0;
        for (String phrase : phrases) {
            if (phrase.toLowerCase().contains(words.toLowerCase()))
                contador++;
        }
        return contador;
    }

    public static double getFinalNum(int num, double percentage) {
        double resultado = (percentage / 100) * num;
        System.out.println(resultado);
        if (resultado > 100 && resultado < 1000)
            resultado = resultado / 3;
        if (resultado < 10)
            resultado = resultado * 3;
        return resultado;
    }

    public static int[] getFirstRow(int[][] matrix, int columns) {
        int[] resultadoMatrix = new int[columns];
        for (int i = 0; i < resultadoMatrix.length; i++) {
            resultadoMatrix[i] = matrix[0][i];
        }
        return resultadoMatrix;
    }
}
