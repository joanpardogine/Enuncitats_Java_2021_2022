import java.util.Scanner;

public class Enu17_FulmigacioVersio3 {
    public static void main(String[] args) throws Exception {
        Scanner teclat = new Scanner(System.in);
        char opcioEscollida;
        boolean opEscollidaEsCorrecte;
        float[] possiblesPreus = { 50f, 70f, 80f, 190f };
        float preuOpcioEscollida = 0;
        float areaAFulmigar;
        float importFulmigacio; // preu x hectàrea;
        float dteMesDe100Hectarees;
        float dteMesDe10000Euros;
        float qtatSobrapassi10000Euros;

        final float DTE_PER_HECTAREA = 0.05f;
        final float DTE_PER_VOLUM = 0.10f;

        final int IMPORT_PER_DECOMPTE = 100;
        final int IMPORT_PER_DECOMPTE_VOLUM = 10000;

        String nomGranger;
        int comptaGrangers = 2;
        int grangerActual = 1;

        do {
            opEscollidaEsCorrecte = false;
            System.out.print("Entra el nom del granger " + grangerActual + " de " + comptaGrangers + " : ");
            nomGranger = teclat.next();
            do {
                System.out.print(
                        "\nTipus 1: fumigació contra males herbes, 50 Euro per hectàrea.              (escull A)\n");
                System.out.println(
                        "Tipus 2: fumigació contra mosques i mosquits, 70 Euro per hectàrea.        (escull B)");
                System.out.println(
                        "Tipus 3: fumigació contra cucs, 80 Euro per hectàrea.                      (escull C)");
                System.out.println(
                        "Tipus 4: fumigació contra tots els tipus anteriors, 190 Euro per hectàrea. (escull D)");
                System.out.print("\n" + nomGranger + ", quin tipus de fumigació desistjes fer (A/B/C/D)?: ");
                opcioEscollida = teclat.next().toUpperCase().charAt(0);
                if (opcioEscollida == 'A' || opcioEscollida == 'B' || opcioEscollida == 'C' || opcioEscollida == 'D') {
                    opEscollidaEsCorrecte = true;
                    System.out.println("\nCorrecte!!! Has escollit l'opció " + opcioEscollida + ".");
                } else {
                    System.out.println("\nERROR!!! Només pots escollir (A/B/C/D), torna a intentar-ho!\n");
                }

            } while (opEscollidaEsCorrecte == false);

            // if(opcioEscollida=='A'){
            // preuOpcioEscollida = possiblesPreus[0];
            // } else if(opcioEscollida=='B'){
            // preuOpcioEscollida = possiblesPreus[1];
            // } else if(opcioEscollida=='C'){
            // preuOpcioEscollida = possiblesPreus[2];
            // } else {
            // preuOpcioEscollida = possiblesPreus[3];
            // }

            switch (opcioEscollida) {
            case 'A':
                preuOpcioEscollida = possiblesPreus[0];
                break;
            case 'B':
                preuOpcioEscollida = possiblesPreus[1];
                break;
            case 'C':
                preuOpcioEscollida = possiblesPreus[2];
                break;
            case 'D':
                preuOpcioEscollida = possiblesPreus[3];
                break;
            }
            /*
             * Si l'àrea a fumigar és més gran de 100 hectàrees, el granger gaudirà d'un 5%
             * de descompte. A més a més, si el compte total és més gran de 10.000 €,
             * gaudirà d'un 10% de descompte sobre la quantitat que sobrepassi als 10.000 €.
             */

            System.out.print("Entra làrea a fumigar (en hectàrees): ");
            areaAFulmigar = teclat.nextFloat();

            importFulmigacio = preuOpcioEscollida * areaAFulmigar;

            if (areaAFulmigar > IMPORT_PER_DECOMPTE) {
                dteMesDe100Hectarees = importFulmigacio * DTE_PER_HECTAREA;
                importFulmigacio = importFulmigacio - dteMesDe100Hectarees;
            }

            if (importFulmigacio > IMPORT_PER_DECOMPTE_VOLUM) {
                qtatSobrapassi10000Euros = importFulmigacio - IMPORT_PER_DECOMPTE_VOLUM;
                dteMesDe10000Euros = qtatSobrapassi10000Euros * DTE_PER_VOLUM;
                importFulmigacio = importFulmigacio - dteMesDe10000Euros;
                // importFulmigacio = importFulmigacio - ((importFulmigacio -
                // IMPORT_PER_DECOMPTE_VOLUM) * DTE_PER_VOLUM)
            }
            grangerActual++;

            System.out.println("El granger " + nomGranger + " té un import de " + importFulmigacio);
        } while (grangerActual <= comptaGrangers);

        teclat.close();
    }
}