import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int menuOpcion = 0;
        String frase = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n========== MORSE ==========\n");
        System.out.println("\n ( 1 ) Texto - Morse");
        System.out.println("\n ( 2 ) Morse - Texto\n");
        menuOpcion = sc.nextInt();
        frase = sc.nextLine();
        if (menuOpcion == 1) {
            System.out.println("\n- Texto - Morse - \nintrodiuce un texto:\n");
            frase = sc.nextLine();
            traducirTM(frase);
        }
        else if (menuOpcion == 2) {
            System.out.println("\n- Morse - Texto - \nintrodiuce un texto:\n");
            frase = sc.nextLine();
            traducirMT(frase);
        }
        else {
            System.out.println("Error: opcion invalida");
        }
        main(args);
    }


    public static void traducirTM(String frase) {
        HashMap<Character, String> valores = new HashMap<>();
        valores.put('a', ".-");
        valores.put('b', "-...");
        valores.put('c', "-.-.");
        valores.put('d', "-..");
        valores.put('e', ".");
        valores.put('f', "..-.");
        valores.put('g', "--.");
        valores.put('h', "....");
        valores.put('i', "..");
        valores.put('j', ".---");
        valores.put('k', "-.-");
        valores.put('l', ".-..");
        valores.put('m', "--");
        valores.put('n', "-.");
        valores.put('o', "---");
        valores.put('p', ".--.");
        valores.put('q', "--.-");
        valores.put('r', ".-.");
        valores.put('s', "...");
        valores.put('t', "-");
        valores.put('u', "..-");
        valores.put('v', "...-");
        valores.put('w', ".--");
        valores.put('x', "-..-");
        valores.put('y', "-.--");
        valores.put('z', "--..");
        valores.put('1', ".----");
        valores.put('2', "..---");
        valores.put('3', "...--");
        valores.put('4', "....-");
        valores.put('5', ".....");
        valores.put('6', "-....");
        valores.put('7', "--...");
        valores.put('8', "---..");
        valores.put('9', "----.");
        valores.put('0', "-----");

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) != ' ')
                System.out.print(valores.get(frase.toLowerCase().charAt(i)) + " ");
            else
                System.out.print("/ ");
        }
    }
    
    public static void traducirMT(String frase){
        HashMap<String, Character> valores = new HashMap<>();
            valores.put(".-"   , 'a');
            valores.put("-..." , 'b');
            valores.put("-.-." , 'c');
            valores.put("-.."  , 'd');
            valores.put("."    , 'e');
            valores.put("..-." , 'f');
            valores.put("--."  , 'g');
            valores.put("...." , 'h');
            valores.put(".."   , 'i');
            valores.put(".---" , 'j');
            valores.put("-.-"  , 'k');
            valores.put(".-.." , 'l');
            valores.put("--"   , 'm');
            valores.put("-."   , 'n');
            valores.put("---"  , 'o');
            valores.put(".--." , 'p');
            valores.put("--.-" , 'q');
            valores.put(".-."  , 'r');
            valores.put("..."  , 's');
            valores.put("-"    , 't');
            valores.put("..-"  , 'u');
            valores.put("...-" , 'v');
            valores.put(".--"  , 'w');
            valores.put("-..-" , 'x');
            valores.put("-.--" , 'y');
            valores.put("--.." , 'z');
            valores.put(".----", '1');
            valores.put("..---", '2');
            valores.put("...--", '3');
            valores.put("....-", '4');
            valores.put(".....", '5');
            valores.put("-....", '6');
            valores.put("--...", '7');
            valores.put("---..", '8');
            valores.put("----.", '9');
            valores.put("-----", '0');

            String[] fraseArray = frase.split(" ");
            for (int i = 0; i < fraseArray.length; i++) {
                if (valores.containsKey(fraseArray[i]))
                    System.out.print(valores.get(fraseArray[i]));
                else 
                    System.out.print(" ");
            }
    }
}