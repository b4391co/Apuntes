package colecciones.clase;
import java.util.HashMap;
import java.util.Scanner;

import colecciones.conjuntos.HashMap01;

public class Main {
    static HashMap<Integer, Alumno> alumnos = new HashMap<>(); // Nº Expediente, Alumno

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inserciones();

        while (true) {
            System.out.println("\n===========================================================\n ( 1 ) Contar\t( 2 ) Buscar \t( 3 ) Eliminar\t( 0 ) Salir\n===========================================================");
            int selec = sc.nextInt();
            if ( selec == 0 )
                break;
            if (selec == 1 )
                contarAlumnos();
            if (selec == 2 ){
                System.out.println("\nBuscar alumno: ");
                infoAlumno(sc.nextInt());
            }
            if (selec == 3) {
                System.out.println("\nEliminar alumno: ");
                eliminarAlumno(sc.nextInt());
            }
        }
    }
    
    public static void inserciones() {
        alumnos.put(1, new Alumno("Pepe I", "12345678A", 20, "Casa Pepe 1"));
        alumnos.put(2, new Alumno("Pepe II", "12345678B", 21, "Casa Pepe 2"));
        alumnos.put(3, new Alumno("Pepe III", "12345678C", 22, "Casa Pepe 3"));
        alumnos.put(4, new Alumno("Pepe IV", "12345678D", 23, "Casa Pepe 4"));
    }
    
    public static void contarAlumnos() {
        System.out.println("\nNumero de alumnos: " + alumnos.size());
    }

    public static void infoAlumno(int numExpediente) {
        if (alumnos.containsKey(numExpediente))
            System.out.println("\nExp: " + numExpediente + " :  " + alumnos.get(numExpediente).toString());
        else
            System.out.println("\nEl alumno no Existe");
    }

    public static void eliminarAlumno(int numExpediente) {
        if (alumnos.containsKey(numExpediente)){
            System.out.println("\nAlumno " + numExpediente + " : ELIMINIADO");
            alumnos.remove(numExpediente);
        }
        else
            System.out.println("\nEl alumno no Existe");
    }
}