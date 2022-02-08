package Fitxers;

/* // Inicia una nova sessió CMD i (opcionalmen
//  * Sintaxi
//    =======
//       CMD 
//       CMD [charset] [Opcions]
//       CMD [charset] [Opcions] [/K Ordre] 
//  * Opcions
//    =======
//       /C E
//       /K Executa l'ordre i després es queda obert la 
//  * Ordre
//    =====
//      Pro
//      Fins i tot poden ser diverses ordres separades am
//          (tot també hauria d'estar envoltat de "cometes")
// */

public class Ordres {

    public static void pausa(String missatge) {
        Process iniciaProces; // https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html
        ProcessBuilder proces; // https://docs.oracle.com/javase/7/docs/api/java/lang/ProcessBuilder.html
        String sistemaOperatiu;

        System.out.println(missatge);
        try {
            sistemaOperatiu = System.getProperty("os.name");
            //Comprova el sistema operatiu actual
            if (sistemaOperatiu.contains("Windows")) {
                proces = new ProcessBuilder("cmd", "/c", "pause >nul");
                iniciaProces = proces.inheritIO().start();
                iniciaProces.waitFor();
            } else {
                proces = new ProcessBuilder("pause >nul");
                iniciaProces = proces.inheritIO().start();
                iniciaProces.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void netejaConsola() {
        Process iniciaProces;       // https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html
        ProcessBuilder proces;      // https://docs.oracle.com/javase/7/docs/api/java/lang/ProcessBuilder.html
        String sistemaOperatiu;
        try {
            // Comprova el sistema operatiu actual
            sistemaOperatiu = System.getProperty("os.name");

            if (sistemaOperatiu.contains("Windows")) {
                proces = new ProcessBuilder("cmd", "/c", "cls");
                iniciaProces = proces.inheritIO().start();
                iniciaProces.waitFor();
            } else {
                proces = new ProcessBuilder("clear");
                iniciaProces = proces.inheritIO().start();
                iniciaProces.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}