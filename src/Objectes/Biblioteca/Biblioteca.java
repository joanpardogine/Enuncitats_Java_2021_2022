package Objectes.Biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private String nom;
    private int qtatLlibres;
    private Llibre[] prestatge;

    public Biblioteca(String nom) {
        this.nom = nom;
        this.qtatLlibres = 0;
        this.prestatge = new Llibre[qtatLlibres];
    }

    public Biblioteca(String nom, Llibre[] prestatge) {
        this.nom = nom;
        this.qtatLlibres = prestatge.length - 1;
        this.prestatge = prestatge;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Llibre[] getPrestatge() {
        return this.prestatge;
    }

    public void setPrestatge(Llibre[] prestatge) {
        this.prestatge = prestatge;
    }

    public void llistatDeLlibresPerTitol() {
        for (int i = 0; i < this.prestatge.length; i++) {
            System.out.println("Llibre número " + (i + 1) + ": " +
                    this.getPrestatge()[i].getTitol());
        }
    }

    @Override
    public String toString() {
        if (this.qtatLlibres == 0) {
            return ("La biblioteca " + this.nom
                    + " està buida!");
        }
        return "Nom biblioteca = " + this.nom + "\n"
                + "prestatge=" + Arrays.toString(this.prestatge);
    }

    private int buscaLlibrePerTitol(String titolLlibreABuscar) {
        if (this.prestatge.length != 0) {
            for (int i = 0; i < prestatge.length; i++) {
                if (prestatge[i].getTitol().equals(titolLlibreABuscar)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Llibre tornaLlibre(int posicioLlibreABuscar) {
        if (posicioLlibreABuscar < this.qtatLlibres) {
            return prestatge[posicioLlibreABuscar];
        }
        return null;
    }
    
    public void afegirLlibre(Llibre llibreRebut) {
        int novaMida = this.qtatLlibres + 1;
        if (buscaLlibrePerTitol(llibreRebut.getTitol()) == -1) {
            Llibre[] prestatgeGran = new Llibre[novaMida];
            for (int i = 0; i < this.qtatLlibres; i++) {
                prestatgeGran[i] = this.prestatge[i];
            }
            prestatgeGran[prestatgeGran.length - 1] = llibreRebut;
            this.prestatge = prestatgeGran;
            this.qtatLlibres = novaMida;
            System.out.println("El llibre amb titol " +
                    llibreRebut.getTitol() +
                    " afegit correctament!");
        } else { // si que existeix xq és diferent de -1
            System.out.println("El llibre amb titol " +
                    llibreRebut.getTitol() +
                    " ja existeix!");
        }
    }

    public void esborrarLlibre(Llibre llibreRebut) {
        int novaMida = this.qtatLlibres - 1;
        Llibre[] prestatgePetit = new Llibre[novaMida];
        int comptadorExtra = 0;
        for (int i = 0; i < novaMida; i++) {
            if (this.prestatge[i + comptadorExtra].equals(llibreRebut)) {
                comptadorExtra--;
            } else {
                prestatgePetit[i + comptadorExtra] = this.prestatge[i];
            }
        }
        this.prestatge = prestatgePetit;
        this.qtatLlibres = novaMida ;
    }
}