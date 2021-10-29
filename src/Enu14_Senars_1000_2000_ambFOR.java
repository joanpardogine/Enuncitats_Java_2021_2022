public class Enu14_Senars_1000_2000_ambFOR {
    public static void main(String[] args) {
        int petit = 1000;
        int gran = 2000;
        for (int i = petit; i <= gran; i++) { // i-- => i = i - 1
            if (i % 2 != 0) { // És senar
                System.out.println(i);
            }
        }
    }
}
