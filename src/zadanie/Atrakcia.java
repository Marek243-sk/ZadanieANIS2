package zadanie;

public abstract class Atrakcia {

    public String nazov;
    public String rocneObdobie;
    public int cena;

    public Atrakcia(String nazov, String rocneObdobie, int cena) {
        this.nazov = nazov;
        this.rocneObdobie = rocneObdobie;
        this.cena = cena;
    }

    public int getCena() {
        return this.cena;
    }

    public abstract void infoOAtrakcii();
}