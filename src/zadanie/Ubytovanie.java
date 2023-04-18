package zadanie;

public class Ubytovanie {
    private String nazovHotela;
    private String adresa;
    private int pocetIzieb;
    private String dlazkaPobytu;
    private int pocetLozok;
    private int cenaZaUbytovanie;

    public Ubytovanie(String nazovHotela, String adresa, int pocetIzieb, String dlazkaPobytu, int pocetLozok, int cenaZaUbytovanie) {
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

    public String getDlazkaPobytu() {
        return dlazkaPobytu;
    }


    public int getPocetLozok() {
        return pocetLozok;
    }

    public int getCenaZaUbytovanie() {
        return cenaZaUbytovanie;
    }

    public void setCenaZaUbytovanie(int cena) {
        this.cenaZaUbytovanie = cena;
    }
}
