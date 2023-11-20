
import java.util.HashMap;

public class _04_Romanos {
    public static void main(String[] args) {
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


}