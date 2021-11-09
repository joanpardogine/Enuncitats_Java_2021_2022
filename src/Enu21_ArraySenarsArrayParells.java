public class Enu21_ArraySenarsArrayParells {
    public static void main(String args[]) throws Exception {
        int[] arraySenars = new int[5];
        int[] arrayParells = new int[5];
        int nombreAleatori, poscArraySenars = 0, poscArrayParell = 0;
        do {
            nombreAleatori = (int) (Math.random() * 100);
            if (nombreAleatori % 2 == 0) {
                if (poscArrayParell < 5) {
                    arrayParells[poscArrayParell] = nombreAleatori;
                    poscArrayParell++;
                }
            } else {
                if (poscArraySenars < 5) {
                    arraySenars[poscArraySenars] = nombreAleatori;
                    poscArraySenars++;
                }
            }
        } while ((poscArrayParell + poscArraySenars) < 10);
        System.out.println("par | imp");
        for (int i = 0; i < arraySenars.length; i++) {
            System.out.println(arrayParells[i] + " | " + arraySenars[i]);
        }
    }
}