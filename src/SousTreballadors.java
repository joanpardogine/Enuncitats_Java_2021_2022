import java.util.Scanner;

public class SousTreballadors {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int empleats;
        double souhomes = 0;
        double soudones = 0;
        int contadorhomes = 0;
        int contadordones = 0;
        System.out.println("Digues el num. empleats: ");
        empleats = sc.nextInt();
        double[][] sueldo = new double[empleats][2];
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("Entra el génere Home = 0 y  Dona = 1 ");
            sueldo[i][0] = sc.nextInt();
            System.out.println("Entra sou");
            sueldo[i][1] = sc.nextDouble();
        }
        for (int i = 0; i < sueldo.length; i++) {

            if (sueldo[i][0] == 0) {
                contadorhomes++;
                souhomes = souhomes + sueldo[i][1];

            }
            if (sueldo[i][0] == 1) {

                contadordones++;
                soudones = soudones + sueldo[i][1];
            }

        }
        System.out.println("EL sou mitjà dels homes és " + (souhomes / contadorhomes));
        System.out.println("El sou mitjà de les dones és " + (soudones / contadordones));
        sc.close();
    }
}