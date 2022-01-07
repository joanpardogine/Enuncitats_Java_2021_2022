import java.util.Scanner;

public class activitat1 {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int SIZE = 1000;
    int MIN = 0;
    int MAX = 99;

    int[] array = new int[SIZE];
    int n = 0;
    int count = 0;

    //Escrivim a l'array els valors aleatoris
    for(int i = 0; i < array.length; i++)
    {
      array[i] = (int)(Math.random()*(MAX-MIN)+MIN);
    }

    //Demanem el valor a buscar dins l'array
    System.out.print("Introdueix el número N\n");
    n = sc.nextInt();

    //Lògica: busquem quantes vegades es repeteix el valor dins l'array
    for(int i = 0; i < array.length; i++)
    {
      if (array[i] == n) count++;
    }

    //Mostrem resultats
    if (count == 0){
      System.out.print("El número N = " + n + " no ha sortit cap vegada.\n");
    } else {
      System.out.print("El número N = " + n + " ha sortit " + count + " vegades.\n");
    }

    sc.close();
  }


}