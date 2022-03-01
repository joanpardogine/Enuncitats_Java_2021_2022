package figuresGeometriques;

import java.util.Arrays;

public class Poligon {

   private Punt punts[];
   
   public Poligon(Punt[] puntsRebuts) {
      for (int i=0; i<puntsRebuts.length;i++) {
         this.punts[i] = puntsRebuts[i];
      }
   }

   public Punt[] getPunts() {
      return punts;
   }

   public void setPunts(Punt[] punts) {
      this.punts = punts;
   }

   @Override
   public String toString() {
      return "Poligon [punts=" + Arrays.toString(punts) + "]";
   }

   // mètodes
   public void traslladar(double trasCoorX, double trasCoorY) {
      for (int i=0; i<this.punts.length;i++) {
         double valorCoorX, valorCoorY;
         valorCoorX = this.punts[i].getCoorX() + trasCoorX;
         valorCoorY = this.punts[i].getCoorY() + trasCoorY;
         this.punts[i].setCoorX(valorCoorX);
         this.punts[i].setCoorY(valorCoorY);
      } 
   }
   
   public void escalar(double escalaCoorX, double escalaCoorY) {
      for (int i=0; i<this.punts.length;i++) {
         double valorCoorX, valorCoorY;
         valorCoorX = this.punts[i].getCoorX() * escalaCoorX;
         valorCoorY = this.punts[i].getCoorY() * escalaCoorY;
         this.punts[i].setCoorX(valorCoorX);
         this.punts[i].setCoorY(valorCoorY);
      } 
   }
   
   public int numeroVertex() {
      return this.punts.length;
   }
   
   // public int perimetre() {
      
   // }
}
