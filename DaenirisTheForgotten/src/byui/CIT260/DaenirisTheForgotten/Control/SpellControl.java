/*********************************************************************
 * SpellControl Class
 * Author: Nathan Wittmann
 * Controls the spell effects
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Spells;


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
       
    public static void castSpell(Spells spell){
        if (spell.getSpellType() == Constants.SPELL_ATTACK){
            System.out.println("Cast Attack Spell");
        }
        else if (spell.getSpellType() == Constants.SPELL_HEALTH){
            System.out.println("Cast Health Spell");
        }
        else if (spell.getSpellType() == Constants.SPELL_ATTACK_DEFENSE){
            System.out.println("Cast Defense Attack Spell");
        }
        else if (spell.getSpellType() == Constants.SPELL_MAGIC_DEFENSE){
            System.out.println("Cast Defense Magic Spell");
        }
    }
}
