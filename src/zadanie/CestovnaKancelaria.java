package zadanie;

import java.util.ArrayList;
import java.util.Scanner;

public class CestovnaKancelaria {
    private static CestovnaKancelaria instancia = new CestovnaKancelaria("Cestovná kancelaria");
    private String nazov;
    private ArrayList<Pouzivatel> zoznamPouzivatelov = new ArrayList<Pouzivatel>();
    private ArrayList<Pobyt> zoznamPobytov = new ArrayList<Pobyt>();
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

        System.out.print("Zadajte telefónne číslo: ");
        String telefonneCislo = scanner.nextLine();

        System.out.print("Zadajte vek: ");
        int vek = Integer.parseInt(scanner.nextLine());

        // AK JE UŽ POUŽÍVATEĽ ZAREGISTROVANÝ
        boolean pouzivatelExistuje = false;
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            if (zoznamPouzivatelov.get(i).getEmail() == email) {
                pouzivatelExistuje = true;
                break;
            }
        }
        if (pouzivatelExistuje) {
            System.out.println("CHYBA: Používateľ už je zaregistrovaný.");
        } else { //AK POUŽÍVATEĽ EŠTE NIE JE ZAREGISTROVANÝ
            Pouzivatel pouzivatel = new Pouzivatel.PouzivatelBuilder(email).setMeno(meno).setTelefonneCislo(telefonneCislo).setVek(vek).vytvor();
            System.out.println("Používateľ " + pouzivatel.getMeno() + " s tel.č.: " + pouzivatel.getTelefonneCislo()
                    + " a vekom: " + pouzivatel.getVek() + " bol úspešne zaregistrovaný.");
            zoznamPouzivatelov.add(pouzivatel);
        }
    }

    public void odstranitPouzivatela(String email) {
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            if (zoznamPouzivatelov.get(i).getEmail() == email) {
                zoznamPouzivatelov.remove(i);
                break;
            }
        }
    }

    public void zmenitEmail(String email, String novyEmail) {
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            if (zoznamPouzivatelov.get(i).getEmail() == email) {
                boolean novyEmailExistuje = false;
                for (int j = 0; j < zoznamPouzivatelov.size(); j++) {
                    if(zoznamPouzivatelov.get(j).getEmail() == novyEmail) {
                        novyEmailExistuje = true;
                        break;
                    }
                }
                if (!novyEmailExistuje) {
                    zoznamPouzivatelov.get(i).setEmail(novyEmail);
                }
            }
        }
    }

    public void zoznamRegistrovanychPouzivatelov() {
        System.out.println("Zoznam používateľov je: ");
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            System.out.println(zoznamPouzivatelov.get(i).getMeno() + ", " + zoznamPouzivatelov.get(i).getEmail() + ", " + zoznamPouzivatelov.get(i).getTelefonneCislo()
            + ", " + zoznamPouzivatelov.get(i).getVek());
        }
    }
    //VRÁTI POUŽÍVATEĽA NA ZÁKLADE EMAILU
    public Pouzivatel getPouzivatel(String email) {
        for (int i = 0; i < zoznamPouzivatelov.size(); i++) {
            if (zoznamPouzivatelov.get(i).getEmail() == email) {
                return zoznamPouzivatelov.get(i);
            }
        }
        return null;
    }

    public void registraciaLetenky() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo sedadla: ");
        String cisloSedadla = scanner.nextLine();

        System.out.print("Zadajte triedu: ");
        String trieda = scanner.nextLine();

        System.out.print("Zadajte cenu: ");
        int cena = Integer.parseInt(scanner.nextLine());

        System.out.print("Zadajte druh: ");
        String druh = scanner.nextLine();

        System.out.print("Zadajte miesto odletu: ");
        String miestoOdletu = scanner.nextLine();

        System.out.print("Zadajte miesto príletu: ");
        String miestoPriletu = scanner.nextLine();

        System.out.print("Zadajte dátum: ");
        String datum = scanner.nextLine();

        System.out.print("Zadaj id letenky: ");
        String idLetenky = scanner.nextLine();

        Letenka letenka = new Letenka.LetenkaBuilder(cisloSedadla, trieda, Integer.parseInt(idLetenky)).setCena(cena).setDruh(druh)
                .setMiestoOdletu(miestoOdletu).setMiestoPriletu(miestoPriletu).setDatum(datum).vytvor();
        System.out.println("Letenka s číslom sedadla: " + letenka.getCisloSedadla() + " ,triedou: " + letenka.getTrieda()
        + " , cenou: " + letenka.getCena() + "€, druh: " + letenka.getDruh() + " ,miestom odletu: " + letenka.getMiestoOdletu()
        + " ,miestom príletu: " + letenka.getMiestoPriletu() + " ,dátumom: " + letenka.getDatum() + " bola úspešne zaregistrovaná.");
                zoznamLeteniek.add(letenka);
    }

    public Letenka getLetenka(int id) {
        for (int i = 0; i < zoznamLeteniek.size(); i++) {
            if (zoznamLeteniek.get(i).getIdLetenky() == id) {
                return this.zoznamLeteniek.get(i);
            }
        }
        return null;
    }

    public void zoznamRegistrovanychLeteniek() {
        System.out.println("Zoznam leteniek je: ");
        for (int i = 0; i < zoznamLeteniek.size(); i++) {
            System.out.println(zoznamLeteniek.get(i).getCisloSedadla()+ ", " + zoznamLeteniek.get(i).getTrieda()
                    + ", " + zoznamLeteniek.get(i).getCena() + "€, " + zoznamLeteniek.get(i).getDruh() + ", " +
                    zoznamLeteniek.get(i).getMiestoOdletu() + ", " + zoznamLeteniek.get(i).getMiestoPriletu() + ", " +
                    zoznamLeteniek.get(i).getDatum());
        }
    }
}