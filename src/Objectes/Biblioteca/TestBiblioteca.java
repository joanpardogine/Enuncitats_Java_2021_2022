package Objectes.Biblioteca;

public class TestBiblioteca {
    
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
       System.out.println( "\n Anem a afegir el primer dels llibre!");
       biblio1.afegirLlibre(dqdlm);
       System.out.println( "\n Anem a afegir el primer dels llibre per 2a vegada!");
       biblio1.afegirLlibre(dqdlm);
       System.out.println( "\n Anem a afegir el segon dels llibre!");
       biblio1.afegirLlibre(dqdlm2);

       System.out.println("Mostra dades 2\n" + biblio1.toString());

       biblio1.llistatDeLlibresPerTitol();
    }

}
