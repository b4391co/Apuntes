package edu.gorila.biblioteca;

public class Excepciones extends Exception {
    public static final int NUMERO_INCORRECTO = 1;
    public static final int TEXTO_INCORRECTA = 2;
    public static final int DNI_LENGHT = 3;
    public static final int DNI_INCORRECTO = 4;
    
    public Excepciones(int e) {
        super (devolverError(e));
    }

    public static String devolverError(int e) {
        switch (e) {
            case NUMERO_INCORRECTO:
                return "Numero incorrecto";
            case TEXTO_INCORRECTA:
                return "texto incorrecta";
            case DNI_LENGHT:
                return "Longitud Dni Incorrecta";
            case DNI_INCORRECTO:
                return "Dni incorrecto";
            default:
                return "invalido";
        }
    }
}
