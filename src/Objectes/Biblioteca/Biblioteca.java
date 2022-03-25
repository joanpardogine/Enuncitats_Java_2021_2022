package Objectes.Biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private String nom;
    // private int qtatMaxima;
    private int qtatLlibres;
    private Llibre[] prestatge;

    // public Biblioteca(String nom, int qtatMaxima) {
    public Biblioteca(String nom) {
        this.nom = nom;
        // this.qtatMaxima = qtatMaxima;
        this.qtatLlibres = 0;
        this.prestatge = new Llibre[qtatLlibres];
    }

    // public Biblioteca(String nom, int qtatMaxima, Llibre[] prestatge) {
    public Biblioteca(String nom, Llibre[] prestatge) {
        this.nom = nom;
        // this.qtatMaxima = qtatMaxima;
        this.qtatLlibres = prestatge.length - 1;
        this.prestatge = prestatge;
    }

    // public Biblioteca(String nom, Llibre[] prestatge) {
    //     this.nom = nom;
    //     this.qtatMaxima = 100;
    //     this.prestatge = prestatge;
    //     this.qtatLlibres = 0;
    // }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // public int getQtatMaxima() {
    //     return this.qtatMaxima;
    // }

    // public void setQtatMaxima(int qtatMaxima) {
    //     this.qtatMaxima = qtatMaxima;
    // }

    public Llibre[] getPrestatge() {
        return this.prestatge;
    }

    public void setPrestatge(Llibre[] prestatge) {
        this.prestatge = prestatge;
    }

    public void llistatDeLlibresPerTitol(){
        for (int i = 0; i < this.prestatge.length; i++) {
            System.out.println("Llibre número " + (i+1) + ": " +
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
        // + "qtatMaxima=" + this.qtatMaxima;
    }

    private int buscaLlibre(String titolLlibreABuscar) {
        if (this.prestatge.length != 0) {
            for (int i = 0; i < prestatge.length; i++) {
                if (prestatge[i].getTitol().equals(titolLlibreABuscar)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void afegirLlibre(Llibre prestatgeRebut) {
        if (buscaLlibre(prestatgeRebut.getTitol()) == -1) {
            Llibre[] prestatgeAuxiliar = new Llibre[this.qtatLlibres + 1];
            for (int i = 0; i < this.qtatLlibres; i++) {
                prestatgeAuxiliar[i] = this.prestatge[i];
            }
            prestatgeAuxiliar[prestatgeAuxiliar.length - 1] = prestatgeRebut;
            this.prestatge = prestatgeAuxiliar;
            this.qtatLlibres++;
            System.out.println("El llibre amb titol " +
            prestatgeRebut.getTitol() +
            " afegit correctament!");
        } else { // si que existeix xq és diferent de -1
            System.out.println("El llibre amb titol " +
                    prestatgeRebut.getTitol() +
                    " ja existeix!");
        }
    }

    public void esborrarLlibre(Llibre llibreRebut) {
        // Pendent de desenvolupar
        this.qtatLlibres = 1;
    }

}

// public Llibre[] esborrarLlibre(Llibre[] agenda) {
//     String[][] novaAgenda = new String[agenda.length - 1][QTAT_CAMPS];
//     int contacteAEliminar;
//     int posNovaAgenda = 0;
//     mostraAgenda(agenda);
//     mostrarMissatge("Quin contacte vols eliminar: ");

//     contacteAEliminar = teclat.nextInt();

//     for (int i = 0; i < agenda.length; i++) {
//         for (int j = 0; j < agenda[i].length; j++) {
//             if (i != contacteAEliminar - 1) {
//                 novaAgenda[posNovaAgenda][j] = agenda[i][j];
//             }
//         }
//         if (i != contacteAEliminar - 1) {
//             posNovaAgenda++;
//         }
//     }

//     return novaAgenda;
// }