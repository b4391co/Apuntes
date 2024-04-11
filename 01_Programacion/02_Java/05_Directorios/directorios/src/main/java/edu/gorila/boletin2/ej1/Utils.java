package edu.gorila.boletin2.ej1;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Utils {
    public static void comprobarFichero(File file) {
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

    public static void leerFichero(File file) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0)
                System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int calcularMedia(File file) {
        int contador = 0;
        int suma = 0;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0){
                suma += Integer.parseInt(dis.readUTF());
                contador ++;
            }
            return suma/contador;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
