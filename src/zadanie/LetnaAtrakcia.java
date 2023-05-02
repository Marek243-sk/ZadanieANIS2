package zadanie;

public class LetnaAtrakcia extends Atrakcia {

    private final int odVeku = 4;
    private final boolean aktivnyOddych = true;
    private final boolean pasivnyOddych = false;

    public LetnaAtrakcia(String nazov, String rocneObdobie, int cena) {
        super(nazov, rocneObdobie, cena);
    }

    @Override
    public void infoOAtrakcii() {
        System.out.println("Letná atrakcia");
        System.out.println(this.nazov + " " + this.rocneObdobie + " " + this.odVeku + " " + this.aktivnyOddych + " " + this.pasivnyOddych);
    }
}