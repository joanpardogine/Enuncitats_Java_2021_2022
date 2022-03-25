package Objectes.Biblioteca;

/**Crea la classe Llibre. Aquesta classe tindrà els següents atributs:
 * títol, autor, exemplars i préstec.
 * -> Exemplars serà el nombre de còpies o exemplars que 
 * la biblioteca té d'aquest llibre i
 * -> préstec serà la quantitat de còpies que estan en préstec d'aquest llibre.
 * Has de fer dos constructors
 * ->  un sense paràmetres l'altre amb els
 * ->  quatre paràmetres. Fes també els mètodes get, set i toString.
 * Per últim, hauràs d'implementar dos mètodes:
 * -> agafarEnPrestec
 * -> retornarDePrestec
 */
public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private int prestec;
    
    public Llibre() {
        this.titol = "";
        this.autor = "";
        this.exemplars = 0;
        this.prestec = 0;
    }
    
    public Llibre(String titolRebut, String autorRebut, int exemplarRebut, int prestecRebut) {
        this.titol = titolRebut;
        this.autor = autorRebut;
        this.exemplars = exemplarRebut;
        this.prestec = prestecRebut;
    }
    
    public String getTitol() {
        return this.titol;
    }
    
    public void setTitol(String titolRebut) {
        this.titol = titolRebut;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autorRebut) {
        this.autor = autorRebut;
    }
    
    public int getExemplars() {
        return this.exemplars;
    }
    
    public void setExemplars(int exemplarsRebut) {
        this.exemplars = exemplarsRebut;
    }
    
    public int getPrestec() {
        return this.prestec;
    }
    
    public void setPrestec(int prestecRebut) {
        this.prestec = prestecRebut;
    }
    
    @Override
    public String toString() {
        return "Llibre\n" 
        + " -- titol            = " +  this.titol + ",\n"
        + " -- autor            = " +  this.autor + ",\n"
        + " -- qtat exemplars   = " +  this.exemplars +  ",\n"
        + " -- qtat en prestec  = " +  this.prestec + "\n";
    }
    
    // Mètodes
    // * -> agafarEnPrestec
    // * -> retornarDePrestec
    
    public void agafarEnPrestec(){
        if(this.prestec < this.exemplars){
            this.prestec ++;
        }
    }
    public void retornarDePrestec(){
        if( (this.prestec <= this.exemplars) &&
            (this.prestec > 0 )
            ){
            this.prestec --;
        }
    }
}
