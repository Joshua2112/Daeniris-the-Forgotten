/******************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *****************************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;


/**
 *
 * @author Joshua
 */
public class BattleControl {   
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        Enemy enemy = ((Enemy) actors[1][0]);
        
        String playerName = player.getName();
        int totalAttack = player.getAttack();
        int totalDefense = player.getDefense();
        int currentHealth = player.getHealthPoints();
        int currentMagic = player.getMagicPoints();
        int totalMagicAttack = player.getMagicAttack();
        int totalMagicDefense = player.getMagicDefense();
        int criticalHitBonus = 0;
        
        String enemyName = enemy.getName();
        int enemyAttack = enemy.getAttack();
        int enemyDefense = enemy.getDefense();
        int enemyHealth = enemy.getHealthPoints();
        int enemyMagic = enemy.getMagicPoints();
        int enemyMagicAttack = enemy.getMagicAttack();
        int enemyMagicDefense = enemy.getMagicDefense();
        int enemyCritBonus = 0;
        
        public void attackEnemy() {        
           
        boolean hit = false;
        boolean critical = false;
        int damage = 0;
        
        Random number = new Random();
        int connect = number.nextInt(30) + totalAttack - enemyDefense;
        if (connect > 14){
            hit = true;
            
            Random critRand = new Random();
            int crit = critRand.nextInt(100) + criticalHitBonus;
                if (crit > 90){
                critical = true;
                }
                else{
                critical = false;
                }
           
            if (totalAttack < 0){
                totalAttack = 0;           
                }
                   
            damage = totalAttack - enemyDefense;
            
            if (damage < 0){
                damage = 0;
            }
	
            if (critical == true){
                damage *= 2;
            }
        }   
            if (hit == true){
                
                enemyHealth -= damage;
                System.out.println("You did " + damage + " damage to the enemy");
            }
            else{
                    System.out.println("Your attack missed");                
            }
        
    }

        
        public void enemyAttack() {        
           
        boolean hit = false;
        boolean critical = false;
        int damage = 0;
        
        Random number = new Random();
        int connect = number.nextInt(30) + enemyAttack - totalDefense;
        if (connect > 14){
            hit = true;
            
            Random critRand = new Random();
            int crit = critRand.nextInt(100) + enemyCritBonus;
                if (crit > 94){
                critical = true;
                }
                else{
                critical = false;
                }
           
            if (enemyAttack < 0){
                enemyAttack = 0;           
                }
                   
            damage = enemyAttack - totalDefense;
            
            if (damage < 0){
                damage = 0;
                }
	
            if (critical == true){
                damage *= 2;
            }   
        } 
            if (hit == true){
                
                currentHealth -= damage;
                System.out.println("You took " + damage + " damage from the enemy");
            }
            else{
                System.out.println("Enemy attack missed");                
            }
        
    }

    

    public void defend1() {
        totalDefense += totalDefense * 0.25;
    }
    
    public void defend2(){
        //totalDefense = player.getDefense();
        
        totalDefense = 10;
}

    public void examineEnemy() {
        /*System.out.println("\n\tName " + enemy.getName()
                            +"\n\tHealth Points " + enemy.getHealthPoints()
                            +"\n\tMagic Points " + enemy.getMagicPoints()
                            +"\n\tAttack " + enemyAttack
                            +"\n\tDefense " + enemyDefense
                            +"\n\tMagic Attack " + enemyMagicAttack
                            +"\n\tMagic Defense " + enemyMagicDefense);*/
        
        System.out.println("\n\tName " + "Goblin"
                            +"\n\tHealth Points " + enemyHealth + "/20"
                            +"\n\tMagic Points " + enemyMagic
                            +"\n\tAttack " + enemyAttack
                            +"\n\tDefense " + enemyDefense
                            +"\n\tMagic Attack " + enemyMagicAttack
                            +"\n\tMagic Defense " + enemyMagicDefense);
    }

    public void run1() {
        System.out.println("run stub called");
    }

    public int getTotalAttack() {
        return totalAttack;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }

    public int getTotalMagicAttack() {
        return totalMagicAttack;
    }

    public int getTotalMagicDefense() {
        return totalMagicDefense;
    }

    public int getCriticalHitBonus() {
        return criticalHitBonus;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public int getEnemyDefense() {
        return enemyDefense;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public int getEnemyMagic() {
        return enemyMagic;
    }

    public int getEnemyMagicAttack() {
        return enemyMagicAttack;
    }

    public int getEnemyMagicDefense() {
        return enemyMagicDefense;
    }

    public int getEnemyCritBonus() {
        return enemyCritBonus;
    }

    public String getPlayerName() {
        return playerName;
    }   
}
    

