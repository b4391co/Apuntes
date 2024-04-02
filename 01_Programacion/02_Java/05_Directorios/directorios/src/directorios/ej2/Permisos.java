package directorios.ej2;

import java.io.File;
import java.util.Scanner;

public class Permisos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ruta:");
        String path = sc.next();
        System.out.println();

        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            System.out.println("Carpeta\nLectura: " + file.canRead() + "\nEscritura: " + file.canWrite());
        }
        else if (file.exists() && !file.isDirectory()) {
            System.out.println("Archivo\nLectura: " + file.canRead() + "\nEscritura: " + file.canWrite());
        }
        else {
            System.out.println("El fichero/carpeta no existe");
        }
    }
}
