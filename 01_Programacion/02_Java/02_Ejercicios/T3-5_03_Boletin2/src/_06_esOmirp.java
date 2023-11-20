
public class _06_esOmirp {
    public static void main(String[] args) {
        // EJ 9
        int num = 7951;
        System.out.println("\n\n\n --------------------- esOmirp ---------------------\n\n");


        System.out.println(num + ": " + esOmirp(num));
    }

    public static boolean esOmirp(int num) {
        return (esPrimo(num) && esPrimo(reverse(num)));
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
            if (i == num - 1) {
                return true;
            }
        }
        return false;
    }

    public static int reverse(int num) {
        int numLength = String.valueOf(num).length();
        String suma = "";
        for (int i = numLength - 1; i >= 0; i--) {
            suma += String.valueOf(num).charAt(i);
        }
        return (Integer.parseInt(suma));
    }

}