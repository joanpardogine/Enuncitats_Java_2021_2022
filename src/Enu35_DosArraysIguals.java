public class Enu35_DosArraysIguals {

    public static void main(String args[]) throws Exception {
        int[] arrayA = { 3, 7, 13, 19 }; // m = 4 
        int[] arrayB = { 3, 7, 13 }; // n = 3
        boolean esDiferent = false;
        if (arrayA.length != arrayB.length) { // Arrays NO tenen igual mida
            System.out.println("Els arrays són diferents per què tenen mides diferents.");
        } else { // Arrays tenen igual mida
            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] != arrayB[i]) {
                    esDiferent = true;
                    break;
                }
            }
            if (esDiferent == true) {
                System.out.println("Els arrays tenen elements diferents.");
            } else {
                System.out.println("Els arrays son iguals.");

            }
        }

    }
}