import java.util.Scanner;

public class ProgramaCanvi {
    public static void main(String[] args) throws Exception {
        int[] valors = { 500, 200, 100, 50, 20, 10, 5 };
        int[] stock = new int[7];
        int[] client = new int[7];
        int importe;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdueix un import (MULTIPLE DE 5): ");
        importe = teclado.nextInt();

        while (importe % 5 != 0) {
            System.out.println("ERROR. Import invàlid. Torna-ho a intentar.");
            importe = teclado.nextInt();
        }

        for (int i = 0; i < stock.length; i++) {
            System.out.println("Quants bitllets de " + valors[i] + " tens? ");
            stock[i] = teclado.nextInt();
        }

        for (int i = 0; i < valors.length; i++) {
            while (importe >= valors[i] && stock[i] > 0) {
                importe -= valors[i];
                stock[i]--;
                client[i]++;
            }
        }

        System.out.println(importe);
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Queden " + stock[i] + " bitllets de " + valors[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Et donem " + client[i] + " bitllets de " + valors[i]);
        }

        teclado.close();
    }
}