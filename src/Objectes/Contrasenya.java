package Objectes;

import java.util.Random;

public class Contrasenya {
    private final static int LONG_DEF = 8;
    private final static int QTAT_MINUS_SEGURA = 1;
    private final static int QTAT_MAJUS_SEGURA = 2;
    private final static int QTAT_NOMBRES_SEGURA = 5;

    private int longitud;
    private String contrasenya;

    // Un constructor per defecte.
    public Contrasenya() {
        this.longitud = LONG_DEF;
    }

    // Un constructor amb la longitud que nosaltres li passem.
    // S'ha de generar una contrasenya aleatòria amb aquesta longitud.
    public Contrasenya(int longitud) {
        this.longitud = longitud;
        this.contrasenya = generarContrasenya();
    }

    // Setters i Getters

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    // Mètodes
    public String generarContrasenya() {
        String contrasenya = "";
        int aleatori = 0;
        Random caracterAleatori;
        char caracterAConcatenar;
        for (int i = 0; i < this.longitud; i++) {
            aleatori = (int) (Math.random() * 3 + 1);
            caracterAleatori = new Random();
            if (aleatori == 1) { // nombre  0 = ASCII 30  9 = ASCII 39 
                caracterAConcatenar = (char) (caracterAleatori.nextInt('9' - '0') + '0');
            } else if (aleatori == 2) { // minúscula
                caracterAConcatenar = (char) (caracterAleatori.nextInt('z' - 'a') + 'a');
            } else { // majúscula
                caracterAConcatenar = (char) (caracterAleatori.nextInt('Z' - 'A') + 'A');
            }
            contrasenya += caracterAConcatenar;
        }
        return contrasenya;
    }

    /** esForta: retorna un booleà si és forta o no.
     * Perquè sigui forta ha de tenir
     *  més de 2 majúscules,
     *  més d'1 minúscula i
     *  més de 5 números. */
    public boolean esForta() {
        boolean esForta = false;
        int qtatNumeros = 0;
        int qtatMajuscules = 0;
        int qtatMinuscules = 0;

        // for (int i = 0; i < this.contrasenya.length(); i++) {
        for (int i = 0; i < this.longitud; i++) {
            if (Character.isDigit(this.contrasenya.charAt(i))) {
                qtatNumeros++;
            } else if (Character.isLowerCase(this.contrasenya.charAt(i))) {
                qtatMinuscules++;
            } else if (Character.isUpperCase(this.contrasenya.charAt(i))) {
                qtatMajuscules++;
            }
        }

        if (qtatMinuscules > QTAT_MINUS_SEGURA &&
                qtatMajuscules > QTAT_MAJUS_SEGURA &&
                qtatNumeros > QTAT_NOMBRES_SEGURA) {
            esForta = true;
        }
        return esForta;
    }
}
