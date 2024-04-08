package boletin.ej3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> listaProductos = new ArrayList<>();
    static ArrayList<Double> listaPrecios = new ArrayList<>();

    static String path = "./src/boletin/ej3/";
    static File file = new File(path + "productos.txt");

    public static void main(String[] args) {
        llenarTablas();
        escribirFichero(file);
        leerFichero(file);
        eliminarProducto(file,"Manzana");
        leerFichero(file);
    }

    private static void llenarTablas() {
        listaProductos.add("Manzana");
        listaProductos.add("Pera");
        listaProductos.add("Naranja");

        listaPrecios.add(0.50);
        listaPrecios.add(0.60);
        listaPrecios.add(0.70);
    }

    private static void eliminarProducto(File file,String nombreEliminar) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int byteLeido;
            String nombre = "";
            while ((byteLeido = fis.read()) != -1) {
                if (byteLeido != 32)
                    nombre += (char) byteLeido;
                else
                    nombre = "";

                if (nombre.equals(nombreEliminar)) {
                    int index = listaProductos.indexOf(nombre);
                    listaProductos.remove(index);
                    listaPrecios.remove(index);
                }

                escribirFichero(file);
            }
            
            
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void comprobarFichero(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void escribirFichero(File file) {
        comprobarFichero(file);
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.getChannel().truncate(0);
            for (int i = 0; i < listaProductos.size(); i++) {
                fos.write(listaProductos.get(i).toString().getBytes());
                fos.write(" - ".getBytes());
                fos.write(listaPrecios.get(i).toString().getBytes());
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

    public static void leerFichero(File file) {
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
