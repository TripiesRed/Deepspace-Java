/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import deepspace.DamageToUI;
/**
 *
 * @author diegoos_03
 */
public class DamageView extends javax.swing.JPanel {

    /**
     * Creates new form DamageView
     */
    public DamageView() {
        initComponents();
        /*
        Escudos.setText("Escudos: " + Integer.toString(d.getNShields()));
        Armas.setText("Armas: " + d.getWeaponInfo());
        */
    }

    public void setDamageView(DamageToUI d){
        
        if(d != null){
            Escudos.setText("Escudos: " + Integer.toString(d.getNShields()));
            Armas.setText("Armas: " + d.getWeaponInfo());
        }
        
        else{
            Escudos.setText("Escudos: 0");
            Armas.setText("Armas: 0");
        }
        
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

        Escudos = new javax.swing.JLabel();
        Armas = new javax.swing.JLabel();

        Escudos.setText("Escudos: ");

        Armas.setText("Armas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Armas)
                    .addComponent(Escudos))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Escudos)
                .addGap(18, 18, 18)
                .addComponent(Armas)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Armas;
    private javax.swing.JLabel Escudos;
    // End of variables declaration//GEN-END:variables
}
