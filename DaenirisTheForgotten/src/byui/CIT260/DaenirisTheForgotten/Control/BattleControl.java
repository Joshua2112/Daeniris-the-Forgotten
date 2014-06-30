/******************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *****************************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.View.DistributeBonusesView;
import byui.CIT260.DaenirisTheForgotten.View.GameOverView;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;


/**
 *
 * @author Joshua
 */
public class BattleControl {   
   
    public static int attackEnemy() {        
        
        Game game = DaenirisTheForgotten.currentGame;
        BattleScene battle = game.getBattle();   
        
        boolean hit = false;
        boolean critical = false;
        int damage = 0;
        
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
                   
            damage = battle.getTotalAttack() - battle.getEnemyDefense();
            
            if (damage < 0){
                damage = 0;
            }
	
            if (critical == true){
                damage *= 2;
            }
        }   
            if (hit == true){
                
                battle.setEnemyCurrentHealth(battle.getEnemyCurrentHealth() - damage);
                System.out.println("You did " + damage + " damage to the enemy");
            }
            else{
                    System.out.println("Your attack missed");                
            }
            
            if(battle.getEnemyCurrentHealth() <= 0){
                battle.setEnemyHealth(0);
                endBattle(battle);
                return 1;
            }
        return 0;
    }

        
    @SuppressWarnings("empty-statement")
        public static void enemyAttack() {    
            Game game = DaenirisTheForgotten.currentGame;
            BattleScene battle = game.getBattle(); 
            
            if(battle.getEnemyCurrentHealth() <= 0){
                return;
            }
           
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
                   
            damage = battle.getEnemyAttack() - battle.getTotalDefense();
            
            if (damage < 0){
                damage = 0;
                }
	
            if (critical == true){
                damage *= 2;
            }   
        } 
            if (hit == true){
                
                battle.setCurrentHealth(battle.getCurrentHealth() - damage);;
                System.out.println("You took " + damage + " damage from the enemy");
            }
            else{
                System.out.println("Enemy attack missed");                
            }
        if(battle.getCurrentHealth() <= 0){
            GameOverView gameOver = new GameOverView();
            gameOver.endGame();
        }
    }

    

    public static void defend1() {
        BattleScene battle = game.getBattle();
        System.out.println("Defense increased by " + battle.getTotalDefense() * 0.25 
                          + (" points temporarily"));
        
        float totalDefence = battle.getTotalDefense();        
        battle.setTotalDefense((int)(totalDefence * 1.25));        
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

    public static void run1() {
        System.out.println("run stub called");
    }
    
    private static void endBattle(BattleScene battle) {
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        
        player.setCurrentHealthPoints(battle.getCurrentHealth());
        player.setCurrentMagicPoints(battle.getCurrentMagic());
        player.setPlayerGold(battle.getEnemyGold() + battle.getPlayerGold());
        player.setExperience(battle.getPlayerExp() + battle.getEnemyExp());
        //future add item to inventory.
 
        System.out.println("\n\tYou defeated the enemy!"
                          +"\n\tYou gained " + battle.getEnemyGold() + " gold"
                          +"\n\tand you gained " + battle.getEnemyExp() + " experience points");        
        
        if(player.getExperience() >= player.getLevel() * 100){
            System.out.println("\n\tYou gained a level!"
                              +"\n\tYou have five points to distribute");
            player.setLevel(player.getLevel() + 1);
            player.setLevelPoints(5);
            DistributeBonusesView levelUp = new DistributeBonusesView();
            levelUp.display();
        }
       
    }
}
    

