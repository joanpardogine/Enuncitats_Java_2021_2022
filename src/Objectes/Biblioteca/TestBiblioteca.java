package Objectes.Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBiblioteca {
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        boolean esEnter = false;
        Biblioteca biblio1 = new Biblioteca("Biblioteca de prova");

        System.out.print("Mostra dades 1\n" + biblio1.toString());

        Llibre dqdlm = new Llibre("Don Quijote de la Mancha",
                "Miguel de Cervantes Saavedra", 2, 0);

        Llibre dqdlm2 = new Llibre("La isla del tesoro",
                "Robert Louis Stevenson", 4, 0);

        //    biblio1.setPrestatge(biblio1.afegeixLlibreImanol(dqdlm));
        //    biblio1.afegirLlibre(dqdlm2);
        System.out.println("\n Anem a afegir el primer dels llibre!");
        biblio1.afegirLlibre(dqdlm);
        System.out.println("\n Anem a afegir el primer dels llibre per 2a vegada!");
        biblio1.afegirLlibre(dqdlm);
        System.out.println("\n Anem a afegir el segon dels llibre!");
        biblio1.afegirLlibre(dqdlm2);

        System.out.println("Mostra dades 2\n" + biblio1.toString());

        int posicioLlibreAEsborrar = 0;
        boolean nombreCorrecte = false;
        int qtatLlibres;
        do {
            biblio1.llistatDeLlibresPerTitol();
            nombreCorrecte = false;
            qtatLlibres = biblio1.getPrestatge().length;
            System.out.print("Entra el número de llibre a esborrar: ");
            try {
                posicioLlibreAEsborrar = teclat.nextInt();
                nombreCorrecte = true;
                if (!(posicioLlibreAEsborrar > 0 &&
                        posicioLlibreAEsborrar < qtatLlibres + 1)) {
                    System.out.println("Error no és un nombre correcte!\nTorna a intentar-ho!");
                    nombreCorrecte = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error no és un nombre!\nTorna a intentar-ho!");
            } finally {
                teclat.nextLine();
            }
        } while (nombreCorrecte == false);
        Llibre llibreAEsborrar = biblio1.tornaLlibre(posicioLlibreAEsborrar-1);
        biblio1.esborrarLlibre(llibreAEsborrar);
        System.out.println("Mostra dades 3\n" + biblio1.toString());
    }

}
