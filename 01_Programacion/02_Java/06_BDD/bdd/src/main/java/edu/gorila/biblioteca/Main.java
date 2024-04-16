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
                    + "[3] Listar Autores\n"
                    + "[4] Listar Libros\n"
                    + "[5] Modificar Autor\n"
                    + "[6] Modificar Libro\n"
                    + "[7] Eliminar Autor\n"
                    + "[8] Eliminar Libro\n"
                    + "[0] Exit\n");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    insertarAutor(sentencia);
                    break;
                case 2:
                    insertarLibro(sentencia);
                    break;
                case 3:
                    listarAutores(sentencia);
                    break;
                case 4:
                    listarLibros(sentencia);
                    break;
                case 5:
                    modificar(sentencia);
                    break;
                case 6:
                    modificar(sentencia);
                    break;
                case 7:
                    eliminar(sentencia);
                    break;
                case 8:
                    eliminar(sentencia);
                    break;
                case 0:

            }

        } while (op != 0);
    }

    private static void insertarAutor(Statement sentencia) {
        System.out.println("Dni");
        String dni = Utils.verificarDni();
        System.out.println("Nombre");
        String nombre = Utils.verificarString();
        System.out.println("Nacionalidad");
        String nacionalidad = Utils.verificarString();
        sc = new Scanner(System.in);

        try {
            sentencia.executeUpdate("INSERT INTO AUTORES (dni,nombre,nacionalidad) VALUES('" + dni + "','" + nombre + "','" + nacionalidad + "')");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    private static void insertarLibro(Statement sentencia) {
        System.out.println("Titulo");
        String titulo = Utils.verificarString();
        System.out.println("precio");
        Float precio = (float) Utils.verificarDouble();
        System.out.println("\n\n");
        listarAutores(sentencia);
        System.out.println("Autor (dni)");
        String autor = Utils.verificarDni();
        sc = new Scanner(System.in);

        try {
            sentencia.executeUpdate("INSERT INTO LIBROS (titulo,precio,autor) VALUES('" + titulo + "'," + precio + ",'" + autor + "')");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    public static void listarAutores(Statement sentencia) {
        int cont = 0;

        try {
            ResultSet result = sentencia.executeQuery("Select * from AUTORES");

            while (result.next()) {
                cont++;
                System.out.println("Autores " + cont + ": ");

                System.out.println("DNI: " + result.getString("dni"));
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarLibros(Statement sentencia) {
        int cont = 0;

        try {
            ResultSet result = sentencia.executeQuery("Select * from LIBROS");

            while (result.next()) {
                cont++;
                System.out.println("Libros " + cont + ": ");

                System.out.println("id: " + result.getInt("idLibro"));
                System.out.println("titulo: " + result.getString("titulo"));
                System.out.println("preco: " + result.getFloat("precio"));
                System.out.println("autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void modificar(Statement sentencia) {

        System.out.println("Dame nombre del producto a modificar");
        ResultSet res = buscarProducto(sentencia);
        if (res != null) {
            System.out.println("Introduzca nuevo nombre de producto:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca nuevo precio de producto:");
            float precio = sc.nextFloat();
            sc = new Scanner(System.in);
            try {
                sentencia.executeUpdate("UPDATE PRODUCTOS set nombreProducto='" + nombre + "', precio=" + precio +" where idProd = '" + res.getInt("idProd") + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }

    public static void eliminar(Statement sentencia) {
        System.out.println("Dame nombre del producto a eliminar");
        ResultSet res = buscarProducto(sentencia);
        if (res != null) {
            try {
                sentencia.execute("DELETE from PRODUCTOS where idProd="+ res.getInt("idProd") +";");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }

    }

    public static ResultSet buscarProducto(Statement sentencia) {
        String nomProd = null;

        try {
            nomProd = sc.nextLine();

            ResultSet result = sentencia.executeQuery("Select * from PRODUCTOS where nombreProducto = '" + nomProd + "';");

            if (result.next()) {
                System.out.println("Los datos del producto buscado son: ");

                System.out.println(" ID Producto: " + result.getInt("idProd"));
                System.out.println(" Nombre: " + result.getString("nombreProducto"));
                System.out.println(" Precio: " + result.getFloat("precio"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}