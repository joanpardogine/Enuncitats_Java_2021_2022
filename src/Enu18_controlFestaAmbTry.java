import java.util.Scanner;

public class Enu18_controlFestaAmbTry {
    public static void main(String args[]) throws Exception {
        final int MAJOR_EDAT = 18;
        Scanner teclat = new Scanner(System.in);
        int edat, totalHomes, totalDones, totalEdatHomes, totalEdatDones;
        char sexe;

        totalHomes = 0;
        totalDones = 0;
        totalEdatHomes = 0;
        totalEdatDones = 0;

        do {
            System.out.print("Entra la teva edat (0 per acabar!): ");
            edat = teclat.nextInt();
            if (edat < MAJOR_EDAT) {
                if (edat < 0) {
                    System.out.println("T'has equivocat!");
                } else {
                    System.out.println("Ho sento no pots entrar!");
                }
            } else { // Major d'edat
                if (edat != 0) {
                    do {
                        System.out.print("Entra el teu sexe (H/D): ");
                        sexe = teclat.next().toUpperCase().charAt(0);
                        // sexe = teclat.next().toLowerCase().charAt(0);
                        if ((sexe != 'H') && (sexe != 'D')) {
                            System.out.println("ERROR només H o D!");
                        }
                    } while ((sexe != 'H') && (sexe != 'D'));
                    if (sexe == 'H') {
                        totalHomes++;
                        totalEdatHomes = totalEdatHomes + edat;
                    } else {
                        totalDones++;
                        totalEdatDones = totalEdatDones + edat;
                    }
                }
            }
        } while (edat != 0);

        System.out.println("Hi han " + (totalHomes + totalDones) + " assistents!");
        System.out.println("Hi han " + totalHomes + " homes!");
        System.out.println("Hi han " + totalDones + " dones!");

        try {
            System.out.println("La mitjana d'edat dels homes és " + (totalEdatHomes / totalHomes));
        } catch (ArithmeticException e) {
            System.out.println("La mitjana d'edat dels homes és: NO ES POT MOSTRAR!");
        }

        try {
            System.out.println("La mitjana d'edat de les dones és " + (totalEdatDones / totalDones));
        } catch (ArithmeticException e) {
            System.out.println("La mitjana d'edat de les dones és: NO ES POT MOSTRAR!");
        }

        // if (totalHomes > 0) {
        // System.out.println("La mitjana d'edat dels homes és " + (totalEdatHomes /
        // totalHomes));
        // }
        // if (totalDones > 0) {
        // System.out.println("La mitjana d'edat de les dones és " + (totalEdatDones /
        // totalDones));
        // }
        teclat.close();
    }

}
