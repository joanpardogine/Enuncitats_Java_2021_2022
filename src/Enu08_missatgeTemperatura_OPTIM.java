import java.util.Scanner;

/**
 * @author: Imanol (optimitzator) i Adrian (creator)
 */
public class Enu08_missatgeTemperatura_OPTIM {

    public static void main(String[] args) throws Exception {
        final float ZERO_ABSOLUT = -273.16f;
        float temperaturaLlegida;
        System.out.print("Introdueix la temperatura: ");
        Scanner teclat = new Scanner(System.in);
        temperaturaLlegida = teclat.nextInt();
        teclat.close();

        String[] missatges = { "Temperatura incompatible amb la vida", "Massa Fred: Avui és millor no sortir de casa",
                "Molt Fred: Perill de congelació", "Fred: Abriga't bé", "Fresqueta: Temps agradable",
                "Calor: Bon temps", "Molta calor: Recomanable portar hidratació", "Massa calor: Perill de cop de calor",
                "Temperatura incompatible amb la vida" };

        float[] minTemp = { ZERO_ABSOLUT, -30f, -14f, -9f, 6f, 16f, 21f, 31f, 46f };

        for (int i = 0; i < minTemp.length; i++) {
            if (temperaturaLlegida <= minTemp[i + 1] + 1) {
                System.out.print(missatges[i]);
                break;
            }
        }
    }
}
