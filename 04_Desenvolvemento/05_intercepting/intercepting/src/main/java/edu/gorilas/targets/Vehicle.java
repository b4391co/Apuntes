package edu.gorilas.targets;

public class Vehicle implements Target {
    @Override
    public void ejecucion(String missatge) {
        System.out.println("Puerta abierta " + id.toString() + "!");
    }
    
}