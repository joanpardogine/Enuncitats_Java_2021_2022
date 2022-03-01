package EinesControl.Classes;

public class Persona {
    public String nom;
    public String cognom;
    public String nif;
    public int anyNaixement;

    private char lletresNif[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


    // Constructors
    Persona() { // Constructor rebrà nom
        this.nom = "sense nom";
        this.cognom = "buida";
        this.nif = "buit";
        this.anyNaixement = 1990;
    }

    Persona(String nomRebut) { // Constructor rebrà nom
        this.nom = nomRebut;
        this.cognom = "buida";
        this.nif = "buit";
        this.anyNaixement = 1990;
    }

    Persona(String nomRebut, String cognomRebut) { // Constructor rebrà nom
        this.nom = nomRebut;
        this.cognom = cognomRebut;
        this.nif = "buit";
        this.anyNaixement = 1990;
    }

    // mètodes setters
    public void setNom(String nomRebut) {
        this.nom = nomRebut;
    }
    
    public void setCognom(String cognomRebut) {
        this.cognom = cognomRebut;
    }

    public void setNif(String nifRebut) {
        // nif = int 
        // lletra = 1 char 
        if (comprovaNif(nifRebut)){
            this.nif = nifRebut;
            System.out.println("NIF Correcte!");
        } else {
            System.out.println("NIF incorrecte!");
            this.nif = "buit";
        } 
    }
    
    // mètodes getters
    public String getNom() {
        return this.nom;
    }

    public String getcognom() {
        return this.cognom;
    }

    public String getNif() {
        return this.nif;
    }

// metode boolean comprovaNif(String)
private boolean comprovaNif(String nifRebut){
    boolean esCorrecte = false;
    char lletra;
    int partEntera = Integer.parseInt(nifRebut.substring(0,8));
    lletra = nifRebut.charAt(8);

    if (lletra == lletresNif[partEntera % 23]){
        esCorrecte = true;
    }

    return esCorrecte;
}

    // mètode toString 
    public String toString() {
        return "Nom persona = " + this.nom + "\n"
                + "Cogom persona = " + this.cognom + "\n"
                + "nif persona = " + this.nif;
    }
}
