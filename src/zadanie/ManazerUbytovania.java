package zadanie;

import java.util.ArrayList;

public class ManazerUbytovania {

    public ArrayList<Ubytovanie> pridelenieUbytovania = new ArrayList<Ubytovanie>();

    public void pridelenieUbytovania(String nazovHotela, String adresa, int cisloIzby, String dlzkaPobytu, int pocetLozok, int cenaZaUbytovanie) {
        this.pridelenieUbytovania.add(new Ubytovanie(nazovHotela, adresa, cisloIzby, dlzkaPobytu,  pocetLozok, cenaZaUbytovanie));
    }

    public void ukazPonukuUbytovani(){
        System.out.println("Ponuka ubytovaní: ");
        for (int i = 0; i < this.pridelenieUbytovania.size() ; i++) {
            System.out.println(this.pridelenieUbytovania.get(i).getNazovHotela() + ", " + this.pridelenieUbytovania.get(i).getAdresa() + ", " +
            this.pridelenieUbytovania.get(i).getPocetIzieb() + ", " + this.pridelenieUbytovania.get(i).getDlazkaPobytu() + ", " + this.pridelenieUbytovania.get(i)
                    .getPocetLozok() + ", " + this.pridelenieUbytovania.get(i).getCenaZaUbytovanie() + ".");
        }
    }

    public void uplatniZlavu() {
        for (int i = 0; i < pridelenieUbytovania.size(); i++) {
            if (pridelenieUbytovania.get(i).getDlazkaPobytu().equals("7")) {
                int cena = pridelenieUbytovania.get(i).getCenaZaUbytovanie();
                int cenaPoZlave = cena - (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) - 3) * 10;
                pridelenieUbytovania.get(i).setCenaZaUbytovanie(cenaPoZlave);

            } else if (pridelenieUbytovania.get(i).getDlazkaPobytu().equals("14")) {
                int cena = pridelenieUbytovania.get(i).getCenaZaUbytovanie();
                int cenaPoZlave = cena - (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) - 5) * 15;
                pridelenieUbytovania.get(i).setCenaZaUbytovanie(cenaPoZlave);
            }
        }
    }
}