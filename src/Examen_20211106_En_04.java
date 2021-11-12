import java.util.Scanner;

public class Examen_20211106_En_04 {
    /*
     * Realitza un programa que demani dos nombres enters A i B, i B és més gran que
     * A. Després visualitza els números des de A fins a B i indicar quants n'hi ha
     * que siguin parells. Si A és més gran o igual que B, es mostrarà un missatge
     * d’error per pantalla.
     */
    public static void main(String args[]) throws Exception {

        int primerNombreEntrat, segonNombreEntrat;
        int comptaParells = 0;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el primer dels dos nombres: ");
        primerNombreEntrat = teclat.nextInt();
        System.out.print("Entra el segon dels dos nombres: ");
        segonNombreEntrat = teclat.nextInt();
        // segonNombreEntrat més gran primerNombreEntrat CORRECTE!!!

        if (primerNombreEntrat >= segonNombreEntrat) {
            System.out.print("ERROR!");
        } else {
            for (int i = primerNombreEntrat; i <= segonNombreEntrat; i++) {
                System.out.println(i);
                if (i % 2 == 0) {
                    comptaParells++;
                }
            }
        }
        System.out.println(
                "El nombres parells entre " + primerNombreEntrat + " i " + segonNombreEntrat + " són " + comptaParells);
        teclat.close();
    }
}