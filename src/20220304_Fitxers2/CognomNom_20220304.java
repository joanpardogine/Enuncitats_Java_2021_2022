public class CognomNom_20220304 {

    public static int llegeixEnterArray(String cadenaAMostrar,
            String[] arrayValors) {
        int enterARetornar = 0;
        String[] missatges = { "els possibles valors són ",
                "Entra una opció: ",
                "ERROR! El valor entrat",
                "Torna a intentar-ho!",
                "està fora de rang,",
                "NO és un enter," };
        // El teu codi va aquí.
        return enterARetornar;
    }

    public static void main(String[] args) {
        String missDemIdioma = "Escull un idioma";
        String missDemDiaSet = "Entra un dia de la setmana";
        int idiomaEscollit = 0;
        int diaSetDemanat = 0;
        String[] arrayIdiomes = { "català", "castellà", "anglès" };
        String[] arrayDiesDeLaSetmana = { "dilluns", "dimarts", "dimecres",
                "dijous", "divendres", "dissabte", "diumenge" };
        idiomaEscollit = llegeixEnterArray(missDemIdioma, arrayIdiomes);
        diaSetDemanat = llegeixEnterArray(missDemDiaSet, arrayDiesDeLaSetmana);
        // El teu codi va aquí.
    }

}