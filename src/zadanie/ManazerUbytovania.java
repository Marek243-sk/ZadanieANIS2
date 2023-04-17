package zadanie;

import java.util.ArrayList;

public class ManazerUbytovania{

    public ArrayList<Ubytovanie> pridelenieUbytovania = new ArrayList<Ubytovanie>();

    ManazerUbytovania(){

    }
    public void pridelenieUbytovania(String nazovHotela, String adresa, int cisloIzby, int dlzkaPobytu, int pocetLozok, int cenaZaUbytovanie) {
        this.pridelenieUbytovania.add(new Ubytovanie(nazovHotela, adresa, cisloIzby, dlzkaPobytu,  pocetLozok, cenaZaUbytovanie));
    }

    public void ukazPrideleneUbytovanie(){
        for (int i = 0; i < this.pridelenieUbytovania.size() ; i++) {
            System.out.println("Pridelené ubytovanie: " + this.pridelenieUbytovania.get(i).getNazovHotela() + ", " + this.pridelenieUbytovania.get(i).getAdresa() +
            this.pridelenieUbytovania.get(i).getCisloIzby() + ", " + this.pridelenieUbytovania.get(i).getDlazkaPobytu() + ", " + this.pridelenieUbytovania.get(i)
                    .getPocetLozok() + ", " + this.pridelenieUbytovania.get(i).getCenaZaUbytovanie());
        }
    }
 /*
    public void zoznamUbytovanych() {
        for (int i = 0; i < pridelenieUbytovania.size(); i++) {
            if (dlazkaPobytu > 3) {
                cenaZaUbytovanie = cenaZaUbytovanie - (dlazkaPobytu - 3) * 10;
            }
        }
        System.out.println("Zoznam ubytovaných je: ");
    }
*/
}