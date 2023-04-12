package zadanie;

import java.util.ArrayList;
import java.util.Scanner;

public class CestovnaKancelaria {
    private String nazov;
    private ArrayList<Pouzivatel> zoznamPouzivatelov = new ArrayList<Pouzivatel>();
    public CestovnaKancelaria(String nazov) {   /*|---KONŠTRUKTOR---|*/
        this.nazov = nazov;
    }

    public void registraciaPouzivatela() {      /*|---METÓDA---|*/
        System.out.print("Zadajte meno: ");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.print("Zadajte priezvisko: ");
        String surname = scanner.nextLine();

        System.out.print("Zadajte email: ");
        String email = scanner.nextLine();

        Pouzivatel pouzivatel = new Pouzivatel(username, surname, email);
        System.out.println("Používateľ " + pouzivatel.getMeno() + ' ' + pouzivatel.getPriezvisko() + " bol úspešne zaregistrovaný.");
        zoznamPouzivatelov.add(pouzivatel);
    }

    public void zoznamRegistrovanychPouzivatelov() {    /*|---METÓDA---|*/
        System.out.println("Zoznam používateľov je: ");
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            System.out.println(zoznamPouzivatelov.get(i).getMeno() + ' ' + zoznamPouzivatelov.get(i).getPriezvisko() +
                    ' ' + zoznamPouzivatelov.get(i).getEmail());
        }
    }
}