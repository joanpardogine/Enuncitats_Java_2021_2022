public class activitat4 {
    public static void main(String[] args) throws Exception {
        int[] a1 = { 1, 2, 3, 4 };
        int[] a2 = { 5, 6, 7, 8 };
        int[] a3 = { 9, 10, 11, 12 };
        
        int log = a1.length;
        int col;
        int[][] matriu = new int[log][3];
        
        //No cal fer un bucle anidat per omplir la matriu. 
        for (int i = 0; i < matriu.length; i++) {
            col=0;    
            matriu[i][col] = a1[i];
            matriu[i][++col] = a2[i];
            matriu[i][++col] = a3[i];
        }

        //Mostrem la matriu.
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
