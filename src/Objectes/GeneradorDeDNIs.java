import java.io.FileWriter;
import java.util.Scanner;

/**
 * generaDIN
 */
public class GeneradorDeDNIs {
    static Scanner teclat = new Scanner(System.in);

    private static void escriuArrayAFitxer(String nomFitxer, String[] linies) {
        FileWriter fitxer = null;
        try {

            fitxer = new FileWriter(nomFitxer);

            // Escrivim línia a línia en el fitxer
            for (int i = 0; i < linies.length; i++) { // String linia : paraules) {
                fitxer.write(linies[i] + "\n");
            }
            fitxer.close();
        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
    }

    public static void mostraArray(String[] arrayAMostrar) {
        for (int i = 0; i < arrayAMostrar.length; i++) {
            System.out.println(arrayAMostrar[i]);
        }
    }

    public static int aleatoriMaxMin(int min, int max) {
        double num = Math.random() * (max - min) + min;
        return (int) num;
    }


    public static String tornaDNI() {
        char lletresNif[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E' };
        int min = 30000000, max = 55000000;
        int numeroDNI = aleatoriMaxMin(min, max);
        char lletraDNI = lletresNif[numeroDNI % 23];
        return numeroDNI + Character.toString(lletraDNI);
    }

    public static void main(String[] args) {
        int qtatDnis = 0;
        boolean qtatCorrecta = false;


       String nomFitxer = "DNIGenerats.txt";
        do {
            qtatCorrecta = false;
            System.out.print("Quants DNIS's vols crear?: ");
            try {
                qtatDnis = teclat.nextInt();
                qtatCorrecta = true;
            } catch (Exception e) {
                System.out.println("Entra un nombre si us plau!\nTorna a intentar-ho!");
            }
        } while (!qtatCorrecta);

        String[] llistaDnis = new String[qtatDnis];

        for (int i = 0; i < llistaDnis.length; i++) {
            llistaDnis[i]=tornaDNI();
        }
        escriuArrayAFitxer(nomFitxer, llistaDnis);
        mostraArray(llistaDnis);
    }

}