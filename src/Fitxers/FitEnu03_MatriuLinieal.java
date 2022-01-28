package Fitxers;

import java.io.FileWriter;
import java.util.Scanner;

public class FitEnu03_MatriuLinieal {
    public static void main(String[] args) {
        int[][] matriu;
        int files, columnes;

        System.out.print("Entra la quantitat de files: ");
        files = teclat.nextInt();
        System.out.print("Entra la quantitat de columnes: ");
        columnes = teclat.nextInt();

        matriu = new int[files][columnes];
        int comptador = 1;

        FileWriter fitxer = null;
        try {
            fitxer = new FileWriter("src\\Fitxers\\matriuLineal.txt");
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j] = comptador;
                    fitxer.write(String.valueOf(comptador));
                    comptador++;
                }
                fitxer.write("\n");
            }
            fitxer.close();
        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
        teclat.close();
    }
}