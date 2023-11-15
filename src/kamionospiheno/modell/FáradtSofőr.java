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
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
