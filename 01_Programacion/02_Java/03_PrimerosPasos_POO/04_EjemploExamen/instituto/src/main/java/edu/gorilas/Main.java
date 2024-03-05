package edu.gorilas;

import edu.gorilas.especialidad.Especialidad;
import edu.gorilas.menu.*;
import edu.gorilas.persona.*;

import java.util.ArrayList;

public class Main {
    
    static public ArrayList<Miembro> miembros = new ArrayList<>();
    static public ArrayList<Especialidad> especialidades = new ArrayList<>();
    public static void main( String[] args )
    {
        Utils.rellenarMiembros();
        while(true)
            Menu.menu(miembros);
    }
}