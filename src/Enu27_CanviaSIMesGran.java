import java.util.Scanner;

public class Enu27_CanviaSIMesGran {
    public static void main(String args[]) throws Exception {
        int[] arrayNombres = new int[5];
        int[] arrResultat = new int[5];
        int valorMesGran, valorMesPetit;

        Scanner teclat = new Scanner(System.in);
        // FOR per inicialitzar array
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i] = (int) (Math.random() * 100);
        }
        // Math.random()                        => torna un valor entre 0.0 i 1.0
        // Math.random() * 100                  => torna un valor entre 0.0 i 100.0
        // Math.random() * (max - min) + min;   => torna un valor entre min i max
        System.out.println("ABANS!");
        // FOR per mostrar array abbans de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }
        System.out.print("Entra el valor més gran: ");
        valorMesGran = teclat.nextInt();
        System.out.print("Entra el valor més petit: ");
        valorMesPetit = teclat.nextInt();
        // FOR per processar l'array
        for (int i = 0; i < arrayNombres.length; i++) {
            if (arrayNombres[i] < valorMesPetit) {
                arrResultat[i] = 0;
            } else if (arrayNombres[i] > valorMesGran) {
                arrResultat[i] = 1;
            } else {
                arrResultat[i] = arrayNombres[i];

            }

        }

        System.out.println("DESPRES!");
        // FOR per mostrar array despres de ordenar
        System.out.println("arrayNombres");
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }

        System.out.println("arrResultat");
        for (int i = 0; i < arrResultat.length; i++) {
            System.out.println(arrResultat[i]);
        }
        teclat.close();
    }
}