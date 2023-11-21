public class Main {
    public static void main(String[] args) {
        int[][] patterColour = {{255,255,255},{100, 120, 150},{200, 255,200}, {240, 0, 0}};
        int[][] objectColour = {{ 230, 235, 255 }, { 109, 121, 155 }, { 200, 255, 200 }, { 241, 5, 15 }};
        
        System.out.println(checkObjectWithPatternColour(patterColour, objectColour));

    }
    
    public static double getDistance(double speed, double time) {
        return ((speed * time) / 2);
    }

    public static boolean isValidCar(double[] sensorProbability) {
        int porcentaje = 0;
        for (double d : sensorProbability)
            porcentaje += d;
        return (porcentaje/sensorProbability.length <= 10);
    }

    public static double checkObjectWithPatternBlackAndWhite(boolean[][] pattern, boolean[][] object) {
        int check = 0;
        int total = object.length * object[0].length;
        for (int i = 0; i < object.length; i++) {
            for (int j = 0; j < object[0].length; j++) {
                if (pattern[i][j] != object[i][j])
                    check++;
            }
        }
        return (check * 100) / total;
    }
    
    public static double checkObjectWithPatternColour(int[][] pattern, int[][] object) {
        double total = object.length * object[0].length;
        double check = 0;
        for (int i = 0; i < object.length; i++) {
            for (int j = 0; j < object[0].length; j++) {
                if (((pattern[i][j] - object[i][j] >= 0) && (pattern[i][j] - object[i][j] <= 10))
                        || ((object[i][j] - pattern[i][j] >= 0) && (object[i][j] - pattern[i][j] <= 10)))
                    check++;
            }
        }
        System.out.println(check);
        return 100-((check * 100) / total);
    }
}
