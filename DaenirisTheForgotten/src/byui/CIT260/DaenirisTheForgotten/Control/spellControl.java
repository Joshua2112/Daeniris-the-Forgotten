/*********************************************************************
 * Daeniris The Forgotten (Role Playing Game)
 * Author: Nathan Wittmann
 * Sp
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;



public class spellControl {

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
