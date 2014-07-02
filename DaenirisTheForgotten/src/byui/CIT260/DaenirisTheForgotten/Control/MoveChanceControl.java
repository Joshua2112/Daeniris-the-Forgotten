/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;


import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import byui.CIT260.DaenirisTheForgotten.View.HealingPondScene;
import byui.CIT260.DaenirisTheForgotten.View.TabularMenu;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import daeniristheforgotten.DaenirisTheForgotten;
import java.io.Serializable;
import java.util.Random;
import static javax.management.Query.value;

/**
 *
 * @author Joshua
 */
public class MoveChanceControl implements Serializable{

    public MoveChanceControl() {}
        
    public void MoveChance(){
    
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        

        if(randomInt > 0 && randomInt < 25){
            createNewBattle();      
            }
        else if(randomInt >= 26 && randomInt <= 40){
            TreasureChestScene treasure = new TreasureChestScene();
            treasure.display();
            }
        else if(randomInt >= 41 && randomInt <= 45){
            HealingPondScene healingPond = new HealingPondScene();
            healingPond.display();  
            }
        else{
            return;
            }
        
    }
    private TabularMenu createTabularMenu(){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu craftTab = new TabularMenu();
        craftTab.setDisplayName(" ");
        craftTab.setColumnCount(2);
        craftTab.setColumnWidth(25);
        craftTab.setRowCount(1);
        craftTab.setType(Constants.BATTLE);
        
        String[] header = new String[Constants.SPELL_COL_COUNT];
        header[0] = "Player";
        header[1] = "Enemy";
        
        craftTab.setHeader(header);
        
        //GameControl.stringConvert(game.getInventory(), Constants.INV_POTION_COL);
        //GameControl.sortCrafts(game.getSpells());      
        return craftTab;
        
    }
    
    private void createNewBattle(){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        BattleScene battleData = new BattleScene();
        game.setBattle(battleData);
        
        BattleMenuView battle = new BattleMenuView();
        TabularMenu tab = MoveChanceControl.battleTabularMenu(battleData);
        battle.display(tab);
    }
    
    private static TabularMenu battleTabularMenu(BattleScene battle){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu tab = new TabularMenu();
        tab.setDisplayName(" ");
        tab.setColumnCount(Constants.BATTLE_COL_COUNT);
        tab.setColumnWidth(Constants.BATTLE_COL_WIDTH);
        tab.setRowCount(Constants.BATTLE_ROW_COUNT);
        tab.setType(Constants.BATTLE);
        
        String[] header = new String[Constants.SPELL_COL_COUNT];
        header[0] = "Player";
        header[1] = "Enemy";
        
        tab.setHeader(header);
        
        String[][] data = new String[Constants.BATTLE_COL_COUNT][Constants.BATTLE_ROW_COUNT];
        
        data[0][0] = "Player Name   : " + battle.getPlayerName();
        data[0][1] = "Current Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth();
        data[0][2] = "Current Mana  : " + battle.getCurrentMagic() + "/" + battle.getTotalMagic();
        
        data[1][0] = "Enemy Name    : " + battle.getEnemyName();
        data[1][1] = "Enemy Health  : " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth();
        data[1][2] = "Enemy Mana    : " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic();
        
        tab.setData(data);
        
        //GameControl.stringConvert(game.getInventory(), Constants.INV_POTION_COL);
        //GameControl.sortCrafts(game.getSpells());      
        return tab;
    }
}   
    
