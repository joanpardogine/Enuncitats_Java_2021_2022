package Objectes.Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        int qtatLlibres = 0;
        int qtatMaxDeLlibres = 5;
        boolean esEnter = false;
        Llibre dqdlm = new Llibre("Don Quijote de la Mancha",
                "Miguel de Cervantes Saavedra", 2, 0);

        System.out.println("Abans de prèstec");
        System.out.println(dqdlm.toString());

        dqdlm.agafarEnPrestec();

        System.out.println("Després de prèstec");
        System.out.println(dqdlm.toString());

        Biblioteca bibloJoan = new Biblioteca("Joan");

        do {
            try {
                System.out.print("Quants llibres donaràs d'alta?: ");
                qtatLlibres = teclat.nextInt();
                esEnter = true;
            } catch (InputMismatchException e) {
                System.out.println("Cal que entris un nombre enter!");
            }
        } while (!esEnter);



    }
}
