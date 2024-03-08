package edu.gorilas.filtros;

public class Autenticacion implements Filtro{

    @Override
    public void ejecucion(String id) {
        System.out.println("Autenticacion OK para " + id.toString());

    }

}
