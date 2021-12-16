import java.util.Scanner;

public class Enu39_MatriuIdentitat {

    static void mostraMatriu(int[][] matriuRebuda) {
        // FOR per mostrar array
        for (int i = 0; i < matriuRebuda.length; i++) {
            for (int j = 0; j < matriuRebuda[i].length; j++) {
                if (matriuRebuda[i][j] < 10) {
                    System.out.print(" " + matriuRebuda[i][j] + " ");
                } else {
                    System.out.print(matriuRebuda[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner teclat = new Scanner(System.in);
        int files, columnes;
        System.out.print("Entra la quantitat de files: ");
        files = teclat.nextInt();
        do {
            System.out.print("Entra la quantitat de columnes: ");
            columnes = teclat.nextInt();
            if (files != columnes) {
                System.out.print("Torna a entrar "
                        + "la quantitat de columnes!\n"
                        + "Recorda que cal que sigui "
                        + "igual a les files ("
                        + files + ")!\n");
            }
        } while (files != columnes);

        int[][] matriuIdentitat = new int[files][columnes];

        // FOR introducció de dades
        for (int i = 0; i < matriuIdentitat.length; i++) {
            for (int j = 0; j < matriuIdentitat[i].length; j++) {
                if (i == j) {
                    matriuIdentitat[i][j] = 1;
                } else {
                    matriuIdentitat[i][j] = 0;
                }
            }
        }

        mostraMatriu(matriuIdentitat);
        teclat.close();
    }
}
