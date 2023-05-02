package zadanie;

import java.util.ArrayList;

public class Destinacia {
    private String nazov;
    private String krajina;


    public Destinacia(String nazov, String krajina) throws DestinaciaException{
        if (!(this.nazov instanceof String)) {
            throw new DestinaciaException("Názov nebol zadaný ako reťazec.", this);
        }
        this.nazov = nazov;

        if (!(this.krajina instanceof String)) {
            throw new DestinaciaException("Krajina nebola zadaná ako reťazec.", this);
        }
        this.krajina = krajina;
    }
}