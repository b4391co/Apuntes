package edu.gorilas;

import edu.gorilas.administrador.ProgramadorTareas;
import edu.gorilas.clientes.Mollapp;
import edu.gorilas.filtros.Autorizacion;
import edu.gorilas.targets.Vehicle;


public final class App {
    public static void main(String[] args) {

        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        ProgramadorTareas ProgramadorTareas = new ProgramadorTareas(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        ProgramadorTareas.setTarea(new Autorizacion());
        ProgramadorTareas.setTarea(new Autorizacion());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTareas(ProgramadorTareas);
        mollapp.enviarPeticion("Francesc");
    }
}