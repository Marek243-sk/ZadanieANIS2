package zadanie;

public class CKException extends Exception{

    protected CestovnaKancelaria ck;
    public CKException() {

    }
    public CKException(String sprava) {
        this(sprava, null);
    }
    public CKException(String sprava, CestovnaKancelaria ck) {
        super(sprava);
        this.ck = ck;
    }
}
