package zadanie;

import java.util.ArrayList;

public class ManazerUbytovania {

    public ArrayList<Ubytovanie> pridelenieUbytovania = new ArrayList<Ubytovanie>();

    //Ak je pole 'prideleneUbytovania' naplnené aspoň jedným "ubytovaním", tak ho prejde, "spýta" sa na dĺžku pobytu, počet lôžok a na cenu za ubytovanie.
    //Ak hodnoty neprejdú cez kontrolu, vyhodí sa chyba, ak prejdú, "ubytovanie" sa pridá do zoznamu.
    public void pridelenieUbytovania(String nazovHotela, String adresa, int cisloIzby, String dlzkaPobytu, int pocetLozok, int cenaZaUbytovanie) throws MUException {
        if (pridelenieUbytovania.size() > 0) {
            for (int i = 0; i < pridelenieUbytovania.size(); i++) {
                if (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu() ) < 1 || pridelenieUbytovania.get(i).getPocetLozok() < 1 ||
                        pridelenieUbytovania.get(i).getCenaZaUbytovanie() < 10) {
                    throw new MUException("CHYBA!. Musí byť splnené: dĺžka pobytu > 1 deň, počet lôžok > 1, cena za ubytovanie > 10€.");
                }
            }
        }
        this.pridelenieUbytovania.add(new Ubytovanie(nazovHotela, adresa, cisloIzby, dlzkaPobytu,  pocetLozok, cenaZaUbytovanie));
    }

    //Overí, či je pole prázdne, ak nie, tak ho prejde a vypíše jednotlivé ubytovania
    public void ukazPonukuUbytovani() throws MUException{
        if (this.pridelenieUbytovania.isEmpty()) {
            throw new MUException("Zoznam ubytovaní je prázdny.");
        }
        System.out.println("Ponuka ubytovaní (Ak je dĺžka ubytovania 7, 10, 14, alebo 21 dní, uplatní sa zľava.): ");
        for (int i = 0; i < this.pridelenieUbytovania.size() ; i++) {
            System.out.println("Názov hotela: " + this.pridelenieUbytovania.get(i).getNazovHotela() + ", adresa hotela: " + this.pridelenieUbytovania.get(i).getAdresa() + ", počet izieb: " +
                    this.pridelenieUbytovania.get(i).getPocetIzieb() + ", dĺžka pobytu: " + this.pridelenieUbytovania.get(i).getDlazkaPobytu() + ", počet lôžok: " + this.pridelenieUbytovania.get(i)
                    .getPocetLozok() + ", cena za ubytovanie: " + this.pridelenieUbytovania.get(i).getCenaZaUbytovanie() + " €.");
        }
    }

    //Overí, či je pole prázdne, alebo ak je dĺžka pobytu 0 a menej dní
    public void uplatniZlavu() throws MUException {
        if (this.pridelenieUbytovania.isEmpty()) {
            throw new MUException("Zoznam ubytovaní je prázdny.");
        }
        for (int i = 0; i < pridelenieUbytovania.size(); i++) {
            if (Integer.parseInt(pridelenieUbytovania.get(i).getDlazkaPobytu()) < 1) {
                throw new MUException("Chybná dĺžka pobytu. Dĺžka pobytu je menšia ako 1 deň.");
            }
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