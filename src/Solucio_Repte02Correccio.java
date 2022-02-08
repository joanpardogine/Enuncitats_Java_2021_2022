import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Solucio_Repte02Correccio {

    static int identificaVerb(String verb) {
        int posverb = 0;
        String[] verbs = { "SALTAR", "MENJAR", "VIURE" };

        for (int j = 0; j < verbs.length; j++) {
            if (verbs[j].equals(verb)) {
                posverb = j;
            }
        }

        return posverb;
    }

    static int identificaConjugacio(String conjuga) {
        int posconjugacions = 0;
        String[] conjugacions = { "A", "P", "F" };

        for (int j = 0; j < conjugacions.length; j++) {
            if (conjugacions[j].equals(conjuga)) {
                posconjugacions = j;
            }
        }

        return posconjugacions;
    }

    public static void main(String[] args) throws Exception {
        String txt;
        int posverb = 0;
        int posconjugacio = 0;
        String[][] conjugacio = {
                { "jo salto#tu saltes#ell salta#nosaltres saltem#vosaltres salteu#ells salten",
                        "jo he saltat#tu has saltat#ell ha saltat#nosaltres hem saltat#vosaltres heu saltat#ells han saltat",
                        "jo saltaré#tu saltaràs#ell saltarà#nosaltres saltarem#vosaltres saltareu#ells saltaran" },
                { "jo menjo#tu menges#ell menja#nosaltres mengem#vosaltres mengeu#ells mengen",
                        "jo he menjat#tu has menjat#ell ha menjat#nosaltres hem menjat#vosaltres heu menjat#ells han menjat",
                        "jo menjaré#tu menjaràs#ell menjarà#nosaltres menjarem#vosaltres menjareu#ells menjaran" },
                { "jo visc#tu vius#ell viu#nosaltres vivim#vosaltres viviu#ells viuen",
                        "jo he viscut#tu has viscut#ell ha viscut#nosaltres hem viscut#vosaltres heu viscut#ells han viscut",
                        "jo viuré#tu viuràs#ell viurà#nosaltres viurem#vosaltres viureu#ells viuran" }
        };
        try {
            File fichero = new File("filein.txt");
            Scanner sc = new Scanner(fichero);
            FileWriter file = new FileWriter("fileout.txt");

            while (sc.hasNextLine()) {
                txt = sc.nextLine();
                String cadena = txt.toUpperCase();
                String[] parts = cadena.split(" ");
                posverb = identificaVerb(parts[0]);
                posconjugacio = identificaConjugacio(parts[1]);
                String[] cal = conjugacio[posverb][posconjugacio].split("#");
                for (int j = 0; j < cal.length; j++) {
                    file.write(cal[j] + "\n");

                }
            }
            file.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
