/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;


import byui.CIT260.DaenirisTheForgotten.Frames.BattleFrame;
import byui.CIT260.DaenirisTheForgotten.Frames.HealingPondFrame;
import byui.CIT260.DaenirisTheForgotten.Frames.TreasureFrame;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import byui.CIT260.DaenirisTheForgotten.View.HealingPondScene;
import byui.CIT260.DaenirisTheForgotten.View.TabularMenu;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import dangurantheforgotten.DanguranTheForgotten;
import java.io.Serializable;
import java.util.Random;
import static javax.management.Query.value;

/**
 *
 * @author Joshua
 */
public class MoveChanceControl implements Serializable{

    public MoveChanceControl() {}
        
    public int MoveChance(){
    
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        
        if(randomInt > 0 && randomInt < 15){
            return 1;
            }
        else if(randomInt >= 16 && randomInt <= 18){
            return 2;
            }
        else if(randomInt >= 19 && randomInt <= 20){
            return 3;  
            }
        else{
            return 4;
        }     
    }
    private TabularMenu createTabularMenu(){
        Game game = DanguranTheForgotten.getCurrentGame();
        
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
    

    
    private static TabularMenu battleTabularMenu(BattleScene battle){
        Game game = DanguranTheForgotten.getCurrentGame();
        
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
    
