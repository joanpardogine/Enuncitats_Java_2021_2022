package Objectes;

import java.util.Scanner;

/** Crea un array de Contrasenya's amb la mida indicada per teclat.
 * Indica també per teclat la longitud de la Contrasenya.
 * Crea un bucle que creï un objecte per a cada posició de l'array amb les dades introduïdes anteriorment.
 * Mostrar per a cada objecte de l'Array de Contrasenya si aquest és fort o no. */

public class ProgramaContrasenya {

    private static Scanner teclat = new Scanner(System.in);

    public static void introduirDadesObjecte(Contrasenya[] arrayContrasenya, int quantitatContrasenya) {
        for (int i = 0; i < quantitatContrasenya; i++) {
            System.out.print("Introdueix la longitud del Contrasenya: ");
            int longitudContrasenya = teclat.nextInt();
            arrayContrasenya[i] = new Contrasenya(longitudContrasenya);
        }
    }

    public static void main(String[] args) {
        System.out.print("Introdueix la quantitat de Contrasenyas: ");
        int quantitatContrasenya = teclat.nextInt();
        Contrasenya[] arrayContrasenya = new Contrasenya[quantitatContrasenya];

        System.out.print("Introdueix la longitud del Contrasenya: ");
        int longitudContrasenya = teclat.nextInt();

        for (int i = 0; i < quantitatContrasenya; i++) {
            arrayContrasenya[i] = new Contrasenya(longitudContrasenya);
            if (arrayContrasenya[i].esForta()) {
                System.out.print("La contrasenya " + arrayContrasenya[i].getContrasenya() + " és FORTA!\n");
            } else {
                System.out.print("La contrasenya " + arrayContrasenya[i].generarContrasenya() + " és feble!\n");
            }
            
        }
    }
}