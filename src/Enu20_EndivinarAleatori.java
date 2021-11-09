import java.util.InputMismatchException;
import java.util.Scanner;

public class Enu20_EndivinarAleatori {
    public static void main(String[] args) {
        int nombreAleatori, nombreMax = 1, nombreMin = 100;
        int nombreLlegit = 0;
        int intents = 0;
        boolean lecturaCorrecta = false;
        boolean nombreEncertat = false;

        Scanner teclat = new Scanner(System.in);

        nombreAleatori = (int) (Math.random() * 100);

        if (nombreAleatori == 0) {
            nombreAleatori++;
        }
        System.out.println("Nombre aleatori: " + nombreAleatori);
        do { // REPETIR
            do { // REPETIR
                System.out.print("Introdueix número entre " + nombreMin + " i " + nombreMax + ": ");
                try { // TRY
                    nombreLlegit = teclat.nextInt();
                    System.out.println("El número llegit és " + nombreLlegit);
                    lecturaCorrecta = true;
                } catch (InputMismatchException excepcioObtinguda) { // CATCH
                    System.out.println("Error no és un nombreLlegit!");
                }
            } while (lecturaCorrecta == false); // MENTRES lecturaCorrecta sigui false
            // El nombre llegit és correcte, és a dir no és una lletra!
            if (nombreLlegit > nombreAleatori) { // (nombreLlegit <= nombreAleatori)
                System.out.print("El nombre és més petit.\nTorna a intentar-ho!\n");
            } else if (nombreLlegit < nombreAleatori) { // (nombreLlegit < nombreAleatori)
                System.out.print("El nombre és més gran.\nTorna a intentar-ho!\n");
            } else { // (nombreLlegit = nombreAleatori)
                nombreEncertat = true;
                System.out.print("Felicitats!! El número encertat és " + nombreLlegit + "\n");
            }
            intents++;
        } while (nombreEncertat == false); // MENTRES ???
        System.out.print("Ho has aconseguit en " + intents + " intents!");
        teclat.close();
    }
}