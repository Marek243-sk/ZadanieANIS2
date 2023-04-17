package zadanie;

public class LetnaAtrakcia extends Atrakcia {

    protected int odVeku = 4;
    protected boolean aktivnyOddych = true;
    protected boolean pasivnyOddych = false;

    public LetnaAtrakcia(String nazov, String rocneObdobie) {
        super(nazov, rocneObdobie);
    }

    @Override
    public void infoOAtrakcii() {
        System.out.println("Letná atrakcia");
        System.out.println(this.nazov + " " + this.rocneObdobie + " " + this.odVeku + " " + this.aktivnyOddych + " " + this.pasivnyOddych);
    }
}