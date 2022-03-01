package figuresGeometriques;

/** Classe Punt representa un <b>punt</b> en un espai
    * bidimensional
    * @author Joan
    * @version 1
    * */
public class Punt {

      // Atributs
      private double coorX;
      private double coorY;
      
      // Constructors
      // Constructor sense parametres
      // Les dues coordenades seran 0
      public Punt(){
         this.coorX = 0;
         this.coorY = 0;
      }
      
      // Constructor amb un parametre
      // Les dues coordenades seran igual al parametre rebut
      public Punt(double coorRebuda) {
         this.coorX = coorRebuda;
         this.coorY = coorRebuda;
      }
      
      // Constructor amb dos parametres
      // La coordenada X ser� el primer dels  parametres rebuts
      // La coordenada Y ser� el segon dels  parametres rebuts
      public Punt(double coorXRebuda,double coorYRebuda) {
         this.coorX = coorXRebuda;
         this.coorY = coorYRebuda;
      }

      // Getters i Setters
      public double getCoorX() {
         return this.coorX;
      }

      public double getCoorY() {
         return this.coorY;
      }

      public void setCoorX(double coorXRebuda) {
         this.coorX = coorXRebuda;
      }

      public void setCoorY(double coorYRebuda) {
         this.coorY = coorYRebuda;
      }
      
      // M�todes
      public String toString() {
         return ("La coordenada X : " + this.coorX + "\n"
               + "La coordenada Y : " + this.coorY);
      }
      
      public double distancia(Punt puntOrigen) {
         double distanciaACalcular = 0;
         try {
            distanciaACalcular = Math.sqrt (
                  Math.pow(this.coorX - puntOrigen.coorX,2) +
                  Math.pow(this.coorY - puntOrigen.coorY,2)
                  );
         }
         catch (Exception e) {
            System.out.print("El punt est� buit!" 
                  + e.getMessage());
         }
         
         
         return distanciaACalcular;
      }
}
