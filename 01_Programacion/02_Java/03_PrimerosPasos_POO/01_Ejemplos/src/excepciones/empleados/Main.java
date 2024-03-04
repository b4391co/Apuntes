package excepciones.empleados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static public ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        try {
            crearEmpleados();
        } catch (ExcepcionEmpleado e) {
            System.out.println(e.getMessage());
        }
        while(true)
            menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Agregar\t( 2 ) Mostrar");
        switch (verificarNumero("opcion: ")) {
            case 1:
                crearEmpleado();
                break;
            case 2:
                listar();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public static void listar() {
        empleados.stream().map(Empleado::toString).forEach(System.out::println);
    }
    
    public static void crearEmpleados() throws ExcepcionEmpleado {
        empleados.add(new Comercial("12345678A", "PEPEI", 20, 3000, 5));
        empleados.add(new Repartidor("12345678A", "PEPEII", 20, 5000, 5));
    }

    public static void crearEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Comercial\t( 2 ) Repartidor");
        int opcion = verificarNumero("opcion ");
        while (opcion < 1 || opcion > 2) {
            System.out.println("\n opcion invalida");
            opcion = verificarNumero("opcion ");
        }
        System.out.println("dni: ");
        String dni = sc.next();
        System.out.println("nombre: ");
        String nombre = sc.next();
        int edad = verificarNumero("edad");
        int salario = verificarNumero("salario");
        switch (opcion) {
            case 1:
                int comision = verificarNumero("comision");
                try {
                    empleados.add(new Comercial(dni, nombre, edad, salario, comision));
                } catch (ExcepcionEmpleado e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("comision: ");
                int zona = sc.nextInt();
                try {
                    empleados.add(new Comercial(dni, nombre, edad, salario, zona));
                } catch (ExcepcionEmpleado e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
        }

    }

    private static int verificarNumero(String dato) {
        Scanner sc = new Scanner(System.in);
        int v;
        while (true) {
            System.out.println("introduce: " + dato);w
            if (sc.hasNextInt()) {
                v = sc.nextInt();
                break;
            } else {
                System.out.println("\nPor favor, ingrese un valor numérico para " + dato);
                sc.next(); // Limpiar el búfer del escáner
            }
        }
        return v;
    }
}