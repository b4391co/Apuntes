package herencia.empresa;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleadoArray = new Empleado[7];
        empleadoArray[0] = new Empleado("Pepe I", 3000, LocalDate.of(2000, 01,01));
        empleadoArray[1] = new Directivo("Pepe II", 2000, LocalDate.of(1990, 11, 20), "Jefe", "informatico"); 
        empleadoArray[2] = new Operario("Pepe III", 2500, LocalDate.of(2001, 01,01), "area uno", "nave uno") ;
        empleadoArray[3] = new Oficial("Pepe IV", 3000, LocalDate.of(2002, 01,01), "area de Pepes", "nave dos", "pepes");
        empleadoArray[4] = new Tecnico("Pepe V", 4000, LocalDate.of(2003, 01,01), "area de Pepes", "nave dos", "seccdos");
        empleadoArray[5] = new Operario("Pepe VI", 10000, LocalDate.of(2001, 01,01), "area tres", "nave dos") ;
        empleadoArray[6] = new Tecnico("Pepe VII", 14000, LocalDate.of(2004, 01,01), "area de Pepes", "nave tres", "sectres");

        Arrays.stream(empleadoArray).forEach(empleado -> System.out.println(empleado.toString()));
        
    }
}
