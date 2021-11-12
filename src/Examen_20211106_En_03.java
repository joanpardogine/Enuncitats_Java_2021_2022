import java.util.Scanner;

public class Examen_20211106_En_03 {
    /*
     * Realitza un programa que demani un nombre enter N entre 0 i 20 i després
     * mostri per pantalla els números des d’1 fins a N, un a cada línia, repetint
     * cada nombre tantes vegades com el seu valor. Si el valor no es troba en
     * l’interval demanat, es mostrarà per pantalla un error.
     */
    public static void main(String args[]) throws Exception {
        final int NOMBRE_MAXIM = 20;
        final int NOMBRE_MINIM = 0;
        int nombreEntrat;
        boolean esCorrecte = false;

        Scanner teclat = new Scanner(System.in);
        do {
            System.out.print("Entra un nombre entre " + NOMBRE_MINIM + " i " + NOMBRE_MAXIM + ": ");
            nombreEntrat = teclat.nextInt();
            if (nombreEntrat >= NOMBRE_MINIM && nombreEntrat <= NOMBRE_MAXIM) {
                System.out.println("Has entrat el " + nombreEntrat);
                for (int i = 1; i <= nombreEntrat; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                esCorrecte = true;
            } else {
                System.err.println("ERROR!");
            }
        } while (esCorrecte != true); // (condició)
        // } while (esCorrecte == false); // (condició)
        // } while (!(esCorrecte)); // (condició)

        teclat.close();
    }
}