
public class _01_LuckyNumber {
    public static void main(String[] args) {
        // EJ 5
        System.out.println("\n\n---------------- Lucky Number ----------------\n");
        String date = "01-01-2000";
        System.out.println(luckyNumberCheck(date));
    }

    public static int luckyNumberCheck(String date){
        int dia = Integer.parseInt(date.substring(0,2));
        int mes = Integer.parseInt(date.substring(3,5));
        int anho = Integer.parseInt(date.substring(6,10));


        int luckyNumber = dia + mes + anho;
        String luckyNumberString = String.valueOf(luckyNumber);
        luckyNumber = 0;
        for (int i = 0; i < 4; i++) {
            luckyNumber += Integer.parseInt(luckyNumberString.substring(i,i+1));
        }
        return luckyNumber;
    }
}