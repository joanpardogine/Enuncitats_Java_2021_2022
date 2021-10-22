
/*
 * Fer un programa que donades les següents dades:
 *   Del primer cop que vaig a repostar
 * 		- preu litre combustible
 * 		- total pagat per emplenar el dipòsit
 * 		- número del compta-kilòmetres
 * 
 * 	Del segon cop que vaig a repostar
 * 		- preu litre combustible
 * 		- total pagat per emplenar el dipòsit
 * 
 * 	Del tercer 
 * 		- número del compta-kilòmetres
 * 
 * i calculi el consum per cada 100km i el cost per kilòmetre
 * */
import java.util.Scanner;

public class Enu03_ConsumCotxe {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		float importe;
		double litresAl100Km;
		double preu1Km;
		int kmInicials;
		int kmFinals;
		int kmTotal;

		System.out.print("Entra l'import de càrrega: ");
		importe = teclat.nextInt();

		System.out.print("Km inici: ");
		kmInicials = teclat.nextInt();

		System.out.print("Km final: ");
		kmFinals = teclat.nextInt();
		kmTotal = kmFinals - kmInicials;

		System.out.println("Has fet  " + kmTotal + " Km.");
		litresAl100Km = (importe / kmTotal) * 100;

		System.out.println("Cada 100 km el teu cotxe consumeix " + litresAl100Km + " litres.");
		preu1Km = litresAl100Km / 100;

		System.out.println("Un km et costa " + preu1Km);
		teclat.close();
	}
}