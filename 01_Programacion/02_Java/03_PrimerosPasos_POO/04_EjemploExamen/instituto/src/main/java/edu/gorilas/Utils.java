package edu.gorilas;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.gorilas.especialidad.Especialidad;
import edu.gorilas.excepciones.ExcepcionesMenu;
import edu.gorilas.persona.Alumno;
import edu.gorilas.persona.Profesor;

public class Utils {
    public static int verificarNumero() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca un número: ");
                String num = sc.next();
                Pattern pat = Pattern.compile("[0-9]");
                match = pat.matcher(num);
                if (!match.matches())
                    throw new ExcepcionesMenu(ExcepcionesMenu.NUMERO_INCORRECTO);
                return Integer.parseInt(num);
            } catch (ExcepcionesMenu e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
    
    public static void rellenarMiembros() {
        Especialidad programacion = new Especialidad(1,"Programacion");
        Especialidad dwcd = new Especialidad(2,"dwcd");
        Especialidad dwcs = new Especialidad(3,"dwcs");
        Especialidad dwcc = new Especialidad(4,"dwcc");

        Main.miembros.add(new Profesor("11111111A","Prof Pepe",50,"Casa Pepe",LocalDate.of(2011,8,2),"Completa",5000,programacion));
        Main.miembros.add(new Profesor("22222222B","Prof Pepe II",40,"Casa Pepe II",LocalDate.of(2020,3,20),"Parcial",4000,dwcc));
        Main.miembros.add(new Profesor("33333333P","Prof Pepe III",30,"Casa Pepe V",LocalDate.of(2023,5,3),"Completa",6000,dwcs));
        Main.miembros.add(new Profesor("44444444P","Prof Pepe IV",20,"Casa Pepe V",LocalDate.of(2017,7,8),"Parcial",1200,dwcd));
        Main.miembros.add(new Profesor("55555555P","Prof Pepe V",30,"Casa Pepe II",LocalDate.of(2018,1,2),"Completa",5000,programacion));

        Main.miembros.add(new Alumno("12121212A","Pepe X",15,"Casa Pepe",LocalDate.of(2020,6,11),"DAW",7,200));
    }
}