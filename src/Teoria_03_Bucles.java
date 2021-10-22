public class Teoria_03_Bucles {
    public static void main(String[] args) {
        // 1r Bucle-> Tipus While
        int value = 10;
        while (value > 0) {
            System.out.println("Valor actual" + value);
            value = value - 1; // value--
        }

        // 2n Bucle -> Tipus DoWhile
        value = 10;
        do {
            System.out.println("Valor actual" + value);
            value--;
        } while (value > 0);

        // 3r bucle -> FOR
        for (value = 10; value > 0; value--) {
            System.out.println("Valor actual" + value);
        }
    }
}
