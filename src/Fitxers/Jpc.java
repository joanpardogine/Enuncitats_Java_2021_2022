package Fitxers;

import java.util.Scanner;

public class Jpc {
    static Scanner teclat = new Scanner(System.in);

    // Fer una funció per llegir un nombre per teclat.
    // Aquesta funció haurà de tenir un paràmetre que sigui
    // el missatge a mostrar a l'usuari. Que retorni un int.
    public static int llegirEnterAmbMissatge(String missatge) {
        int nombreLlegit = 0;
        boolean llegitNombre = false;

        do {
            try {
                llegitNombre = false;
                System.out.print(missatge);
                nombreLlegit = teclat.nextInt();
            } catch (Exception errorAGestionar) {
                System.out.println("ERROR! només pots entrar nombres!");
                llegitNombre = true;
                teclat.nextLine();
            }
        } while (llegitNombre != false);
        return nombreLlegit;
    }

}
