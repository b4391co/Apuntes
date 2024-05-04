package edu.gorila.empleados;

import java.sql.*;
import java.util.Scanner;

public class db {
    public static void createDepartament(Statement sentencia) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nombre:");
            String Dnombre = Utils.verificarString();
            System.out.println("Localidad:");
            String Localidad = Utils.verificarString();
            // example "INSERT INTO table (varc,float,varch) VALUES('" + varch + "'," +
            // float + ",'" + varch + "')";
            sentencia.executeUpdate(
                    "INSERT INTO DEPARTAMENTOS (Dnombre,Localidad) VALUES('" + Dnombre + "','"
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
        System.out.println("Introduce un dia");
        int dia = Utils.verificarNumeroInterval(1, 31);
        System.out.println("Introduce un mes");
        int mes = Utils.verificarNumeroInterval(1, 12);
        System.out.println("Introduce un año");
        int anho = Utils.verificarNumero(4);
        String fecha = anho + "-" + mes + "-" + dia;
        System.out.println("introduce un Salario");
        int Salario = Utils.verificarNumero();
        System.out.println("introduce un Comision");
        int comision = Utils.verificarNumero();
        System.out.println("introduce un Departamento");
        int Nu_dept = Utils.verificarNumero();
        try {
            // example "INSERT INTO table (varc,float,varch) VALUES('" + varch + "'," +
            // float + ",'" + varch + "')";
            sentencia.executeUpdate(
                    "INSERT INTO EMPLEADOS (dni,Nombre,Estudios,Dir,Fecha_alt,Salario,Comision,Nu_dept) VALUES('"
                            + dni + "','" + Nombre + "','" + Estudios + "','" + Dir + "','" + fecha + "'," + Salario + "," + comision + ","
                            + Nu_dept + ")");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar:" + e.getMessage());
            System.err.println("Se ha producido un error al insertar:" + e.getSQLState());
            System.err.println("Se ha producido un error al insertar:" + e.getErrorCode());

        }
    }
}
