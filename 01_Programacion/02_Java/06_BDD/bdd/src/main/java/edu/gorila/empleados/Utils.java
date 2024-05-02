package edu.gorila.empleados;

import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                    throw new Exception("Numero invalido");
                return Integer.parseInt(num);
            } catch (Exception e) {
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
                    throw new Exception("");
                return s;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

    public static String verificarDni() {
        Scanner sc = new Scanner(System.in);
        Matcher match;
        do {
            try {
                System.out.println("Introduzca un dni: ");
                String dni = sc.next();
                Pattern pat = Pattern.compile("[0-9]{8}[A-Z]{1}");
                match = pat.matcher(dni);
                if (dni.length() != 9)
                    throw new Exception("Longitud incorrecta");
                if (!match.matches())
                    throw new Exception("Dni incorecto");
                return dni;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}
