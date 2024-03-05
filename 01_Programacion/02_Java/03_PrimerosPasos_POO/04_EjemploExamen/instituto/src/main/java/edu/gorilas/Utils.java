package edu.gorilas;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.gorilas.especialidad.Especialidad;
import edu.gorilas.excepciones.*;
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
                Pattern pat = Pattern.compile("[0-9]{1,20}");
                match = pat.matcher(num);
                if (!match.matches())
                    throw new Excepciones(Excepciones.NUMERO_INCORRECTO);
                return Integer.parseInt(num);
            } catch (Excepciones e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static double verificarDouble() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca un número ( double ): ");
                String num = sc.next();
                Pattern pat = Pattern.compile("[0-9]{0,9}.[0-9]{0,2}");
                match = pat.matcher(num);
                if (!match.matches())
                    throw new Excepciones(Excepciones.NUMERO_INCORRECTO);
                return Double.parseDouble(num);
            } catch (Excepciones e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static String verificarString() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                String s = sc.next();
                Pattern pat = Pattern.compile("[a-zA-Z]{1,20}");
                match = pat.matcher(s);
                if (!match.matches())
                    throw new Excepciones(Excepciones.TEXTO_INCORRECTA);
                return s;
            } catch (Excepciones e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static void rellenarMiembros() {
        Main.especialidades.add(new Especialidad(1,"Programacion"));
        Main.especialidades.add(new Especialidad(2,"dwcd"));
        Main.especialidades.add(new Especialidad(3,"dwcs"));
        Main.especialidades.add(new Especialidad(4,"dwcc"));

        Main.miembros.add(new Profesor("11111111A","Prof Pepe",50,"Casa Pepe",LocalDate.of(2011,8,2),"Completa",5000,Main.especialidades.get(1)));
        Main.miembros.add(new Profesor("22222222B","Prof Pepe II",40,"Casa Pepe II",LocalDate.of(2020,3,20),"Parcial",4000,Main.especialidades.get(2)));
        Main.miembros.add(new Profesor("33333333P","Prof Pepe III",30,"Casa Pepe V",LocalDate.of(2023,5,3),"Completa",6000,Main.especialidades.get(3)));
        Main.miembros.add(new Profesor("44444444P","Prof Pepe IV",20,"Casa Pepe V",LocalDate.of(2017,7,8),"Parcial",1200,Main.especialidades.get(0)));
        Main.miembros.add(new Profesor("55555555P","Prof Pepe V",30,"Casa Pepe II",LocalDate.of(2018,1,2),"Completa",5000,Main.especialidades.get(3)));

        Main.miembros.add(new Alumno("12121212A", "Pepe X", 15, "Casa Pepe", LocalDate.of(2020, 6, 11), "DAW", 7, 1200));
        Main.miembros.add(new Alumno("34343434A","Pepe 3",18,"Casa Pepe",LocalDate.of(2010,6,11),"ASIR",7,2000));
        Main.miembros.add(new Alumno("45454545A","Pepe 45",20,"Casa Pepe",LocalDate.of(2024,1,11),"DAW",7,500));
        Main.miembros.add(new Alumno("67676767A","Pepe 7",30,"Casa Pepe",LocalDate.of(2000,6,11),"DAW",7,6200));

    }
}