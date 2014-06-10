/******************************************************************************
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *****************************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;


/**
 *
 * @author Joshua
 */
public class BattleControl {
    
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
    

