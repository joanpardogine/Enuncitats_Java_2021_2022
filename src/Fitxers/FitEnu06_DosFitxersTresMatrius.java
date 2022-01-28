package Fitxers;

import java.io.FileWriter;
import java.util.Scanner;

public class FitEnu06_DosFitxersTresMatrius {

    static Scanner teclat;

    public static int llegirEnterAmbMissatge(String missatge) {
        int nombreLlegit = 0;
        boolean llegitNombre = false;
        teclat = new Scanner(System.in);
        do {
            try {
                llegitNombre = false;
                System.out.print(missatge);
            } catch (Exception errorAGestionar) {
                System.out.println("ERROR! només pots entrar nombres!");
                llegitNombre = true;
            } finally {
                nombreLlegit = teclat.nextInt();
            }
        } while (llegitNombre != false);

        return nombreLlegit;
    }

    public static void main(String[] args) {
        int mida = llegirEnterAmbMissatge("Entra la mida de matriu: ");

        int[][] matriu = new int[mida][mida];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                matriu[i][j] = llegirEnterAmbMissatge("Entra un numero");

            }
        }

        /** 1a FORMA D'ESCRITURE **/
        FileWriter fitxer = null;
        try {

            fitxer = new FileWriter("src\\Fitxers\\matIntroUsuari.txt");

            // Escrivim línia a línia en el fitxer
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {

                    fitxer.write(String.valueOf(matriu[i][j]));

                }
                fitxer.write("\n");
            }

            fitxer.close();

        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }

    }

}
