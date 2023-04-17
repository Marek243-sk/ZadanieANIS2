package zadanie;

public class ZimnaAtrakcia extends Atrakcia {

    protected String nazov;
    protected String rocneObdobie;
    protected int odVeku;
    protected boolean aktivnyOddych = false;
    protected boolean pasivnyOddych = false;

    public void ZimnaAtrakcia(String nazov, String rocneObdobie, int odVeku, boolean aktivnyOddych, boolean pasivnyOddych) {
        this.nazov = nazov;
        this.rocneObdobie = rocneObdobie;
        this.odVeku = odVeku;
        this.aktivnyOddych = aktivnyOddych;
        this.pasivnyOddych = pasivnyOddych;
    }

    @Override
    public void vyberAtrakciu() {

    }
}
