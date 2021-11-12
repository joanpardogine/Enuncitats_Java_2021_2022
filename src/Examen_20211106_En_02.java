import java.util.Scanner;

public class Examen_20211106_En_02 {
    /*
     * Realitza un programa en JAVA que llegeixi un número i a continuació mostri
     * per pantalla el caràcter “*” tantes vegades com el número llegit. En aquells
     * casos en què el valor llegit no sigui positiu caldrà escriure un únic
     * asterisc
     */
    public static void main(String args[]) throws Exception {
        int nombreLlegit;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el nombre: ");
        nombreLlegit = teclat.nextInt();

        if (nombreLlegit < 0) {
            nombreLlegit = 1;
        }

        /*
         * do { System.out.print("*"); nombreLlegit--; } while (nombreLlegit > 0); Ho
         * descarto per que vull que quan sigui 0 no mostri cap asterisc!
         */

        while (nombreLlegit > 0) {
            System.out.print("*");
            nombreLlegit--;
        }

        teclat.close();
    }
}