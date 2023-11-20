package main;

import modell.Ember;
import modell.FaradtSofor;
import modell.Parkolo;
import modell.Sofor;


public class PihenoProgram {

    private Parkolo parkolo;

    public static void main(String[] args) {
        new PihenoProgram();
    }
    
    public PihenoProgram() {
        parkolo = new Parkolo(4);
        parkolo.bemegy(new Sofor("Pista"));
        parkolo.bemegy(new FaradtSofor("János"));

        
        System.out.println("--- sofor pihenés előtt:");
        parkoloEmberek();
        System.out.println("--- sofor 1 pihenés után");
        parkolo.pihenes();
        parkoloEmberek();

        
    }
    
    private void parkoloEmberek() {
        for (Ember ember : parkolo.getParkolo()) {
            if(ember != null){
                System.out.println(ember);
            }
        }
    }

}