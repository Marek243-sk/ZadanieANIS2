package zadanie;

public class main {
    public static void main(String[] args) {

        System.out.println("Vytajte v: Cestovná kancelária");

        CestovnaKancelaria ck = CestovnaKancelaria.vytvorInstanciuSingleton();
        /*try {
            ck.registraciaPouzivatela();
            ck.zoznamRegistrovanychPouzivatelov();
            ck.zmenitEmail("marek@123", "MAREK@456");
            ck.zoznamRegistrovanychPouzivatelov();
            ck.zmenitEmail("abc@789", "ABC@987");
            ck.zoznamRegistrovanychPouzivatelov();
        } catch (CKException chyba) {
            System.out.println(chyba);
        }*/


        /*ck.registraciaPouzivatela();
        ck.zoznamRegistrovanychPouzivatelov();
*/
        try {
            ck.registraciaLetenky();
            ck.zoznamRegistrovanychLeteniek();
        } catch (CKException chyba) {
            System.out.println(chyba);
        }
/*
        try {
            ManazerUbytovania manazer = new ManazerUbytovania();
            manazer.pridelenieUbytovania("Hotel Dukla", "Námestie legionárov", 52, "0", 1, 100);
            //manazer.pridelenieUbytovania("Hotel Torysa", "Námestie slobody 1", 15, "7", 2, 200);
            //manazer.pridelenieUbytovania("Hotel Dukla", "Námestie legionárov", 52, "14", 1, 400);
            //manazer.pridelenieUbytovania("Hotel Torysa", "Námestie legionárov", 52, "21", 1, 600);
            manazer.uplatniZlavu();
            manazer.ukazPonukuUbytovani();
        } catch (MUException chyba) {
            System.out.println(chyba);
        }*/


        Destinacia destinacia = new Destinacia("Barcelona", "Španielsko");

        Ubytovanie ubytovanie = new Ubytovanie("A", "B", 2, "10", 2, 500);

        Atrakcia atrakcia1 = new ZimnaAtrakcia("Štrbské pleso", "zima", 50);

        Pobyt pobyt = new Pobyt(1, ck.getPouzivatel("marek@123"), ck.getLetenka(1), ubytovanie, atrakcia1, destinacia);
        System.out.println(pobyt.cenaPobytu());

        /*
        try {
            Atrakcia atrakcia1 = new LetnaAtrakcia("Bobová dráha","leto",20);
            Atrakcia atrakcia2 = new ZimnaAtrakcia("Tatry", "jeseň",55);
            Atrakcia atrakcia3 = new LetnaAtrakcia("Bobová dráha", "leto",800);

            ZoznamAtrakcii zoznamAtrakcii = new ZoznamAtrakcii("Zoznam", "sezóna",5);
            zoznamAtrakcii.pridajAtrakciu(atrakcia1);
            zoznamAtrakcii.pridajAtrakciu(atrakcia2);
            zoznamAtrakcii.pridajAtrakciu(atrakcia3);
            zoznamAtrakcii.zobrazAtrakcie();
        } catch (AtrakciaException chyba) {
            System.out.println(chyba);
        }*/
    }
}