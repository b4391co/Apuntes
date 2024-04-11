package edu.gorila.directorios.ej1;

import java.io.File;
import java.util.Scanner;

public class Extension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Extension:");
        String ext = sc.next();
        System.out.println("\n");

        File path = new File("./src/main/java/edu/gorila/directorios/ej1/");
        if (path.exists() && path.isDirectory()) {
            for (String file : path.list()) {
                if (file.endsWith(ext))
                    System.out.println(file);
            }
        }

    }
}
