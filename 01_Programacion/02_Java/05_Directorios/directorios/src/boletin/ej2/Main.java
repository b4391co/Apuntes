package boletin.ej2;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
        } else {
            try (FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
                out.print("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void escribirFichero() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
            for (int i = 0; i < productos.length; i++) {
                dos.writeUTF(productos[i] + " - " + precios[i] + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero() {
        try {
            DataInputStream fis = new DataInputStream(new FileInputStream(file));
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
