/*********************************************************************
 * SpellControl Class
 * Author: Nathan Wittmann
 * Controls the spell effects
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;


public class SpellControl{

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
    
    public static Spells getSpell(String str) throws stringNotFoundException{
        Game game = DaenirisTheForgotten.getCurrentGame();
        Spells[][] spells = game.getSpells();
         
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < Constants.SPELL_COL_COUNT; i++){
            row = GameControl.stringSearch(spells, str, i);

            if (row != -1){
                column = i;  
            }
        }
        
        if (row == -1){
            throw new stringNotFoundException("Selection Not Found");
        }
            
        
        
        Spells spell = spells[column][row];
        
        return spell;
        
    }
   
    public static boolean castSpell(String str, boolean battle){     
        Game game = DaenirisTheForgotten.getCurrentGame();
        Spells[][] spells = game.getSpells();
        
        //displaySpells();
        
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < Constants.SPELL_COL_COUNT; i++){
            row = GameControl.stringSearch(spells, str, i);
            column = i;
        }        
        
        if (!battle){
            System.out.println(spells[column][row].getSpellType());
            if (spells[column][row].getSpellType() != Constants.SPELL_HEALTH){
                return false;
            }
        }
        
        if (spells[column][row].getSpellType() == Constants.SPELL_ATTACK){
            System.out.println("Cast Attack Spell");
        }
        else if (spells[column][row].getSpellType() == Constants.SPELL_HEALTH){
            System.out.println("Cast Health Spell");
        }
        else if (spells[column][row].getSpellType() == Constants.SPELL_ATTACK_DEFENSE){
            System.out.println("Cast Defense Attack Spell");
            
        }
        else if (spells[column][row].getSpellType() == Constants.SPELL_MAGIC_DEFENSE){
            System.out.println("Cast Defense Magic Spell");
        }
        return true;
    }
}
