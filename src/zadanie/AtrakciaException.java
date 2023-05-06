package zadanie;

public class AtrakciaException extends Exception {

    protected Atrakcia atrakcia;
    public AtrakciaException() {

    }
    public AtrakciaException(String sprava) {
        this(sprava, null);
    }

    public AtrakciaException(String sprava, Atrakcia atrakcia) {
        super(sprava);
        this.atrakcia = atrakcia;
    }
}
