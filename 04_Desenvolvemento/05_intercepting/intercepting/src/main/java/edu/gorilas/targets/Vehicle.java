package edu.gorilas.targets;

public class Vehicle implements Target {
    @Override
    public void ejecucion(String id) {
        System.out.println("Puerta abierta " + id.toString() + "!");
    }
    
}