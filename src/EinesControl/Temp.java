package EinesControl;

public class Temp {

    /**
     *
     */
    private static final String TEXT = "El factorial de ";

    public static void main(String[] args) {
        int nre = 3;
        System.out.println(TEXT + nre
                + " és " + Factorial.calculFactorial(nre));
        nre = 5;
        System.out.println(TEXT + nre
                + " és " + Factorial.calculFactorial(nre));
    }

}
