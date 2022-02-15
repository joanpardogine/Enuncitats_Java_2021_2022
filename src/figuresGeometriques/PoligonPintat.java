package figuresGeometriques;

public class PoligonPintat extends Poligon {
   private final int RGB = 3;
   
   // Atribut
   private int[] colors = new int[RGB];
   
   // Constructor
   public PoligonPintat(Punt[] puntsRebuts) {
      super(puntsRebuts);
   }

   public int[] getColors() {
      return colors;
   }

   public void setColors(int[] colors) {
      this.colors = colors;
   }
   
   

}
