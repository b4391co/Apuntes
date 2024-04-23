package edu.gorila.biblioteca;

import java.sql.*;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Statement sentencia = null;
        Connection conexion = null;


        int op = 0;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mariadb://localhost:3306/?user=admin&password=QpWBHu9ni0J4";
        //String url = "jdbc:mariadb://localhost:3306/?user=root&password=1234";
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
            System.out.println("**** MENU ****\n"
                    + "[1] Insertar Autor\n"
                    + "[2] Insertar Libro\n"
                    + "[3] Listar Libros\n"
                    + "[4] Listar Autores Con libros\n"
                    + "[5] Buscar Libro por Nombre\n"
                    + "[6] Buscar libros de un Autor\n"
                    + "[7] Modificar Autor por Dni\n"
                    + "[8] Eliminar Libro\n"
                    + "[0] Exit\n");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    db.insertarAutor(sentencia);
                    break;
                case 2:
                    db.insertarLibro(sentencia);
                    break;
                case 3:
                    db.listarLibros(sentencia);
                    break;
                case 4:
                    db.listarAutores(sentencia); // Autores con sus libros
                    break;
                case 5:
                    db.listarLibroPorNombre(sentencia);
                    break;
                case 6:
                    db.listarAutorPorNombre(sentencia);
                    break;
                case 7:
                    db.modificarAutor(sentencia);
                    break;
                case 8:
                    db.eliminar(sentencia);
                    break;
                case 0:

            }

        } while (op != 0);
    }
}