import java.util.Scanner;

public class A_Teoria_05_Funcions {

    // funció  function
    static int quadratEnters(int base) {
        return base * base;
    }

    static float quadratFloat(float base) {
        return base * base;
    }

    // acció     procedure
    static void mostraUnNombre(float valorAMostrar) {
        System.out.print("El valor és " + valorAMostrar);
    }

    static void mostraUnaCadena(String cadenaRebuda) {
        System.out.print("La cadena és " + cadenaRebuda);
    }

    public static void main(String[] args) {
        int nombreEntrat, quadratNombre;
        float nombreFloat, quadratFloat;
        Scanner teclat = new Scanner(System.in);

        System.out.print("Entra el nombre (enter) del que vols el seu quadrat: ");
        nombreEntrat = teclat.nextInt();
        // quadratNombreEntrat = nombreEntrat * nombreEntrat;
        quadratNombre = quadratEnters(nombreEntrat);
        // System.out.print("El valor és " + quadratNombreEntrat);
        mostraUnNombre(quadratNombre);

        System.out.print("Entra el nombre (float) del que vols el seu quadrat: ");
        nombreFloat = teclat.nextFloat();

        // quadratNombreEntrat = nombreEntrat * nombreEntrat;

        quadratFloat = quadratFloat(nombreFloat);

        // System.out.print("El valor és " + quadratNombreEntrat);
        mostraUnNombre(quadratFloat);

        // quadratNombreEntrat = nombreEntrat * nombreEntrat;

        // System.out.print("El valor és " + quadratNombreEntrat);
        mostraUnNombre(quadratNombre);

        // quadratNombreEntrat = nombreEntrat * nombreEntrat;

        quadratNombre = quadratEnters(nombreEntrat);

        // System.out.print("El valor és " + quadratNombreEntrat);
        mostraUnNombre(quadratNombre);

        teclat.close();
    }
}