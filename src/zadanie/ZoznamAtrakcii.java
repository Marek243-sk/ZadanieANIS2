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
    public void infoOAtrakcii() {
        System.out.println("Zoznam atrakcií: ");
    }

    public void pridajAtrakciu(Atrakcia atrakcia) throws AtrakciaException {
        for (int i = 0; i < zoznam.size(); i++) {
            if (zoznam.get(i).getNazov().equals(atrakcia.getNazov())) {
                throw new AtrakciaException("Atrakcia s týmto názvom už existuje.", this);
            }
        }
        zoznam.add(atrakcia);
    }


    public void zobrazAtrakcie() throws AtrakciaException {
        boolean atrakciaExistuje = false;
        Iterator<Atrakcia> iterator = zoznam.iterator();
        while (iterator.hasNext()) {
            Atrakcia a = iterator.next();
            a.infoOAtrakcii();
        }
    }
}
