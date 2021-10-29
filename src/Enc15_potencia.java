import java.util.Scanner;

public class Enc15_potencia {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int base, potencia, resultat;
        resultat = 1;
        do {
            System.out.print("Entra la base: ");
            base = teclat.nextInt();
            System.out.print("Entra la potencia: ");
            potencia = teclat.nextInt();
            if ((base < 0) || (potencia < 0)) {
                System.out.println("ERROR! Torna a intentar-ho!");
            }
        } while ((base < 0) || (potencia < 0));

        for (int i = 0; i < potencia; i++) {
            resultat = resultat * base;
        }

        System.out.print(base + " elevat a " + potencia + " és " + resultat);
        teclat.close();
    }
}