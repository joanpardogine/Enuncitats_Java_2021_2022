package EinesControl;

public class Prova {
    public static void main(String[] args) {
        int nre = 3;
        double resultat = factorial(nre);
        System.out.println("Factorial de " + nre
           + ": " + resultat);
     }

    private static double factorial(int nre) {
        int comptador = 1;
        double resultat = 1;
        while (comptador<=nre){
           resultat = resultat * comptador;
           comptador++;
        }
        return resultat;
    }
}
