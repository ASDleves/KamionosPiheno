package kamionospiheno.modell;

public class Sofor extends Emberek {

    public Sofor(int kipihentseg, String nev) {
        super(kipihentseg, nev);
    }
    
    

    @Override
    public String toString() {
        return "Sofor{" + "kipihentseg=" + getKipihentseg() + ", nev=" + getNev() + '}';
    }
}