package Objectes;

public class Dau {
    static final int CARES = 6;

	// Atributs
	private int cares;

	// Constructor
	public Dau () {
		this.cares = CARES;
	}
	public Dau (int caresRebudes) {
		this.cares = caresRebudes;
	}
	
	// Metode
	public int llensar() {
        return (int) (Math.random() * (this.cares - 1) + 1);
	}
}