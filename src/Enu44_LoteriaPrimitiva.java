import java.util.Scanner;

public class Enu44_LoteriaPrimitiva {
    // Variables GLOBALS
    static Scanner teclat = new Scanner(System.in);
    static final int MIDA = 6; // constant
    static final int MINIM = 1; // constant
    static final int MAXIM = 49; // constant

    static int demanaQtatApostes() {
        int numeroLlegit = 0;
        boolean nombreIncorrecte = false;
        do {
            try {
                nombreIncorrecte = false;
                System.out.print("Entra la quantitat de apostes: ");
                numeroLlegit = teclat.nextInt();
            } catch (Exception e) {
                System.out.println("Només pots entrar nombres,"
                        + " torna a intentar-ho!");
                nombreIncorrecte = true;
                teclat.nextLine(); // Netejem el buffer d'entrada
            }
        } while (nombreIncorrecte != false);
        return numeroLlegit;
    }

    static boolean existeixArray(int[] array, int num) {
        boolean existeix = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                existeix = true;// Si ta :v
                break;
            }
        }
        return existeix;
    }

    static int tornaAleatori(int maxim, int minim) {
        return (int) (Math.random() * (maxim - minim) + minim);
    }

    static void mostraArray(int[] arrayAMostrar) {
        for (int i = 0; i < arrayAMostrar.length; i++) {
            System.out.print(arrayAMostrar[i] + " ");
        }
        System.out.println("");
    }

    static int[] ordenaArray(int[] arrayRebut) {
        int temp;
        for (int i = 1; i < arrayRebut.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayRebut[j] < arrayRebut[j - 1]) {
                    temp = arrayRebut[j];
                    arrayRebut[j] = arrayRebut[j - 1];
                    arrayRebut[j - 1] = temp;
                }
            }
        }
        return arrayRebut;
    }

    static boolean sonIguals(int[] array1, int[] array2) {
        boolean sonIguals = true;
        array1 = ordenaArray(array1);
        array2 = ordenaArray(array2);

        if (array1.length != array2.length) {
            sonIguals = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    sonIguals = false;
                    break;
                }
            }
        }
        return sonIguals;
    }

    static int coincidencies(int[] array1, int[] array2) {
        int numeroCoincidencies = 0;
        array1 = ordenaArray(array1);
        array2 = ordenaArray(array2);

        for (int i = 0; i < array1.length; i++) {
            if (existeixArray(array1, array2[i])) {
                numeroCoincidencies++;

            }
        }

        return numeroCoincidencies;
    }

    static int[] creaApostaGuanyadora(int mida) {
        int[] apostaGuanyadora = new int[mida];
        int num;
        for (int i = 0; i < mida; i++) {
            num = tornaAleatori(MAXIM, MINIM);
            if (existeixArray(apostaGuanyadora, num)) {
                i--;
            } else {
                apostaGuanyadora[i] = num; //:v
            }
        }
        return apostaGuanyadora;
    }

    public static void main(String args[]) throws Exception {

        int apostes;
        int numeroAposta;
        int numeroCoincidencies;

        apostes = demanaQtatApostes();

        // System.out.println("Qtat apostes = " + apostes);

        int[] apostaGuanyadora = new int[MIDA];
        int[][] apostesDelJugador = new int[apostes][MIDA];

        apostaGuanyadora = creaApostaGuanyadora(MIDA);
        System.out.print("La aposta guanyadora és: ");
        mostraArray(apostaGuanyadora);

        for (int i = 0; i < apostes; i++) {
            for (int j = 0; j < MIDA; j++) {
                System.out.print("Entra el numero " + (j + 1)
                        + " de l'aposta " + (i + 1)
                        + " de les " + apostes + " apostes: ");
                numeroAposta = teclat.nextInt();
                if (existeixArray(apostesDelJugador[i], numeroAposta)) {
                    System.out.println("Es numero ya existe");
                    j--;
                } else {
                    apostesDelJugador[i][j] = numeroAposta;
                }
            }
            System.out.println();
        }

        // int[] apostaProva = { 1, 2, 3, 4, 5 };

        // boolean arraysIguals;
        // arraysIguals=sonIguals(apostaGuanyadora, apostaProva);
        // if (arraysIguals == true) {        

        // if (sonIguals(apostaGuanyadora, apostaProva) == true) {

        // if (!(sonIguals(apostaGuanyadora, apostaProva))) {
        // if (sonIguals(apostaGuanyadora, apostesDelJugador[i])) {
        //     System.out.println("les apostes son iguals");
        // } else {
        //     System.out.println("les apostes son diferents");

        // }
        for (int i = 0; i < apostesDelJugador.length; i++) {
            numeroCoincidencies = coincidencies(apostaGuanyadora, apostesDelJugador[i]);
            if (numeroCoincidencies == MIDA) {
                System.out.println("La aposta numero " + (i + 1) + " es guanyadora");
            } else {
                System.out.println("La aposta numero " + (i + 1) + " ha acertat " + numeroCoincidencies + " numeros");
            }
        }

        // Falta que a cap aposta no hi hagi nombres repetits.
        // Comparar si les apostes de l'usuari son guanyadores o no.

    }
}
