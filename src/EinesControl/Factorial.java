package EinesControl;

public class Factorial {
   public static double calculFactorial(double n) {
      if (n == 0) {
         return 1;
      } else {
         double resultat = n * calculFactorial(n - 1);
         return resultat;
      }
   }

   public static void main(String[] args) {
      int nre = 3;
      System.out.println("El factorial de " + nre
            + " és " + calculFactorial(nre));
      nre = 5;
      System.out.println("El factorial de " + nre
            + " és " + calculFactorial(nre));
   }
}
