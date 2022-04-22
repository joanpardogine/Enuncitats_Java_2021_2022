package Objectes;

/**
 * ProgramaCursa: Crei un Array de Cursa de 3 posicions.
 *  Crei 3 objectes curses:
 *   el primer de 200 m
 *   el segon de 400 m
 *   el tercer de 800 m
 *  Posi aleatòriament un nombre de voltes a cada cursa.
 *  Mostri per pantalla el total de la distància recorreguda de cada cursa.
 */

public class ProgramaCursa {

    static int tornaAleatori(int minim, int maxim) {
        return (int) (Math.random() * (maxim - minim) + minim);
    }

    public static void main(String[] args) {
        Ordres.netejaConsola();
        Cursa[] curses = new Cursa[3];

        curses[0] = new Cursa(200);
        curses[1] = new Cursa(400);
        curses[2] = new Cursa();

        curses[2].setMetres(800);

        for (int i = 0; i < curses.length; i++) {
            curses[i].setVoltes(tornaAleatori(1, 50));
        }
        System.out.println("Informació distància recorreguda");
        System.out.println("================================");
        for (int i = 0; i < curses.length; i++) {
        }
        
        System.out.println("\nInformació de les curses");
        System.out.println("========================");
        for (int i = 0; i < curses.length; i++) {
            System.out.println("Cursa " + (i + 1) +
            curses[i].toString());
            System.out.println("  Distancia recorreguda " +
             curses[i].distanciaRecorreguda());
        }
        
    }
    
}