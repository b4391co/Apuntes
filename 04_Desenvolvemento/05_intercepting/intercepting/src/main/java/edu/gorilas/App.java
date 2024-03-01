package edu.gorilas;

// import edu.gorilas.administrador.ProgramadorTasques;
// import edu.gorilas.clients.Mollapp;
// import edu.gorilas.filtres.Autoritzacio;
// import edu.gorilas.targets.Vehicle;
// import edu.gorilas.filtres.Autenticacio;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        //ProgramadorTasques programadorTasques = new ProgramadorTasques(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        //programadorTasques.setTasca(new Autenticacio());
        //programadorTasques.setTasca(new Autoritzacio());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        //Mollapp mollapp = new Mollapp();
        //mollapp.setProgramadorTasques(programadorTasques);
        //mollapp.enviarPeticio("Francesc");
    }
}