package zadanie;

public class DestinaciaException extends Exception {

    protected  Destinacia destinacia;
    public DestinaciaException() {

    }

    public DestinaciaException(String sprava) {
        this(sprava, null);
    }

    public DestinaciaException(String sprava, Destinacia destinacia) {
        super(sprava);
        this.destinacia = destinacia;
    }
}
