/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import deepspace.ShieldToUI;
/**
 *
 * @author diegoos_03
 */
public class ShieldView extends javax.swing.JPanel {

    /**
     * Creates new form ShieldView
     */
    public ShieldView() {
        initComponents();
    }
    
    public void setShieldView(ShieldToUI s){
        
        Potencia.setText("Potencia: " + Float.toString(s.getBoost()));
        Usos.setText("Usos: " + Integer.toString(s.getUses()));
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

        Potencia = new javax.swing.JLabel();
        Usos = new javax.swing.JLabel();

        Potencia.setText("Potencia:");

        Usos.setText("Usos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usos)
                    .addComponent(Potencia))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Potencia)
                .addGap(18, 18, 18)
                .addComponent(Usos)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Potencia;
    private javax.swing.JLabel Usos;
    // End of variables declaration//GEN-END:variables
}