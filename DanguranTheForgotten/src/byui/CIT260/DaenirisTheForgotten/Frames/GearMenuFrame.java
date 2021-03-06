/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Frames;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.EquippedGear;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import dangurantheforgotten.DanguranTheForgotten;
import javax.swing.WindowConstants;

/**
 *
 * @author Nathan
 */
public class GearMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MagicMenuFrame
     */
    public GearMenuFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        
    Game game = DanguranTheForgotten.getCurrentGame();
    AdventureMenuFrame adventureMenuFrame = null;
    Gear[] armors = game.getArmors();
    Gear[] helms = game.getHelms();
    Gear[] weapons = game.getWeapons();
    Gear[] secondaries = game.getSecondaries();
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        int rowCount = this.gearTable.getRowCount();
        int columnCount = this.gearTable.getColumnCount();
        
        for (int i = 0; i < Constants.GEAR_LIST_COUNT; i++){
                this.gearTable.getModel().setValueAt(weapons[i].getName(), i, 0);
                this.gearTable.getModel().setValueAt(armors[i].getName(), i, 1);
                this.gearTable.getModel().setValueAt(helms[i].getName(), i, 2);
                this.gearTable.getModel().setValueAt(secondaries[i].getName(), i, 3);
    }

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
        gearTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        equipGear = new javax.swing.JButton();
        exitMenu = new javax.swing.JButton();
        gearName = new javax.swing.JLabel();
        gearDescription = new javax.swing.JLabel();
        gearAttack = new javax.swing.JLabel();
        gearDefense = new javax.swing.JLabel();
        gearMAttack = new javax.swing.JLabel();
        gearMDefense = new javax.swing.JLabel();
        gearQuantity = new javax.swing.JLabel();
        gearValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gearTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Weapons", "Armor", "Helmet", "Left Hand"
            }
        ));
        gearTable.setColumnSelectionAllowed(true);
        gearTable.setRowHeight(50);
        gearTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gearTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gearTable);
        gearTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Gear Menu");

        equipGear.setText("Equip");
        equipGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipGearActionPerformed(evt);
            }
        });

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });

        gearName.setText("name");

        gearDescription.setText("description");

        gearAttack.setText("attack");

        gearDefense.setText("defense");

        gearMAttack.setText("magic attack");

        gearMDefense.setText("magic defense");

        gearQuantity.setText("quantity");

        gearValue.setText("value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipGear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(gearName))
                            .addComponent(gearQuantity)
                            .addComponent(gearAttack))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gearValue)
                            .addComponent(gearDescription)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gearDefense)
                                .addGap(64, 64, 64)
                                .addComponent(gearMAttack)
                                .addGap(44, 44, 44)
                                .addComponent(gearMDefense))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equipGear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gearName)
                            .addComponent(gearDescription))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gearAttack)
                            .addComponent(gearDefense)
                            .addComponent(gearMAttack)
                            .addComponent(gearMDefense))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gearQuantity)
                            .addComponent(gearValue)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipGearActionPerformed
        Game game = DanguranTheForgotten.getCurrentGame();
        Gear[] armors = game.getArmors();
        Gear[] helms = game.getHelms();
        Gear[] weapons = game.getWeapons();
        Gear[] secondaries = game.getSecondaries();
        EquippedGear playerGear = game.getEquippedGear();
        
        int column = this.gearTable.getSelectedColumn();
        int row = this.gearTable.getSelectedRow();
        Gear gear = null;
        String message = null;
        
        if(column == 0){
            if(weapons[row].getQuantity() > 0){
            playerGear.setWeapon(weapons[row]);
            gear = weapons[row];
            BattleScene stats = new BattleScene(1);
        
            message = "You equipped " + gear.getName()
                    + "\nTotal Attack : " + stats.getTotalAttack()
                    + "\nTotal Defense : " + stats.getTotalDefense()
                    + "\nTotal Magic Attack : " + stats.getTotalMagicAttack()
                    + "\nTotal Magic Defense : " + stats.getTotalMagicDefense();
            }
            else{
                message = "You don't have any of that gear";
            }
        }
        else if(column == 1){
            if(armors[row].getQuantity() > 0){
            playerGear.setArmor(armors[row]);
            gear = armors[row];
            BattleScene stats = new BattleScene(1);
        
            message = "You equipped " + gear.getName()
                    + "\nTotal Attack : " + stats.getTotalAttack()
                    + "\nTotal Defense : " + stats.getTotalDefense()
                    + "\nTotal Magic Attack : " + stats.getTotalMagicAttack()
                    + "\nTotal Magic Defense : " + stats.getTotalMagicDefense();
            }
            else{
                message = "You don't have any of that gear";
            }
        }
        else if(column == 2){
            if(helms[row].getQuantity() > 0){
            playerGear.setHelmet(helms[row]);
            gear = helms[row];
            BattleScene stats = new BattleScene(1);
        
            message = "You equipped " + gear.getName()
                    + "\nTotal Attack : " + stats.getTotalAttack()
                    + "\nTotal Defense : " + stats.getTotalDefense()
                    + "\nTotal Magic Attack : " + stats.getTotalMagicAttack()
                    + "\nTotal Magic Defense : " + stats.getTotalMagicDefense();
            }
            else{
                message = "You don't have any of that gear";
            }
        }
        else if(column == 3){
            if(secondaries[row].getQuantity() > 0){
            playerGear.setLeftHand(secondaries[row]);
            gear = secondaries[row];
            BattleScene stats = new BattleScene(1);
        
            message = "You equipped " + gear.getName()
                    + "\nTotal Attack : " + stats.getTotalAttack()
                    + "\nTotal Defense : " + stats.getTotalDefense()
                    + "\nTotal Magic Attack : " + stats.getTotalMagicAttack()
                    + "\nTotal Magic Defense : " + stats.getTotalMagicDefense();
            }
            else{
                message = "You don't have any of that gear";
            }
        }
        
        GearEquippedFrame gearEquipped = new GearEquippedFrame(message);
        gearEquipped.setVisible(true);
        
    }//GEN-LAST:event_equipGearActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void gearTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gearTableMouseClicked
        Game game = DanguranTheForgotten.getCurrentGame();
        Gear[] armors = game.getArmors();
        Gear[] helms = game.getHelms();
        Gear[] weapons = game.getWeapons();
        Gear[] secondaries = game.getSecondaries();
        
        int column = this.gearTable.getSelectedColumn();
        int row = this.gearTable.getSelectedRow();
        Gear gear = null;
        
        if(column == 0){
            gear = weapons[row];
        }
        else if(column == 1){
            gear = armors[row];
        }
        else if(column == 2){
            gear = helms[row];
        }
        else if(column == 3){
            gear = secondaries[row];
        }
        
        this.gearName.setText(gear.getName());
        this.gearDescription.setText(gear.getDescription());
        this.gearAttack.setText("Attack: " + gear.getAttackBonus());
        this.gearDefense.setText("Defense: " + gear.getDefenseBonus());
        this.gearMAttack.setText("Magic Attack: " + gear.getMagicAttackBonus());
        this.gearMDefense.setText("Magic Defense: " + gear.getMagicDefenseBonus());
        this.gearQuantity.setText("Quantity: " + gear.getQuantity());
        this.gearValue.setText("Value: " + gear.getCost());
    }//GEN-LAST:event_gearTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GearMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GearMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GearMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GearMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GearMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton equipGear;
    private javax.swing.JButton exitMenu;
    private javax.swing.JLabel gearAttack;
    private javax.swing.JLabel gearDefense;
    private javax.swing.JLabel gearDescription;
    private javax.swing.JLabel gearMAttack;
    private javax.swing.JLabel gearMDefense;
    private javax.swing.JLabel gearName;
    private javax.swing.JLabel gearQuantity;
    private javax.swing.JTable gearTable;
    private javax.swing.JLabel gearValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
