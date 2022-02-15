package EinesControl.Classes;

public class Persona {
    String nom;
    String cognom;
    String nif;
    int anyNaixement;

    public void setNom(String nomRebut) {
        this.nom = nomRebut;
    }

    public void setCognom(String cognomRebut) {
        this.cognom = cognomRebut;
    }

    public void setNif(String nifRebut) {
        this.nif = nifRebut;
    }

    public String getNom() {
        return this.nom;
    }

    public String getcognom() {
        return this.cognom;
    }

    public String getNif() {
        return this.nif;
    }

    public String toString() {
        return "Nom persona = " + this.nom + "\n"
                + "Cogom persona = " + this.cognom + "\n"
                + "nif persona = " + this.nif;
    }
}
