package boletin.ej5;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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

    public static String buscar(File file, String termino) {
        String busqueda = termino;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0) {
                String linea = dis.readUTF();
                if (linea.contains(busqueda))
                    return (linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No se ha encontrado ningun registro";
    }

    public static void borrar(File file,String termino) {
        String buscar = buscar(file,termino);
        if (!buscar.equals("No se ha encontrado ningun registro")){
            for (int i = 0; i < Main.Personas.size(); i++) {
                if (Main.Personas.get(i).getNombre().equals(termino)) {
                    System.out.println("Entra");
                    Main.Personas.remove(i);
                }
                else if (Main.Personas.get(i).getDireccion().equals(termino)) {
                    Main.Personas.remove(i);
                }
            }
        }
    }
}
