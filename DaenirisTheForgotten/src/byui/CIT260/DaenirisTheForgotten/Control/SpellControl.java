/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

/**
 *
 * @author Joshua
 */
public class SpellControl {

       public int weakenSpell(double specialEffect, int enemyDefense ){
           
           int reducedDefense;
           
           if (specialEffect < .5 || specialEffect > .9 ){
               return -1;
            }

           reducedDefense = (int) (specialEffect * enemyDefense);

           if (reducedDefense < 0){
               reducedDefense = 0;
           }
           
           return reducedDefense;
       }
}
