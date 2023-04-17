package zadanie;

public class main {
    public static void main(String[] args) {
        /*
        System.out.println("Vytajte v: Cestovná kancelária");

        CestovnaKancelaria ck = CestovnaKancelaria.vytvorInstanciuSingleton();

        ck.registraciaPouzivatela();
        ck.zoznamRegistrovanychPouzivatelov();

        ck.registraciaLetenky();
        ck.zoznamRegistrovanychLeteniek();*/
        ManazerUbytovania manazer1 = new ManazerUbytovania();
        manazer1.pridelenieUbytovania("Hotel Torysa", "Námestie slobody 1", 15, 7, 2,  200);
        manazer1.ukazPrideleneUbytovanie();
    }
}
