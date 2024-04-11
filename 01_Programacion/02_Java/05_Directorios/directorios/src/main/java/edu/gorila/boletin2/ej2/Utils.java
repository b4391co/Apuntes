package edu.gorila.boletin2.ej2;

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

    public static String leerFichero(File file) {
        comprobarFichero(file);

        String text = "";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0)
                text += (dis.readUTF());
            return text;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void escribirFichero(File file, String text) {
        comprobarFichero(file);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
            dos.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void intercambiarFicherios(File file1, File file2) {
        comprobarFichero(file1);
        comprobarFichero(file2);

        String path = "./src/main/java/edu/gorila/boletin2/ej2/";
        File tmp = new File(path + "tmp.txt");
        
        escribirFichero(tmp, leerFichero(file1));
        escribirFichero(file1, leerFichero(file2));
        escribirFichero(file2, leerFichero(tmp));
    }
}
