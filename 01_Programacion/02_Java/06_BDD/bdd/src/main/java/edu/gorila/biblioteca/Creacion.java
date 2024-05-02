package edu.gorila.biblioteca;

import java.sql.SQLException;
import java.sql.Statement;

public class Creacion {
    public static void crearBase(Statement sentencia) {
        try {
            String bd = "biblioteca";

            sentencia.execute("CREATE DATABASE IF NOT EXISTS " + bd + ";");
            sentencia.execute("USE " + bd + ";");

            sentencia.execute("CREATE TABLE IF NOT EXISTS AUTORES"
                    + "(dni VARCHAR(9) not null PRIMARY KEY,"
                    + "nombre VARCHAR(30) not null,"
                    + "nacionalidad VARCHAR(20) not null)"
                    + "ENGINE INNODB;");

            sentencia.execute("CREATE TABLE IF NOT EXISTS LIBROS"
                    + "(idLibro INT(5) unsigned zerofill not null auto_increment PRIMARY KEY,"
                    + "Titulo VARCHAR(100) not null,"
                    + "precio float not null,"
                    + "autor VARCHAR(9) not null,"
                    + "CONSTRAINT FK_autor Foreign key (autor) REFERENCES AUTORES (dni))"
                    + "ENGINE INNODB;");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
