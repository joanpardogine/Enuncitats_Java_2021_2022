import java.util.Scanner;

public class Enu25_ArrayComptaVocals {
    public static void main(String args[]) throws Exception {
        final int QTAT_PARAULES = 5;
        final int QTAT_VOCALS = 5;

        String[] arrEntrada = new String[QTAT_PARAULES];

        Scanner teclat = new Scanner(System.in);
        // // FOR introducció de dades
        // for (int i = 0; i < arrCadenes.length; i++) {
        // System.out.print("Entra la cadena de la posició " + (i + 1));
        // arrCadenes[i] = teclat.nextLine();
        // }

        arrEntrada[0] = "Programación";
        arrEntrada[1] = "Murcièlago";
        arrEntrada[2] = "Base de dades";
        arrEntrada[3] = "Programació";
        arrEntrada[4] = "Escola Ginebro";

        int comptaVocals[][] = new int[QTAT_PARAULES][QTAT_VOCALS];

        // FOR per inicialitzar a 0 tots els comptadors
        for (int i = 0; i < comptaVocals.length; i++) { // Per recorrer una a una totes les cadenes
            for (int j = 0; j < comptaVocals[i].length; j++) {
                comptaVocals[i][j] = 0;
            }
        }
        char lletra;
        long tempsInicial, tempsFinal;

        // FOR procesament de dades
        tempsInicial = System.nanoTime();
        for (int i = 0; i < arrEntrada.length; i++) { // Per recorrer una a una totes les cadenes
            for (int j = 0; j < arrEntrada[i].length(); j++) { // Per recorrer un a un tots els caracters
                lletra = arrEntrada[i].toLowerCase().charAt(j);
                // Primera OPCIÓ
                // if ((lletra == 'a') || (lletra == 'á') || (lletra == 'à')) {
                // comptaVocals[i][0]++;
                // } else if (lletra == 'e' || (lletra == 'é') || (lletra == 'è')) {
                // comptaVocals[i][1]++;
                // } else if (lletra == 'i' || (lletra == 'í') || (lletra == 'ì')) {
                // comptaVocals[i][2]++;
                // } else if (lletra == 'o' || (lletra == 'ó') || (lletra == 'ò')) {
                // comptaVocals[i][3]++;
                // } else if (lletra == 'u' || (lletra == 'ú') || (lletra == 'ù')) {
                // comptaVocals[i][4]++;
                // }
                // FINAL Primera OPCIÓ
                // Segona OPCIÓ
                switch (lletra) {
                case 'a', 'à', 'á':
                    comptaVocals[i][0]++;
                    break;
                case 'e', 'è', 'é':
                    comptaVocals[i][1]++;
                    break;
                case 'i', 'ì', 'í':
                    comptaVocals[i][2]++;
                    break;
                case 'o', 'ò', 'ó':
                    comptaVocals[i][3]++;
                    break;
                case 'u', 'ù', 'ú':
                    comptaVocals[i][4]++;
                    break;
                }
                // FINAL Segona OPCIÓ
            }
        }

        tempsFinal = System.nanoTime();
        System.out.println("Temps total d'execució: " + ((tempsFinal - tempsInicial)) + " nanoseg.");

        // FOR per mostrar tots els comptadors
        for (int i = 0; i < comptaVocals.length; i++) { // Per recorrer una a una totes les cadenes
            System.out.print("La cadena " + arrEntrada[i] + " té: ");
            for (int j = 0; j < comptaVocals[i].length; j++) {
                System.out.print(comptaVocals[i][j] + ", ");
            }
            System.out.println();
        }

        teclat.close();
    }
}