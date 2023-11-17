import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nEJERCICIO 2");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nEJERCICIO 3");
        int longitud = 7;
        for (int i = 1; i <= longitud; i += 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = longitud-2; i >= 1; i -= 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nEJERCICIO 4");
        longitud = 7;
        for (int i = 1; i <= longitud; i += 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i/2; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = longitud-2; i >= 1; i -= 2) {
            int espacios = (longitud-i)/2;
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // EJ 5
        System.out.println("\n\n---------------- Lucky Number ----------------\n");
        String date = "01-01-2000";
        System.out.println(luckyNumberCheck(date));

        //  EJ 11
        System.out.println("\n\n---------------- Tiempo ----------------\n");
        int t = 7120;

        System.out.println(calcularTiempo(t));

        //  EJ 12
        System.out.println("\n\n---------------- Dinero ----------------\n");
        int dinero = 5543;

        System.out.println(calcularBilletes(dinero));

        //  EJ 8
        System.out.println("\n\n---------------- Numeros Romanos ----------------\n");
        int num = 3899 ;
        System.out.println(numerosRomanos(num));

        
    }

    public static String numerosRomanos(int num){
        HashMap<Character,Integer> valores = new HashMap<>();
        valores.put('M', 1000);
        valores.put('D', 500);
        valores.put('C', 100);
        valores.put('L', 50);
        valores.put('X', 10);
        valores.put('V', 5);
        valores.put('I', 1);

        HashMap<Integer,Character> posiciones = new HashMap<>();
        posiciones.put(0 ,'M');
        posiciones.put(1 ,'D');
        posiciones.put(2 ,'C');
        posiciones.put(3 ,'L');
        posiciones.put(4 ,'X');
        posiciones.put(5 ,'V');
        posiciones.put(6 ,'I');

        String resultado = "";
        int contador = 0;
        for (int i = 0; i < posiciones.size(); i++) {
            while ( num >= valores.get(posiciones.get(i))){
                contador++;
                num -= valores.get(posiciones.get(i));
            }
            if (contador <= 3){
                for (int j = 0; j < contador; j++) {
                    resultado += posiciones.get(i);
                }
            }else{
                resultado = resultado.substring(0, resultado.length() - 1);
                resultado += (posiciones.get(i) + "" + posiciones.get(i-2));
            }
            contador = 0;
        }
        return resultado;
    }

    public static int luckyNumberCheck(String date){
        int dia = Integer.parseInt(date.substring(0,2));
        int mes = Integer.parseInt(date.substring(3,5));
        int anho = Integer.parseInt(date.substring(6,10));


        int luckyNumber = dia + mes + anho;
        String luckyNumberString = String.valueOf(luckyNumber);
        luckyNumber = 0;
        for (int i = 0; i < 4; i++) {
            luckyNumber += Integer.parseInt(luckyNumberString.substring(i,i+1));
        }
        return luckyNumber;
    }

    public static String calcularTiempo(int t){
        int horas = t / 3600;
        int minutos = ( t%3600 )/60;
        int segundos = ( t%3600 )%60;
        return(horas + " Horas " + minutos + " Minutos " + segundos + " Segundos "); 
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
