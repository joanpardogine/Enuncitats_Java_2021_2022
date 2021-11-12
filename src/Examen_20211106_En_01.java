import java.util.Scanner;

public class Examen_20211106_En_01 {

    /*
     * Realitza un programa en JAVA que llegeixi i “accepti” únicament aquells que
     * siguin més grans que el primer donat. La introducció de números finalitza amb
     * la introducció d'un 0. Al final es mostrarà. El total de números introduïts,
     * exclòs el 0 i El total de números fallats.
     */
    public static void main(String args[]) throws Exception {
        int nombreLlegit, comptNombres = 0, comptErrors = 0;
        int primerNombre;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el primer nombre: ");
        primerNombre = teclat.nextInt();
        do {
            System.out.print("\nEntra un nombre (0 per acabar): ");
            nombreLlegit = teclat.nextInt();
            if (nombreLlegit <= primerNombre) {
                System.out.println("   ----    Nombre incorrecte!    ------ ");
                comptErrors++;
            } else {
                System.out.println("   ----    Nombre correcte!    ------ ");
            }
            comptNombres++;
        } while (nombreLlegit != 0);
        System.out.println("Total nombres introduïts: " + (comptNombres - 1)); // -1 per no comptar el primer
        System.out.println("Total errors: " + (comptErrors - 1)); // -1 per no comptar el zero
        teclat.close();
    }
}