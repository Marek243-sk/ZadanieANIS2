package zadanie;

public class main {
    public static void main(String[] args) {
        System.out.println("Vytajte v: Cestovná kancelária");

        CestovnaKancelaria ck = CestovnaKancelaria.vytvorInstanciuSingleton();

        ck.registraciaPouzivatela();
        ck.zoznamRegistrovanychPouzivatelov();

        ck.registraciaLetenky();
        ck.zoznamRegistrovanychLeteniek();
    }
}