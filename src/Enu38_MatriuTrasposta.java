import java.util.Scanner;

public class Enu38_MatriuTrasposta {

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

    public static void main(String[] args) {

        int files, columnes;
        Scanner teclat = new Scanner(System.in);

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

        int matriu[][] = new int[files][columnes];
        int matriuTras[][] = new int[columnes][files];

        // for per introduir dades
        for (int i = 0; i < matriu.length; i++) { // for per recorrer les files
            for (int j = 0; j < matriu[i].length; j++) { // for per recorrer les columnes
                System.out.print("Entra el valor de [" + i + "][" + j + "] = ");
                matriu[i][j] = teclat.nextInt();
            }
            System.out.println();
        }

        // for per procesar les dades
        for (int i = 0; i < matriu.length; i++) { // for per recorrer les files
            for (int j = 0; j < matriu[i].length; j++) { // for per recorrer les columnes
                matriuTras[j][i] = matriu[i][j];
            }
        }

        mostraMatriu(matriu);
        System.out.println();
        mostraMatriu(matriuTras);

        teclat.close();
    }

}