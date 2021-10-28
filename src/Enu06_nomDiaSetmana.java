import java.util.Scanner;

public class Enu06_nomDiaSetmana {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int diaSetmana;
        // String nomDiaSetmana;

        do {
            System.out.print("Introdueix el número de dia de la setmana: ");
            diaSetmana = teclat.nextByte();
            if ((diaSetmana <= 0) || (diaSetmana >= 8)) {
                System.out.println("ERROR! Torna a intentar-ho!");
            }
        } while ((diaSetmana <= 0) || (diaSetmana >= 8));

        /*
         * dilluns = 1 dimarts = 2 dimecres = 3 dijous = 4 divendres = 5 dissabte = 6
         * diumenge = 7
         */
        // OPCIÓ A Amb if's
        // if (diaSetmana == 1) {
        // nomDiaSetmana = "dilluns";
        // } else {
        // if (diaSetmana == 2) {
        // nomDiaSetmana = "dimarts";
        // } else if (diaSetmana == 3) {
        // nomDiaSetmana = "dimecres";
        // } else if (diaSetmana == 4) {
        // nomDiaSetmana = "dijous";
        // } else if (diaSetmana == 5) {
        // nomDiaSetmana = "divendres";
        // } else if (diaSetmana == 6) {
        // nomDiaSetmana = "dissabte";
        // } else {
        // nomDiaSetmana = "diumenge";
        // }
        // }

        // OPCIÓ B Amb switch
        // switch (diaSetmana){
        // case 1:
        // nomDiaSetmana = "dilluns";
        // break;
        // case 2:
        // nomDiaSetmana = "dimarts";
        // break;
        // case 3:
        // nomDiaSetmana = "dimecres";
        // break;
        // case 4:
        // nomDiaSetmana = "dijous";
        // break;
        // case 5:
        // nomDiaSetmana = "divendres";
        // break;
        // case 6:
        // nomDiaSetmana = "dissabte";
        // break;
        // case 7:
        // nomDiaSetmana = "diumenge";
        // break;
        // // default: break;
        // }

        // OPCIÓ C Amb ARRAY

        String[] nomDiesDeLaSetmana = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte",
                "Diumenge" };

        System.out.println("El dia de la setmana és " + nomDiesDeLaSetmana[diaSetmana - 1]);

        teclat.close();
    }
}