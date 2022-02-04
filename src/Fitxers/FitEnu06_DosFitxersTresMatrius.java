package Fitxers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FitEnu06_DosFitxersTresMatrius {
    public static void main(String[] args) {
        int mida = Jpc.llegirEnterAmbMissatge("Entra la mida de matriu: ");
        String nomFitxer = "src\\Fitxers\\matIntroUsuari.txt";
        String[][] matriu = new String[mida][mida];
        String[][] matriuAux = new String[mida][mida];
        String[][] matriuTras = new String[mida][mida];

        // Omplim l'array demanant-li els valors a l'usuari
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = Integer.toString((int) (Math.random() * 10));
                // matriu[i][j] = Integer.toString(Jpc.llegirEnterAmbMissatge(
                //         "Entra el número de la fila " + (i + 1) + " i la columna " + (j + 1) + ": "));
            }
        }

        // Escribim el contingut de l'array al fitxer.
        FileWriter fitxer = null;
        try {
            fitxer = new FileWriter(nomFitxer);
            // Escrivim línia a línia en el fitxer
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    fitxer.write(String.valueOf(matriu[i][j]));
                    if (j < (matriu[i].length - 1)) {
                        fitxer.write("#");
                    }
                }
                fitxer.write("\n");
            }

            fitxer.close();
        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }

        // Llegim el contingut del fitxer.
        File fitxer2 = new File(nomFitxer);
        Scanner punter = null;
        String linia = "";
        String[] arrayLinia;

        try {
            // Llegim el contingut del fitxer
            punter = new Scanner(fitxer2);

            // Llegim una línia del contingut del fitxer
            while (punter.hasNextLine()) {

                for (int i = 0; i < matriuTras.length; i++) {
                    linia = punter.nextLine(); // Salvem la linia dins d'un String
                    // String linia = 1#2#3
                    arrayLinia = linia.split("#");
                    // String arrayLinia[0] = 1
                    // String arrayLinia[1] = 2
                    // String arrayLinia[2] = 3
                    matriuAux[i] = arrayLinia; // EROROR
                }

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

        System.out.println("matriuAux");
        // for per mostrar la matriu matriuAux per pantalla
        for (int i = 0; i < matriuAux.length; i++) {
            for (int j = 0; j < matriuAux[i].length; j++) {
                System.out.print(matriuAux[i][j] + " ");
            }
            System.out.println();
        }

        // for per transposar la matriu matriuAux a la matriuTras
        for (int i = 0; i < matriuAux.length; i++) {
            for (int j = 0; j < matriuAux[i].length; j++) {
                matriuTras[i][j] = matriuAux[j][i]; // Integer.parseInt(matriuAux[j][i]);
            }
            System.out.println();
        }

        System.out.println("matriuTras");
        // for per mostrar la matriu matriuTras per pantalla
        for (int i = 0; i < matriuTras.length; i++) {
            for (int j = 0; j < matriuTras[i].length; j++) {
                System.out.print(matriuTras[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        // Part de codi per crear la matriu Intercalada!
        String[][] matriuInter = new String[mida][mida + mida];
        for (int i = 0; i < matriuInter.length - 1; i = i + 2) {

            for (int j = 0; j < matriuInter.length; j++) {
                matriuInter[i][j] = matriu[index][j];
                matriuInter[i + 1][j] = matriuTras[index][j];
            }

            for (int j = 0; j < matriuInter.length; j++) {
                System.out.println("matriuInter[i,index] " + matriuInter[i][j]);
            }
            for (int j = 0; j < matriuInter.length; j++) {
                System.out.println("matriuInter[i+1,index] " + matriuInter[i + 1][j]);
            }
            index++;
        }

        System.out.println("matriuInter");
        // for per mostrar la matriu matriuInter per pantalla
        for (int i = 0; i < matriuInter.length; i++) {
            for (int j = 0; j < matriuInter[i].length; j++) {
                System.out.print(matriuInter[i][j] + " ");
            }
            System.out.println();
        }
    }

}
