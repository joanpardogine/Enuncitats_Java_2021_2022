public class Teoria_04_Arrays {
    public static void main(String[] args) {
        int[] arrayExemple = new int[150]; // Declarant i dimensionant l'array
        int novaLongitud = 200;

        // Redimensionant l'array
        arrayExemple = new int[novaLongitud];

        // Declaro,dimensiono i Inicialitzo.
        String[] diesSetmana = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };

        System.out.println("L'element 3 de l'array és " + diesSetmana[2]);
        diesSetmana[2] = "Wednesday";
        System.out.println("L'element 3 de l'array és " + diesSetmana[2]);

        // Recorregut array.
        for (int i = 0; i < diesSetmana.length; i++) {
            System.out.println(diesSetmana[i]);

        }
    }
}