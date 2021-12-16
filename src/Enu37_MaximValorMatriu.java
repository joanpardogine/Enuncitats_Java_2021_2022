import java.util.Scanner;

/*  Dissenya un programa que pugui determinar el màxim
    element d'una matriu de n x m de sencers i que
    serà donada per l'usuari.  */

public class Enu37_MaximValorMatriu {

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
        int files, columnes, elementMaxim, fila, columna;
        elementMaxim = 0;
        fila = 0;
        columna = 0;

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

        int[][] matriuEnters = new int[files][columnes];

        // FOR per inicialitzar array
        for (int i = 0; i < matriuEnters.length; i++) {
            for (int j = 0; j < matriuEnters[i].length; j++) {
                matriuEnters[i][j] = (int) (Math.random() * 100);
            }
        }

        mostraMatriu(matriuEnters);

        // FOR per processar l'array
        for (int i = 0; i < matriuEnters.length; i++) {
            for (int j = 0; j < matriuEnters[i].length; j++) {
                if (matriuEnters[i][j] > elementMaxim) {
                    elementMaxim = matriuEnters[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        System.out.println("El màxim element de la matriu és "
                + elementMaxim + "\ni es troba a la fila "
                + (fila + 1) + " i columna " + (columna + 1));
        teclat.close();
    }
}