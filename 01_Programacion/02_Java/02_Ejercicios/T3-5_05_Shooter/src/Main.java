public class Main {
    public static void main(String[] args) {
        boolean[][] mapa = {{true,false,false,false},{false,false,true,true}};
        System.out.println(getNumObjects(mapa)); 
    }

    public static int getDamage(int speed, int armor, int distance){
        int damage = 0;

        if (distance <= 3 ) {
            damage = speed/10;
        }
        else if (speed >= 500 && distance < 20){
            damage = speed/10;
        }
        else if (speed >= 500 && distance >= 20){
            damage = ((speed/10) - armor);
        }
        else {
            damage = ((speed/10) - armor+(distance/10));
        }
        
        if ( damage >= 0 ){
            return damage;
        } 
        else{
            return 0;
        }
    }

    public static boolean isDeadByBodyShot(int life, int damage){
        return (life - damage <= 0)? true: false;
    }

    public static int getNumObjects(boolean[][] map){
        int contador = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == true) contador++;
            }
        }
        return contador;
    }

    public static boolean isHit(boolean[][] screen, int y, int x){
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                return (screen[i][j] && ( i == y && j == x))?true: false;
            }
        }
        return false;
    }

    public static boolean isHeadShot(boolean[][] screen, int y, int x){
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                int filaHeadShot = 0;
                if (filaHeadShot == 0) filaHeadShot = (screen[i][j])?i:0;
                return (screen[i][j] && ( i == y && j == x) && filaHeadShot == y)?true: false;
            }
        }
        return false;
    }

/*     public static int  getEnemyPosition(boolean[][] screen){

    } */
}
