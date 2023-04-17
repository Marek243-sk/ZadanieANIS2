package zadanie;

public abstract class Atrakcia {

    public String nazov;
    public String rocneObdobie;

    public Atrakcia(String nazov, String rocneObdobie) {
        this.nazov = nazov;
        this.rocneObdobie = rocneObdobie;
    }

    public abstract void infoOAtrakcii();
}