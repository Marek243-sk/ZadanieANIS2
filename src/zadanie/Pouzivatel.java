package zadanie;

public class Pouzivatel {
    private String meno;
    private String priezvisko;
    private String email;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public Pouzivatel(String meno, String priezvisko, String email) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.email = email;
    }
}