import java.util.Scanner;

public class Enu41_SumaDeMatrius {

    static void pintaLinia(int columnes) {
        int comptador = 0;
        do {
            System.out.print("+---");
            comptador++;
        } while (comptador < columnes);
        System.out.println("+");
    }

    static void mostraMatriu(int[][] matriuRebuda) {
        int columnes = matriuRebuda[0].length;
        pintaLinia(columnes);
        // FOR per mostrar array
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (matriuRebuda[i][j] > 0) {
                    if (matriuRebuda[i][j] < 10) {
                        System.out.print("|  " + matriuRebuda[i][j]);
                    } else {
                        System.out.print("| " + matriuRebuda[i][j]);
                    }
                } else {
                    if (matriuRebuda[i][j] > -10) {
                        System.out.print("| " + matriuRebuda[i][j]);
                    } else {
                        System.out.print("|" + matriuRebuda[i][j]);
                    }
                }
            }
            System.out.println("|");
            pintaLinia(columnes);
        }
    }

    static int[][] llegirMatriu(int filesMatriu, int columnesMatriu) {
        int[][] matriuAOmplir = new int[filesMatriu][columnesMatriu];
        // Scanner teclat = new Scanner(System.in);
        for (int i = 0; i < matriuAOmplir.length; i++) { // for per recorrer les files
            for (int j = 0; j < matriuAOmplir[i].length; j++) { // for per recorrer les columnes
                // System.out.print("Entra el valor de [" + i + "][" + j + "] = ");
                int min = -99;
                int max = 99;

                matriuAOmplir[i][j] = (int) (Math.random() * (max - min) + min);// teclat.nextInt();
            }
            System.out.println();
        }
        // teclat.close();
        return matriuAOmplir;
    }

    public static void main(String args[]) throws Exception {

        Scanner teclat = new Scanner(System.in);
        int files, columnes;

        System.out.print("Entra la quantitat de files: ");
        files = teclat.nextInt();

        System.out.print("Entra la quantitat de columnes: ");
        columnes = teclat.nextInt();

        int[][] matriuA = new int[files][columnes];
        int[][] matriuB = new int[files][columnes];

        // FOR introducció de dades
        matriuA = llegirMatriu(files, columnes);
        System.out.println("Matriu A");
        mostraMatriu(matriuA);

        matriuB = llegirMatriu(files, columnes);
        System.out.println("Matriu B");
        mostraMatriu(matriuB);

        teclat.close();
    }
}
