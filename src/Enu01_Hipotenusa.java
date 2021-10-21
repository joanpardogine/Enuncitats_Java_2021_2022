import java.util.Scanner;

public class Enu01_Hipotenusa {
    public static void main(String[] args) throws Exception {
        double base, alssada;
        float hipotenusa;

        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra la base del triangle: ");
        base = teclat.nextInt();

        System.out.print("Entra l'alçada del triangle: ");
        alssada = teclat.nextInt();

        hipotenusa = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(alssada, 2));
        // hipotenusa = (float) Math.sqrt(base * base + alssada * alssada);
        // hipotenusa = sqrt ( base^2 + alssada^2)
        System.out.println("La hipotenusa és " + hipotenusa);

        teclat.close();
    }
}
