/*********************************************************************
 * SpellControl Class
 * Author: Nathan Wittmann
 * Controls the spell effects
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Spells;


public class SpellControl {

    public static void castSpell(Spells spells) {
    System.out.println("cast spell stub");
    }
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

    public void castFire() {
        System.out.println("Fire spell cast stub");
    }

    public void castIce() {
        System.out.println("Ice spell cast stub");
    }

    public void castWater() {
        System.out.println("Water spell cast stub");
    }

    public void castAttackBoost() {
        System.out.println("Attack Boost spell cast stub");
    }

    public void castDefenseBoost() {
        System.out.println("Defense Boost spell cast stub");
    }

    public void castLightning() {
        System.out.println("Lightning spell cast stub");
    }
}
