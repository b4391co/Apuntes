package colecciones.videojuegos;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static ArrayList<Serie> series = new ArrayList<>();
    static ArrayList<Videojuego> videojuegos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\n\n ===================================== Videojuegos =====================================");
        llenarConjuntos();
        series.get(3).entregar();
        series.get(2).entregar();
        videojuegos.get(1).entregar();

        contarEntregados();
        System.out.println("La serie con mas temporadas es:\t" + serieMasTemporadas());
        System.out.println("El Videojuego con mas horas es:\t" + videojuegoMasHoras());

    }
    
    public static String serieMasTemporadas() {
        return series.stream().max(Comparator.comparing(Serie::getNumTemporadas)).get().toString();
    }

    public static String videojuegoMasHoras() {
        return videojuegos.stream().max(Comparator.comparing(Videojuego::getHorasEstimadas)).get().toString();
    }
        
    public static void contarEntregados() {
        int seriesEntregadas = (int) series.stream().filter(Serie::isEntregado).count();
        int videojuegosEntregados = (int) videojuegos.stream().filter(Videojuego::isEntregado).count();
        System.out.println("Series: " + seriesEntregadas + "\t Videojuegos: " + videojuegosEntregados + "\nTotal: " + (seriesEntregadas + videojuegosEntregados));
    }

    public static void llenarConjuntos() {
        series.add(new Serie("Serie 1", 3, "genero1", "creador1"));
        series.add(new Serie("Serie 2", 1, "genero1", "creador4"));
        series.add(new Serie("Serie 3", 2, "genero2", "creador2"));
        series.add(new Serie("Serie 4", 5, "genero3", "creador3"));
        series.add(new Serie("Serie 5", 1, "genero3", "creador1"));

        videojuegos.add(new Videojuego("Juego 1", 10, "Genero 1", "Compañia 1"));
        videojuegos.add(new Videojuego("Juego 2", 5, "Genero 2", "Compañia 2"));
        videojuegos.add(new Videojuego("Juego 3", 6, "Genero 2", "Compañia 3"));
        videojuegos.add(new Videojuego("Juego 4", 20, "Genero 3", "Compañia 2"));
        videojuegos.add(new Videojuego("Juego 5",18,"Genero 1","Compañia 1"));
    }
}