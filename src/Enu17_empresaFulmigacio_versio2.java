import java.util.Scanner;

public class Enu17_empresaFulmigacio_versio2 {

	public static void main(String args[]) throws Exception {
		final int EXTENSIO_DTE = 100;
		final float DTE_EXTENSIO = 0.05f;

		final int IMPORT_DTE = 10000;
		final float DTE_IMPORT = 0.10f;

		Scanner teclat = new Scanner(System.in);
		double dteMesDe10000Euros = 0;
		double dteMesDe100Hectarees = 0;
		double extensioAFumigar;
		double importTotal;
		String nomGranger;
		String opcioEscollida;
		char opcioEscollidaLletra;
		double preuProducte;
		double qtatDeGrangers;
		int[] qtatDeCadaTipus = { 0, 0, 0, 0 };
		int[] preuDeCadaTipus = { 50, 70, 80, 190 };
		double importTotalVendes = 0;
		qtatDeGrangers = 3;

		int tipusEscollit = 0;

		do { // REPETIR PER CADA GRANGER
			System.out.print("Entra el nom del granger: ");
			nomGranger = teclat.next();
			do { // REPETIR MENTRE OPCIO NO ÉS A o B o C o D
				System.out.println(
						"Tipus 1: fumigació contra males herbes, 50 Euro per hectàrea.              (escull A)");
				System.out.println(
						"Tipus 2: fumigació contra mosques i mosquits, 70 Euro per hectàrea.        (escull B)");
				System.out.println(
						"Tipus 3: fumigació contra cucs, 80 Euro per hectàrea.                      (escull C)");
				System.out.println(
						"Tipus 4: fumigació contra tots els tipus anteriors, 190 Euro per hectàrea. (escull D)");
				System.out.println("Quin tipus de fumigació desistjes fer (A/B/C/D)?");
				opcioEscollida = teclat.next().toUpperCase(); // toUpperCase() => canvia la lletra llegida a majúscula.
				// opcioEscollidaLletra = teclat.next().charAt(0); // Per lelgir només un
				// caràcter
				if (!(opcioEscollida.equals("A") || opcioEscollida.equals("B") || opcioEscollida.equals("C")
						|| opcioEscollida.equals("D"))) {
					System.out.println("ERROR, has d'escollir una lletra entre A i D!");
				}
			} while (!(opcioEscollida.equals("A") || opcioEscollida.equals("B") || opcioEscollida.equals("C")
					|| opcioEscollida.equals("D"))); // REPETIR MENTRE OPCIO NO ÉS A o B o C o D

			if (opcioEscollida.equals("A")) {
				// preuProducte = 50;
				// preuProducte = preuDeCadaTipus[0];
				// qtatDeCadaTipus[0]++;
				tipusEscollit = 0;
			} else {
				if (opcioEscollida.equals("B")) {
					// preuProducte = 70;
					// preuProducte = preuDeCadaTipus[1];
					// qtatDeCadaTipus[1]++;
					tipusEscollit = 1;
				} else {
					if (opcioEscollida.equals("C")) {
						// preuProducte = 80;
						// preuProducte = preuDeCadaTipus[2];
						// qtatDeCadaTipus[2]++;
						tipusEscollit = 2;
					} else {
						// preuProducte = 190;
						// preuProducte = preuDeCadaTipus[3];
						// qtatDeCadaTipus[3]++;
						tipusEscollit = 3;
					}
				}
			}
			preuProducte = preuDeCadaTipus[tipusEscollit];
			qtatDeCadaTipus[tipusEscollit]++;

			System.out.println("Genial!, ara que has escollit la opció " + opcioEscollida
					+ ", cal que indiquis quina és l`extensió (en hectàrees) a fumigar.");
			extensioAFumigar = teclat.nextDouble();

			if (extensioAFumigar > EXTENSIO_DTE) {
				dteMesDe100Hectarees = (extensioAFumigar * preuProducte) * DTE_EXTENSIO;
			}

			importTotal = (extensioAFumigar * preuProducte) - dteMesDe100Hectarees;

			if (importTotal > IMPORT_DTE) {
				dteMesDe10000Euros = (importTotal - IMPORT_DTE) * DTE_IMPORT;
			}

			importTotal = importTotal - dteMesDe10000Euros;

			System.out.println("El granger " + nomGranger + " té un compte total de " + importTotal);

			qtatDeGrangers--; // Començoa amb 50 i vaig decrementant
			importTotalVendes = importTotalVendes + importTotal;
		} while (qtatDeGrangers > 0); // REPETIR PER CADA GRANGER

		teclat.close();

		System.out.print("Del tipus A hi han hagut " + qtatDeCadaTipus[0] + "\nDel tipus B hi han hagut "
				+ qtatDeCadaTipus[1] + "\nDel tipus C hi han hagut " + qtatDeCadaTipus[2]
				+ "\nDel tipus D hi han hagut " + qtatDeCadaTipus[3] + "\n");

		System.out.println("L'import Total de Vendes és de " + importTotalVendes);
	}
}
