public class FactorialNoRec {
   
   public static void main(String[] args) {
      int nre = 3;
      double resultat = calculFactorial(nre);
      
      System.out.println("Factorial de " + nre
         + ": " + resultat);
   }

   private static double calculFactorial(int nre) {
      int comptador = 1;
      double resultat = 1;
      while (comptador<=nre){
         resultat = resultat * comptador;
         comptador++;
      }
      return resultat;
   }

   
}
