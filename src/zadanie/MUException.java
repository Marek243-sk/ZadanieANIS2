package zadanie;

public class MUException extends Exception {
    protected Ubytovanie ubytovanie;

    public MUException() {

    }
    public MUException(String sprava) {
        this(sprava, null);
    }
    public MUException(String sprava, Ubytovanie ubytovanie) {
        super(sprava);
        this.ubytovanie = ubytovanie;
    }
}
