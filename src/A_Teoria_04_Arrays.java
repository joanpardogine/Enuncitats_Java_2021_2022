public class A_Teoria_04_Arrays {

    public static void main(String[] args) {

        int[] arrayExemple = new int[150];// Declaració d'un array d'enters i dimensionant a 149 posicions
        int novaLongitud = 200;

        arrayExemple = new int[novaLongitud];// Redimensionant l'array a la nova

        String[] diesSetmana = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };
        // Declaro, dimensiono i inicialitzo l'array de cadenes (Strings) diesSetmana.

        System.out.println("L'element 3 de l'array és " + diesSetmana[2]);
        diesSetmana[2] = "Wednesday";
        System.out.println("L'element 3 de l'array és " + diesSetmana[2]);

        // Recorregut per mostrar el contingut de l'Array.
        for (int i = 0; i < diesSetmana.length; i++) {
            System.out.println(diesSetmana[i]);
        }
    }
}