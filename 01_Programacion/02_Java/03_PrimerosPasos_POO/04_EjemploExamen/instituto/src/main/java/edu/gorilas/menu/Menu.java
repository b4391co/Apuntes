package edu.gorilas.menu;

import java.util.ArrayList;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

import edu.gorilas.Utils;
import edu.gorilas.persona.Miembro;

public class Menu{
    public static void menu(ArrayList m) {
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Mostrar\t");
        switch (Utils.verificarNumero()) {
            case 1:
                menuMostrar(m);
                break;
            case 2:
                
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public static void menuMostrar(ArrayList<Miembro> m) {
        System.out.println("\n\n\n ================================ MENU ================================");
        System.out.println("( 1 ) Todos\t ( 2 )Alumnos\t( 3 ) Profesores");
        System.out.println("( 4 ) Edad Media Profesores\t ( 5 ) Nota Media");
        switch (Utils.verificarNumero()) {
            case 1:
                UtilsMenu.mostrarTodos(m);
                break;
            case 2:
                UtilsMenu.mostrarAlumnos(m);
                break;
            case 3:
                UtilsMenu.mostrarProfesores(m);
                break;
            case 4:
                UtilsMenu.edadMediaProfesores(m);
                break;
            case 5:
                UtilsMenu.notaMedia(m, null);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
}


