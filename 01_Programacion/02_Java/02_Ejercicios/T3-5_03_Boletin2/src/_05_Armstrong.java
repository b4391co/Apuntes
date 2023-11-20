
public class _05_Armstrong {
    public static void main(String[] args) {
        // EJ 4
        int num = 153;
        System.out.println("\n\n\n --------------------- esOmirp ---------------------\n\n");
        System.out.println(armstrong(num));

    }

    public static boolean armstrong(int num) {
        int numLength = String.valueOf(num).length();
        int suma = 0;
        for (int i = 0; i < numLength; i++) {
            suma += Math.pow(Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i))), numLength);
        }
        return (suma == num);
    }
}