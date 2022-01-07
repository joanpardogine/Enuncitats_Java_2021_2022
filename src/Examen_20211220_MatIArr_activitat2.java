import java.util.Scanner;

public class activitat2 {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int size = 0;
    int increment = 0;
    int value = 0;

    System.out.print("Introdueix el valor inicial: ");
    value = sc.nextInt();

    System.out.print("Introdueix el valor d'increment: ");
    increment = sc.nextInt();

    System.out.print("Introdueix la quantitat de números a generar: ");
    size = sc.nextInt();

    int[] array = new int[size];

    //Omplim l'array
    for (int i = 0; i < array.length; i++){
      array[i] = value;
      value+=increment;
    }

    //Mostrem el resultat
    for (int i = 0; i < array.length; i++){
     
        System.out.print(array[i]+" ");
    }

    sc.close();
  }


}