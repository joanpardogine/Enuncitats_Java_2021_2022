public class Enu34_BarrejaArraysOrdenats {

    public static void main(String args[]) throws Exception {
        int[] arrayA = { 3, 7, 13, 19 }; // m = 4 
        int[] arrayB = { 8, 10, 12 }; // n = 3
        // int[] arrayResultat = { 3, 7, 8, 10, 12, 13, 19 }; // m + n = 7
        boolean acabatA = false;
        boolean acabatB = false;
        int midaArrResultat = arrayA.length + arrayB.length;

        int[] arrayResultat = new int[midaArrResultat];

        // FOR pel procesament

        for (int i = 0, j = 0, k = 0; k < arrayResultat.length; k++) {
            if (arrayA[i] < arrayB[j]) {
                arrayResultat[k] = arrayA[i];
                if (i < arrayA.length - 1) {
                    i++;
                } else {
                    acabatA = true;
                }
            } else {
                arrayResultat[k] = arrayB[j];
                if (j < arrayB.length - 1) {
                    j++;
                } else {
                    acabatB = true;
                }
            }
            if (acabatA == true) {
                arrayResultat[k] = arrayB[j];
                j++;
            }
            if (acabatB == true) {
                arrayResultat[k] = arrayA[i];
                i++;
            }
        }
        for (int k = 0; k < arrayResultat.length; k++) {
            System.out.println(arrayResultat[k]);
        }
    }
}