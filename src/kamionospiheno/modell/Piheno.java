/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kamionospiheno.modell;

/**
 *
 * @author voros.dominik
 */
public class Piheno {

    /**
     *
     */
    public Emberek soforok[];
    public int ferohely;
    public int elfolalt = 0;

    public Piheno(int ferohely) {

        Emberek[] soforok = new Emberek[ferohely];
        this.soforok = soforok;
    }

    public Piheno() {
        this(5);
    }

    public void befogad(Emberek sofor) {
        if (soforok.length > elfolalt) {

            soforok[elfolalt] = sofor;

            System.out.println(soforok[elfolalt].getNev() + " leparkolt");
            elfolalt++;
        } else {
            System.out.println("A parkoló megtelt");
        }
    }
    public void pihenes(){
        for (int i = 0; i < soforok.length; i++) {
            soforok[i].setKipihentseg(100);
            System.out.println(soforok[i].getNev() +"kiphentsége= " + soforok[i].getKipihentseg());
            
            }
            
        }
    
    
    
    
    
    }

}
