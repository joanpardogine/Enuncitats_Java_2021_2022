import java.util.Scanner;

public class Enu32_MaximaDiferenciaEntreConsecitius {
    public static void main(String args[]) throws Exception {

        // final int MIDA = 7;
        // int[] arrayInicial = new int[MIDA];
        // int[] arrayFinal = new int[MIDA];

        int[] arrayInicial = { 34, 123, 324, 78, 45, 125, 154 };

        Scanner teclat = new Scanner(System.in);

        // FOR per inicialitzar arrayInicial
        // for (int i = 0; i < arrayInicial.length; i++) {
        //     arrayInicial[i] = (int) (Math.random() * 100);
        // }

        // FOR per mostrar arrayInicial
        for (int i = 0; i < arrayInicial.length; i++) {
            System.out.print(" " + arrayInicial[i]);
        }
        System.out.println();

        // FOR pel procesament
        int diferencia, pos1aDif = 0, pos2aDif = 0, difMaxima = 0;
        for (int i = 0; i < arrayInicial.length - 1; i++) {
            if (arrayInicial[i] > arrayInicial[i + 1]) {
                diferencia = arrayInicial[i] - arrayInicial[i + 1];
            } else {
                diferencia = arrayInicial[i + 1] - arrayInicial[i];
            }
            if (diferencia > difMaxima) {
                difMaxima = diferencia;
                pos1aDif = i;
                pos2aDif = i + 1;
            }
        }

        System.out.println("La diferència màxima és " + difMaxima +
                " i es troba entre les posicions " + pos1aDif + " i " + pos2aDif + ".");

        // FOR per mostrar arrayInicial
        // for (int i = 0; i < arrayFinal.length; i++) {
        //     System.out.print(" " + arrayFinal[i]);
        // }
        teclat.close();
    }
}