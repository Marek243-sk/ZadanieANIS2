package zadanie;

public class ZimnaAtrakcia extends Atrakcia {

    private int odVeku = 6;
    private boolean aktivnyOddych = false;
    private boolean pasivnyOddych = true;

    public ZimnaAtrakcia(String nazov, String rocneObdobie, int cena) {
        super(nazov, rocneObdobie, cena);
    }

    @Override
    public void infoOAtrakcii() {
        System.out.println("Zimná atrakcia");
        System.out.println(this.nazov + " " + this.rocneObdobie + " " + this.odVeku + " " + this.aktivnyOddych + " " + this.pasivnyOddych);
    }
}