package boletin.ej2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    static String[] productos = { "Juan", "Maria", "Paco" };
    static Double[] precios = { 1.05, 2.0, 5.5};

    static String path = "./src/boletin/ej2/";
    static File file = new File(path + "productos.txt");
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
            for (int i = 0; i < productos.length; i++) {
                fos.write(productos[i].getBytes());
                fos.write(" - ".getBytes());
                fos.write(precios[i].toString().getBytes());
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
