import java.util.Scanner;

public class Enu23_ArrayParaulesIMidesVersio2 {
    public static void main(String[] args) throws Exception {
        final int MIDA = 5;

        String[] arrCadenes = new String[MIDA];

        // for per introducció de dades
        Scanner teclat = new Scanner(System.in);
        // for (int i = 0; i < arrCadenes.length; i++) {
        // System.out.print("Entra la cadena de la posició " + (i + 1) + " de " +
        // arrCadenes.length + " : ");
        // arrCadenes[i] = teclat.nextLine();
        // }

        arrCadenes[0] = "En un lugar de la Macha";
        arrCadenes[1] = "de cuyo nombre no quiero acordarme";
        arrCadenes[2] = "no ha mucho tiempo que vivía un hidalgo";
        arrCadenes[3] = "de los de lanza en astillero";
        arrCadenes[4] = "adarga antigua, rocín flaco y galgo corredor";

        // for per procesament de dades
        // for(int i = 0; i < ???.length; i++){

        // }

        // la longitud de arrCadenes[0] és arrCadenes[0].length()
        // arrCadenes[0] = "En un lugar de la Macha"
        // arrCadenes[0].length() = 23

        // for per mostrar dades

        teclat.close();
    }
}
