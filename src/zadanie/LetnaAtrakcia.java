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
        System.out.println("Názov atrakcie: " + this.nazov + ", ročné obdobie: " + this.rocneObdobie + ", od veku: " + this.odVeku + ", aktívny oddych: " + this.aktivnyOddych + ", pasívny oddych: " + this.pasivnyOddych);
    }
}