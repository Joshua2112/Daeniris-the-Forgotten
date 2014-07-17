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
import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import byui.CIT260.DaenirisTheForgotten.View.DistributeBonusesView;
import byui.CIT260.DaenirisTheForgotten.View.GameOverView;
import byui.CIT260.DaenirisTheForgotten.View.TreasureChestScene;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;


/**
 *
 * @author Joshua
 */
public class BattleControl {   
   
    public static String attackEnemy() {   
        
        
        
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();   
        
        boolean hit = false;
        boolean critical = false;
        int damage = 0;
        String battleMessage = " ";
        
        Random number = new Random();
        int connect = number.nextInt(30) + battle.getTotalHealth() - battle.getEnemyDefense();
        if (connect > 14){
            hit = true;
            
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
            
        }
        else{
            battleMessage = "Your attack missed";
        }
            
            if(battle.getEnemyCurrentHealth() <= 0){
                battle.setEnemyCurrentHealth(0);
                battleMessage = endBattle(battle);
                return battleMessage;
            }
        return battleMessage;
    }

    public static int magicCast(){
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle(); 
        
        
        
        if(battle.getEnemyCurrentHealth() <= 0){
            battle.setEnemyHealth(0);
            endBattle(battle);
            return 1;
        }        
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
                
                fightMessage = "\n\tEnemy used " + battle.getSpellName()
                                +"\n\tYou took " + damage + " damage";
                
                if(battle.getCurrentHealth() <= 0){
                GameOverView gameOver = new GameOverView();
                gameOver.endGame();
                
                return fightMessage;
                                
            }   
            else {
            
            boolean hit = false;
            boolean critical = false;
            damage = 0;
        
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
            
                extraDamage = randomDamage.nextInt(10);
            
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
                fightMessage = "\n\tThe enemy attacked you"
                                +"\n\tYou took " + damage + " damage from the enemy";
                
                if(battle.getCurrentHealth() <= 0){
                    GameOverView gameOver = new GameOverView();
                    gameOver.endGame();
                }
                
                return fightMessage;
                }   
            else{
                fightMessage = "\n\tEnemy attack missed";                
            }
            }
        }
        return " ";
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
            runMessage = "\n\tYou successfully ran from the enemy";
        }
        else{
            runMessage = "\n\tYou were unable to run";
        }
        return runMessage;
    }
    
    private static String endBattle(BattleScene battle) {
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        
        player.setCurrentHealthPoints(battle.getCurrentHealth());
        player.setCurrentMagicPoints(battle.getCurrentMagic());
        player.setPlayerGold(battle.getEnemyGold() + battle.getPlayerGold());
        player.setExperience(battle.getPlayerExp() + battle.getEnemyExp());
        String message = "\n\tYou defeated the enemy!"
                          +"\n\tYou gained " + battle.getEnemyGold() + " gold"
                          +"\n\tand you gained " + battle.getEnemyExp() + " experience points";
        Random treasure = new Random();
        int treasureChance = treasure.nextInt(100);
        if(treasureChance >= 50){
            TreasureChestScene battleTreasure = new TreasureChestScene();
            battleTreasure.display();
        }
        return message;
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
    

