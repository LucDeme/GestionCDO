/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncdo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ldemessine
 */
public class greservation extends javax.swing.JInternalFrame {

    private void defaultTableModelstatic() {
        String requete;
        requete = "SELECT dateReservation, nomUtilisateur FROM `reservation` INNER join utilisateur on reservation.idUtilisateur=utilisateur.idUtilisateur";
        LoadDriver test = new LoadDriver(requete);
        DefaultTableModel model = (DefaultTableModel) jtblreservation.getModel();
        ArrayList tableau = test.renvoi();
        model.setRowCount(0);
        for (int i=0;i<tableau.size();i++){ 
            ArrayList dateres = (ArrayList) tableau.get(i);
            System.out.println(dateres);
            model.addRow(new Object[]{dateres.get(0), dateres.get(1), });  
        }

    }

    /**
     * Creates new form greservation
     */
    
    public greservation() {
        initComponents();
        String requete = "Select * from reservation";
        System.out.println(requete);
        LoadDriver test = new LoadDriver(requete);
        ArrayList tableau = test.renvoi();
        System.out.println(test.renvoi());// TODO add your handling code here:
        defaultTableModelstatic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblreservation = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jtblreservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "date", "nom", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblreservation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblreservation;
    // End of variables declaration//GEN-END:variables

}