package PardoJoanFuncions;

public class Aplicacio {
    public static void main(String[] args) {
        int nombreEnter1, nombreEnter2;


        nombreEnter1 = Jpc.llegirEnterAmbMissatge("Entra un nombre: ");
        System.out.println("El primer nombre entrat és " + nombreEnter1);
        nombreEnter2 = Jpc.llegirEnterAmbMissatge("Entra un nombre: ");
        System.out.println("El segon nombre entrat és " + nombreEnter2);

        System.out.println("Has entrat un "
            + Jpc.tornaMaxim(nombreEnter1,nombreEnter2));
    }

}
