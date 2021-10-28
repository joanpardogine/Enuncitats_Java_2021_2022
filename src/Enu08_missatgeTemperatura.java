
import java.util.Scanner;

public class Enu08_missatgeTemperatura {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int temperatura;

        System.out.print("Entra la temperatura actual: ");
        temperatura = teclat.nextByte();
        if ((temperatura >= -30) && (temperatura <= -15)) {
            System.out.println("Massa fred");

        } else if ((temperatura >= -14) && (temperatura <= -10)) {
            System.out.println("Molt fred");

        } else if ((temperatura >= -9) && (temperatura <= 5)) {
            System.out.println("Fred");

        } else if ((temperatura >= 6) && (temperatura <= 15)) {
            System.out.println("Fresqueta");

        } else if ((temperatura >= 16) && (temperatura <= 20)) {
            System.out.println("Calor");

        } else if ((temperatura >= 21) && (temperatura <= 30)) {
            System.out.println("Molta Calor");

        } else if ((temperatura >= 31) && (temperatura <= 45)) {
            System.out.println("Moltíssima Calor");

        }

        teclat.close();

    }
}
