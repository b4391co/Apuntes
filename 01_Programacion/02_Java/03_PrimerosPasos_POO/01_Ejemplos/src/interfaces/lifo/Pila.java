package interfaces.lifo;

import java.util.NoSuchElementException;

public class Pila implements CollectionInterface {
    private Object[] array;
    private int contador;


    public Pila (int Size) {
        array = array[Size];
        contador = 0;
    }

    @Override
    public boolean isEmpty() {
        return contador == 0;
    }

    @Override
    public Object get() {
        if (!isEmpty()) {
            Object toReturn = array[--contador];
            eliminarUltimoElemento();
            return toReturn;
        }
        else
            throw new NoSuchElementException();
    }

    @Override
    public Object first() {
        if (!isEmpty())
            return array[--contador];
        else
            throw new NoSuchElementException();
    }

    @Override
    public boolean add(Object objeto) {
        if (contador != array.length) {
            array[contador] = objeto;
            contador++;
            return true;
        } else
            return false;
    }
    
    private void eliminarElementoModificaTamanho() {
        Object[] arrayCopy = new Object[array.length - 1];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[i];
        }
        array = arrayCopy;
    }

    private void eliminarUltimoElemento() {
        array[contador] = null;
        System.out.println("Contenido tras eliminar: ");
        for (Object o : array) {
            System.out.println(o);
        }
    }
}