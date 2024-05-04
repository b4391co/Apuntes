package edu.gorila.empleados;

import java.sql.*;

public class CreacionDB {
public static void crearBase(Statement sentencia)
{
    try
    {
        String bd = "empleados";

        sentencia.execute("CREATE DATABASE IF NOT EXISTS " + bd + ";");
        sentencia.execute("USE " + bd + ";");

        sentencia.execute("CREATE TABLE IF NOT EXISTS DEPARTAMENTOS ("
            + "Nu_dept INT PRIMARY KEY AUTO_INCREMENT NOT NULL, "
            + "Dnombre VARCHAR(10) UNIQUE, "
            + "Localidad VARCHAR(10)"
            + ") ENGINE=InnoDB;");
    

        sentencia.execute("CREATE TABLE IF NOT EXISTS EMPLEADOS"
                + "(dni varchar(9) not null unique PRIMARY KEY,"
                + "Nombre varchar(10) not null,"
                + "Estudios varchar(10),"
                + "Dir varchar(10),"
                + "Fecha_alt Date,"
                + "Salario int,"
                +" Comision int,"
                + "Nu_dept int,"
                + "CONSTRAINT FK_Nu_dept FOREIGN KEY (Nu_dept) REFERENCES DEPARTAMENTOS(Nu_dept))"
                + "ENGINE INNODB;");
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
}
}