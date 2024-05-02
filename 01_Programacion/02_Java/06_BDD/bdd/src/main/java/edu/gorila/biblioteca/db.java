package edu.gorila.biblioteca;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import java.sql.*;

public class db {

    static Scanner sc = new Scanner(System.in);

    public static void insertarAutor(Statement sentencia) {
        System.out.println("Dni");
        String dni = Utils.verificarDni();
        System.out.println("Nombre");
        String nombre = Utils.verificarString();
        System.out.println("Nacionalidad");
        String nacionalidad = Utils.verificarString();
        sc = new Scanner(System.in);

        try {
            sentencia.executeUpdate("INSERT INTO AUTORES (dni,nombre,nacionalidad) VALUES('" + dni + "','" + nombre
                    + "','" + nacionalidad + "')");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    public static void insertarLibro(Statement sentencia) {
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
            sentencia.executeUpdate(
                    "INSERT INTO LIBROS (titulo,precio,autor) VALUES('" + titulo + "'," + precio + ",'" + autor + "')");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    public static void listarAutores(Statement sentencia) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from AUTORES");

            while (result.next()) {
                System.out.println("Autor: ");
                System.out.println("DNI: " + result.getString("dni"));
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarAutoresConLibros(Statement sentencia) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from AUTORES");

            while (result.next()) {
                System.out.println("Autor: ");
                System.out.println("DNI: " + result.getString("dni"));
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("Libros: ");
                listarLibrosPorDni(sentencia, result.getString("dni"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarAutorPorNombre(Statement sentencia) {
        System.out.println("Introduce un nombre");
        String nombre = Utils.verificarString();
        try {
            ResultSet result = sentencia.executeQuery("Select * from AUTORES WHERE nombre = '" + nombre + "'");

            while (result.next()) {
                System.out.println("Autor: ");
                System.out.println("DNI: " + result.getString("dni"));
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("Libros: ");
                listarLibrosPorDni(sentencia, result.getString("dni"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean verificarAutorPorDni(Statement sentencia, String dni) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from AUTORES WHERE dni = '" + dni + "'");

            if (result.next())
                return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static void listarLibros(Statement sentencia) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from LIBROS");

            while (result.next()) {
                System.out.println("Libro: " + result.getInt("idLibro"));
                System.out.println("titulo: " + result.getString("titulo"));
                System.out.println("preco: " + result.getFloat("precio"));
                System.out.println("autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarLibrosPorDni(Statement sentencia, String dni) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from LIBROS WHERE autor  = '" + dni + "'");

            while (result.next()) {
                System.out.println("\tid: " + result.getInt("idLibro"));
                System.out.println("\ttitulo: " + result.getString("titulo"));
                System.out.println("\tpreco: " + result.getFloat("precio"));
                System.out.println("\tautor: " + result.getString("autor"));
                System.out.println("-----------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarLibroPorNombre(Statement sentencia) {
        System.out.println("Introduce un nombre");
        String nombre = Utils.verificarString();
        try {
            ResultSet result = sentencia.executeQuery("Select * from LIBROS WHERE titulo  = '" + nombre + "'");

            while (result.next()) {
                System.out.println("Libro: " + result.getInt("idLibro"));
                System.out.println("titulo: " + result.getString("titulo"));
                System.out.println("preco: " + result.getFloat("precio"));
                System.out.println("autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean verificarLibroPorNombre(Statement sentencia, String nombre) {
        try {
            ResultSet result = sentencia.executeQuery("Select * from LIBROS WHERE titulo  = '" + nombre + "'");

            if (result.next())
                return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static void modificarAutor(Statement sentencia) {
        System.out.println("DNI del autor a modificar");
        String dni = Utils.verificarDni();

        if (verificarAutorPorDni(sentencia, dni)) {
            System.out.println("Nombre");
            String nombre = Utils.verificarString();
            System.out.println("Nacionalidad");
            String nacionalidad = Utils.verificarString();
            sc = new Scanner(System.in);
            try {
                sentencia.executeUpdate("UPDATE AUTORES set nombre='" + nombre + "', nacionalidad='" + nacionalidad
                        + "' where dni = '" + dni + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El autor no se encuentra en la base de datos");
        }
    }

    public static void modificarLibro(Statement sentencia) {
        System.out.println("Introduce un nombre");
        String nombre = Utils.verificarString();

        if (verificarLibroPorNombre(sentencia, nombre)) {
            System.out.println("precio");
            Float precio = (float) Utils.verificarDouble();
            System.out.println("\n\n");
            listarAutores(sentencia);
            System.out.println("Autor (dni)");
            String autor = Utils.verificarDni();
            sc = new Scanner(System.in);
            try {
                sentencia.executeUpdate("UPDATE LIBROS set precio=" + precio + ", autor='" + autor
                        + "' where Titulo = '" + nombre + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El autor no se encuentra en la base de datos");
        }
    }

    public static void eliminarAutor(Statement sentencia) {
        System.out.println("DNI del autor a eliminar");
        String dni = Utils.verificarDni();

        if (verificarAutorPorDni(sentencia, dni)) {
            try {
                sentencia.execute("DELETE from LIBROS where autor='" + dni + "';");
                sentencia.execute("DELETE from AUTORES where dni='" + dni + "';");
                System.out.println("Autor Eliminado\n");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void eliminarLibro(Statement sentencia) {
        System.out.println("Introduce un nombre");
        String nombre = Utils.verificarString();

        if (verificarLibroPorNombre(sentencia, nombre)) {
            try {
                sentencia.execute("DELETE from Libros WHERE Titulo='" + nombre + "';");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            System.out.println("El libro no se encuentra en la base de datos");
        }
    }
}
