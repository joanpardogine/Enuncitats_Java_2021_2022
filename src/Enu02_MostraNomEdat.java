import java.util.Scanner;

public class Enu02_MostraNomEdat {
    public static void main(String[] args) throws Exception {
        // Fer un programa en java que demani a l’usuari
        // el nom i l'edat i mostri per pantalla el següent missatge:
        // Hola, et dius <nomEntrat> i tens <edatEntrada> anys

        String nomEntrat;
        int edatEntrada;

        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra el teu nom: ");
        nomEntrat = teclat.next();
        System.out.print("Ara " + nomEntrat + " entra la teva edat: ");
        edatEntrada = teclat.nextInt();
        System.out.println("Hola, et dius " + nomEntrat + " i tens " + edatEntrada + " anys");
        teclat.close();
    }
}