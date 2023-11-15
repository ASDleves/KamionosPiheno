package modell;


public class Parkolo {
    private Ember[] ember;
    private int parkoloDb;
    
    private enum UzemelesiAllapot {FELUJJIT, NYITVA};
    private UzemelesiAllapot allapot;

    public Parkolo() {
        this(5);
    }

    public Parkolo(int db) {
        parkoloDb = 0;
        ember = new Ember[db];
        allapot = UzemelesiAllapot.NYITVA;
    }

    public void felujjit(){
        allapot = UzemelesiAllapot.FELUJJIT;
    }

    public UzemelesiAllapot getUzemel(){
        return allapot;
    }
    
    public boolean isNYITVA(){
        return allapot == UzemelesiAllapot.NYITVA;
    }

    
}
