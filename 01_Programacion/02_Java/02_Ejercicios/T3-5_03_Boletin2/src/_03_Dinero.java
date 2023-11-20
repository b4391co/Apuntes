
public class _03_Dinero {
    public static void main(String[] args) {
        //  EJ 12
        System.out.println("\n\n---------------- Dinero ----------------\n");
        int dinero = 5543;

        System.out.println(calcularBilletes(dinero));
    }

    public static String calcularBilletes(int dinero){
        int[] billetes = {200,100,50,20,10,5};
        int contador = 0;
        String calculo = "";
        for (int i = 0; i < billetes.length; i++) {
            while(dinero >= billetes[i]){
                dinero -= billetes[i];
                contador++;
            }
            if ( contador != 0) calculo += ("\n" + contador + " billetes de " + billetes[i]+ "€");
            contador = 0;
        }
        if ( dinero > 0 ){
            calculo += ("\nSobran: " + dinero + "€");
        }
        return calculo;
    }

}