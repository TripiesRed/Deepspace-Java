/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.GUI;
import controller.Controller;
import deepspace.SpaceStationToUI;
import java.util.ArrayList;

/**
 *
 * @author diegoos_03
 */
public class SpaceStationView extends javax.swing.JPanel {
    
    private WeaponsView weapons_view;
    private ShieldsView shields_view;
    private HangarView hangar_view;
    private DamageView damage_view;
    /**
     * Creates new form SpaceStationView
     */
    public SpaceStationView() {
        initComponents();
        
        damage_view = new DamageView();
        add(damage_view);
        
        weapons_view = new WeaponsView();
        add(weapons_view);
        
        shields_view = new ShieldsView();
        add(shields_view);
        
        hangar_view = new HangarView();
        add(hangar_view);
    }
    
    public void setSpaceStationView(SpaceStationToUI s){
        
        Titulo.setText(s.getName());
        Ataque.setText("Potencia de ataque: " + Float.toString(s.getAmmoPower()));
        Defensa.setText("Potencia de defensa: " + Float.toString(s.getShieldPower()));
        Combustible.setText("Nivel de combustible: " + Float.toString(s.getFuelUnits()));
        Medallas.setText("Medallas: " + Integer.toString(s.getnMedals()));
        
        damage_view.setDamageView(s.getPendingDamage());
        weapons_view.setWeaponsView(s.getWeapons());
        shields_view.setShieldsView(s.getShieldBoosters());
        hangar_view.setHangarView(s.getHangar());
        
        Hangar.add(hangar_view);
        Defensas.add(shields_view);
        Armas.add(weapons_view);
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

        Titulo = new javax.swing.JLabel();
        Ataque = new javax.swing.JLabel();
        Defensa = new javax.swing.JLabel();
        Combustible = new javax.swing.JLabel();
        Medallas = new javax.swing.JLabel();
        Daño = new javax.swing.JPanel();
        Armas = new javax.swing.JPanel();
        Defensas = new javax.swing.JPanel();
        Hangar = new javax.swing.JPanel();
        Equipar = new javax.swing.JButton();
        Descartar = new javax.swing.JButton();
        DescartarHangar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(650, 800));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Rasa SemiBold", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("ESTACIÓN");
        Titulo.setAlignmentY(0.0F);
        Titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 1, true));
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Ataque.setText("Potencia de ataque:");

        Defensa.setText("Potencia de defensa:");

        Combustible.setText("Nivel de combustible:");

        Medallas.setText("Medallas:");

        Daño.setBorder(javax.swing.BorderFactory.createTitledBorder("Castigo Pendiente"));
        Daño.setPreferredSize(new java.awt.Dimension(320, 135));
        Daño.setLayout(new java.awt.BorderLayout());

        Armas.setName(""); // NOI18N
        Armas.setPreferredSize(new java.awt.Dimension(600, 120));

        Defensas.setPreferredSize(new java.awt.Dimension(600, 120));

        Hangar.setPreferredSize(new java.awt.Dimension(600, 320));

        Equipar.setBackground(new java.awt.Color(51, 153, 255));
        Equipar.setForeground(new java.awt.Color(255, 255, 255));
        Equipar.setText("Equipar");
        Equipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquiparActionPerformed(evt);
            }
        });

        Descartar.setBackground(new java.awt.Color(51, 153, 255));
        Descartar.setForeground(new java.awt.Color(255, 255, 255));
        Descartar.setText("Descartar");
        Descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescartarActionPerformed(evt);
            }
        });

        DescartarHangar.setBackground(new java.awt.Color(51, 153, 255));
        DescartarHangar.setForeground(new java.awt.Color(255, 255, 255));
        DescartarHangar.setText("Descartar Hangar Completo");
        DescartarHangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescartarHangarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Defensas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Armas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Equipar)
                        .addGap(18, 18, 18)
                        .addComponent(Descartar)
                        .addGap(18, 18, 18)
                        .addComponent(DescartarHangar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medallas)
                            .addComponent(Combustible)
                            .addComponent(Ataque)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Defensa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(Daño, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Hangar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ataque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Defensa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combustible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Medallas)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Daño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(Armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Defensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hangar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipar)
                    .addComponent(Descartar)
                    .addComponent(DescartarHangar))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EquiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquiparActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> w, s;
        w = hangar_view.getSelectedBoxesWeapons();
        s = hangar_view.getSelectedBoxesShields();
        
        Controller.getInstance().mount(w, s);
        MainWindow.getInstance().updateView();        
    }//GEN-LAST:event_EquiparActionPerformed

    private void DescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescartarActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> w, s;
        w = weapons_view.getSelectedBoxes();
        s = shields_view.getSelectedBoxes();
        
        Controller.getInstance().discard(Controller.WEAPON, w, s);
        Controller.getInstance().discard(Controller.SHIELD, w, s);
        
        ArrayList<Integer> wh, sh;
        wh = hangar_view.getSelectedBoxesWeapons();
        sh = hangar_view.getSelectedBoxesShields();
        Controller.getInstance().discard(Controller.HANGAR, wh, sh);       
   
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_DescartarActionPerformed

    private void DescartarHangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescartarHangarActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().discardHangar();
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_DescartarHangarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Armas;
    private javax.swing.JLabel Ataque;
    private javax.swing.JLabel Combustible;
    private javax.swing.JPanel Daño;
    private javax.swing.JLabel Defensa;
    private javax.swing.JPanel Defensas;
    private javax.swing.JButton Descartar;
    private javax.swing.JButton DescartarHangar;
    private javax.swing.JButton Equipar;
    private javax.swing.JPanel Hangar;
    private javax.swing.JLabel Medallas;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
