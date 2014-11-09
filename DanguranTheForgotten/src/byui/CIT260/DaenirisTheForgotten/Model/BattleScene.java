/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import dangurantheforgotten.DanguranTheForgotten;
import java.util.Random;
/**
 *
 * @author Nathan
 */
public class BattleScene extends Location{
    Game game = DanguranTheForgotten.currentGame;
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
    EquippedGear playerGear = game.getEquippedGear();
    Random enemyNum = new Random();
    Enemy enemy = new Enemy();
    private boolean attackFirst;
    
    public BattleScene(int column, int row){
        enemy = ((Enemy) actors[column][row]);
        populateBattleData(); 
    }
    
    public BattleScene(int column) {
        int RandEnemy = enemyNum.nextInt(3);
        enemy = ((Enemy) actors[column][RandEnemy]);
        
        populateBattleData();
            
    }
    
    private void populateBattleData(){
        playerName = player.getName();
        totalAttack = player.getAttack() + playerGear.getTAB();
        totalDefense = player.getDefense() + playerGear.getTDB();
        totalHealth = player.getHealthPoints();
        currentHealth = player.getCurrentHealthPoints();
        currentMagic = player.getCurrentMagicPoints();
        totalMagic = player.getMagicPoints();
        totalMagicAttack = player.getMagicAttack() + playerGear.getTMAB();
        totalMagicDefense = player.getMagicDefense() + playerGear.getTMDB();
        playerGold = player.getPlayerGold();
        playerExp = player.getExperience();
        criticalHitBonus = 0;
        
        enemyName = enemy.getName();
        enemyAttack = enemy.getAttack();
        enemyDefense = enemy.getDefense();
        enemyHealth = enemy.getHealthPoints();
        enemyCurrentHealth = enemy.getHealthPoints();
        enemyMagic = enemy.getMagicPoints();
        enemyCurrentMagic = enemy.getCurrentMagicPoints();
        enemyMagicAttack = enemy.getMagicAttack();
        enemyMagicDefense = enemy.getMagicDefense();
        enemyGold = enemy.getGoldValue();
        enemyExp = enemy.getExperienceValue();
        enemyItemDrop = enemy.getItemsDropped();
        magicAt = enemy.isMagicAttacker();
        spellName = enemy.getSpellUsed();
        spellDamage = enemy.getSpellUseDamage();
        enemyCritBonus = 0;
        pheonix = false;
        inBattle = false;
    }
        
        private String playerName;
        private int totalAttack;
        private int totalDefense;
        private int totalHealth;
        private int currentHealth;
        private int currentMagic;
        private int totalMagic;
        private int totalMagicAttack;
        private int totalMagicDefense;
        private int criticalHitBonus;
        private int playerGold;
        private int playerExp;
        
        private String enemyName;
        private int enemyAttack;
        private int enemyDefense;
        private int enemyHealth;
        private int enemyCurrentHealth;
        private int enemyMagic;
        private int enemyCurrentMagic;
        private int enemyMagicAttack;
        private int enemyMagicDefense;
        private int enemyCritBonus;
        private int enemyGold;
        private int enemyExp;
        private String enemyItemDrop;
        private String spellName;
        private boolean magicAt;
        private int spellDamage;
        private int enemySpellCost;
        private boolean pheonix;
        private boolean inBattle;

    public BattleScene() {

    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTotalAttack() {
        return totalAttack;
    }

    public void setTotalAttack(int totalAttack) {
        this.totalAttack = totalAttack;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public void setTotalDefense(int totalDefense) {
        this.totalDefense = totalDefense;
    }

    public int getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }

    public void setCurrentMagic(int currentMagic) {
        this.currentMagic = currentMagic;
    }

    public int getTotalMagic() {
        return totalMagic;
    }

    public void setTotalMagic(int totalMagic) {
        this.totalMagic = totalMagic;
    }

    public int getTotalMagicAttack() {
        return totalMagicAttack;
    }

    public void setTotalMagicAttack(int totalMagicAttack) {
        this.totalMagicAttack = totalMagicAttack;
    }

    public int getTotalMagicDefense() {
        return totalMagicDefense;
    }

    public void setTotalMagicDefense(int totalMagicDefense) {
        this.totalMagicDefense = totalMagicDefense;
    }

    public int getCriticalHitBonus() {
        return criticalHitBonus;
    }

    public void setCriticalHitBonus(int criticalHitBonus) {
        this.criticalHitBonus = criticalHitBonus;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyDefense() {
        return enemyDefense;
    }

    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyCurrentHealth() {
        return enemyCurrentHealth;
    }

    public void setEnemyCurrentHealth(int enemyCurrentHealth) {
        this.enemyCurrentHealth = enemyCurrentHealth;
    }

    public int getEnemyMagic() {
        return enemyMagic;
    }

    public void setEnemyMagic(int enemyMagic) {
        this.enemyMagic = enemyMagic;
    }

    public int getEnemyCurrentMagic() {
        return enemyCurrentMagic;
    }

    public void setEnemyCurrentMagic(int enemyCurrentMagic) {
        this.enemyCurrentMagic = enemyCurrentMagic;
    }

    public int getEnemyMagicAttack() {
        return enemyMagicAttack;
    }

    public void setEnemyMagicAttack(int enemyMagicAttack) {
        this.enemyMagicAttack = enemyMagicAttack;
    }

    public int getEnemyMagicDefense() {
        return enemyMagicDefense;
    }

    public void setEnemyMagicDefense(int enemyMagicDefense) {
        this.enemyMagicDefense = enemyMagicDefense;
    }

    public int getEnemyCritBonus() {
        return enemyCritBonus;
    }

    public void setEnemyCritBonus(int enemyCritBonus) {
        this.enemyCritBonus = enemyCritBonus;
    }

    public boolean isAttackFirst() {
        return attackFirst;
    }

    public void setAttackFirst(boolean attackFirst) {
        this.attackFirst = attackFirst;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getPlayerExp() {
        return playerExp;
    }

    public void setPlayerExp(int playerExp) {
        this.playerExp = playerExp;
    }

    public int getEnemyGold() {
        return enemyGold;
    }

    public void setEnemyGold(int enemyGold) {
        this.enemyGold = enemyGold;
    }

    public int getEnemyExp() {
        return enemyExp;
    }

    public void setEnemyExp(int enemyExp) {
        this.enemyExp = enemyExp;
    }

    public String getEnemyItemDrop() {
        return enemyItemDrop;
    }

    public void setEnemyItemDrop(String enemyItemDrop) {
        this.enemyItemDrop = enemyItemDrop;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public boolean isMagicAt() {
        return magicAt;
    }

    public void setMagicAt(boolean magicAt) {
        this.magicAt = magicAt;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public int getEnemySpellCost() {
        return enemySpellCost;
    }

    public void setEnemySpellCost(int enemySpellCost) {
        this.enemySpellCost = enemySpellCost;
    }

    public boolean isPheonix() {
        return pheonix;
    }

    public void setPheonix(boolean pheonix) {
        this.pheonix = pheonix;
    }

    public boolean isInBattle() {
        return inBattle;
    }

    public void setInBattle(boolean inBattle) {
        this.inBattle = inBattle;
    }
    
    
    
    
    

    public String[][] toArray() {

        String[][] data = new String[Constants.BATTLE_COL_COUNT][Constants.BATTLE_ROW_COUNT];
        
        data[0][0] = "Player Name   : " + playerName;
        data[0][1] = "Current Health: " + currentHealth + "/" + totalHealth;
        data[0][2] = "Current Mana  : " + currentMagic + "/" + totalMagic;
        
        data[1][0] = "Enemy Name    : " + enemyName;
        data[1][1] = "Enemy Health  : " + enemyCurrentHealth + "/" + enemyHealth;
        data[1][2] = "Enemy Mana    : " + enemyCurrentMagic + "/" + enemyMagic;  
        return data;
    }
    
    public String enemyToString() {
        
        Actor[][] actors = game.getActor();
        String newline = System.getProperty("line.separator");
        return "Character (Enemy):"                            + newline
                + "name= "            + this.getName()         + newline
                + "attack= "          + this.getEnemyAttack()       + newline
                + "defense= "         + this.getEnemyDefense()      + newline
                + "magicAttack= "     + this.getEnemyMagicAttack() + newline
                + "magicDefence= "    + this.getEnemyMagicDefense() + newline
                + "healthPoints= "    + this.getEnemyCurrentHealth() + newline
                + "/"                 + this.getEnemyHealth()        + newline
                + "magicPoints = "    + this.getEnemyCurrentMagic()  + newline
                + "/"                 + this.getEnemyMagic()         + newline              
                + "experienceValue= " + this.getEnemyExp()           + newline
                + "itemsDropped= "    + this.getEnemyItemDrop()      + newline
                + "goldValue= "       + this.getEnemyGold()          + newline;
    }
        
    
    
    
    
}
