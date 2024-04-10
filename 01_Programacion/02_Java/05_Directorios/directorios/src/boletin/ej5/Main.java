package boletin.ej5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String path = "./src/boletin/ej5/";
    static File file = new File(path + "info.txt");

    static ArrayList<Persona> Personas = new ArrayList<>();

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
                Utils.leerFichero(file);
                break;
            case 3:
                System.out.println("Buscador:");
                String termino = sc.nextLine();
                System.out.println(Utils.buscar(file,termino));
                break;
            case 4:
                System.out.println("Buscador:");
                sc.nextLine();
                termino = sc.nextLine();
                Utils.borrar(file,termino);
                escribirFichero();
                break;
            default:
                break;
        }
    }

    private static void crearRegistro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Direccion");
        String direccion = sc.nextLine();
        System.out.println("Telefono");
        int telefono = sc.nextInt();

        Personas.add(new Persona(nombre, direccion, telefono));
        escribirFichero();
    }

    private static void llenarTablas() {
        Personas.add(new Persona("Pepe", "Calle falsa 123", 66666666));
        Personas.add(new Persona("Juan", "Calle falsa 456", 77777777));
        Personas.add(new Persona("Luis", "Calle falsa 789", 88888888));
        Personas.add(new Persona("Ana", "Calle falsa 1011", 999999999));
    }

    public static void escribirFichero() {
        Utils.comprobarFichero(file);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true))) {
            for (int i = 0; i < Personas.size(); i++) {
                dos.writeUTF(Personas.get(i).getNombre() + " - " + Personas.get(i).getDireccion() + " - "
                        + Personas.get(i).getTelefono());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
