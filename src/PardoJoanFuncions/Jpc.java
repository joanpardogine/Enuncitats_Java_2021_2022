package PardoJoanFuncions;

import java.util.Scanner;

public class Jpc {
    // Fer una funció per llegir un nombre per teclat.
    // Aquesta funció haurà de tenir un paràmetre que sigui
    // el missatge a mostrar a l'usuari. Que retorni un int.
    public static int llegirEnterAmbMissatge(String missatge) {
        int nombreLlegit = 0;
        boolean llegitNombre = false;

        Scanner teclat = new Scanner(System.in);
        do {
            try {
                llegitNombre = true;
                System.out.print(missatge);
                nombreLlegit = teclat.nextInt();
            } catch (Exception errorAGestionar) {
                System.out.println("ERROR! només pots entrar nombres!");
                llegitNombre = false;
            } finally {
                teclat.nextLine();
            }
        } while (llegitNombre == false);
        teclat.close();
        return nombreLlegit;
    }

    public static String tornaMaxim(int nombreEnter1, int nombreEnter2) {
        return null;
    }

}
