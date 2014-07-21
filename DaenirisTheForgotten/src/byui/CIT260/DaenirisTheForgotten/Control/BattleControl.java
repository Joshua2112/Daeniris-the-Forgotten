/******************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *****************************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.ArrayLocation;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.View.GameOverView;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;


/**
 *
 * @author Joshua
 */
public class BattleControl {   
    
    public static boolean hit() {
        
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();
        boolean hit = false;
        
        Random number = new Random();
        int connect = number.nextInt(30) + battle.getTotalHealth() - battle.getEnemyDefense();
        if (connect > 14){
            hit = true;
        }
            
        return hit;   
    }
   
    public static String attackEnemy() {   
        
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();   
        
        boolean critical = false;
        int damage = 0;
        String battleMessage = " ";
            
        Random critRand = new Random();
        int crit = critRand.nextInt(100) + battle.getCriticalHitBonus();
            if (crit > 90){
            critical = true;
            }
            else{
            critical = false;
            }
           
        if (battle.getTotalAttack() < 0){
            battle.setTotalAttack(0);           
            }
            
        Random randomDamage = new Random();
        int extraDamage = randomDamage.nextInt(10);
            
        if(critical == true){
            damage = 2 * (battle.getTotalAttack() + extraDamage) - battle.getEnemyDefense();
        }
        else{
            damage = battle.getTotalAttack() + extraDamage - battle.getEnemyDefense();
        }
            
        if (damage < 0){
            damage = 0;
        }
        
        battle.setEnemyCurrentHealth(battle.getEnemyCurrentHealth() - damage);
        if(battle.getEnemyCurrentHealth() <= 0){
            battle.setEnemyCurrentHealth(0);
        }
            
        battleMessage = "You attacked the enemy"
                        +"\nYou did " + damage + " to the enemy";
        return battleMessage;
    }     
    
    public static boolean checkEnemyDeath() {
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();
        boolean dead = false;
        if(battle.getEnemyCurrentHealth() == 0){
            dead = true;
        }
        return dead;
    }

    public static int magicCast(){
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle(); 
        return 0;
    }
    
        public static String enemyAttack() {   
            String fightMessage = " ";
            Game game = DaenirisTheForgotten.currentGame;
            BattleScene battle = game.getBattle(); 
            
            if(battle.getEnemyCurrentHealth() <= 0){
                return fightMessage;
            }
            
            if(battle.isMagicAt()){
                                
                Random randomDamage = new Random();
                int extraDamage = randomDamage.nextInt(10);
                
                    if(battle.getEnemyMagicAttack() < 0){
                        battle.setEnemyMagicAttack(0);
                    }
                
                    if(battle.getSpellDamage() < 0){
                        battle.setSpellDamage(0);
                    }
                
                int damage = battle.getEnemyMagicAttack() + battle.getSpellDamage() + extraDamage 
                        - battle.getTotalMagicDefense();
                
                    if(damage < 0){
                        damage = 0;
                    }
                
                battle.setCurrentHealth(battle.getCurrentHealth() - damage);
                battle.setEnemyCurrentMagic(battle.getEnemyCurrentMagic() - battle.getEnemySpellCost());
                
                fightMessage = "Enemy used " + battle.getSpellName()
                                +"\nYou took " + damage + " damage";
                                
                return fightMessage;
                                
            }   
            else {
            
            boolean hit = false;
            boolean critical = false;
            int damage = 0;
        
            Random number = new Random();
            int connect = number.nextInt(30) + battle.getEnemyAttack() - battle.getTotalDefense();
            if (connect > 14){
                hit = true;
            
                Random critRand = new Random();
                int crit = critRand.nextInt(100) + battle.getEnemyCritBonus();
                    if (crit > 94){
                    critical = true;
                    }
                    else{
                    critical = false;
                    }
           
                if (battle.getEnemyAttack() < 0){
                   battle.setEnemyAttack(0);           
                   }
            
                Random randomDamage = new Random();
                int extraDamage = randomDamage.nextInt(10);
            
                if(critical == true){
                    damage = 2 * battle.getEnemyAttack() + extraDamage - battle.getTotalDefense();
                    }
                else{
                    damage = battle.getEnemyAttack() + extraDamage - battle.getTotalDefense();
                    }
            
                if (damage < 0){
                    damage = 0;
                    }
	
                if (critical == true){
                    damage *= 2;
                }
                    
                battle.setCurrentHealth(battle.getCurrentHealth() - damage);
                fightMessage = "The enemy attacked you"
                                +"\nYou took " + damage + " damage";
                
                return fightMessage;
                }   
            else{
                fightMessage = "Enemy attack missed";
                return fightMessage;
            }
            }
        }
        
        public static boolean playerDead(){
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();   
        if(battle.getCurrentHealth() <= 0){
                    return true;
                }
        else{
            return false;
        }
        }
        
    public static float defend1() {
        BattleScene battle = game.getBattle();
        float totalDefense = battle.getTotalDefense();        
        battle.setTotalDefense((int)(totalDefense * 1.25));
        float tempDef = battle.getTotalDefense();
        return tempDef;
    }
    
    public static void defend2(){
        BattleScene battle = game.getBattle();
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        
        battle.setTotalDefense(player.getDefense());
    }

    public static void examineEnemy() {
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();
        System.out.println(battle.toString());
    }

    public static String run1() {
        String runMessage;
        Random number = new Random();
        int run = number.nextInt(100);
        if(run >= 50){
            runMessage = "You successfully ran from the enemy";
        }
        else{
            runMessage = "You were unable to run";
        }
        return runMessage;
    }
    
    public static String endBattle() {
        Game game = DaenirisTheForgotten.currentGame;
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        BattleScene battle = game.getBattle();
        
        player.setCurrentHealthPoints(battle.getCurrentHealth());
        player.setCurrentMagicPoints(battle.getCurrentMagic());
        player.setPlayerGold(battle.getEnemyGold() + battle.getPlayerGold());
        player.setExperience(battle.getPlayerExp() + battle.getEnemyExp());
        String message = "\n\tYou defeated the enemy!"
                          +"\n\tYou gained " + battle.getEnemyGold() + " gold"
                          +"\n\tand you gained " + battle.getEnemyExp() + " experience points";
        return message;
    }
    public boolean treasureRoll(){
        boolean treasureChest = false;
        Random treasure = new Random();
        int treasureChance = treasure.nextInt(100);
        if(treasureChance >= 50){
            treasureChest = true;
        }
        return treasureChest;
    }
        
       /* if(player.getExperience() >= player.getLevel() * 100){
            System.out.println("\n\tYou gained a level!"
                              +"\n\tYou have three points to distribute");
            player.setLevel(player.getLevel() + 1);
            player.setLevelPoints(3);
            DistributeBonusesView levelUp = new DistributeBonusesView();
            levelUp.display();
        }
    }*/
    
    public static ArrayLocation enemySelector(){
        ArrayLocation arrayLocation = new ArrayLocation();
        
        World world = game.getWorld();
        Location[][] location = world.getMap();
        
        char symbol = location[world.getxLoc()][world.getyLoc()].getSymbol();
        
        switch (symbol){
            //case: ''
        }
        
        
        return arrayLocation;
    }

    

    
}
    

