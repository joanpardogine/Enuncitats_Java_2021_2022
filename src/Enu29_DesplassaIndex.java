public class Enu29_DesplassaIndex {
    public static void main(String args[]) throws Exception {
        int[] arrEnters1 = new int[5];
        int[] arrEnters2 = new int[5];

        // FOR per inicialitzar array
        for (int i = 0; i < arrEnters1.length; i++) {
            arrEnters1[i] = (int) (Math.random() * 100);
        }

        // FOR per mostrar array
        for (int i = 0; i < arrEnters1.length; i++) {
            System.out.print(" " + arrEnters1[i]);
        }
        System.out.println();
        // FOR per processar array
        for (int i = arrEnters1.length - 1; i >= 0; i--) {
            if (i != 0) {
                arrEnters2[i] = arrEnters1[i - 1];
            } else {
                arrEnters2[i] = arrEnters1[arrEnters1.length - 1];
            }
        }
        System.out.println();

        // FOR per mostrar array
        for (int i = 0; i < arrEnters2.length; i++) {
            System.out.print(" " + arrEnters2[i]);
        }

    }
}