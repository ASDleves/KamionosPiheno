/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kamionospiheno;

import kamionospiheno.modell.Emberek;
import kamionospiheno.modell.FáradtSofőr;
import kamionospiheno.modell.Piheno;
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
        Emberek sf1 = new Sofor(10, "pista");
        Emberek fsf2 = new FáradtSofőr(10, "gábor");
        Emberek fsf3 = new FáradtSofőr(10, "gábor");
        Emberek fsf4 = new FáradtSofőr(10, "gábor");
        Emberek fsf5 = new FáradtSofőr(10, "gábor");
        Emberek fsf6 = new FáradtSofőr(10, "gábor");

        Piheno P = new Piheno();
        P.befogad(sf1);
        P.befogad(fsf2);
        P.befogad(fsf3);
        P.befogad(fsf4);
        P.befogad(fsf5);
        P.befogad(fsf6);
        P.befogad(fsf6);
        P.pihenes();
        System.out.println("");
        P.pihenes();
        
     
        

    }

}
