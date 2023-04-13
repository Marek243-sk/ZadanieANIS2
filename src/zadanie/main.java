package zadanie;

public class main {
    public static void main(String[] args) {
        System.out.println("Vytajte v našej cestovnej kancelárii ...");

        CestovnaKancelaria ck = CestovnaKancelaria.vytvorInstanciuSingleton();
        ck.registraciaPouzivatela();
        ck.zoznamRegistrovanychPouzivatelov();
    }
}