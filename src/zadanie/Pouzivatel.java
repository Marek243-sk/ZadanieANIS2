package zadanie;

public class Pouzivatel {
    private String meno;
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

    public Pouzivatel(String meno, String email) {
        this.meno = meno;
        this.email = email;
    }
}