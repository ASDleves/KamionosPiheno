/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kamionospiheno;

import kamionospiheno.modell.Emberek;
import kamionospiheno.modell.FáradtSofőr;
import kamionospiheno.modell.Sofor;

/**
 *
 * @author voros.dominik
 */
public class Kamionospiheno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emberek sf=new Sofor(10, "pista");
        Emberek fsf=new FáradtSofőr(10, "gábor");
        System.out.println(sf);
                
    }
    
}
