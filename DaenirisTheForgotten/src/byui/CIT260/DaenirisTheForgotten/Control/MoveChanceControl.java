/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import byui.CIT260.DaenirisTheForgotten.View.HealingPondScene;
import byui.CIT260.DaenirisTheForgotten.View.TabularMenu;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import daeniristheforgotten.DaenirisTheForgotten;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Joshua
 */
public class MoveChanceControl implements Serializable{

    public MoveChanceControl() {}
        
    public static void MoveChance(){
    
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        
        if(randomInt >= 0 && randomInt <= 25){
            BattleMenuView battle = new BattleMenuView();
            battle.display();      
            }
        else if(randomInt >= 26 && randomInt <= 40){
            TreasureChestScene treasure = new TreasureChestScene();
            treasure.giveTreasure();  
            }
        else if(randomInt >= 41 && randomInt <= 45){
            HealingPondScene healingPond = new HealingPondScene();
            healingPond.giveHealing();  
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
}   