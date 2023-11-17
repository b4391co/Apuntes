public class Main {
    public static void main(String[] args) {

    }

    public static int checkWordLength(String word){
        return word.length();
    }

    public static int NumOfVowels(String word){
        char cadena[] = word.toCharArray();
        int contador = 0;
        for (char c : cadena) {
            if ( String.valueOf(c).toUpperCase().equals("A") || String.valueOf(c).toUpperCase().equals("E") || String.valueOf(c).toUpperCase().equals("I") || String.valueOf(c).toUpperCase().equals("O") || String.valueOf(c).toUpperCase().equals("U") ){
                contador++;
            }
        }
        return contador;
    }

    public static int checkNumberOfPrimes(int[] numbers){
        int contador = 0;
        for (int i : numbers) {
            if (isPrime(i)){
                contador++;
            }
        }
        return contador;
    }

    public static boolean isPrime(int i){
        for (int j = 2; j < i ; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentityMatrix(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ( i == j && matrix[i][j] != 1){
                    return false;
                }
                else if ( i != j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
