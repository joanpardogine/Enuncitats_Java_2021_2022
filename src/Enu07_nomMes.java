import java.util.Scanner;

public class Enu07_nomMes {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int nombreMes;

        do {
            System.out.print("Introdueix el número del mes: ");
            nombreMes = teclat.nextByte();
            if ((nombreMes <= 0) || (nombreMes >= 12)) {
                System.out.println("ERROR! Torna a intentar-ho!");
            }
        } while ((nombreMes <= 0) || (nombreMes >= 12));

        String[] nomsMesosDeLAny = { "Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Septembre",
                "Octubre", "Novembre", "Desembre" };

        System.out.println("El nom del mes és " + nomsMesosDeLAny[nombreMes - 1]);

        teclat.close();
    }
}