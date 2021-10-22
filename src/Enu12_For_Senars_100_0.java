public class Enu12_For_Senars_100_0 {
    /*
     * Fer un programa en Java que escrigui els nombres senars del 100 al 0. Només
     * es pot fer servir, la sentencia for.
     */
    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) { // i-- => i = i - 1
            if (i % 2 != 0) { // És senar
                System.out.println(i);
            }
        }
    }
}