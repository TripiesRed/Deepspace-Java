/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package View.GUI;
import View.DeepSpaceView;
import View.View;
import controller.Controller;
import deepspace.GameUniverseToUI;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzalomp
 */
public class MainWindow extends javax.swing.JFrame implements View {
    
    private static MainWindow instance = null;
    private static GameUniverseToUI gameUI;
    
    public static MainWindow getInstance (){
        if(instance == null)
            instance = new MainWindow();
        
        return instance;
    }
    
    /** Creates new form MainWindow */
    private SpaceStationView currentSS;
    private EnemyView currentEn;
    
    public MainWindow(){
        initComponents();
        
        currentSS = new SpaceStationView();
        currentEn = new EnemyView();
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Controller.getInstance().finish(0);
            }
        });
    }  
    
    @Override
    public void updateView(){
        
        gameUI = Controller.getInstance().getUIversion();
        
        currentEn.setEnemyView(gameUI.getCurrentEnemy());
        currentSS.setSpaceStationView(gameUI.getCurrentStation());
        
        currentStation.add(currentSS);
        currentEnemy.add(currentEn);
        
        repaint();
        revalidate();
    }
    
    @Override
    public void showView() {
        this.setVisible(true);
    }
    
    @Override
    public ArrayList<String> readNamePlayers() {
        NamesCapture namesCapt = new NamesCapture(this);
        return namesCapt.getNames();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPruebas = new javax.swing.JPanel();
        currentStation = new javax.swing.JPanel();
        currentEnemy = new javax.swing.JPanel();
        Combatir = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeepSpace V1.0");
        setMinimumSize(new java.awt.Dimension(480, 480));
        setPreferredSize(new java.awt.Dimension(1240, 940));

        panelPruebas.setMinimumSize(new java.awt.Dimension(900, 600));
        panelPruebas.setPreferredSize(new java.awt.Dimension(1240, 940));

        currentStation.setPreferredSize(new java.awt.Dimension(660, 810));

        currentEnemy.setPreferredSize(new java.awt.Dimension(550, 500));

        Combatir.setBackground(new java.awt.Color(51, 153, 255));
        Combatir.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        Combatir.setForeground(new java.awt.Color(255, 255, 255));
        Combatir.setText("COMBATIR");
        Combatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombatirActionPerformed(evt);
            }
        });

        Siguiente.setBackground(new java.awt.Color(51, 153, 255));
        Siguiente.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setText("NEXT TURN");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPruebasLayout = new javax.swing.GroupLayout(panelPruebas);
        panelPruebas.setLayout(panelPruebasLayout);
        panelPruebasLayout.setHorizontalGroup(
            panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPruebasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPruebasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(20, 20, 20))
                    .addGroup(panelPruebasLayout.createSequentialGroup()
                        .addGroup(panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPruebasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(currentEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPruebasLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Combatir, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE))))
        );
        panelPruebasLayout.setVerticalGroup(
            panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPruebasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPruebasLayout.createSequentialGroup()
                        .addComponent(currentStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(panelPruebasLayout.createSequentialGroup()
                        .addComponent(currentEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(Combatir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addGap(14, 14, 14))))
        );

        getContentPane().add(panelPruebas, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombatirActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().combat();
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_CombatirActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().nextTurn();
        MainWindow.getInstance().updateView();
    }//GEN-LAST:event_SiguienteActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        Controller.getInstance().finish(0);
    }//GEN-LAST:event_SalirActionPerformed
    
    @Override
    public boolean confirmExitMessage() {
        return (JOptionPane.showConfirmDialog(this, "¿Estás segur@ que deseas salir?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
    
    @Override
    public void lostCombatMessage() {
        JOptionPane.showMessageDialog(this, "Has perdido", "¡Qué pena!", JOptionPane.OK_OPTION);
    }
    
    @Override
    public void escapeMessage() {
        JOptionPane.showMessageDialog(this, "Has logrado escapar", "¡Menos mal!", JOptionPane.OK_OPTION);
    }
    
    @Override
    public void wonCombatMessage() {
        JOptionPane.showMessageDialog(this, "Has ganado el combate", "¡Disfruta de tu botín!", JOptionPane.OK_OPTION);
    }
    
    @Override
    public void noCombatMessage() {
        JOptionPane.showMessageDialog(this, "No puedes combatir en este momento", "Ups", JOptionPane.OK_OPTION);
    }
    
    @Override
    public void wonGameMessage() {
        JOptionPane.showMessageDialog(this, "Has ganado la partida", "¡Enhorabuena!", JOptionPane.OK_OPTION);
    }
    
    @Override
    public void conversionMessage() {
        JOptionPane.showMessageDialog(this, "Has ganado el combate y te has convertido.", "¡Disfruta de tu botín!", JOptionPane.OK_OPTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Combatir;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Siguiente;
    private javax.swing.JPanel currentEnemy;
    private javax.swing.JPanel currentStation;
    private javax.swing.JPanel panelPruebas;
    // End of variables declaration//GEN-END:variables

}
