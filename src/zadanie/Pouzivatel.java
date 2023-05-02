package zadanie;

import java.util.ArrayList;

public class Pouzivatel implements EvidenciaPouzivatela{
    private String meno;
    private String email;
    private String telefonneCislo;
    private int vek;
    private ArrayList<Letenka> zoznamLeteniek = new ArrayList<Letenka>();

    public Pouzivatel(PouzivatelBuilder builder) {
        this.meno = builder.meno;
        this.email = builder.email;
        this.telefonneCislo = builder.telefonneCislo;
        this.vek = builder.vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonneCislo() {
        return this.telefonneCislo;
    }

    public void setTelefonneCislo(String telefonneCislo) {
        this.telefonneCislo = telefonneCislo;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public ArrayList<Letenka> getZoznamLeteniek() {
        return this.zoznamLeteniek;
    }
    public void pridajLetenku(Letenka letenka) {
        this.zoznamLeteniek.add(letenka);
    }

    public static class PouzivatelBuilder {
        private String meno;
        private String email;
        private String telefonneCislo;
        private int vek;

        public PouzivatelBuilder(String email) {    /*musi byt email*/
            this.email = email;
        }

        public PouzivatelBuilder setMeno(String meno) {
            this.meno = meno;
            return this;
        }

        public PouzivatelBuilder setTelefonneCislo(String telefonneCislo) {
            this.telefonneCislo = telefonneCislo;
            return this;
        }

        public PouzivatelBuilder setVek(int vek) {
            this.vek = vek;
            return this;
        }

        public Pouzivatel vytvor() {
            Pouzivatel pouzivatel = new Pouzivatel(this);
            return pouzivatel;
        }
    }
}