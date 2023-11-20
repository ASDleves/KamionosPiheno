package modell;

public abstract class Ember {
    private String Neve;
    private int kipihentseg;

    public Ember(String Neve) {
        this.Neve = Neve;
        kipihentseg = 0;
    }

    public String getNeve() {
        return Neve;
    }

    public void setNeve(String Neve) {
        this.Neve = Neve;
    }

    public int getFaradt() {
        return kipihentseg;
    }

    public void setKipihentseg(int kipihentseg) {
        this.kipihentseg = kipihentseg;
    }

    @Override
    public String toString() {
        return "Ember{" + "Neve=" + Neve + ", kipihentség=" + kipihentseg + '}';
    }

    public abstract void pihenes();
    public abstract void szuperPihenes();
    
}