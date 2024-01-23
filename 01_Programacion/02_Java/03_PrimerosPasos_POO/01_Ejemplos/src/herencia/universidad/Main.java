package herencia.universidad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona[] pArray = new Persona[7];
        pArray[0] = new Docente("Pepe uno", 18, "12345678A", 'H', 60, 180, "Ciencia");
        pArray[1] = new Alumno("Pepe dos", 11, "1A", 'H', 60, 180, "Primera", "Ciencia");
        pArray[2] = new AlumnoInternacional("Sebastian Castro", 20, "8f894b32", 'H', 60, 180, "Segunda", "Geografia","Aleman");
        pArray[3] = new Docente("Maria Gonzalez", 23, "12345678A", 'M', 60, 180, "Geografia");
        pArray[4] = new Alumno("Pepe cuatro", 30, "1A", 'H', 60, 180, "Cuarta", "Pesca");
        pArray[5] = new AlumnoInternacional("Cristian Esteban", 20, "8f894b32", 'H', 60, 180, "Segundo", "pesca", "Indio");
        pArray[6] = new Alumno("Pepe V", 18, "12345678A", 'H', 60, 180, "Segunda","Pesca");
    
        Arrays.stream(pArray).forEach(Persona::mostrarInfo);
    }
}