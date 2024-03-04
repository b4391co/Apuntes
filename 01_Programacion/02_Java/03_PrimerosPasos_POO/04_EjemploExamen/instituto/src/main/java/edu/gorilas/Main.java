package edu.gorilas;

import edu.gorilas.especialidad.Especialidad;
import edu.gorilas.persona.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    
    static public ArrayList<Miembro> miembros = new ArrayList<>();
    public static void main( String[] args )
    {
        rellenarMiembros();
    }

    public static void mostrarTodos() {
        for (Miembro miembro : miembros) {
            System.out.println(miembro.toString());
        }
    }

    public static void rellenarMiembros() {
        Especialidad programacion = new Especialidad(1,"Programacion");
        Especialidad dwcd = new Especialidad(2,"dwcd");
        Especialidad dwcs = new Especialidad(3,"dwcs");
        Especialidad dwcc = new Especialidad(4,"dwcc");

        miembros.add(new Profesor("11111111A","Prof Pepe",50,"Casa Pepe",LocalDate.of(2011,8,2),"Completa",5000,programacion));
        miembros.add(new Profesor("22222222B","Prof Pepe II",40,"Casa Pepe II",LocalDate.of(2020,3,20),"Parcial",4000,dwcc));
        miembros.add(new Profesor("33333333P","Prof Pepe III",30,"Casa Pepe V",LocalDate.of(2023,5,3),"Completa",6000,dwcs));
        miembros.add(new Profesor("44444444P","Prof Pepe IV",20,"Casa Pepe V",LocalDate.of(2017,7,8),"Parcial",1200,dwcd));
        miembros.add(new Profesor("55555555P","Prof Pepe V",30,"Casa Pepe II",LocalDate.of(2018,1,2),"Completa",5000,programacion));

        miembros.add(new Alumno("12121212A","Pepe X",15,"Casa Pepe",LocalDate.of(2020,6,11),"DAW",7,200));
    }
}
