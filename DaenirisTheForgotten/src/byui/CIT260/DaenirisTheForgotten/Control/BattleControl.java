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
}
    

