package zadanie;

import java.util.ArrayList;
import java.util.Iterator;
public class ZoznamAtrakcii extends Atrakcia {

    private ArrayList <Atrakcia> zoznam;
    public ZoznamAtrakcii(String nazov, String sezona, int cena) {
        super(nazov, sezona, cena);
        this.zoznam = new ArrayList<>();
    }
    @Override
    public void infoOAtrakciach() throws AtrakciaException{
        if (zoznam.isEmpty()) {
            throw new AtrakciaException("CHYBA! Zoznam atrakcií je prázdny.");
        }
        System.out.println("Zoznam atrakcií obsahuje tieto atrakcie:");
        for (int i = 0; i < zoznam.size(); i++) {
            System.out.println("Názov atrakcie: " + zoznam.get(i).nazov + ", ročné obdobie: " + zoznam.get(i).rocneObdobie
                    + ", cena: " + zoznam.get(i).cena);
        }
    }

    //Pridá atrakciu do zoznamu, ak sú splnené podmienky, ak nie sú, tak sa vyvolá výnimka.

    public void pridajAtrakciu(Atrakcia atrakcia) throws AtrakciaException {
        for (Atrakcia existujucaAtrakcia : zoznam) {
            if (existujucaAtrakcia.getNazov().equals(atrakcia.getNazov()) && existujucaAtrakcia.getRocneObdobie().equals(atrakcia.getRocneObdobie())) {
                throw new AtrakciaException("CHYBA! Atrakcia už existuje v zozname.", this);
            }
        }
        if (atrakcia.getCena() < 10) {
            throw new AtrakciaException("CHYBA! Cena atrakcie musí byť väčšia ako 10.", this);
        }
        zoznam.add(atrakcia);
    }

    public void zobrazAtrakcie() throws AtrakciaException {

    }
}
