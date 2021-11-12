public class Enu22_ArrayPotenciesDe2 {
    public static void main(String args[]) throws Exception {
        int[] arrayPotencies = new int[10];
        for (int i = 0; i < arrayPotencies.length; i++) {
            arrayPotencies[i] = (int) Math.pow(2, i + 1);
            System.out.print("2 ^ " + (i + 1) + " = " + arrayPotencies[i]);
            System.out.println("");
        }
    }
}
