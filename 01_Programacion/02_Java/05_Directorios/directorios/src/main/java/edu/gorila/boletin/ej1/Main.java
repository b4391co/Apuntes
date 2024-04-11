package edu.gorila.boletin.ej1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    static String[] nombres = { "Juan", "Maria", "Paco" };
    static String path = "./src/main/java/edu/gorila/boletin/ej1/";
    static File file = new File(path + "nombres.txt");
    public static void main(String[] args) {
        comprobarFichero();
        escribirFichero();
        leerFichero();
    }

    public static void comprobarFichero() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void escribirFichero() {
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.getChannel().truncate(0);
            for (String nombre : nombres) {
                fos.write(nombre.getBytes());
                fos.write("\n".getBytes());
            }
            fos.write("\n".getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero() {
        try {
            FileInputStream fis = new FileInputStream(file);
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
