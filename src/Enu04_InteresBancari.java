import java.util.Scanner;

public class Enu04_InteresBancari {

	public static void main(String[] args) {
		// b-> final float RETENCIO = 18;
		final int MESOS_ANY = 12;

		int diposit, mesos;
		float interes, interesGenerat;

		Scanner teclat = new Scanner(System.in);

		System.out.print("Escriu quantitat de diners que vols posar a termini fix: ");
		diposit = teclat.nextInt();

		System.out.print("Escriu el interés: ");
		interes = teclat.nextFloat();

		System.out.print("Quant temps vols tenir els diners a plaç fix: ");
		mesos = teclat.nextInt();

		interesGenerat = diposit * (interes / 100 / MESOS_ANY) * mesos;
		// b -> interesGenerat = interesGenerat - (interesGenerat * RETENCIO) / 100;
		teclat.close();

		System.out.println("L'interès generat és: " + interesGenerat);
	}
}