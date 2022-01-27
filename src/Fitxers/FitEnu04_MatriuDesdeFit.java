package Fitxers;

import java.io.File;
import java.util.Scanner;

public class FitEnu04_MatriuDesdeFit {
    public static void main(String[] args) {
        int files, columnes;
        // src\\Fitxers\\matriuAmbFilaIColumna.txt
        File fitxer = new File("src\\Fitxers\\matriuAmbFilaIColumna.txt");
        Scanner punter = null;
        String linia = "";

        try {
            // Llegim el contingut del fitxer
            System.out.println("... Llegim el contingut del fitxer ...");
            punter = new Scanner(fitxer);

            linia = punter.nextLine(); // Salvem la linia dins d'un String
            // System.out.println(linia); // Mostrem la linia

            String array[];
            array = linia.split("#");
            files = Integer.parseInt(array[0]);
            columnes = Integer.parseInt(array[1]);

            String[][] matriu = new String[files][columnes];

            linia = punter.nextLine(); // Salvem la linia dins d'un String

            array = linia.split(",");

            int comptador = 0;

            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j] = array[comptador];
                    comptador++;

                }
            }

            for (int i = 0; i < matriu.length; i++) {
                System.out.print(" | ");
                for (int j = 0; j < matriu[i].length; j++) {
                    System.out.print(matriu[i][j] + " | ");
                }
                System.out.println();
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
}