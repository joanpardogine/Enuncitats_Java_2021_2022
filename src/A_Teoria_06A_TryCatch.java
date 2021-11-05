
public class A_Teoria_06A_TryCatch {
    public static void main(String[] args) {
        try {
            int[] nombres = { 1, 2, 3 };
            System.out.println(nombres[10]);
        } catch (Exception errorAGestionar) {
            System.out.println("Alguna cosa ha fallat.");
            System.out.println("L'error ha estat " + errorAGestionar.getMessage());
        }
    }
}
