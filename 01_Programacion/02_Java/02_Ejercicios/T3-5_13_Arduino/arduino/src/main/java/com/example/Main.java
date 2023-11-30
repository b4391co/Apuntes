package com.example;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        ArrayList<Integer> temperatures = new ArrayList<>();
        ArrayList<Integer> humidities = new ArrayList<>();
        HashMap<String, Integer> colors = new HashMap<>();
        String[] validColors = { "red", "blue", "green", "yellow", "purple" };

        String maxTemperatureDate = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String maxhumiditieDate = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        //EJEMPLOS DE COMO ACCEDER A LA API

        //Enviar una petición POST
        //postAPI("localhost", "1880", "color", "orange");

        //Realizar una petición GET y mostrarla por pantalla
        //System.out.println(getAPI("192.168.7.21", "1880", "temperature"));

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n********************** Welcome to Arduino Menu *****************************");
            System.out.println("\n\t1. Ver Color.\t\t\t\t7. Humedad máxima.");
            System.out.println("\n\t2. Ver Humedad.\t\t\t\t8. Cambiar color.");
            System.out.println("\n\t3. Ver Temperatura.\t\t\t9. Color más repetido.");
            System.out.println("\n\t4. Temperatura mínima.\t\t\t10. Hora Temperatura máxima.");
            System.out.println("\n\t5. Humedad mínima.\t\t\t11. Hora Humedad máxima.");
            System.out.println("\n\t6. Temperatura máxima.\t\t\t0. Exit.");
            System.out.println("\n**************************************************************************");

            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    String colorGet = getAPI("192.168.7.21", "1880", "color");
                    System.out.println("\ncolor: " + colorGet);
                    if (colors.get(colorGet) != null)
                        colors.put(colorGet, colors.get(colorGet) + 1);
                    else
                        colors.put(colorGet, 1);

                } else if (choice == 2) {
                    System.out.println("\nHumedad: " + getAPI("192.168.7.21", "1880", "humidity"));
                    int humiditie = Integer.parseInt(getAPI("192.168.7.21", "1880", "humidity"));
                    if (humiditie > getMaxMin("max", humidities)) {
                        maxhumiditieDate = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    }
                    humidities.add(humiditie);

                } else if (choice == 3) {
                    System.out.println("\nTemperatura: " + getAPI("192.168.7.21", "1880", "temperature"));
                    int temperature = Integer.parseInt(getAPI("192.168.7.21", "1880", "temperature"));
                    if (temperature > getMaxMin("max", temperatures)) {
                        maxTemperatureDate = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    }
                    temperatures.add(temperature);
                } else if (choice == 4)
                    System.out.println("\nTemperatura minina: " + getMaxMin("min", temperatures));
                else if (choice == 5)
                    System.out.println("\nHumedad minina: " + getMaxMin("min", humidities));
                else if (choice == 6)
                    System.out.println("\nTemperatura Maxima: " + getMaxMin("max", temperatures));
                else if (choice == 7) 
                    System.out.println("\nHumedad  Maxima: " + getMaxMin("max", humidities));
                else if (choice == 8) {
                    System.out.println("\n********************** Welcome to Arduino Menu *****************************");
                    System.out.println("\n\t1. Azul.\t\t\t\t\t3. Verde.");
                    System.out.println("\n\t2. rojo.\t\t\t\t\t4. Amarillo.");
                    System.out.println("\n\t5. Purple.\t\t\t\t\t");
                    System.out.println("\n**************************************************************************");
                    int colorChoice = scanner.nextInt();
                    String color = "";
                    if (colorChoice == 1)
                        color = "blue";
                    else if (colorChoice == 2)
                        color = "red";
                    else if (colorChoice == 3)
                        color = "green";
                    else if (colorChoice == 4)
                        color = "yellow";
                    else if (colorChoice == 5)
                        color = "purple";

                    postAPI("192.168.7.21", "1880", "color", color);
                } else if (choice == 9) {
                    String maxColor = "";
                    int maxColorValue = 0;
                    for (String validColor : validColors) {
                        if (colors.get(validColor) != null){
                            maxColorValue = (colors.get(validColor) >= maxColorValue) ? colors.get(validColor) : maxColorValue;
                            maxColor = (colors.get(validColor) >= maxColorValue) ? validColor : maxColor;
                        }
                    }
                    System.out.println("\n el color mas repetido es " + maxColor + ", " + maxColorValue + " veces");
                } else if (choice == 10)
                    System.out.println(maxTemperatureDate);
                else if (choice == 11)
                    System.out.println(maxhumiditieDate);
                else if(choice==0) {
                    System.out.println("Bye!!");
                    System.exit(0);;
                } else {
                    System.err.println("[ERROR] Your option is incorrect!! Try again!!");
                }
            } catch (
                    InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);


    }

    public static int getMaxMin(String type, ArrayList<Integer> temperatures) {
        if (type == "max") {
            int result = 0;
            for (int value : temperatures) {
                result = (result < value) ? value : result;
            }
            return result;
        } else if (type == "min") {
            int result = 100;
            for (int value : temperatures) {
                result = (result > value) ? value : result;
            }
            return result;
        }
        return 0;
    }
    public static String getAPI(String ip, String port, String path) throws URISyntaxException, IOException, InterruptedException {
        URI targetURI = new URI("http://" + ip + ":" + port + "/" + path);
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(targetURI).GET().build();
        //HttpClient httpClient = HttpClient.newHttpClient();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static String postAPI(String ip, String port, String path, String message) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://" + ip + ":" + port +"/" + path))
                .POST(HttpRequest.BodyPublishers.ofString(message))
                .build();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    /*
        Escribir en un archivo:

        FileWriter file = new FileWriter("./parameters.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hola");
        pw.close();
     */

    /*
        Leer de un archivo:

       BufferedReader br = new BufferedReader(new FileReader ("./parameters.txt"));
       String line = "";
       while(!(line = br.readLine()) != null){
            System.out.println(line);
       }
     */

}