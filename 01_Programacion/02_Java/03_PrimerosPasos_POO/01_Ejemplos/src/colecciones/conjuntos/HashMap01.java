package colecciones.conjuntos;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<Integer, String> codigosPostales = new HashMap<>();
        codigosPostales.put(36, "Pontevedra");
        codigosPostales.put(15, "Coruña");
        codigosPostales.put(27, "Lugo");
        codigosPostales.put(32, "Ourense");

        mostrarDatos(codigosPostales); // A
        localizarProvincia(codigosPostales); // B
        codigosPostales = eliminarProvincias(codigosPostales); // C
        mostrarDatos(codigosPostales); // D
    }

    public static void mostrarDatos(HashMap<Integer, String> codigosPostales) {
        System.out.println("\n================\nCodigos Postales\n" + codigosPostales);
    }

    public static void localizarProvincia(HashMap<Integer, String> codigosPostales) {
        System.out.println("\nLocaliazar Provincia\nIntroduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int codProvincia = sc.nextInt();
        if (codigosPostales.containsKey(codProvincia))
            System.out.println(codigosPostales.get(codProvincia));
        else
            System.out.println("Codigo invalido");
    }
    
    public static HashMap<Integer, String> eliminarProvincias(HashMap<Integer, String> codigosPostales) {
        codigosPostales.remove(36);
        codigosPostales.remove(27);
        return codigosPostales;
    }
    
}