package zadanie;

public class Letenka implements EvidenciaLetenky{
    private String cisloSedadla;
    private String trieda;
    private int cena;
    private String druh;
    private String miestoOdletu;
    private String miestoPriletu;
    private String datum;
    private int idLetenky;

    private Letenka(LetenkaBuilder builder) {
        this.cisloSedadla = builder.cisloSedadla;
        this.trieda = builder.trieda;
        this.cena = builder.cena;
        this.druh = builder.druh;
        this.miestoOdletu = builder.miestoOdletu;
        this.miestoPriletu = builder.miestoPriletu;
        this.datum = builder.datum;
        this.idLetenky = builder.idLetenky;
    }

    public String getCisloSedadla() {
        return cisloSedadla;
    }

    public void setCisloSedadla(String cisloSedadla) {
        this.cisloSedadla = cisloSedadla;
    }

    public String getTrieda() {
        return trieda;
    }

    public void setTrieda(String trieda) {
        this.trieda = trieda;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getMiestoOdletu() {
        return miestoOdletu;
    }

    public void setMiestoOdletu(String miestoOdletu) {
        this.miestoOdletu = miestoOdletu;
    }

    public String getMiestoPriletu() {
        return miestoPriletu;
    }

    public void setMiestoPriletu(String miestoPriletu) {
        this.miestoPriletu = miestoPriletu;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getIdLetenky() {
        return idLetenky;
    }

    public static class LetenkaBuilder {
        private String cisloSedadla;
        private String trieda;
        private int cena;
        private String druh;
        private String miestoOdletu;
        private String miestoPriletu;
        private String datum;
        private int idLetenky;

        //Kon3truktor, atribúty 'cisloSedadla' a 'trieda' sú povinné
        public LetenkaBuilder(String cisloSedadla, String trieda, int idLetenky) {
            if (cisloSedadla == null || trieda == null) {
                throw new IllegalArgumentException("Nie su zadane povinne atributy: cisloSedadla, trieda");
            }
            this.cisloSedadla = cisloSedadla;
            this.trieda = trieda;
            this.idLetenky = idLetenky;
        }

        public  LetenkaBuilder setCena(int cena) {
            this.cena = cena;
            return this;
        }

        public LetenkaBuilder setDruh(String druh) {
            this.druh = druh;
            return this;
        }

        public LetenkaBuilder setMiestoOdletu(String miestoOdletu) {
            this.miestoOdletu = miestoOdletu;
            return this;
        }

        public LetenkaBuilder setMiestoPriletu(String miestoPriletu) {
            this.miestoPriletu = miestoPriletu;
            return this;
        }

        public LetenkaBuilder setDatum(String datum) {
            this.datum = datum;
            return this;
        }

        public Letenka vytvor() {
            Letenka letenka = new Letenka(this);
            return letenka;
        }
    }
}