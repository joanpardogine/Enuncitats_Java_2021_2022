import java.util.Scanner;

public class Enu28_ArrayValorsPrimers {
    public static void main(String args[]) throws Exception {
        int valorN, valorK, comptador = 0;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el valor de N: ");
        valorN = teclat.nextInt();
        System.out.print("Entra el valor de k: ");
        valorK = teclat.nextInt();
        int[] arrayNombres = new int[valorN];
        // FOR per inicialitzar array
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i] = (int) (Math.random() * 100);
        }
        // FOR per processar array
        for (int i = 0; i < arrayNombres.length; i++) {
            if (arrayNombres[i] % valorK == 0) {
                comptador++;
            }
        }

        // FOR per mostrar array
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.print(" " + arrayNombres[i]);
        }

        System.out
                .println("\nDins de l'array de " + valorN + " posicions hi ha " + comptador + " divisors de " + valorK);
        teclat.close();
    }
}