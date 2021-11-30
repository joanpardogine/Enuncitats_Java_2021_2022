import java.io.FileWriter;

public class A_Teoria_07B_FitxersEscriure {

    public static void main(String[] args) {

        String[] paraules = { "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "..." };

        /** 1a FORMA D'ESCRITURE **/
        FileWriter fitxer = null;
        try {

            fitxer = new FileWriter("fitxer_escriure.txt");

            // Escrivim línia a línia en el fitxer
            for (String linia : paraules) {
                fitxer.write(linia + "\n");
            }

            fitxer.close();

        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
    }
}
