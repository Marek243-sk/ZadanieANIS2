package zadanie;

import java.util.ArrayList;
import java.util.Iterator;
public class ZoznamAtrakcii extends Atrakcia {

    private ArrayList <Atrakcia> zoznam;
    public ZoznamAtrakcii(String nazov, String sezona) {
        super(nazov, sezona);
        this.zoznam = new ArrayList<>();
    }
    @Override
    public void infoOAtrakcii() {
        System.out.println("Zoznam atrakcií: ");
    }

    public void pridajAtrakciu(Atrakcia atrakcia) {
        zoznam.add(atrakcia);
    }

    public void zobrazAtrakcie() {
        Iterator<Atrakcia> iterator = zoznam.iterator();
        while (iterator.hasNext()) {
            Atrakcia a = iterator.next();
            a.infoOAtrakcii();
        }
    }
}
