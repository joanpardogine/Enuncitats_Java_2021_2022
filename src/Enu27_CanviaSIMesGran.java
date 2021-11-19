public class Enu27_CanviaSIMesGran {
    public static void main(String args[]) throws Exception {
        int[] arrayNombres = new int[5];

        // FOR per inicialitzar array
        for (int i = 0; i < arrayNombres.length; i++) {
            arrayNombres[i] = (int) (Math.random() * 100);
        }
        System.out.println("ABANS!");
        // FOR per mostrar array abbans de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }

        // FOR per processar l'array
        for (int i = 0; i < arrayNombres.length; i++) {

            for (int j = i + 1; j < arrayNombres.length; j++) {

            }
        }

        System.out.println("DESPRES!");
        // FOR per mostrar array despres de ordenar
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i]);
        }
    }
}