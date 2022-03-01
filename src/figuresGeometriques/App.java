package figuresGeometriques;

import java.util.Scanner;

public class App {

    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        int qtatCostats;
        double coorX, coorY;

        System.out.print("Entra la qtat de vertex que té el poligon: ");
        qtatCostats = teclat.nextInt();

        Punt[] llistaDePunts = new Punt[qtatCostats];
        
        // Creació dun poligon
        for (int i = 0; i < qtatCostats; i++) {
            System.out.print("Entra la posició X del " + (i + 1) + " dels punts:");
            coorX = teclat.nextDouble();
            System.out.print("Entra la posició Y del " + (i + 1) + " dels punts:");
            coorY = teclat.nextDouble();
            llistaDePunts[i] = new Punt (coorX,coorY);
        }

        Poligon figuraQuadrada = new Poligon(llistaDePunts, qtatCostats);

        // Mostro figura per pantalla
        System.out.println("Abans trasllat");
        System.out.println( figuraQuadrada.toString());
        
        
        figuraQuadrada.traslladar(2,1);
        // Mostro figura per pantalla
        System.out.println("Després trasllat 2,1");
        System.out.println( figuraQuadrada.toString());

        figuraQuadrada.escalar(-1,-1);
        // Mostro figura per pantalla
        System.out.println("Després d'escalar -1, -1");
        System.out.println( figuraQuadrada.toString());


        // // Instancia creada amb el Constructor sense parametres
        // Punt puntZero = new Punt();

        // double x,y, iguals;

        // System.out.print("Entra la posició X:");
        // x = teclat.nextInt();

        // System.out.print("Entra la posició Y:");
        // y = teclat.nextInt();

        // // Instancia creada amb el Constructor amb dos parametres
        // Punt punt1 = new Punt(x,y);

        // System.out.print("Entra la posició X i Y:");
        // iguals = teclat.nextInt();

        // // Instancia creada amb el Constructor amb un parametre.
        // Punt punt2 = new Punt(iguals);

        // System.out.println("Dades punt 0");
        // System.out.println(puntZero.toString());

        // System.out.println("Dades punt 1");
        // System.out.println(punt1.toString());

        // System.out.println("Dades punt 2");
        // System.out.println(punt2.toString());

    }
}
