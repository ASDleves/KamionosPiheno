package modell;

public class Parkolo {
    private Ember[] emberek;
    private int parkoloDb;
    private enum UzemelesiAllapot { FELUJJIT, NYITVA };
    private UzemelesiAllapot allapot;

    public Parkolo(int db) {
        parkoloDb = 0;
        emberek = new Ember[db];
        allapot = UzemelesiAllapot.NYITVA;
    }

    public void bemegy(Ember ember) {
        if (allapot == UzemelesiAllapot.NYITVA) {
            if (parkoloDb < emberek.length) {
                emberek[parkoloDb++] = ember;
            } else {
                System.out.println("A parkolóban nincs szabad hely!");
            }
        } else {
            epites();
        }
    }

    public void pihenes() {
        if (allapot == UzemelesiAllapot.NYITVA) {
            for (Ember ember : emberek) {
                if (ember != null) {
                    ember.pihenes();
                }
            }
        } else {
            epites();
        }
    }

    public Ember kimegy(String Neve) {
        if (allapot == UzemelesiAllapot.NYITVA) {
            for (int i = 0; i < parkoloDb; i++) {
                if (emberek[i] != null && emberek[i].getNeve().equals(Neve)) {
                    Ember kimegyEmber = emberek[i];
                    emberek[i] = null;
                    return kimegyEmber;
                }
            }
            System.out.println("Nincs ilyen nevű sofőr a parkolóban!");
        } else {
            epites();
        }
        return null;
    }

    public Ember[] getParkolo() {
        return emberek;
    }

    private void epites() {
        if (allapot == UzemelesiAllapot.FELUJJIT) {
            System.out.println("A parkolót felújjítják!");
        }
    }
}
