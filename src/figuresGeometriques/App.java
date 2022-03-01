package figuresGeometriques;

import java.util.Scanner;

public class App {

    static Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
        double x,y;

        System.out.println("Entra la posició X :");
        x = teclat.nextInt();
        
        System.out.println("Entra la posició Y :");
        y = teclat.nextInt();

        Punt punt1 = new Punt(x,y);
        Punt puntZero = new Punt();

        System.out.print("Dades punt 1");
        System.out.println(punt1.toString());
        
        System.out.print("Dades punt 0");
        System.out.println(puntZero.toString());


    }
}
