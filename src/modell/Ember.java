package modell;

public abstract class Ember {
    private String Neve;
    private int faradtsag;

    public Ember(String Neve) {
        this.Neve = Neve;
        faradtsag = 0;
    }

    public String getNeve() {
        return Neve;
    }

    public void setNeve(String Neve) {
        this.Neve = Neve;
    }

    public int getFaradt() {
        return faradtsag;
    }

    public void setFaradtsag(int faradtsag) {
        this.faradtsag = faradtsag;
    }

    @Override
    public String toString() {
        return "Ember{" + "Neve=" + Neve + ", faradtsag=" + faradtsag + '}';
    }

    public abstract void pihenes();
    public abstract void szuperPihenes();
    
}
