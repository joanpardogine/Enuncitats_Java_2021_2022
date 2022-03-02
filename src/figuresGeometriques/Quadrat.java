package figuresGeometriques;

public class Quadrat extends Poligon {
   static final int VERTEX = 4;

   public Quadrat(Punt[] puntsRebuts) {
      super(puntsRebuts);      
      if (puntsRebuts.length != VERTEX){
         System.out.println("Error!");
         this.elimina();
      } 
   }
   
   // public Quadrat(Punt[] puntsRebuts, int qtatVertexsRebuts) {
   //    super(puntsRebuts,qtatVertexsRebuts);      
   //    if (puntsRebuts.length != 4){
   //       System.out.println("Error!");
   //       this.elimina();
   //    } 
   // }

}
