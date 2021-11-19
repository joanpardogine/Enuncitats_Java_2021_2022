public class Enu26_OrdenaArrayEnters {
    public static void main(String args[]) throws Exception {
        int[] arrayNombres = new int[5];
        // int[] arrayNombresOrdenats = new int[5];
        int auxiliar;

        // FOR per inicialitzar array
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i] = (int) (Math.random() * 100);
        }
        System.out.println("ABANS!");
        // FOR per mostrar array abbans de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }

        // FOR per ordenar l'array
        for (int i = 0; i < arrayNombres.length; i++) {

            for (int j = i + 1; j < arrayNombres.length; j++) {
                if (arrayNombres[i] > arrayNombres[j]) {
                    auxiliar = arrayNombres[i];
                    arrayNombres[i] = arrayNombres[j];
                    arrayNombres[j] = auxiliar;
                }
            }
        }

        System.out.println("DESPRES!");
        // FOR per mostrar array despres de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }
    }
}