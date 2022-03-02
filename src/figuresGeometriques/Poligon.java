package figuresGeometriques;

public class Poligon {
   // Paràmetres
   private Punt punts[];
   private int qtatVertexs;

   // Constructors que només rep l'array
   public Poligon(Punt[] puntsRebuts) {
      this.punts = puntsRebuts;
      this.qtatVertexs = puntsRebuts.length;
   }

   // Constructors que rep l'array i la qtat de vèrtexs
   public Poligon(Punt[] puntsRebuts, int qtatVertexsRebuts) {
      this.punts = puntsRebuts;
      this.qtatVertexs = qtatVertexsRebuts;
   }

   // Getters i Setters
   // Getters

   public Punt[] getPunts() {
      return punts;
   }

   public int getVertexs() {
      return qtatVertexs;
   }

   // Setters
   public void setPunts(Punt[] punts) {
      this.punts = punts;
   }

   public void setVertexs(int qtatVertexsRebuts) {
      this.qtatVertexs = qtatVertexsRebuts;
   }

   @Override
   public String toString() {
      String cadenaAMostrar;
      cadenaAMostrar = "Poligon\n";

      for (int i = 0; i < this.punts.length; i++) {
         cadenaAMostrar += "Punt " + (i + 1) + "\n";
         cadenaAMostrar += this.punts[i];
         cadenaAMostrar += "\n";
      }
      return cadenaAMostrar;
   }

   // m�todes
   public void elimina(){
      this.punts = null;
      this.qtatVertexs = 0;
   }
   
   
   
   public void traslladar(double trasCoorX, double trasCoorY) {
      double valorCoorX, valorCoorY;
      for (int i = 0; i < this.punts.length; i++) {
         valorCoorX = this.punts[i].getCoorX() + trasCoorX;
         valorCoorY = this.punts[i].getCoorY() + trasCoorY;
         this.punts[i].setCoorX(valorCoorX);
         this.punts[i].setCoorY(valorCoorY);
      }
   }

   public void escalar(double escalaCoorX, double escalaCoorY) {
      for (int i = 0; i < this.punts.length; i++) {
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
