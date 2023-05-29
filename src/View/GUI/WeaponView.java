/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;

import deepspace.WeaponToUI;
/**
 *
 * @author diegoos_03
 */
public class WeaponView extends javax.swing.JPanel {

    /**
     * Creates new form WeaponView
     */
    public WeaponView() {
        initComponents(); 
        
        /*
        Tipo.setText("Tipo: " + w.getType().toString());
        Potencia.setText("Potencia: " + Float.toString(w.getPower()));
        Usos.setText("Usos: " + Integer.toString(w.getUses()));
        */
    }
    
    public void setWeaponView(WeaponToUI w){
        
        Tipo.setText("Tipo: " + w.getType().toString());
        Potencia.setText("Potencia: " + Float.toString(w.getPower()));
        Usos.setText("Usos: " + Integer.toString(w.getUses()));
        repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipo = new javax.swing.JLabel();
        Potencia = new javax.swing.JLabel();
        Usos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setMaximumSize(new java.awt.Dimension(200, 103));

        Tipo.setText("Tipo:");

        Potencia.setText("Potencia:");

        Usos.setText("Usos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usos)
                    .addComponent(Potencia)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tipo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(Potencia)
                .addGap(18, 18, 18)
                .addComponent(Usos)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Potencia;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Usos;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
