package edu.gorila.empleados;

import java.sql.*;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Statement sentencia = null;
    Connection conexion = null;
    Scanner sc = new Scanner(System.in);

    int op = 0;

    try {
        Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    String url = "jdbc:mariadb://localhost:3306/?user=admin&password=QpWBHu9ni0J4";
    //String url = "jdbc:mariadb://localhost:3306/?user=root&password=pwd";
    try {
        conexion = DriverManager.getConnection(url);
    } catch (SQLException e) {
        System.out.println("No hay ningún driver que reconozca la URL especificada");
    } catch (Exception e) {
        System.out.println("Se ha producido algún otro error");
    }

    try {
        sentencia = conexion.createStatement();
    } catch (SQLException e) {
        System.out.println("Error");
    }

    Creacion.crearBase(sentencia);

    do {
        System.out.println("**** MENU ****\n" +
                "[1] NUEVO DEPARTAMENTO\n" +
                "[2] NUEVO EMPLEADO");
        op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                db.createDepartament(sentencia);
                break;
            case 2:
                db.createEmleado(sentencia);
            case 0:
        }
    } while (op != 0);
}
}
