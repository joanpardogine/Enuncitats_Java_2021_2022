
// import java.util.Scanner;

/*
Crea una calculadora, demana a l'usuari dos nombres i crea les funcions
necessaries per resoldre les següents operacions:

Entra el primer nombre:
Entra el segon nombre:
1. Suma
2. Resta
3. Multiplicació
4. Divisió (recorda que no es pot dividir per zero)
5. Potencia
6. Per acabar.
Entra l'operació que vols fer: 

*/

public class Enu45_Calculadora {

    final static int QTAT_OPERACIONS = 6; // CONSTANT
    static String[] operacions = new String[QTAT_OPERACIONS];

    static char tornaLaMajusculaDeLaPosicio(String cadenaEntera, int posicio) {
        char lletraMajuscula = cadenaEntera.toUpperCase().charAt(posicio);
        return lletraMajuscula;
    }

    static char tornaPrimeraMajuscula(String cadenaEntera) {
        char lletraMajuscula = cadenaEntera.toUpperCase().charAt(0);
        return lletraMajuscula;
    }

    static void mostraMenu(String[] llistaAMostrar) {
        String opcions = "";
        for (int i = 0; i < llistaAMostrar.length; i++) {
            System.out.println(tornaPrimeraMajuscula(llistaAMostrar[i]) + " - " + llistaAMostrar[i]);
            opcions += tornaPrimeraMajuscula(llistaAMostrar[i]);
            if (i < llistaAMostrar.length - 1) {
                opcions += ",";
            }
        }
        System.out.print("Entra una de les opcions (" + opcions + "): ");

        // S - Suma
        // R - Resta
        // P - Producte
        // D - Divisió
        // O - pOtencia
        // R - soRtir
        // Entra una de les opcions (S,R,P,D,O,R): 
    }

    static int tornaOpcio(String[] llistaAMostrar) {
        return 1;
    }

    public static void main(String args[]) throws Exception {
        int operacio = 0;
        operacions[0] = "suma";
        operacions[1] = "resta";
        operacions[2] = "producte";
        operacions[3] = "divisió";
        operacions[4] = "potencia";
        operacions[5] = "sortir";
        mostraMenu(operacions);

        switch (operacio) {
            case 1:
                System.out.println("hola");
                break;
            case 2:
                System.out.println("adeu");
                break;
            default:
                System.out.println("cap");
                break;
        }
    }
}
