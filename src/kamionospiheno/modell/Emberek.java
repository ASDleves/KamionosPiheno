/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kamionospiheno.modell;

/**
 *
 * @author VörösDominik(SZF_202
private int kipihentseg */
public abstract class Emberek {
    int kipihentseg;
    private String nev;

    public Emberek(int kipihentseg, String nev) {
        setKipihentseg(kipihentseg);
        this.nev = nev;
      
    }
   
    public int getKipihentseg() {
        return kipihentseg;
    }

    public void setKipihentseg(int kipihentseg) {
        if (kipihentseg<0) {
            kipihentseg=100;
        }
        else if(kipihentseg<100){
        kipihentseg=100;
        }
        this.kipihentseg = kipihentseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public  abstract String toString();
    
    
    
    
    
    
}
