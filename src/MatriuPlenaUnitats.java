public class MatriuPlenaUnitats {

    public static void main(String args[]) throws Exception {

        int[][] matPlenaUnitats = new int[5][5];
        /*
         * Escriu un programa que omplirà una matriu de 5 x 5, que emmagatzemarà un
         * valor que s’anirà incrementant en una unitat per cada fila. Aquest valor ha
         * de començar per 0.- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * 0 0 0 0 0 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * 1 1 1 1 1 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * 2 2 2 2 2 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * 3 3 3 3 3 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * 4 4 4 4 4 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         */

        // // FOR introducció de dades
        for (int i = 0; i < matPlenaUnitats.length; i++) {
            for (int j = 0; j < matPlenaUnitats[i].length; j++) {
                matPlenaUnitats[i][j] = i;
            }
        }

        // FOR per mostrar les dades
        for (int i = 0; i < matPlenaUnitats.length; i++) {
            for (int j = 0; j < matPlenaUnitats[i].length; j++) {
                System.out.print(" " + matPlenaUnitats[i][j] + " ");
            }
            System.out.println();
        }

    }

}
