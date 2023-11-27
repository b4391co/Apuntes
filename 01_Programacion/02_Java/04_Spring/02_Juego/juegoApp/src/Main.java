import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        String[] ips = {"192.168.7.21", "192.168.7.17", "192.168.7.13", "192.168.7.9",
        "192.168.7.18", "192.168.7.10", "192.168.7.2", "192.168.7.6", "192.168.7.11",
        "192.168.7.15", "192.168.7.19", "192.168.7.3", "192.168.7.20", "192.168.7.16", "192.168.7.8"};
        //String[] ips = {"localhost","192.168.7.11"};
        menu(ips);
    }
    
    public static void menu(String[] ips) throws URISyntaxException, IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n============= JUEGO API =============");
        System.out.println("\n\t (j)ugar / (s)tats: \n");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("J")) play(ips);
        if (respuesta.equalsIgnoreCase("S")) System.out.println("\n" + consumeAPI("localhost", "statistics"));
        if (!respuesta.equalsIgnoreCase("J") && !respuesta.equalsIgnoreCase("S")) {
            System.out.println("error");
            menu(ips);
        }
        main(ips);
    }

    public static String consumeAPI(String ip, String path) throws URISyntaxException, IOException, InterruptedException {
            URI targetURI = new URI("http://" + ip + ":8080/" + path);
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(targetURI).GET().build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return response.body();
    }

    public static void play(String[] ips) throws URISyntaxException, IOException, InterruptedException {
        int numApis = 0;
        int puntuacion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        for (String ip : ips) {
            try{
                if (Boolean.parseBoolean(consumeAPI(ip, ""))) {
                    System.out.println("\n=============  " + ip + "  =============");
                    numApis++;
                    for (int i = 1; i < 4; i++) {
                        System.out.println("\n" + consumeAPI(ip, "pista" + i));
                        System.out.println("\n" + i + "/3 pistas, (r)esolver / (p)ista: \n");
                        String modo = sc.nextLine();
                        if (modo.equalsIgnoreCase("R")) {
                            System.out.println("Introduce tu respuesta\n");
                            String respuesta = sc.nextLine();
                            if (Boolean.parseBoolean(consumeAPI(ip, "resolver/" + respuesta))) {
                                puntuacion += (i == 1) ? 10 : 0;
                                puntuacion += (i == 2) ? 5 : 0;
                                puntuacion += (i == 3) ? 3 : 0;
                            } else {
                                System.out.println("Fallaste");
                            }
                            break;
                        }

                    }
                }
            }catch (Exception e){
                System.out.println("Api no disponible");
                System.out.println("Error" + e);
            }

            System.out.println("Mi puntuación actual es de :" + puntuacion + " puntos");
            System.out.println(numApis + " de " + ips.length + " preguntas");
        }

        System.out.println("PUNTUACIÓN FINAL: " + puntuacion + " puntos en un total de " + numApis + " preguntas");
        
        if (puntuacion > Integer.parseInt(consumeAPI("localhost", "score"))) {
            consumeAPI("localhost", "score/61860/" + puntuacion);
            System.out.println("\n Nueva mejor puntuacion!!!");
        }
        //Comprueba que tu nueva puntuación sea superior a la que tienes en tu API.
        //Si es superior envíala para que quede registrado tu nuevo record.
        main(ips);
    }

}