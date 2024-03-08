package edu.gorilas.administrador;

import edu.gorilas.filtros.Filtro;
import edu.gorilas.targets.Target;

public class ProgramadorTareas {
    private Tareas tareas = null;

    public ProgramadorTareas(Target target) {
        this.tareas = new Tareas();
        tareas.setTarget(target);
    }

    public Tareas getTareas() {
        return tareas;
    }

    public void setTarea(Filtro filtro) {
        getTareas().anhadirTarea(filtro);
    }

    public void ejecutarTarea(String s) {
        tareas.ejecucion(s);
    }
}
