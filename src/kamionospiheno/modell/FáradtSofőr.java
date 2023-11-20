/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kamionospiheno.modell;

/**
 *
 * @author VörösDominik(SZF_202
 */

public class FáradtSofőr extends Emberek{
            static int oszto;
    public FáradtSofőr(int kipihentseg, String nev) {
        super(kipihentseg, nev);
    }

    public static int getOszto() {
        return oszto;
    }
    
            @Override
      public void setKipihentseg(int kipihentseg) {
         int  fáradtpihenes=this.getKipihentseg()+kipihentseg/2;
        if (fáradtpihenes>100) {
            fáradtpihenes=100;
        } else if(fáradtpihenes<0){
        fáradtpihenes=0;
        }
        
       
        this.kipihentseg = fáradtpihenes;
    }
   
    

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
