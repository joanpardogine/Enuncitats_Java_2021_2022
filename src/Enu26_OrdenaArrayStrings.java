public class Enu26_OrdenaArrayStrings {
    public static void main(String args[]) throws Exception {
        String[] arrayCadenes = new String[5];
        // int[] arrayCadenesOrdenats = new int[5];
        String auxiliar;

        // FOR per inicialitzar array
        // for (int i = 0; i < arrayCadenes.length; i++) {
        // arrayCadenes[i] = (int) (Math.random() * 100);
        // }

        arrayCadenes[0] = "Programación";
        arrayCadenes[1] = "Murcièlago";
        arrayCadenes[2] = "Base de dades";
        arrayCadenes[3] = "Programació";
        arrayCadenes[4] = "Escola Ginebro";

        System.out.println("ABANS!");
        // FOR per mostrar array abbans de ordenar
        for (int i = 0; i < arrayCadenes.length; i++) {
            System.out.println(arrayCadenes[i]);
        }

        // FOR per ordenar l'array
        for (int i = 0; i < arrayCadenes.length; i++) {

            for (int j = i + 1; j < arrayCadenes.length; j++) {

                // arrayCadenes[i].equals(arrayCadenes[j]) // si son iguals
                // if (arrayNombres[i] > arrayNombres[j]) {
                if (arrayCadenes[i].compareTo(arrayCadenes[j]) > 0) {
                    auxiliar = arrayCadenes[i];
                    arrayCadenes[i] = arrayCadenes[j];
                    arrayCadenes[j] = auxiliar;
                }
            }
        }

        System.out.println("DESPRES!");
        // FOR per mostrar array despres de ordenar
        for (int i = 0; i < arrayCadenes.length; i++) {
            System.out.println(arrayCadenes[i]);
        }
    }
}