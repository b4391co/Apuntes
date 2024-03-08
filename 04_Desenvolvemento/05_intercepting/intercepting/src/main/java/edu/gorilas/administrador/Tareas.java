package edu.gorilas.administrador;

import edu.gorilas.targets.Target;
import java.util.ArrayList;
import java.util.List;

import edu.gorilas.filtros.*;
import java.util.Optional;

public class Tareas {
    private List<Filtro> Tareas = new ArrayList<>();
    private Optional<Target> target;

    public List<Filtro> getTareas() {
        return Tareas;
    }

    public Optional<Target> getTarget() {
        return target;
    }

    public void anhadirTarea(Filtro filtro) {
        getTareas().add(filtro);
    }

    public void setTarget(Target t) {
        this.target = Optional.ofNullable(t);
    }

    public void ejecucion(String m) {
        getTareas().forEach(item -> item.ejecucion(m));
        if (getTarget().isPresent()) {
            getTarget().get().ejecucion(m);
        } else {
            // target sin añedir al sistema
        }
    }

}
