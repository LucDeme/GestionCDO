/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncdo;
/**
 *
 * @author pdubomessine
 */
public class GestionCDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String requete = "SELECT * FROM document";
        LoadDriver test = new LoadDriver(requete);
        test.renvoi();
        System.out.println(test.renvoi());
        //NewJFrame chevre = new NewJFrame();
        //chevre.setVisible(true);
        new Window();
        
    }
    
}