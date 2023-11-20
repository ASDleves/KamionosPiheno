package modell;

public class FaradtSofor extends Ember {
    private double faradekonysag;

    public FaradtSofor(String Neve) {
        super(Neve);
        faradekonysag = 0.5;
    }

    @Override
    public void pihenes() {
        double newKipihentseg = getFaradt() + 50;
        setKipihentseg((int) Math.min(newKipihentseg, 100));
    }

    @Override
    public void szuperPihenes() {
        setKipihentseg(100);
    }
}
