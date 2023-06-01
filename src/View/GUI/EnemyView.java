/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import deepspace.EnemyToUI;
/**
 *
 * @author diegoos_03
 */
public class EnemyView extends javax.swing.JPanel {

    private LootView loot_view;
    private DamageView damage_view;
    /**
     * Creates new form EnemyView
     */
    public EnemyView() {
        initComponents();
        
        loot_view = new LootView();
        add(loot_view);
        
        damage_view = new DamageView();
        add(damage_view);
    }
    
    public void setEnemyView(EnemyToUI e){
        
        Enemigo.setText("Enemigo: " + e.getName());
        Potencia_fuego.setText("Potencia de fuego: " + Float.toString(e.getAmmoPower()));
        Potencia_escudo.setText("Potencia de defensa: " + Float.toString(e.getShieldPower()));
        
        loot_view.setLootView(e.getLoot());
        damage_view.setDamageView(e.getDamage());
        
        Botín.add(loot_view);
        Daño.add(damage_view);
        
        repaint();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enemigo = new javax.swing.JLabel();
        Potencia_fuego = new javax.swing.JLabel();
        Potencia_escudo = new javax.swing.JLabel();
        Botín = new javax.swing.JPanel();
        Daño = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(470, 450));

        Enemigo.setText("Enemigo:");

        Potencia_fuego.setText("Potencia de fuego:");

        Potencia_escudo.setText("Potencia de defensa:");

        Botín.setPreferredSize(new java.awt.Dimension(440, 192));

        Daño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Castigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15))); // NOI18N
        Daño.setPreferredSize(new java.awt.Dimension(390, 100));
        Daño.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Potencia_escudo)
                            .addComponent(Potencia_fuego)
                            .addComponent(Enemigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Botín, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Daño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Enemigo)
                .addGap(18, 18, 18)
                .addComponent(Potencia_fuego)
                .addGap(18, 18, 18)
                .addComponent(Potencia_escudo)
                .addGap(24, 24, 24)
                .addComponent(Botín, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Daño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botín;
    private javax.swing.JPanel Daño;
    private javax.swing.JLabel Enemigo;
    private javax.swing.JLabel Potencia_escudo;
    private javax.swing.JLabel Potencia_fuego;
    // End of variables declaration//GEN-END:variables
}
