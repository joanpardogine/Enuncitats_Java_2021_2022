import java.util.Scanner;

public class Enu05_ResultatsDosNombres {
    /*
     * Declara dues variables numèriques (amb el valor que desitgis) i mostra per
     * pantalla el resultat de la seva suma, la seva resta, la seva multiplicació,
     * la seva divisió i el mòdul (residu de la divisió).
     */
    public static void main(String[] args) {
        int nombre1, nombre2;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el primer nombre: ");
        nombre1 = teclat.nextInt();
        System.out.print("Entra el segon nombre: ");
        nombre2 = teclat.nextInt();
        System.out.println("La suma de " + nombre1 + nombre2 + " és " + (nombre1 + nombre2));
        System.out.println("La resta de " + nombre1 + nombre2 + " és " + (nombre1 - nombre2));
        System.out.println("El producte de " + nombre1 + nombre2 + " és " + (nombre1 * nombre2));
        if (nombre2 <= 0) {
            System.out.println("La divisió per 0 no és possible!");
        } else {
            System.out.println("La divisió de " + nombre1 + nombre2 + " és " + (nombre1 / nombre2));
        }
        System.out.println("El mòdul de " + nombre1 + nombre2 + " és " + (nombre1 % nombre2));

        teclat.close();
    }
}