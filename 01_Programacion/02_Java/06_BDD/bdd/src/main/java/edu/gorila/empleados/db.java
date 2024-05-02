package edu.gorila.empleados;

import java.sql.*;
import java.util.Scanner;

public class db {
    public static void createDepartament(Statement sentencia) {
        try {
            Scanner sc = new Scanner(System.in);
            int Nu_dept = Utils.verificarNumero();
            System.out.println("nombre:");
            String Dnombre = Utils.verificarString();
            System.out.println("Localidad:");
            String Localidad = Utils.verificarString();
            // example "INSERT INTO table (varc,float,varch) VALUES('" + varch + "'," + float + ",'" + varch + "')";
            sentencia.executeUpdate(
                    "INSERT INTO DEPARTAMENTOS (Nu_dept,Dnombre,Localidad) VALUES(" + Nu_dept + ",'" + Dnombre + "','"
                            + Localidad + "')");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }
    
    public static void createEmleado(Statement sentencia) {
        String dni = Utils.verificarDni();
        System.out.println("introduce un nombre");
        String Nombre = Utils.verificarString();
        System.out.println("introduce un Estudios");
        String Estudios = Utils.verificarString();
        System.out.println("introduce un Dir");
        String Dir = Utils.verificarString();
        java.util.Date Fecha_alt = Utils.verificarFecha();
        System.out.println("introduce un Salario");
        int Salario = Utils.verificarNumero();
        System.out.println("introduce un Departamento");
        int Nu_dept = Utils.verificarNumero();
        try {
            // example "INSERT INTO table (varc,float,varch) VALUES('" + varch + "'," + float + ",'" + varch + "')";
            sentencia.executeUpdate("INSERT INTO EMPLEADOS (dni,Nombre,Estudios,Dir,Fecha_alt,Salario,Nu_dept) VALUES('" + dni + "','" + Nombre + "','" + Estudios + "','" + Dir + "','" + Fecha_alt + "'," + Salario + "," + Nu_dept + ")");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }
}
