package Objectes;

class Estudiant {
    int codi;
    String nomAlumne;

    public static void main(String args[]) {
        Estudiant s1 = new Estudiant();

        s1.codi = 100;
        s1.nomAlumne = "Joan";

        System.out.println("Codi = " + s1.codi);
        System.out.println("Nom  =  " + s1.nomAlumne);
    }
}