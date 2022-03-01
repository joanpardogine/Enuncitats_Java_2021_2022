package EinesControl;

public class Factorial {
   
   private static int nombre = 3;
   public static double calculFactorial (double n) {
      if (n==0) {
         return 1;
      } else {
         double resultat = n * calculFactorial(n-1);
         return resultat;
      }
   }
   public static void main(String[] args) {
      System.out.println("El factorial de " + nombre
         + " és " + calculFactorial(nombre));
      nombre = 5;
      System.out.println("El factorial de " + nombre
         + " és " + calculFactorial(nombre));
   }
}
