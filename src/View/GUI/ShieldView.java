/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import deepspace.ShieldToUI;
import java.awt.Color;
/**
 *
 * @author diegoos_03
 */
public class ShieldView extends javax.swing.JPanel {
    
    private boolean selected = false;
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
    
    public boolean isSelected(){ return selected; }

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

        setBackground(java.awt.Color.lightGray);
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(120, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        Potencia.setText("Potencia:");

        Usos.setText("Usos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usos)
                    .addComponent(Potencia))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Potencia)
                .addGap(18, 18, 18)
                .addComponent(Usos)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        selected = !selected;
        setBackground (Color.WHITE);
        repaint();
        revalidate();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Potencia;
    private javax.swing.JLabel Usos;
    // End of variables declaration//GEN-END:variables
}
