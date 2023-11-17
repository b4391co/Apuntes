import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n");
        int[] test = {100102,500,5000};
        // triple(test);
        // distance(test);
        // vowelCounter("murcielago"); //Después prueba con patata
        // vowelCounter("murciélago");
        // vowelCounter("patata");

        String[] frutas = {"Pera", "Pera", "Manzana", "Naranja", "Pera"};
        //String[] frutas2 = {"Pera", "Pera", "Manzana", "Naranja"};
        frutas(frutas);
        //frutas(frutas2);

    }
    //Cambia el siguiente método para que pueda recibir como parámetro un array de números para
    //que sean multiplcados por 3
    public static void triple(int[] valores){
        for (int i : valores) {
            System.out.println(i*3);
        }
    }
    //Cambia el siguiente método para se le pueda pasar un array de centrimetros.
    public static void distance(int[] centimeters){
        for (int centimeter : centimeters) {
            int km = centimeter/100000;
            int m = (centimeter%100000)/100;
            int cm = (centimeter%100);

            System.out.println(km +" Kilometros " + m + " metros " + cm + " centimetros");
        }
    }

    //Arregla este método. Está raro.
    public static void vowelCounter(String palabra){
        int counter = 0;
        char[] letrasPalabra = palabra.toCharArray();
        char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
        for (char letra : letrasPalabra) {
            letra = Character.toLowerCase(letra);
            for (char vocal : vocales) {
                if (letra == vocal) counter++;
            }
        }
        System.out.println("Número de vocales: " + counter);
    }

    //Nuestro programador no sabe como obtener el número de frutas iguales que están las bolsas
    public static void frutas(String[] frutas){
        //El siguiente tipo de estructura de datos se llama diccionario, HashMap o clave/valor.
        //Permite encontrar un valor buscando por su clave.
        HashMap<String, Integer> fruitsCounter = new HashMap<>();

        for (String fruta : frutas) {
            int valor = 0;
            if (fruitsCounter.get(fruta) != null) valor = fruitsCounter.get(fruta);
            fruitsCounter.put(fruta, valor + 1);
        }
        
        System.out.println(fruitsCounter.keySet());
        String[] frutasUnicas = fruitsCounter.keySet().toArray(new String[0]);

        for (String fruta : frutasUnicas) {
            System.out.println(fruta + ": " + fruitsCounter.get(fruta));
        }
    }
}