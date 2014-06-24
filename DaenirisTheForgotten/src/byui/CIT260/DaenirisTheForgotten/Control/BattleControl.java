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


/**
 *
 * @author Joshua
 */
public class BattleControl {
    
    public void beginBattle(){
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actor = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actor[0][0]);
        Enemy enemy = ((Enemy) actor[1][0]);
        
        int totalAttack = player.getAttack();
        int totalDefense = player.getDefense();
        int currentHealth = player.getHealthPoints();
        int currentMagic = player.getMagicPoints();
        int totalMagicAttack = player.getMagicAttack();
        int totalMagicDefense = player.getMagicDefense();
        
        int enemyAttack = enemy.getAttack();
        int enemyDefense = enemy.getDefense();
        int enemyHealth = enemy.getHealthPoints();
        int enemyMagic = enemy.getMagicPoints();
        int enemyMagicAttack = enemy.getMagicAttack();
        int enemyMagicDefense = enemy.getMagicDefense();
    }
    
    public boolean hit(int attack, int defense){        

        
        boolean hit;
        
        int connect = (int) (Math.random() * (100 - 1) + 1 + attack - defense);
        if (connect > 50){
            hit = true;
        }
        else{
            hit = false;
        }
        return hit;
    }
    
    public boolean critical(){
        
        boolean critical;
        
        int crit = (int) (Math.random() * (100 - 1) + 1);
        if (crit > 50){
            critical = true;
        }
        else{
            critical = false;
        }
        return critical;
    }
    
    public int attackDamageCalc(int totalAttack, int enemyDefense, boolean hit, boolean critical){
        
        int damage;
        
        if (totalAttack < 0){
            return -1;
                    }
        if (hit == true){
                    
            damage = totalAttack - enemyDefense;
            

            if (damage < 0){
		damage = 0;
            }
	
            if (critical == true){
		damage = damage * 2;
            }
        }
    
        else{
        return 0;
        }
        return damage;
    }      

    public void hit() {
        System.out.println("hit stub called");
    }

    public void defend1() {
        System.out.println("defend stub called");
    }

    public void examineEnemy() {
        System.out.println("examine enemy stub called");
    }

    public void run1() {
        System.out.println("run stub called");
    }
}
    

