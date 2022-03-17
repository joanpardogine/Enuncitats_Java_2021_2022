package Objectes;

/**  Crea una classe anomenada Cotxe (Cotxe.java) que tingui els següents atributs:
 *  marca, model, color i matrícula. Ha de tenir dos constructors: un buit i un
 * altre amb la marca, el model i el color. Heu de fer els setters i getters per
 * marca, model i color i per últim un mètode anomenat matricular que li doni valor
 * a l'atribut matrícula. Aquesta matrícula, el nostre objecte, la generarà de manera
 * aleatòria: 4 nombres i 3 lletres majúscules aleatòries. 
 * Des de la classe ProgramaCotxe instancieu un objecte d'aquesta classe (ProgramaCotxe.java). */
public class Cotxe {
    // Atributs
    private String marca;
    private String model;
    private String color;
    private String matricula;

    // Constructors
    // Constructor sense parametres
    public Cotxe() {
        this.marca = "buit";
        this.model = "buit";
        this.color = "buit";
        this.matricula = "buit";
    }

    // Constructors
    // Constructor amb 3 parametres (la marca, el model i el color)
    public Cotxe(String marcaRebuda, String modelRebut, String colorRebut) {
        this.marca = marcaRebuda;
        this.model = modelRebut;
        this.color = colorRebut;
        this.matricula = "buit";
    }

    // Mètode 
    public void generarMatricula() {
        String nombresMatricula;
        String lletresMatricula;

        nombresMatricula = (Integer.toString((int) (Math.random() * (19999 - 10000) + 19999)).substring(1));
        lletresMatricula = Character.toString(tornaConsonant())
                + Character.toString(tornaConsonant())
                + Character.toString(tornaConsonant());
        this.matricula = nombresMatricula + lletresMatricula;
    }

    private char tornaConsonant() {
        // ASCII E = 69 , I = 73, O = 79, U = 85 
        int codiConsonant;
        boolean esVocal;
        do {
            esVocal = false;
            codiConsonant = (int) (Math.random() * (90 - 66) + 66);
            if ( codiConsonant == 69 ||
                 codiConsonant == 73 ||
                 codiConsonant == 79 ||
                 codiConsonant == 85) {
                esVocal = true;
            }
        } while (esVocal);
        return (char) (codiConsonant);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matriculaRebuda) {
        this.matricula = matriculaRebuda;
    }

    public String toString() {
        return      "  color     = " + this.color
                + "\n  marca     = " + this.marca
                + "\n  matricula = " + this.matricula
                + "\n  model     = " + this.model;
    }

}
