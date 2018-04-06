/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncdo;

import gestioncdo.jInternalFrame2;
import java.awt.BorderLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author pdubois
 */
public class Window {
    
    
    public Window()
    {
            JFrame fenetreP = new JFrame();
            fenetreP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenetreP.setSize(900, 600);
            fenetreP.setLocationRelativeTo(null);
            fenetreP.setTitle("Gestion du Centre de Documentation");
            fenetreP.setDefaultLookAndFeelDecorated(true);
            fenetreP.setExtendedState(fenetreP.MAXIMIZED_BOTH);
            
            final JDesktopPane desktop = new JDesktopPane();
            fenetreP.add(desktop, BorderLayout.CENTER);
            fenetreP.setVisible(true);
            
            final JMenuBar menu = new JMenuBar();
  
                JMenu fichier = new JMenu("Fichier");
                JMenuItem repaint = new JMenuItem("Tout fermer");
                fichier.add(repaint);
                JMenuItem quitter = new JMenuItem("Quitter");
                fichier.add(quitter);
                
                JMenu journee = new JMenu("Journée");
                    JMenuItem nouveau = new JMenuItem("Nouveau");
                    journee.add(nouveau);
                    JMenuItem nouveau2 = new JMenuItem("reservation");
                    journee.add(nouveau2);
                    
                fenetreP.add(menu, BorderLayout.NORTH);
                menu.add(fichier);
                menu.add(journee);
                
                //Pour quitter l'application
                quitter.addActionListener((ActionEvent e) -> {
                System.exit(0);
                });
                
                nouveau.addActionListener((ActionEvent e) -> {
                    JInternalFrame[] tab = desktop.getAllFrames();
                    if(Arrays.toString(tab).indexOf("ajouter document")==-1){
                        jInternalFrame2 panneau = new jInternalFrame2();
                        desktop.add(panneau);
                        panneau.setVisible(true);
                    }
                });
                
                nouveau2.addActionListener((ActionEvent e) -> {
                    JInternalFrame[] tab = desktop.getAllFrames();
                    if(Arrays.toString(tab).indexOf("reservation")==-1){
                        greservation panneau = new greservation();
                        desktop.add(panneau);
                        panneau.setVisible(true);
                    }
                });
                
                //Pour fermer toutes les fenetres inetrnes
                repaint.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                });
                
            jInternalFrame2 panneau = new jInternalFrame2();
            desktop.add(panneau);
            panneau.setVisible(true);
            
               
    }
     
}