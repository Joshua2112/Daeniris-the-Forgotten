/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import byui.CIT260.DaenirisTheForgotten.View.HealingPondScene;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Joshua
 */
public class MoveChanceControl implements Serializable{
        
    public MoveChanceControl(){
    
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        
        if(randomInt > 0 && randomInt < 31){
            BattleMenuView battle = new BattleMenuView();
            battle.display();      
            }
        else if(randomInt > 30 && randomInt <56){
            TreasureChestScene treasure = new TreasureChestScene();
            treasure.giveTreasure();  
            }
        else if(randomInt > 55 && randomInt < 66){
            HealingPondScene healingPond = new HealingPondScene();
            healingPond.giveHealing();  
            }
        else{
            return;
            }
    }
}   