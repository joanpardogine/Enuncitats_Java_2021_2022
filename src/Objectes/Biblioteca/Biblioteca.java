package Objectes.Biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private String nom;
    private int qtatMaxima;
    private Llibre[] prestatge = new Llibre[qtatMaxima];

    
    public Biblioteca(String nom, int qtatMaxima) {
        this.nom = nom;
        this.qtatMaxima = qtatMaxima;
        this.prestatge = new Llibre[qtatMaxima];
    }
    
    public Biblioteca(String nom, int qtatMaxima, Llibre[] prestatge) {
        this.nom = nom;
        this.qtatMaxima = qtatMaxima;
        this.prestatge = prestatge;
    }

    // public Biblioteca(String nom, Llibre[] prestatge) {
    //     this.nom = nom;
    //     this.qtatMaxima = 100;
    //     this.prestatge = prestatge;
    // }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQtatMaxima() {
        return this.qtatMaxima;
    }

    public void setQtatMaxima(int qtatMaxima) {
        this.qtatMaxima = qtatMaxima;
    }

    public Llibre[] getPrestatge() {
        return this.prestatge;
    }

    public void setPrestatge(Llibre[] prestatge) {
        this.prestatge = prestatge;
    }

    @Override
    public String toString() {
        return "Biblioteca\n"
            + "nom=" + this.nom + "\n"
            + "prestatge=" + Arrays.toString(this.prestatge) + "\n"
            + "qtatMaxima=" + this.qtatMaxima;
    }

    
    
}
