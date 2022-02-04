package Fitxers;

import java.io.File;
import java.util.Scanner;

public class Agenda {

    static final int NOM = 0;
    static final int COGNOM = 1;
    static final int TELEFON = 2;
    static final int CORREU = 3;
    static final int ADRESA = 4;

    static final int CATALA = 0;
    static final int ESPANYOL = 1;

    static final int QTAT_CAMPS = 5;

    static String nomFitxer = "src\\Fitxers\\agenda.csv";
    static Scanner teclat = new Scanner(System.in);

    static int contaLinies() {
        File fitxer = new File(nomFitxer);
        Scanner punter = null;
        int contador = 0;
        try {
            // Llegim el contingut del fitxer
            punter = new Scanner(fitxer);

            while (punter.hasNextLine()) {
                contador++;
                punter.nextLine();
            }

        } catch (Exception exepcio1) {
            System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
        return contador;
    }

    public static void mostrarMissatge(String cadena) {
        System.out.print(cadena);
    }

    public static void mostraAgenda(String[][] agenda) {
        for (int i = 0; i < agenda.length; i++) {
            System.out.println((i + 1) + agenda[i][0] + " -" + agenda[i][1] + " - " + agenda[i][2]);
        }
    }

    public static void omplirMatriu(String[][] agenda) {
        File fitxer = new File(nomFitxer);
        Scanner punter = null;
        String linia = "";

        try {
            // Llegim el contingut del fitxer
            punter = new Scanner(fitxer);
            String array[];
            for (int i = 0; i < contaLinies(); i++) {
                linia = punter.nextLine(); // Salvem la linia dins d'un String
                array = linia.split(",");
                agenda[i][NOM] = array[NOM];
                agenda[i][COGNOM] = array[COGNOM];
                agenda[i][TELEFON] = array[TELEFON];
                agenda[i][CORREU] = array[CORREU];
                agenda[i][ADRESA] = array[ADRESA];
            }
            System.out.println();
        } catch (Exception exepcio1) {
            System.out.println("Missatge: " + exepcio1.getMessage());
        } finally {
            // Tanquem el fitxer tant si la lectura ha estat correcta o no
            try {
                if (punter != null)
                    punter.close();
            } catch (Exception exepcio2) {
                System.out.println("Missatge 2: " + exepcio2.getMessage());
            }
        }
    }

    static void mostraMenu(String[][] llistaAMostrar, int idioma) {
        String opcions = "";
        for (int i = 0; i < llistaAMostrar.length; i++) {
            System.out.println((i + 1) + " - " + llistaAMostrar[i][idioma]);
            opcions += (i + 1);
            if (i < llistaAMostrar.length - 1) {
                opcions += ",";
            }
        }
        System.out.print("Entra una de les opcions (" + opcions + "): ");
    }

    public static int llegirEnterTeclat() {
        int nombreLlegit = 0;
        boolean esEnter = false;
        do {
            try {
                nombreLlegit = teclat.nextInt();
                esEnter = true;
            } catch (Exception e) {
                mostrarMissatge("\n        ---  ERROR!  ---"
                        + "\n        Només pots entrar nombres!"
                        + "\n        Torna a intentar-ho: ");
                esEnter = false;
                teclat.nextLine();
            }
        } while (esEnter == false);
        return nombreLlegit;
    }

    public static void main(String[] args) {
        String[][] agenda = new String[contaLinies()][QTAT_CAMPS];

        omplirMatriu(agenda);

        int opcio = 0;
        String[][] operacions = {
                { "Afegir contacte.", "Añadir contacto." },
                { "Esborrar contacte.", "Borrar contacto." },
                { "Modificar contacte.", "Modificar contacto." },
                { "Mostrar String[]s.", "Mostrar contactos." },
                { "Sortir i guardar dades", "Salir y guardar datos." },
                { "Sortir sense guardar.", "Salir sin guardar." } };

        int idioma;
        boolean volsSortir = false;
        mostrarMissatge("\nEn quin idioma vols el menú? (" + CATALA + " - Cat, " + ESPANYOL + " - Esp):");
        System.out.println();

        do {
            idioma = llegirEnterTeclat();
        } while (idioma != CATALA && idioma != ESPANYOL);

        do {

            mostraMenu(operacions, idioma);
            opcio = llegirEnterTeclat();

            switch (opcio) {
                case 1: // Afegir
                    System.out.println(operacions[opcio - 1]);
                    break;
                case 2: // Esborrar
                    System.out.println(operacions[opcio - 1]);
                    break;
                case 3: // Modificar
                    System.out.println(operacions[opcio - 1]);
                    break;
                case 4: // Mostrar
                    mostraAgenda(agenda);
                    break;
                case 5: // Guardar + sortir
                    System.out.println(operacions[opcio - 1]);
                    volsSortir = true;
                    break;
                case 6: // ortir sense guardar
                    System.out.println(operacions[opcio - 1]);
                    volsSortir = true;
                    break;
                default:
                    System.out.println("cap");
                    break;
            }
        } while (volsSortir == false);
    }

}
