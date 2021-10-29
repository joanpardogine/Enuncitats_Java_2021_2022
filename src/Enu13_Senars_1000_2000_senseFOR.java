public class Enu13_Senars_1000_2000_senseFOR {
    public static void main(String[] args) {
        int petit = 1000;
        int gran = 2000;

        while (petit < gran) {
            if (petit % 2 != 0) { // És senar
                System.out.println(petit);
            }
            petit++;
        }
    }
}
