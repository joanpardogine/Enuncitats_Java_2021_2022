package Objectes.Biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private String nom;
    // private int qtatMaxima;
    private Llibre[] prestatge = new Llibre[1];
    private int qtatLlibres;

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

    @Override
    public String toString() {
        return "Biblioteca\n"
                + "nom=" + this.nom + "\n"
                + "prestatge=" + Arrays.toString(this.prestatge);
        // + "qtatMaxima=" + this.qtatMaxima;
    }

    public void afegirLlibre(Llibre llibreRebut) {
        Llibre[] prestatgeAuxiliar = new Llibre[this.qtatLlibres + 1];
        for (int i = 0; i < this.prestatge.length; i++) {
            prestatgeAuxiliar[i] = this.prestatge[i];
        }
        prestatgeAuxiliar[this.qtatLlibres + 1] = llibreRebut;
        this.prestatge = prestatgeAuxiliar;
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