import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // se crean 
        Empleado empleado1;
        Empleado empleado2;
        Proyecto proyecto1;
        Proyecto proyecto2;

        // se definen
        empleado1 = new Empleado("Pepe", "123456789A", "empleado");
        empleado2 = new Empleado("Laura", "123456789B", "coordinador");
        proyecto1 = new Proyecto(1, 500);
        proyecto2 = new Proyecto(2,2000);

        // se enlazan los empleados a un proyecto
        empleado1.setProyecto(proyecto1);
        empleado2.setProyecto(proyecto2);

        // EMPLEADO 1 
        empleado1.mostrarEstado();        
        empleado1.subirSueldo(empleado1.getProyecto().getSuplemento());
        empleado1.mostrarNuevoEstado();

        // EMPLEADO 2
        empleado2.mostrarEstado();
        empleado2.subirSueldo(empleado2.getProyecto().getSuplemento());
        empleado2.mostrarNuevoEstado();
    }
}
