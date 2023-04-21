package zadanie;

import java.util.ArrayList;

public class Pobyt {

    int cisloPobytu;
    Pouzivatel pouzivatel;
    ArrayList<Letenka> zoznamLeteniek = new ArrayList<Letenka>();
    Ubytovanie ubytovanie;
    ArrayList<Atrakcia> zoznamAtrakcii = new ArrayList<Atrakcia>();
    Destinacia destinacia;

    public Pobyt(int cislo, Pouzivatel pouzivatel, Letenka letenka, Ubytovanie ubytovanie, Atrakcia atrakcia, Destinacia destinacia) {
        this.cisloPobytu = cislo;
        this.pouzivatel = pouzivatel;
        this.zoznamLeteniek.add(letenka);
        this.ubytovanie = ubytovanie;
        this.zoznamAtrakcii.add(atrakcia);
        this.destinacia = destinacia;
    }

    public void pridajLetenku(Letenka letenka) {
        this.zoznamLeteniek.add(letenka);
    }

    public void pridajAtrakciu(Atrakcia atrakcia) {
        this.zoznamAtrakcii.add(atrakcia);
    }

    public int cenaPobytu() {
        int celkovaCena = 0;
        for (int i = 0; i < zoznamLeteniek.size(); i++) {
            celkovaCena += zoznamLeteniek.get(i).getCena();
        }

        celkovaCena += ubytovanie.getCenaZaUbytovanie();

        for (int i = 0; i < zoznamAtrakcii.size(); i++) {
            celkovaCena += zoznamAtrakcii.get(i).getCena();
        }

        return celkovaCena;
    }
}