package edu.gorilas.filtros;

public class Autorizacion implements Filtro {

    @Override
    public void ejecucion(String id) {
        System.out.println("Autorizacion OK para " + id.toString());
    }

}
