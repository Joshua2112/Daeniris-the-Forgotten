/******************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *****************************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.View.AdventureView;
import byui.CIT260.DaenirisTheForgotten.View.GameOverView;
import byui.CIT260.DaenirisTheForgotten.View.TabularMenu;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;


/**
 *
 * @author Joshua
 */
public class BattleControl {   
        /* Moved to BattleScene in the model layer
    
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
        int enemyCritBonus = 0;*/
        

    
    public static void attackEnemy() {        
        
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
                System.out.println("\n\tYou defeated the enemy!"
                                    +"\n\tYou gained " + battle.getEnemyGold() + " gold"
                                    +"\n\tand you gained " + battle.getEnemyExp() + " experience points");
                endBattle(battle);
                AdventureView adventureView = new AdventureView();
                adventureView.display();
            }
        
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
        
        player.setHealthPoints(battle.getCurrentHealth());
        player.setMagicPoints(battle.getCurrentMagic());
        player.setPlayerGold(battle.getEnemyGold() + battle.getPlayerGold());
        player.setExperience(battle.getPlayerExp() + battle.getEnemyExp());
        //future add item to inventory.
        AdventureView.displayMap();
    }
/*
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
    private TabularMenu createTabularMenu(){
        Game game = DaenirisTheForgotten.getCurrentGame();
   
        
        TabularMenu craftTab = new TabularMenu();
        craftTab.setDisplayName("Spell Display");
        craftTab.setColumnCount(Constants.SPELL_COL_COUNT);
        craftTab.setColumnWidth(Constants.SPELL_COL_WIDTH);
        craftTab.setRowCount(Constants.SPELL_ROW_COUNT);
        craftTab.setType(Constants.SPELLS);
        
        String[] header = new String[Constants.SPELL_COL_COUNT];
        header[0] = "Black Magic";
        header[1] = "White Magic";
        
        craftTab.setHeader(header);
        
        //GameControl.stringConvert(game.getInventory(), Constants.INV_POTION_COL);
        //GameControl.sortCrafts(game.getSpells());      
        return craftTab;
    
        
    }*/


}
    

