package edu.gorilas.clientes;

import edu.gorilas.administrador.ProgramadorTareas;

public class Mollapp implements Cliente {

    private ProgramadorTareas programador = null;

    @Override public void setProgramadorTareas(ProgramadorTareas programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticion(String s) {
        programador.ejecutarTarea(s);
    }

}