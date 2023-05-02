package zadanie;

public class ZimnaAtrakcia extends Atrakcia {

    private final int odVeku = 6;
    private final boolean aktivnyOddych = false;
    private final boolean pasivnyOddych = true;

    public ZimnaAtrakcia(String nazov, String rocneObdobie, int cena) {
        super(nazov, rocneObdobie, cena);
    }

    @Override
    public void infoOAtrakcii() {
        System.out.println("Zimná atrakcia");
        System.out.println(this.nazov + " " + this.rocneObdobie + " " + this.odVeku + " " + this.aktivnyOddych + " " + this.pasivnyOddych);
    }
}