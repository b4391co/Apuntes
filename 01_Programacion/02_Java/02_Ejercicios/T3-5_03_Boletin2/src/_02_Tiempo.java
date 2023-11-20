
public class _02_Tiempo {
    public static void main(String[] args) {
        //  EJ 11
        System.out.println("\n\n---------------- Tiempo ----------------\n");
        int t = 7120;

        System.out.println(calcularTiempo(t));
    }

    public static String calcularTiempo(int t){
        int horas = t / 3600;
        int minutos = ( t%3600 )/60;
        int segundos = ( t%3600 )%60;
        return(horas + " Horas " + minutos + " Minutos " + segundos + " Segundos "); 
    }

}