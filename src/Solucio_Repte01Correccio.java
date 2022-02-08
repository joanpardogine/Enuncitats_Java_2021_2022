import java.io.File;
import java.util.Scanner;

public class Repte01Correccio {
    public static void main(String[] args) throws Exception {
        Scanner teclat = new Scanner(System.in);
        String[] categories = { "Esmorzar", "Copes", "Dinars", "Berenars", "Sopar" };
        float[] valors = new float[5];
        String linea = "";
        float categoriamesgran = 0;
        float categoriamespetita = -1;
        String CatGran = " ";
        String CatPetita = " ";
        float sumaapats = 0;
        float sumavalorstotal = 0;

        try {
            File fitxer = new File("file.txt");
            Scanner fileScanner = new Scanner(fitxer);

            while (fileScanner.hasNextLine()) {

                linea = fileScanner.nextLine();
                
                for (int i = 0; i < categories.length; i++) {
                    if (linea.charAt(0) == categories[i].charAt(0)) {

                        linea = linea.substring(2);
                        valors[i] = Float.parseFloat(linea);

                        sumavalorstotal = valors[i] + sumaapats;
                        sumaapats = sumavalorstotal - valors[4];

                        if (valors[i] > categoriamesgran) {
                            categoriamesgran = valors[i];
                            CatGran = categories[i];
                        }

                        if (valors[i] < categoriamespetita || categoriamespetita==-1) {
                            categoriamespetita = valors[i];
                            CatPetita = categories[i];
                        }
                    }

                }

                if (linea.charAt(0) == 'N') {

                    // Per verificar si tenim algun valor igual a 0 a l'array

                    for (int i = 0; i < valors.length; i++) {
                        if (valors[i] == 0) {
                            categoriamespetita = valors[i];
                            CatPetita = categories[i];
                        }
                        valors[i] =0;
                    }

                    sumaapats = sumaapats / (categories.length-1);
                    sumavalorstotal = sumavalorstotal / categories.length;

                    System.out.print(CatGran + "#");
                    System.out.print(CatPetita + "#");

                    if (sumaapats < sumavalorstotal) {
                        System.out.println("NO");
                    } else if (sumaapats > sumavalorstotal) {
                        System.out.println("SI");

                    } else if (sumaapats == sumavalorstotal) {
                        System.out.println("EMPAT");
                    }

                    categoriamesgran = 0;
                    categoriamespetita = -1;
                }

            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println("Error lectura " + e.getMessage());
            e.printStackTrace();
        }

        teclat.close();
    }
}
