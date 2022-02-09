package Fitxers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Agenda {
    // Joan;Pardo;936501441;joan@pardo.cat;Avinguda Diagonal
    // 0    1     2         3              4

    static final int QTAT_CAMPS = 5;
    static final String SEPARADOR = ";";

    static final int NOM = 0;
    static final int COGNOM = 1;
    static final int TELEFON = 2;
    static final int CORREU = 3;
    static final int ADRESA = 4;

    static final int CATALA = 0;
    static final int ESPANYOL = 1;

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
        Ordres.netejaConsola();
        for (int i = 0; i < agenda.length; i++) {
            System.out.println((i + 1) + " " +
                    agenda[i][NOM] + " - " +
                    agenda[i][COGNOM] + " - " +
                    agenda[i][TELEFON] + " - " +
                    agenda[i][CORREU] + " - " +
                    agenda[i][ADRESA]);
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
                array = linia.split(SEPARADOR);
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

    static void mostraMenu(String[] llistaAMostrar) { //, int idioma) {
        String opcions = "";
        for (int i = 0; i < llistaAMostrar.length; i++) {
            System.out.println((i + 1) + " - " + llistaAMostrar[i]);
            // System.out.println((i + 1) + " - " + llistaAMostrar[i][idioma]);
            opcions += (i + 1);
            if (i < llistaAMostrar.length - 1) {
                opcions += ",";
            }
        }
        teclat = new Scanner(System.in);
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
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (esEnter == false);
        return nombreLlegit;
    }

    public static String[][] esborrarContacte(String[][] agenda) {
        String[][] novaAgenda = new String[agenda.length - 1][QTAT_CAMPS];
        int contacteAEliminar;
        int posNovaAgenda = 0;
        mostraAgenda(agenda);
        mostrarMissatge("Quin contacte vols eliminar: ");

        contacteAEliminar = teclat.nextInt();

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                if (i != contacteAEliminar - 1) {
                    novaAgenda[posNovaAgenda][j] = agenda[i][j];
                }
            }
            if (i != contacteAEliminar - 1) {
                posNovaAgenda++;
            }
        }

        return novaAgenda;
    }

    public static String[][] afegirContacte(String[][] agenda) {
        String[][] novaAgenda = new String[agenda.length + 1][QTAT_CAMPS];
        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                novaAgenda[i][j] = agenda[i][j];
            }
        }

        mostrarMissatge("Entra el nom del nou contacte: ");
        novaAgenda[agenda.length][NOM] = teclat.next();
        mostrarMissatge("Entra el cognom del nou contacte: ");
        novaAgenda[agenda.length][COGNOM] = teclat.next();
        mostrarMissatge("Entra el telefon del nou contacte: ");
        novaAgenda[agenda.length][TELEFON] = teclat.next();
        mostrarMissatge("Entra el correu del nou contacte: ");
        novaAgenda[agenda.length][CORREU] = teclat.next();
        mostrarMissatge("Entra l'adreça del nou contacte: ");
        novaAgenda[agenda.length][ADRESA] = teclat.next();

        return novaAgenda;
    }

    public static void guardarAgenda(String[][] agenda) {
        FileWriter fitxer = null;
        String contacteAGuardar = "";
        try {
            fitxer = new FileWriter(nomFitxer);

            // Escrivim línia a línia en el fitxer
            for (int i = 0; i < agenda.length; i++) { // String linia : paraules) {
                contacteAGuardar = "";
                contacteAGuardar += agenda[i][NOM] + SEPARADOR;
                contacteAGuardar += agenda[i][COGNOM] + SEPARADOR;
                contacteAGuardar += agenda[i][TELEFON] + SEPARADOR;
                contacteAGuardar += agenda[i][CORREU] + SEPARADOR;
                contacteAGuardar += agenda[i][ADRESA] + SEPARADOR;

                fitxer.write(contacteAGuardar + "\n");
            }
            fitxer.close();
        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
    }

    public static void main(String[] args) {
        String[][] agenda = new String[contaLinies()][QTAT_CAMPS];

        omplirMatriu(agenda);

        int opcio = 0;
        String[] operacions = {
                "Afegir contacte.",
                "Esborrar contacte.",
                "Modificar contacte.",
                "Mostrar contactes.",
                "Sortir i guardar dades",
                "Sortir sense guardar." };
        // String[][] operacions = {
        //         { "Afegir contacte.", "Añadir contacto." },
        //         { "Esborrar contacte.", "Borrar contacto." },
        //         { "Modificar contacte.", "Modificar contacto." },
        //         { "Mostrar contactes.", "Mostrar contactos." },
        //         { "Sortir i guardar dades", "Salir y guardar datos." },
        //         { "Sortir sense guardar.", "Salir sin guardar." } };

        // int idioma;
        boolean volsSortir = false;
        // mostrarMissatge("\nEn quin idioma vols el menú? (" + CATALA + " - Cat, " + ESPANYOL + " - Esp):");
        System.out.println();

        // do {
        //     idioma = llegirEnterTeclat();
        // } while (idioma != CATALA && idioma != ESPANYOL);

        do {
            Ordres.netejaConsola();
            mostraMenu(operacions); // , idioma);
            // opcio = llegirEnterTeclat();
            opcio = teclat.nextInt();

            switch (opcio) {
                case 1: // Afegir
                    agenda = afegirContacte(agenda);
                    System.out.println(operacions[opcio - 1]);
                    break;
                case 2: // Esborrar
                    agenda = esborrarContacte(agenda);

                    break;
                case 3: // Modificar
                    System.out.println(operacions[opcio - 1]);
                    break;
                case 4: // Mostrar
                    mostraAgenda(agenda);
                    Ordres.pausa("\nPitja un tecla per continuar!");
                    break;
                case 5: // Guardar + sortir
                    guardarAgenda(agenda);
                    volsSortir = true;
                    break;
                case 6: // Sortir sense guardar
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
