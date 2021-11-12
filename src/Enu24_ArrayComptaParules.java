import java.util.Scanner;

public class Enu24_ArrayComptaParules {
    public static void main(String args[]) throws Exception {
        final int MIDA = 5;
        String[] arrCadenes = new String[MIDA];
        int[] arrLongituds = new int[MIDA];
        int[] arrParaules = new int[MIDA];

        Scanner teclat = new Scanner(System.in);
        // // FOR introducció de dades
        // for (int i = 0; i < arrCadenes.length; i++) {
        // System.out.print("Entra la cadena de la posició " + (i + 1));
        // arrCadenes[i] = teclat.nextLine();
        // }

        arrCadenes[0] = "En un lugar de la Macha";
        arrCadenes[1] = "de cuyo nombre no quiero acordarme";
        arrCadenes[2] = "no ha mucho tiempo que vivía un hidalgo";
        arrCadenes[3] = "de los de lanza en astillero";
        arrCadenes[4] = "adarga antigua, rocín flaco y galgo corredor";

        int comptaEspais = 0;
        // FOR procesament de dades
        for (int i = 0; i < arrCadenes.length; i++) {
            comptaEspais = 0;
            for (int j = 0; j < arrCadenes[i].length(); j++) {
                if (arrCadenes[i].charAt(j) == ' ') {
                    comptaEspais++;
                }
            }
            arrParaules[i] = comptaEspais + 1;
            arrLongituds[i] = arrCadenes[i].length();
            System.out.println();
        }

        // FOR sortida de dades
        for (int i = 0; i < arrCadenes.length; i++) {
            System.out.println("A la pos " + i + " = " + arrCadenes[i] + " té " + arrLongituds[i] + " caracters " + "i "
                    + arrParaules[i] + " paraules.");
        }
        teclat.close();
    }
}
