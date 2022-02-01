package Fitxers;

import java.io.File;
import java.util.Scanner;

public class Fitxers {

    public static void llegirFitxer(String nomFitxer) {
        // Recordar que el Endcoding cal que sigui => "Windows 1250"

        // Nom de fitxer del que volem llegit

        File fitxer = new File(nomFitxer);
        Scanner punter = null;
        String linia = "";

        try {
            // Llegim el contingut del fitxer
            punter = new Scanner(fitxer);

            // Llegim una línia del contingut del fitxer
            while (punter.hasNextLine()) {
                linia = punter.nextLine(); // Salvem la linia dins d'un String
                System.out.println(linia); // Mostrem la linia
            }

        } catch (Exception exepcio1) {
            System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
    }

    // Nom de fitxer del que volem llegit
    public static String llegirLiniaFitxer(String nomCompletFitxer, int liniaALlegir) {
        File fitxer = new File(nomCompletFitxer);
        Scanner punter = null;
        String resultat = "";
        try {
            // Llegim el contingut del fitxer
            // System.out.println("... Llegim el contingut del fitxer ...");
            punter = new Scanner(fitxer);
            // Llegim una línia del contingut del fitxer
            while (punter.hasNextLine() || liniaALlegir == 0) {
                resultat = punter.nextLine(); // Salvem la linia dins d'un String
                // System.out.println(linia); // Mostrem la linia
                liniaALlegir--;
            }
        } catch (Exception exepcio1) {
            resultat = exepcio1.getMessage();
            // System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                resultat = exepcio2.getMessage();
                // System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
        return resultat;
    }

}
