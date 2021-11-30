import java.io.File;
import java.util.Scanner;

public class A_Teoria_07A_FitxersLlegir {
    public static void main(String[] args) {
        // Recordar que el Endcoding cal que sigui => "Windows 1250"

        // Nom de fitxer del que volem llegit
        File fitxer = new File("fitxer_llegir.txt");
        Scanner punter = null;
        String linia = "";

        try {
            // Llegim el contingut del fitxer
            System.out.println("... Llegim el contingut del fitxer ...");
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
}
