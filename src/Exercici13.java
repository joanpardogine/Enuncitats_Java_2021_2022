import java.util.Scanner;

public class Exercici13 {
    public static void main(String[] args) {
        Scanner teclatNum = new Scanner(System.in);

        int numero = 50;
        int limitInferior = 1;
        int limitSuperior = 100;
        char resposta = ' ';
        int intents = 0;

        System.out.print("\nPensat un número entre " + limitInferior + " i " + limitSuperior + "\nEl tens (S/N)? ");
        resposta = teclatNum.next().toUpperCase().charAt(0);
        System.out.println(resposta);

        if (resposta == 'S') {
            resposta = ' ';
            while (resposta != 'S') {
                numero = (limitSuperior - limitInferior) / 2;
                numero = limitInferior + numero;
                System.out.print("El número que t'has pensat és el:\n " + numero + "?\n");
                System.out.print("Digues si el número és:\n  més gran (1),\n  més petit (2) o\n  igual (3): ");
                resposta = teclatNum.next().charAt(0);
                if (resposta == '1') {
                    limitInferior = numero;
                } else if (resposta == '2') {
                    limitSuperior = numero;
                } else if (resposta == '3') {
                    resposta = 'S';
                } else {
                    System.out.println("Opció incorrecta!!!!!!!");
                    resposta = ' ';
                }
                intents++;
            }

            System.out.print("Ja el tinc!!!!\nEl número que t'havies pensat és el " + numero + "!!!!"
                    + "\n i han calgut " + intents + " intents per esbrina-lo!\n");
            // System.out.print("Ja el tinc!!!!\nEl número que t'havies pensat és el " +
            // numero + "!!!!"
            // + "\n i han calgut " + intents + " intent" + ((intents == 1) ? "" : "s") + "
            // per esbrina-lo!\n");

            teclatNum.close();

        } else {
            System.out.println("Doncs ja has acabat!!!!");
        }
    }
}
