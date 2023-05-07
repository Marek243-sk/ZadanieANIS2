package zadanie;

public class LetnaAtrakcia extends Atrakcia {

    private final int odVeku = 4;
    private final boolean aktivnyOddych = true;
    private final boolean pasivnyOddych = false;

    public LetnaAtrakcia(String nazov, String rocneObdobie, int cena) {
        super(nazov, rocneObdobie, cena);
    }

    //Vypíše charakteristiky danej letnej atrakcie
    @Override
    public void infoOAtrakciach() {
        System.out.println("Bola pridaná LETNÁ atrakcia");
    }
}