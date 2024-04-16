
package edu.gorila.boletin2.ej1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static String path = "./src/main/java/edu/gorila/boletin2/ej1/";
    static File file = new File(path + "nums.txt");

    public static void main(String[] args) {
        escribirFichero();
        Utils.leerFichero(file);
        System.out.println("Media: " + Utils.calcularMedia(file));
    }

    public static void escribirFichero() {
        Utils.comprobarFichero(file);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
            for (int i = 0; i < 100; i++) {
                dos.writeUTF("" + (i + 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
