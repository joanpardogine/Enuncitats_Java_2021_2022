import java.util.Scanner;

public class Enu19_AnyDeTraspas {
    public static void main(String args[]) throws Exception {
        boolean esDeTrespas = false;
        Scanner teclat = new Scanner(System.in);
        int dia, mes, any;
        System.out.print("Entra el dia: ");
        dia = teclat.nextInt();
        System.out.print("Entra el mes: ");
        mes = teclat.nextInt();
        System.out.print("Entra l'any: ");
        any = teclat.nextInt();

        if (any == 0) { // L'únic any que no existeix és el 0
            esDeTrespas = false; // System.out.println("Data NO correcta!");
        } else { // L'any no és 0 => CORRECTE!
            if (mes == 2 && (dia >= 1 && dia <= 28)) {
                // L'any no és 0 + mes = 2 I 1 <= dia <= 28 => CORRECTE!
                esDeTrespas = true;
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10
                    || mes == 12 && (dia >= 1 && dia <= 31)) {
                // L'any no és 0 + mes és de 31 dies I 1 <= dia <= 31 => CORRECTE!
                esDeTrespas = true;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia >= 1 && dia <= 30)) {
                // L'any no és 0 + mes és de 30 dies I 1 <= dia <= 30 => CORRECTE!
                esDeTrespas = true;
            } else if (mes == 2 && dia == 29) {
                if (any % 400 == 0) {
                    esDeTrespas = true;
                } else if (any % 100 == 0) {
                    // esDeTrespas = false; System.out.println("Data NO correcta!");
                } else if (any % 4 == 0) {
                    esDeTrespas = true;
                } else {
                    esDeTrespas = false; // System.out.println("Data NO correcta!");
                }
            } else { // NO és CORRECTE!
                esDeTrespas = false; // System.out.println("Data NO correcta!");
            }

            if (esDeTrespas == true) {
                System.out.println("Data correcta!");
            } else {
                System.out.println("Data NO correcta!");
            }
        }
        teclat.close();
    }

}