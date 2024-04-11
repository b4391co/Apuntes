package edu.gorila.boletin.ej4;

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
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> listaNombres = new ArrayList<>();
    static ArrayList<String> listaDirecciones = new ArrayList<>();
    static ArrayList<Integer> listaTelefonos = new ArrayList<>();

    static String path = "./src/main/java/edu/gorila/boletin/ej4/";
    static File file = new File(path + "info.txt");

    public static void main(String[] args) {
        llenarTablas();
        escribirFichero();
        while (true)
            menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("(1) Añadir");
        System.out.println("(2) Listar");
        System.out.println("(3) Buscar");
        System.out.println("(4) Borrar");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                crearRegistro();
                break;
            case 2:
                leerFichero();
                break;
            case 3:
                System.out.println(buscar());
            case 4:
                borrar();
            default:
                break;
        }
    }

    private static void borrar() {
        String linea = buscar();
        if (linea.contains(" - ")) {
            int index = listaNombres.indexOf(linea.split(" - ")[0]);
            listaNombres.remove(index);
            listaTelefonos.remove(index);
            listaDirecciones.remove(index);
            escribirFichero();
        }
            
    }

    private static String buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buscador:");
        String busqueda = sc.nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            while (dis.available() > 0) {
                String linea = dis.readUTF();
                if(linea.contains(busqueda))
                    return(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No se ha encontrado ningun registro";
    }

    private static void crearRegistro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Direccion");
        String direccion = sc.nextLine();
        System.out.println("Telefono");
        int telefono = sc.nextInt();

        listaNombres.add(nombre);
        listaDirecciones.add(direccion);
        listaTelefonos.add(telefono);
        escribirFichero();
    }

    private static void llenarTablas() {
        listaNombres.add("Pepe");
        listaNombres.add("Juan");
        listaNombres.add("Luis");

        listaDirecciones.add("Casa I");
        listaDirecciones.add("Casa II");
        listaDirecciones.add("Casa III");

        listaTelefonos.add(66666666);
        listaTelefonos.add(77777777);
        listaTelefonos.add(88888888);
    }

    private static void eliminarProducto(String valorEliminar) {
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
        comprobarFichero();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
            for (int i = 0; i < listaNombres.size(); i++) {
                dos.writeUTF(listaNombres.get(i) + " - " + listaDirecciones.get(i) + " - " + listaTelefonos.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            while (dis.available() > 0)
                System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
