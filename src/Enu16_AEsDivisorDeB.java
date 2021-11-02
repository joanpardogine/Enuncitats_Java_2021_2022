import java.util.Scanner;

public class Enu16_AEsDivisorDeB {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int nombreA, nombreB;

        do {
            System.out.print("Entra el primer dels nombres: ");
            nombreA = teclat.nextInt();
            System.out.print("Entra el segon dels nombres: ");
            nombreB = teclat.nextInt();
            if ((nombreA < 0) || (nombreB < 0)) {
                System.out.println("ERROR! Torna a intentar-ho!");
            }
        } while ((nombreA < 0) || (nombreB < 0));

        if (nombreB % nombreA == 0) {
            System.out.println(nombreA + " és divisor de " + nombreB);
        } else {
            System.out.println(nombreA + " NO és divisor de " + nombreB);
        }

        teclat.close();
    }
}
