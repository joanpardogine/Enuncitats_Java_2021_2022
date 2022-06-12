public class A_Teoria_08_Aleatori {

    public static void main(String[] args) {
        System.out.println("10 nombres aleatoris!");
        int min = 0;
        int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.println((Math.random() * max - min) + min);
        }

    }
}

