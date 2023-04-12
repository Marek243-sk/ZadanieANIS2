package zadanie;

import java.util.ArrayList;
import java.util.Scanner;

public class CestovnaKancelaria {
    private String nazov;
    private ArrayList<Pouzivatel> zoznamPouzivatelov = new ArrayList<Pouzivatel>();
    public CestovnaKancelaria(String nazov) {
        this.nazov = nazov;
    }

    public void registraciaPouzivatela() {
        System.out.print("Zadajte meno: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.print("Zadajte email: ");
        String email = scanner.nextLine();

        Pouzivatel pouzivatel = new Pouzivatel(username, email);
        System.out.println("Používateľ " + pouzivatel.getMeno() + " bol úspešne zaregistrovaný.");
        zoznamPouzivatelov.add(pouzivatel);
    }

    public void zoznamRegistrovanychPouzivatelov() {
        System.out.println("Zoznam používateľov je: ");
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            System.out.println(zoznamPouzivatelov.get(i).getMeno() + ' ' + zoznamPouzivatelov.get(i).getEmail());
        }
    }
}
