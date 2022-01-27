package Fitxers;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FitEnu01SumaCSV {
    public static void main(String[] args) {
        // Recordar que el Endcoding cal que sigui => "Windows 1250"

        final String SEPARADOR = ",";
        // Nom de fitxer del que volem llegit
        String nomFitxerEntrada = "src\\Fitxers\\_fitEnt_Enu01.txt";
        String nomFitxerSortida = "src\\Fitxers\\_fitSor_Enu01.txt";

        Scanner punter = null;
        String linia = "";
        String[] elementsLlegits;

        int suma;

        try {
            // File fitxerEntrada = new File("src\\Fitxers\\fitxerEntrada.txt");
            File fitxerEntrada = new File(nomFitxerEntrada);
            // FileWriter fitxerSortida = new FileWriter("src\\Fitxers\\fitxerSortida.txt");
            FileWriter fitxerSortida = new FileWriter(nomFitxerSortida);

            // Llegim el contingut del fitxer
            System.out.println("... Llegim el contingut del fitxer ...");
            punter = new Scanner(fitxerEntrada);

            // Llegim una línia del contingut del fitxer
            while (punter.hasNextLine()) {
                suma = 0;
                linia = punter.nextLine(); // Salvem la linia dins d'un String
                System.out.println(linia); // Mostrem la linia
                elementsLlegits = linia.split(SEPARADOR);
                // elementsLlegits = linia.split(",");
                for (int i = 0; i < elementsLlegits.length; i++) {
                    System.out.println("Element [" + i + "] = " + elementsLlegits[i]);
                    // fitxerSortida.write(elementsLlegits[i]+",");
                    fitxerSortida.write(elementsLlegits[i] + SEPARADOR);
                    suma = suma + Integer.parseInt(elementsLlegits[i]);
                }
                fitxerSortida.write(suma + "\n");
                System.out.println("La suma és = " + suma);
            }
            fitxerSortida.close();
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
