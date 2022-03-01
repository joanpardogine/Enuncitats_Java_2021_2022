import java.io.FileWriter;

public class A_Teoria_07B_FitxersEscriure {

    public static void main(String[] args) {
        String nomFitxer = "fitxer_escriure.txt";
        String[] paraules = { "En un lugar de la Macha",
                "de cuyo nombre no quiero acordarme",
                "no ha mucho tiempo que vivia un hidalgo",
                "de los de lanza en astillero",
                "adarga antigua, rocín flaco y galgo corredor",
                "..." };

        /** 1a FORMA D'ESCRITURE **/
        FileWriter fitxer = null;
        try {

            fitxer = new FileWriter(nomFitxer);

            // Escrivim línia a línia en el fitxer
            for (int i = 0; i < paraules.length; i++) { // String linia : paraules) {
                fitxer.write(paraules[i] + "\n");
            }

            fitxer.close();

        } catch (Exception exepcio) {
            System.out.println("Missatge de l'excepció: " + exepcio.getMessage());
        }
    }
}
