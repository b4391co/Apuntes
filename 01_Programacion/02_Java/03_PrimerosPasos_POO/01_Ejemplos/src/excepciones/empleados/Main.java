package excepciones.empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static public ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        crearEmpleados();
        while(true)
            menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Agregar\t( 2 ) Mostrar");
        switch (sc.nextInt()) {
            case 1:
                crearEmpleado();
                break;
            case 2:
                listar();
                break;
            default:
                System.out.println("Valor incorrecto");
                break;
        }
    }

    public static void listar() {
        empleados.stream().map(Empleado::toString).forEach(System.out::println);
    }
    
    public static void crearEmpleados() {
        empleados.add(new Comercial("12345678A", "PEPE I", 20, 3000, 5));
        empleados.add(new Repartidor("12345678A", "PEPE II", 20, 5000, 5));
    }

    public static void crearEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Comercial\t( 2 ) Repartidor");
        int opcion = sc.nextInt();
        System.out.println("dni: ");
        String dni = sc.next();
        System.out.println("nombre: ");
        String nombre = sc.next();
        System.out.println("edad: ");
        int edad = sc.nextInt();
        System.out.println("salario: ");
        double salario = sc.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("comision: ");
                double comision = sc.nextDouble();
                empleados.add(new Comercial(dni, nombre, edad, salario, comision));
                break;
            case 2:
                System.out.println("comision: ");
                int zona = sc.nextInt();
                empleados.add(new Comercial(dni, nombre, edad, salario, zona));
            default:
                System.out.println("valor incorrecto");
                break;
        }
    }
}