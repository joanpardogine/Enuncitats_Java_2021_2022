package Fitxers;

import java.io.FileWriter;

public class FitEnu02_100Primers {

    public static boolean esDivisor(int nEntrat, int posibleDivi) {
        if (nEntrat % posibleDivi == 0) {
            return true;
        }
        return false;
    }

    public static boolean esPrimer(int nEntrat) {
        for (int i = 2; i < nEntrat; i++) {
            if (esDivisor(nEntrat, i) == true) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        FileWriter fitxer = null;
        try {
            fitxer = new FileWriter("src\\Fitxers\\_fitOut_Enu02.txt");
            for (int i = 2, j = 0; j < 100; i++) {
                if (esPrimer(i)) {
                    fitxer.write(i + "\n");
                    j++;
                }
            }
            fitxer.close();
        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
    }
}