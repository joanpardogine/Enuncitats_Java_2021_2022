import java.util.InputMismatchException;
import java.util.Scanner;

public class Enu30_DesplassaNPosicions {
    public static void main(String args[]) throws Exception {

        final int MIDA = 7;
        // int[] arrayInicial = { 34, 123, 324, 78, 45, 125, 154 };
        int[] arrayInicial = new int[MIDA];
        int[] arrayFinal = new int[MIDA];
        boolean esCorrecte = false;
        Scanner teclat = new Scanner(System.in);

        int desplassament = 0;
        do {
            try {
                System.out.print("Entra els despalaçament (enter): ");
                desplassament = teclat.nextInt();
                if (desplassament < MIDA) {
                    esCorrecte = true;
                } else {
                    System.out.println("ERROR! Només pots entrar nombres més petits que " + MIDA + ".");
                }
            } catch (InputMismatchException errorAGestionar) {
                System.out.println("ERROR! Només pots entrar nombres.");
            } finally {
                teclat.nextLine(); // Netejem el buffer d'entrada
            }
        } while (esCorrecte == false);

        // FOR per inicialitzar arrayInicial
        for (int i = 0; i < arrayInicial.length; i++) {
            arrayInicial[i] = (int) (Math.random() * 100);
        }

        // FOR per mostrar arrayInicial
        for (int i = 0; i < arrayInicial.length; i++) {
            System.out.print(" " + arrayInicial[i]);
        }
        System.out.println();

        // FOR pel procesament
        for (int i = 0; i < arrayInicial.length; i++) {
            if (i + desplassament >= arrayInicial.length) {
                arrayFinal[(i + desplassament) - arrayInicial.length] = arrayInicial[i];
            } else {
                arrayFinal[(i + desplassament)] = arrayInicial[i];
            }
        }

        System.out.println();

        // FOR per mostrar arrayInicial
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(" " + arrayFinal[i]);
        }
        teclat.close();
    }
}