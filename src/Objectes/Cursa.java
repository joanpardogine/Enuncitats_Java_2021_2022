package Objectes;

public class Cursa {
    private final static float VOLTES_DEF = 0;

    // Atributs
    private float metres;
    private float voltes;

    // Constructors
    public Cursa() {
        this.voltes = VOLTES_DEF;

    }

    public Cursa(float metresRebuts) {
        this.metres = metresRebuts;
    }

    // Getters i Setters

    public float getMetres() {
        return metres;
    }

    public void setMetres(float metresRebuts) {
        this.metres = metresRebuts;
    }

    public float getVoltes() {
        return voltes;
    }

    public void setVoltes(float voltesRebudes) {
        this.voltes = voltesRebudes;
    }

    // toString
    @Override
    public String toString() {
        return "\n     metres = " + this.metres +
               "\n     voltes = " + this.voltes;
    }

    //Mètodes 
    /** * incrementarVolta(): incrementa en 1 el nombre de voltes.
     * */

    public void incrementarVolta() {
        this.voltes++; // this.voltes = this.voltes + 1;
    }

    /** * incrementarVolta(n): incrementa en n el nombre de voltes.
     * */
    public void incrementarVolta(float qtatVoltes) {
        this.voltes += qtatVoltes; // this.voltes = this.voltes + qtatVoltes;
    }

    /** * decrementarVolta(): decrement en 1 el nombre de voltes.
     *  S'ha de tenir en compte que si al decrement el resultat
     * fos negatiu, el nombre de voltes ha de ser 0.
     * */

    public void decrementarVolta() {
        this.voltes--; // this.voltes = this.voltes - 1;
        if (this.voltes < 0) {
            this.voltes = 0;
        }
    }

    /** * decrementarVolta(): decrement en 1 el nombre de voltes.
     *  S'ha de tenir en compte que si al decrement el resultat
     * fos negatiu, el nombre de voltes ha de ser 0.
     * */

    public void decrementarVolta(float qtatVoltes) {
        this.voltes -= qtatVoltes; // this.voltes = this.voltes - qtatVoltes;
        if (this.voltes < 0) {
            this.voltes = 0;
        }
    }

    /** distanciaRecorreguda(): retorna la distància total recorreguda
     * que serà el nombre de voltes per la longitud del circuit en metres. */
    public float distanciaRecorreguda() {
        return this.voltes * this.metres;
    }

}
