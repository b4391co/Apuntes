package edu.gorilas.clientes;

import edu.gorilas.administrador.ProgramadorTareas;

public interface Cliente {
    void setProgramadorTareas(ProgramadorTareas programadorTareas);

    void enviarPeticion(String s);
}
