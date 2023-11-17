public class Main {

    public static void main(String[] args){
        int numeros[] = new int[2];

        for (int i = 0; i < 2; i++){
            numeros[i] = (int)(Math.random()*1000)+1;
        }

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        for ( int i = 0; i < 2; i++) {
            System.out.print(numeros[i] + " , ");
        }
    }
}