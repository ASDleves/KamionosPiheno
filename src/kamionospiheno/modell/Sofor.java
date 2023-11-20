package kamionospiheno.modell;
public abstract class Sofor {
    String nev;
    int faradtsagSzint;

    public Sofor(String nev) {
        this.nev = nev;
        this.faradtsagSzint = 0;
    }

    public String getNev() {
        return nev;
    }

    public int getFaradtsagSzint() {
        return faradtsagSzint;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setFaradtsagSzint(int faradtsagSzint) {
        this.faradtsagSzint = faradtsagSzint;
    }

    @Override
    public String toString() {
        return "Sofor{" + "nev=" + nev + ", faradtsagSzint=" + faradtsagSzint + '}';
    }
    
    
    
    
}
