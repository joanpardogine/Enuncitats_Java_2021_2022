package EinesControl.Classes;

import java.util.Scanner;

public class App {
    static Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {

        String nomMetge, espMetge, nomPacient, nomPersona;
        Metge metge1 = new Metge();
        Pacient pacient1 = new Pacient();
        Persona persona1 = new Persona();

        System.out.print("Entra el nom del metge: ");
        nomMetge = teclat.next();
        metge1.setNom(nomMetge);

        System.out.print("Entra l'especialitat del metge: ");
        espMetge = teclat.next();
        metge1.setEspecialitat(espMetge);

        System.out.println("Dades de metge1");
        System.out.println(metge1.toString());

        System.out.print("Entra el nom del pacient: ");
        nomPacient = teclat.next();
        pacient1.setNom(nomPacient);

        System.out.print("Entra el nom de la persona: ");
        nomPersona = teclat.next();
        persona1.setNom(nomPersona);

    }

}
