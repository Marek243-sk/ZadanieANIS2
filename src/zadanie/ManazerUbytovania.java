package zadanie;

import java.util.ArrayList;

public class ManazerUbytovania {

    public ArrayList<Ubytovanie> pridelenieUbytovania = new ArrayList<Ubytovanie>();

    public void pridelenieUbytovania(String nazovHotela, String adresa, int cisloIzby, String dlzkaPobytu, int pocetLozok, int cenaZaUbytovanie) {
        this.pridelenieUbytovania.add(new Ubytovanie(nazovHotela, adresa, cisloIzby, dlzkaPobytu,  pocetLozok, cenaZaUbytovanie));
    }

    public void ukazPonukuUbytovani(){
        System.out.println("Ponuka ubytovaní (Ak je dĺžka ubytovania 7, 10, 14, alebo 21 dní, uplatní sa zľava.): ");
        for (int i = 0; i < this.pridelenieUbytovania.size() ; i++) {
            System.out.println("Názov hotela: " + this.pridelenieUbytovania.get(i).getNazovHotela() + ", adresa hotela: " + this.pridelenieUbytovania.get(i).getAdresa() + ", počet izieb: " +
                    this.pridelenieUbytovania.get(i).getPocetIzieb() + ", dĺžka pobytu: " + this.pridelenieUbytovania.get(i).getDlazkaPobytu() + ", počet lôžok: " + this.pridelenieUbytovania.get(i)
                    .getPocetLozok() + ", cena za ubytovanie: " + this.pridelenieUbytovania.get(i).getCenaZaUbytovanie() + " €.");
        }
    }

    public void uplatniZlavu() {
        for (int i = 0; i < pridelenieUbytovania.size(); i++) {
            if (pridelenieUbytovania.get(i).getDlazkaPobytu().equals("7") || pridelenieUbytovania.get(i).getDlazkaPobytu().equals("10")) {
                int cena = pridelenieUbytovania.get(i).getCenaZaUbytovanie();
                int cenaPoZlave = cena - (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) - 3) * 10;
                pridelenieUbytovania.get(i).setCenaZaUbytovanie(cenaPoZlave);

            } else if (pridelenieUbytovania.get(i).getDlazkaPobytu().equals("14")) {
                int cena = pridelenieUbytovania.get(i).getCenaZaUbytovanie();
                int cenaPoZlave = cena - (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) - 5) * 6;
                pridelenieUbytovania.get(i).setCenaZaUbytovanie(cenaPoZlave);

            } else if (pridelenieUbytovania.get(i).getDlazkaPobytu().equals("21")) {
                int cena = pridelenieUbytovania.get(i).getCenaZaUbytovanie();
                int cenaPoZlave = cena - (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) - 7) * 6;
                pridelenieUbytovania.get(i).setCenaZaUbytovanie(cenaPoZlave);
            }
        }
    }
}