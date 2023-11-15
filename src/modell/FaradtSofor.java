package modell;

public class FaradtSofor extends Ember{
    private double faradekonysag;

    public FaradtSofor(String Neve) {
        super(Neve);
        faradekonysag = 0.5;
    }

    public double getFaradekony() {
        return faradekonysag;
    }

    public void setFaradekonysag(double faradekonysag) {
        this.faradekonysag = faradekonysag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "FaradtSofor{" + "faradekonysag=" + faradekonysag + '}';
    }

    @Override
    public void pihenes() {
    faradekonysag = 0.5;
    }

    @Override
    public void szuperPihenes() {
        faradekonysag = 1;
    }

    
}
