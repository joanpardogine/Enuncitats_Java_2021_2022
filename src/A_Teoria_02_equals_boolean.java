import java.util.Scanner;

public class A_Teoria_02_equals_boolean {
    public static void main(String[] args) {
        // final String NOM_JOAN = "Joan";

        char[] nom1 = new char[4];

        char[] nom2 = new char[4];

        nom1[0] = 'J';
        nom1[1] = 'o';
        nom1[2] = 'a';
        nom1[3] = 'n';

        nom2[0] = 'J';
        nom2[1] = 'o';
        nom2[2] = 'a';
        nom2[3] = 'n';

        int comptadorLletresIguals = 0;

        // for (int i = 0; i < nom1.length; i++) {
        // if (nom1[i] == nom2[i]) {
        // comptadorLletresIguals++;
        // }
        // }

        boolean sonDiferents;
        sonDiferents = false;

        int i = 0; // for ==> i=0
        do {
            if (nom1[i] == nom2[i]) {
                comptadorLletresIguals++;
            } else {
                sonDiferents = true;
            }
            i++;
        } while ((i < nom1.length) || (sonDiferents == true));

        System.out.println("comptadorLletresIguals = " + comptadorLletresIguals);

        // int posicio = 3;

        // for (int i = 0; i < nom1.length; i++) {
        // if (i == posicio) {
        // System.out.println("La lletra que esta a la posició " + posicio + " és la " +
        // nom1[i]);
        // } else {
        // System.out.println("La lletra que esta a la posició " + posicio + " NO és la
        // " + nom1[i]);
        // }
        // }

        if (comptadorLletresIguals == nom1.length) {
            System.out.print("És correcte el nom1 es igual a nom2");
        } else {
            System.out.print("NO és correcte el nom1 NO es igual a nom2");
        }

        // if (nom1 == nom2) {
        // System.out.print("És correcte el nom1 es igual a nom2");
        // } else {
        // System.out.print("NO és correcte el nom1 NO es igual a nom2");
        // }

        Scanner teclat = new Scanner(System.in);
        // String nomGranger;
        // System.out.print("Entra el nom del granger ");
        // nomGranger = teclat.next();
        // if (nomGranger.equals(NOM_JOAN)) {
        // System.out.print("És correcte el granger es diu " + NOM_JOAN);
        // } else {
        // System.out.print("NO és correcte el granger NO es diu " + NOM_JOAN);
        // }
        teclat.close();
    }
}
