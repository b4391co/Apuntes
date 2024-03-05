package edu.gorilas.menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.gorilas.Main;
import edu.gorilas.Utils;
import edu.gorilas.excepciones.ExcepcionesMenu;
import edu.gorilas.persona.Alumno;
import edu.gorilas.especialidad.*;
import edu.gorilas.persona.Miembro;
import edu.gorilas.persona.Profesor;

public class Menu{
    public static void menu(ArrayList<Miembro> m) {
        System.out.println("\n\n\n========================= MENU =========================\n");
        System.out.println("( 1 ) Mostrar\t( 2 ) Alta\t( 3 ) Baja\n");
        switch (Utils.verificarNumero()) {
            case 1:
                menuMostrar(m);
                break;
            case 2:
                alta(m);
                break;
            case 3:
                baja(m);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    public static void baja(ArrayList<Miembro> m) {
        System.out.println("\n\n\n========================= MENU =========================\n");
        System.out.println("( 1 ) Alumnos\t( 2 ) Profesor\n");
        switch (Utils.verificarNumero()) {
            case 1:
                UtilsMenu.mostrarAlumnos(m);
                break;
            case 2:
                UtilsMenu.mostrarProfesores(m);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        System.out.println("\nintroduce un dni para borrar");
        String dniBorrar = UtilsMenu.verificarDni();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getDni().equals(dniBorrar)) {
                m.remove(i);
                System.out.println(dniBorrar + " Borrado correctamente");
            }
        }
    }

    public static void alta(ArrayList<Miembro> m) {
            System.out.println("\n\n\n========================= MENU =========================\n");
            System.out.println("( 1 ) Alumno\t( 2 ) Profesor\n");
            int selec = Utils.verificarNumero();
            String dni = UtilsMenu.verificarDni();
            System.out.println("nombre :");
            String nombre = Utils.verificarString();
            System.out.println("edad :");
            int edad = Utils.verificarNumero();
            System.out.println("direccion :");
            String direccion = Utils.verificarString();
            System.out.println("año nacimiento :");
            int anho = UtilsMenu.verificarFecha("[0-9]{4}",ExcepcionesMenu.ANHO_INCORRECTO);
            System.out.println("mes nacimiento :");
            int mes = UtilsMenu.verificarFecha("^(?:[0-9]|[1-2][0-9]|12)$",ExcepcionesMenu.MES_INCORRECTO);
            System.out.println("dia nacimiento :");
            int dia = UtilsMenu.verificarFecha("(?:[0-9]|[1-2][0-9]|30)",ExcepcionesMenu.DIA_INCORRECTO);
            LocalDate fechaIncorporacion = LocalDate.of(anho,mes,dia);
            switch (selec) {
                case 1:
                    System.out.println("ciclo :");
                    String ciclo = Utils.verificarString();
                    System.out.println("media :");
                    double media = Utils.verificarDouble();
                    System.out.println("importe Matricula :");
                    double importeMatricula = Utils.verificarDouble();
                    m.add(new Alumno(dni, nombre, edad, direccion, fechaIncorporacion, ciclo, media, importeMatricula));
                    break;
                case 2:
                    System.out.println("jornada (parcial o completa):");
                    String jornada = Utils.verificarString();
                    System.out.println("sueldo :");
                    double sueldo = Utils.verificarDouble();
                    System.out.println("especialidad ( introduce id ):");
                    System.out.println(Main.especialidades);
                    Especialidad espec = Main.especialidades.get(UtilsMenu.verificarEspec() - 1);
                    m.add(new Profesor(dni, nombre, edad, direccion, fechaIncorporacion, jornada, sueldo, espec));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
    }

    public static void menuMostrar(ArrayList<Miembro> m) {
        System.out.println("\n\n\n========================= MENU =========================\n");
        System.out.println("( 1 ) Todos\t ( 2 )Alumnos\t( 3 ) Profesores");
        System.out.println("( 4 ) Edad Media Profesores\t( 5 ) Nota Media\n");
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


