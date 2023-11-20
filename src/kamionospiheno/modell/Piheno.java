package kamionospiheno.modell;

public class Piheno {

    
    private enum PihenoAllapot {UZEMEL, BOVITES_ALATT};
    private PihenoAllapot allapot;
    private Sofor soforok[];
    private int soforokSzama;

    public Piheno() {
        this(5);
    }
    
    public Piheno(int foglaltak) {
        allapot = PihenoAllapot.UZEMEL;
        soforokSzama = 0;
        soforok = new Sofor[foglaltak];
    }
    
    public void Behajt(Sofor sofor){
        if(allapot == PihenoAllapot.UZEMEL){
            if(soforokSzama < soforok.length){
                soforok[soforokSzama] = sofor;
            }
            if(soforokSzama >= soforok.length){
                System.out.println("A parkoló megtelt!");
            }
        }
        else{
            uzemenKivul();
        }
    }
    
    public void Pihenes(){
        if(allapot == PihenoAllapot.UZEMEL){
            for (Sofor sofor : soforok){
                sofor.setFaradtsagSzint(100);
                System.out.printf("Pihenő sofőr neve: %s, Pihenő sofőr pihentségi szintje: %d", sofor.getNev(), sofor.getFaradtsagSzint());
            }
        }
    }
    
    public void Felujitas(){
        allapot = PihenoAllapot.BOVITES_ALATT;
    }
    
    public void FelujitasVege(){
        allapot = PihenoAllapot.UZEMEL;
    }
    
    private void uzemenKivul() {
        if(allapot == PihenoAllapot.BOVITES_ALATT){
            System.out.println("A parkolóba nem lehetséges a behajtás!");
        }
    }
}
