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
import byui.CIT260.DaenirisTheForgotten.View.AdventureView;
import byui.CIT260.DaenirisTheForgotten.View.DistributeBonusesView;
import byui.CIT260.DaenirisTheForgotten.View.GameOverView;
import byui.CIT260.DaenirisTheForgotten.View.TabularMenu;
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
        int totalHealth = player.getHealthPoints();
        int currentHealth = player.getHealthPoints();
        int currentMagic = player.getMagicPoints();
        int totalMagic = player.getMagicPoints();
        int totalMagicAttack = player.getMagicAttack();
        int totalMagicDefense = player.getMagicDefense();
        int criticalHitBonus = 0;
        
        String enemyName = enemy.getName();
        int enemyAttack = enemy.getAttack();
        int enemyDefense = enemy.getDefense();
        int enemyHealth = enemy.getHealthPoints();
        int enemyCurrentHealth = enemy.getHealthPoints();
        int enemyMagic = enemy.getMagicPoints();
        int enemyCurrentMagic = enemy.getMagicPoints();
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
                
                enemyCurrentHealth -= damage;
                System.out.println("You did " + damage + " damage to the enemy");
            }
            else{
                    System.out.println("Your attack missed");                
            }
            
            if(enemyCurrentHealth <= 0){
                System.out.println("\n\tYou defeated the enemy!"
                                    +"\n\tYou gained " + enemy.getGoldValue() + " gold"
                                    +"\n\tand you gained " + enemy.getExperienceValue() + " experience points");
                player.setPlayerGold(player.getPlayerGold() + enemy.getGoldValue());
                player.setExperiencePoints(player.getExperiencePoints() + enemy.getExperienceValue());
                player.setCurrentHealthPoints(currentHealth);
                player.setCurrentMagicPoints(currentMagic);
                if(player.getExperiencePoints() >= player.getLevel() * 100){
                    System.out.println("\n\tYou gained a level!"
                                      +"\n\tYou have five points to distribute");
                    player.setLevel(player.getLevel() + 1);
                    player.setLevelPoints(5);
                    DistributeBonusesView levelUp = new DistributeBonusesView();
                    levelUp.display();
                }
                AdventureView adventureView = new AdventureView();
                adventureView.display();
            }
        
    }

        
        public void enemyAttack() {    
            
            if(enemyCurrentHealth <= 0){
                return;
            }
           
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
        if(currentHealth <= 0){
            GameOverView gameOver = new GameOverView();
            gameOver.endGame();
        }
    }

    

    public void defend1() {
        System.out.println("Defense increased by " + totalDefense * 0.25 + (" points temporarily"));

        totalDefense += totalDefense * 0.25;        
    }
    
    public void defend2(){
        
        totalDefense = player.getDefense();
}

    public void examineEnemy() {
        
        System.out.println("\n\tName " + enemy.getName()
                            +"\n\tHealth Points " + enemyCurrentHealth + "/" + enemyHealth
                            +"\n\tMagic Points " + enemyCurrentMagic + "/" + enemyMagic
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

    public int getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    public int getTotalMagic() {
        return totalMagic;
    }

    public void setTotalMagic(int totalMagic) {
        this.totalMagic = totalMagic;
    }

    public int getEnemyCurrentHealth() {
        return enemyCurrentHealth;
    }

    public void setEnemyCurrentHealth(int enemyCurrentHealth) {
        this.enemyCurrentHealth = enemyCurrentHealth;
    }

    public int getEnemyCurrentMagic() {
        return enemyCurrentMagic;
    }

    public void setEnemyCurrentMagic(int enemyCurrentMagic) {
        this.enemyCurrentMagic = enemyCurrentMagic;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setTotalAttack(int totalAttack) {
        this.totalAttack = totalAttack;
    }

    public void setTotalDefense(int totalDefense) {
        this.totalDefense = totalDefense;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setCurrentMagic(int currentMagic) {
        this.currentMagic = currentMagic;
    }

    public void setTotalMagicAttack(int totalMagicAttack) {
        this.totalMagicAttack = totalMagicAttack;
    }

    public void setTotalMagicDefense(int totalMagicDefense) {
        this.totalMagicDefense = totalMagicDefense;
    }

    public void setCriticalHitBonus(int criticalHitBonus) {
        this.criticalHitBonus = criticalHitBonus;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public void setEnemyMagic(int enemyMagic) {
        this.enemyMagic = enemyMagic;
    }

    public void setEnemyMagicAttack(int enemyMagicAttack) {
        this.enemyMagicAttack = enemyMagicAttack;
    }

    public void setEnemyMagicDefense(int enemyMagicDefense) {
        this.enemyMagicDefense = enemyMagicDefense;
    }

    public void setEnemyCritBonus(int enemyCritBonus) {
        this.enemyCritBonus = enemyCritBonus;
    }
    
}
    

