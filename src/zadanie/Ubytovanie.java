package zadanie;

public class Ubytovanie {
    private String nazovHotela;
    private String adresa;
    private int pocetIzieb;
    private int dlazkaPobytu;
    private int pocetLozok;
    private int cenaZaUbytovanie;

    public Ubytovanie(String nazovHotela, String adresa, int pocetIzieb, int dlazkaPobytu, int pocetLozok, int cenaZaUbytovanie) {
        this.nazovHotela = nazovHotela;
        this.adresa = adresa;
        this.pocetIzieb = pocetIzieb;
        this.dlazkaPobytu = dlazkaPobytu;
        this.pocetLozok = pocetLozok;
        this.cenaZaUbytovanie = cenaZaUbytovanie;
    }

    public String getNazovHotela() {
        return nazovHotela;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getPocetIzieb() {
        return pocetIzieb;
    }

    public int getDlazkaPobytu() {
        return dlazkaPobytu;
    }

    public int getPocetLozok() {
        return pocetLozok;
    }

    public int getCenaZaUbytovanie() {
        return cenaZaUbytovanie;
    }
}
