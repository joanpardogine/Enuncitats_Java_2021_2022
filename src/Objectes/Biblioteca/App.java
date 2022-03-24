package Objectes.Biblioteca;

import java.util.Scanner;

public class App {
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        int qtatLlibres = 0;
        Llibre dqdlm = new Llibre("Don Quijote de la Mancha",
        "Miguel de Cervantes Saavedra", 2, 0);

        System.out.println("Abans de prèstec");
        System.out.println(dqdlm.toString());
        
        dqdlm.agafarEnPrestec();
        
        System.out.println("Després de prèstec");
        System.out.println(dqdlm.toString());

        Biblioteca bibloJoan = new Biblioteca("Joan", 15);

        System.out.print("Quants llibres donaràs d'alta?: ");
        qtatLlibres = teclat.nextInt();

        

    }
}
