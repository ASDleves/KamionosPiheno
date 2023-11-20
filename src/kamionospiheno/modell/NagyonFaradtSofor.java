package kamionospiheno.modell;
public class NagyonFaradtSofor extends Sofor{
    private int faradtsagiSzint;
    public NagyonFaradtSofor(String nev) {
        super(nev);
        faradtsagiSzint = 0;
    }
    
    public void PihenesAltaliToltottseg(){
        faradtsagiSzint *= 0.5;
    }

    public int getFaradtsagiSzint() {
        return faradtsagiSzint;
    }
    
}
