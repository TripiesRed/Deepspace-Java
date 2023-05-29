/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import deepspace.LootToUI;
/**
 *
 * @author diegoos_03
 */
public class LootView extends javax.swing.JPanel {

    /**
     * Creates new form LootView
     */
    public LootView() {
        initComponents();
        
        /*
        Armas.setText("Armas: " + Integer.toString(l.getnWeapons()));
        Escudos.setText("Escudos: " + Integer.toString(l.getnShields()));
        Hangar.setText("Tamaño del Hangar: " + Integer.toString(l.getnHangars()));
        Combustible.setText("Combustible: " + Integer.toString(l.getnSupplies()));
        Medallas.setText("Medallas: " + Integer.toString(l.getnMedals()));
        
        if(l.isSpaceCity()){
            Ciudad_Esp.setText("Ciudad Espacial: " + "Sí");
        }
        else{
            Ciudad_Esp.setText("Ciudad Espacial: " + "No");
        }
        
        if(l.isGetEfficient()){
            Est_Efi.setText("Estación Eficiente: " + "Sí");
        }
        else{
            Est_Efi.setText("Estación Eficiente: " + "No");
        }
        */
    }
    
    public void setLootView(LootToUI l){
        
        Armas.setText("Armas: " + Integer.toString(l.getnWeapons()));
        Escudos.setText("Escudos: " + Integer.toString(l.getnShields()));
        Hangar.setText("Tamaño del Hangar: " + Integer.toString(l.getnHangars()));
        Combustible.setText("Combustible: " + Integer.toString(l.getnSupplies()));
        Medallas.setText("Medallas: " + Integer.toString(l.getnMedals()));
        
        if(l.isSpaceCity()){
            Ciudad_Esp.setText("Ciudad Espacial: " + "Sí");
        }
        else{
            Ciudad_Esp.setText("Ciudad Espacial: " + "No");
        }
        
        if(l.isGetEfficient()){
            Est_Efi.setText("Estación Eficiente: " + "Sí");
        }
        else{
            Est_Efi.setText("Estación Eficiente: " + "No");
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

        Armas = new javax.swing.JLabel();
        Escudos = new javax.swing.JLabel();
        Hangar = new javax.swing.JLabel();
        Combustible = new javax.swing.JLabel();
        Medallas = new javax.swing.JLabel();
        Ciudad_Esp = new javax.swing.JLabel();
        Est_Efi = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Botín"));

        Armas.setText("Armas:");

        Escudos.setText("Escudos:");

        Hangar.setText("Tamaño del hangar:");

        Combustible.setText("Combustible:");

        Medallas.setText("Medallas:");

        Ciudad_Esp.setText("Ciudad Espacial:");

        Est_Efi.setText("Estación Eficiente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Armas)
                    .addComponent(Hangar)
                    .addComponent(Escudos)
                    .addComponent(Ciudad_Esp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combustible)
                    .addComponent(Medallas)
                    .addComponent(Est_Efi))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Armas)
                    .addComponent(Combustible))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Escudos)
                    .addComponent(Medallas))
                .addGap(18, 18, 18)
                .addComponent(Hangar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudad_Esp)
                    .addComponent(Est_Efi))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Armas;
    private javax.swing.JLabel Ciudad_Esp;
    private javax.swing.JLabel Combustible;
    private javax.swing.JLabel Escudos;
    private javax.swing.JLabel Est_Efi;
    private javax.swing.JLabel Hangar;
    private javax.swing.JLabel Medallas;
    // End of variables declaration//GEN-END:variables
}
