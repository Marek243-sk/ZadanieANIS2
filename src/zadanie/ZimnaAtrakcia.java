package zadanie;

public class ZimnaAtrakcia extends Atrakcia {

    private final int odVeku = 6;
    private final boolean aktivnyOddych = false;
    private final boolean pasivnyOddych = true;

    public ZimnaAtrakcia(String nazov, String rocneObdobie, int cena) {
        super(nazov, rocneObdobie, cena);
    }

    //Vypíše charakteristiky danej zimnej atrakcie
    @Override
    public void infoOAtrakciach() {
        System.out.println("Bola pridaná ZIMNÁ atrakcia");
    }
}