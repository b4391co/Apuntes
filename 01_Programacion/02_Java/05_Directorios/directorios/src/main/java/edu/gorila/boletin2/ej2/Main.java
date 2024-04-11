package edu.gorila.boletin2.ej2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "./src/main/java/edu/gorila/boletin2/ej2/";
        File file1 = new File(path + "FICHERO1.txt");
        File file2 = new File(path + "FICHERO2.txt");

        Utils.escribirFichero(file1, "texto");
        Utils.escribirFichero(file2,"texta");
        System.out.println("Fichero 1: " + Utils.leerFichero(file1));
        System.out.println("Fichero 2: " + Utils.leerFichero(file2));

        Utils.intercambiarFicherios(file1, file2);
        
        System.out.println("Fichero 1: " + Utils.leerFichero(file1));
        System.out.println("Fichero 2: " + Utils.leerFichero(file2));
    }
}
