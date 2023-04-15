package zadanie;

import java.util.ArrayList;
import java.util.Scanner;

public class CestovnaKancelaria {
    private static CestovnaKancelaria instancia = new CestovnaKancelaria("Super kancelaria");
    private String nazov;
    private ArrayList<Pouzivatel> zoznamPouzivatelov = new ArrayList<Pouzivatel>();
    private ArrayList<Letenka> zoznamLeteniek = new ArrayList<Letenka>();
    private CestovnaKancelaria(String nazov) {
        this.nazov = nazov;
    }

    public static CestovnaKancelaria vytvorInstanciuSingleton() {
        return instancia;
    }

    public void registraciaPouzivatela() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte meno: ");
        String meno = scanner.nextLine();

        System.out.print("Zadajte email: ");
        String email = scanner.nextLine();

        System.out.println("Zadajte telefónne číslo: ");
        String telefonneCislo = scanner.nextLine();

        System.out.println("Zadajte vek: ");
        int vek = Integer.parseInt(scanner.nextLine());

        Pouzivatel pouzivatel = new Pouzivatel.PouzivatelBuilder(email).setMeno(meno).setTelefonneCislo(telefonneCislo).setVek(vek).vytvor();
        System.out.println("Používateľ " + pouzivatel.getMeno() + "s tel.č.:" + pouzivatel.getTelefonneCislo()
                + "a vekom: " + pouzivatel.getVek() + " bol úspešne zaregistrovaný.");
        zoznamPouzivatelov.add(pouzivatel);
    }

    public void zoznamRegistrovanychPouzivatelov() {
        System.out.println("Zoznam používateľov je: ");
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            System.out.println(zoznamPouzivatelov.get(i).getMeno() + ' ' + zoznamPouzivatelov.get(i).getEmail());
        }
    }

    public void registraciaLetenky() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo sedadla: ");
        String cisloSedadla = scanner.nextLine();

        System.out.println("Zadajte tiredu: ");
        String trieda = scanner.nextLine();

        Letenka letenka = new Letenka.LetenkaBuilder(cisloSedadla, trieda).setCena(100).setDruh("spiatočná")
                .setMiestoOdletu("Košice").setMiestoPriletu("Praha").setDatum("3.5.2023").vytvor();
                zoznamLeteniek.add(letenka);
    }

    public void zoznamRegistrovanychLeteniek() {
        System.out.println("Zoznam leteniek je: ");
        for (int i = 0; i < zoznamLeteniek.size(); i++) {
            System.out.println(zoznamLeteniek.get(i).getCisloSedadla()+ " " + zoznamLeteniek.get(i).getTrieda()
                    + " " + zoznamLeteniek.get(i).getCena() + " " + zoznamLeteniek.get(i).getDruh() + " " +
                    zoznamLeteniek.get(i).getMiestoOdletu() + " " + zoznamLeteniek.get(i).getMiestoPriletu() + " " +
                    zoznamLeteniek.get(i).getDatum());
        }
    }

}