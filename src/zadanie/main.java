package zadanie;

public class main {
    public static void main(String[] args) {

        System.out.println("Vytajte v: Cestovná kancelária");

        CestovnaKancelaria ck = CestovnaKancelaria.vytvorInstanciuSingleton();

        ck.registraciaPouzivatela();
        //ck.zoznamRegistrovanychPouzivatelov();

        ck.registraciaLetenky();
        //ck.zoznamRegistrovanychLeteniek();

        //ManazerUbytovania manazer = new ManazerUbytovania();
        /*manazer.pridelenieUbytovania("Hotel Dukla", "Námestie legionárov", 52, "5", 1, 100);
        manazer.pridelenieUbytovania("Hotel Torysa", "Námestie slobody 1", 15, "7", 2,  200);
        manazer.pridelenieUbytovania("Hotel Dukla", "Námestie legionárov", 52, "14", 1, 400);*/
        /*manazer.pridelenieUbytovania("Hotel Torysa", "Námestie legionárov", 52, "21", 1, 600);
        manazer.uplatniZlavu();
        manazer.ukazPonukuUbytovani();*/

        Destinacia destinacia = new Destinacia("Barcelona", "Španielsko");

        Ubytovanie ubytovanie = new Ubytovanie("A", "B", 2, "10", 2, 500);

        Atrakcia atrakcia1 = new ZimnaAtrakcia("Štrbské pleso", "zima", 50);

        Pobyt pobyt = new Pobyt(1, ck.getPouzivatel("marek@mail.com"), ck.getLetenka(1), ubytovanie, atrakcia1, destinacia);
        System.out.println(pobyt.cenaPobytu());

        /*Atrakcia atrakcia2 = new ZimnaAtrakcia("Tatry", "jeseň");
        Atrakcia atrakcia3 = new LetnaAtrakcia("Chorvátsko", "leto");*/

        /*ZoznamAtrakcii zoznamAtrakcii = new ZoznamAtrakcii("Zoznam", "sezóna");
        zoznamAtrakcii.pridajAtrakciu(atrakcia1);
        zoznamAtrakcii.pridajAtrakciu(atrakcia2);
        zoznamAtrakcii.pridajAtrakciu(atrakcia3);
        zoznamAtrakcii.zobrazAtrakcie();*/


    }
}