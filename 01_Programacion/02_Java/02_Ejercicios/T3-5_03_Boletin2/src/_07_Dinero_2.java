
public class _07_Dinero_2 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------- Dinero ----------------\n");
        int dinero = 5543;

        System.out.println(calcularBilletes(dinero));
    }

    public static String calcularBilletes(int dinero) {
        int[] billetes = { 200, 100, 50, 20, 10, 5 };
        int contador = 0;
        String resultado = "";
        for (int i : billetes) {
            while (dinero >= i) {
                dinero -= i;
                contador++;
            }
            if (contador != 0)
                resultado += ("\n" + contador + " billetes de " + i);
            contador = 0;
        }
        return resultado;
    }
}