/*********************************************************************
 * SpellControl Class
 * Author: Nathan Wittmann
 * Controls the spell effects
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Exception.stringNotFoundException;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.ArrayLocation;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
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
        ArrayLocation arrayLocation = new ArrayLocation();
        
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < Constants.SPELL_COL_COUNT; i++){
            if (!(GameControl.stringSearch(spells, str, arrayLocation))){
               throw new stringNotFoundException("Selection Not Found");  
            }
        }
                
        Spells spell = spells[arrayLocation.getColumn()][arrayLocation.getRow()];
        
        return spell;
        
    }
   
    public static void castSpell(Spells spell, boolean battle) throws illegalActionException{     

        if (!battle && spell.getSpellType() != Constants.SPELL_HEALTH){
                throw new illegalActionException("Can only cast in a battle.");
        }
        
        if (spell.getSpellType() == Constants.SPELL_HEALTH){
            healthSpell(spell, battle);
        }
        else if (spell.getSpellType() == Constants.SPELL_MANA ){
            System.out.println("Cast Attack Spell");
        }
        else if (spell.getSpellType() == Constants.SPELL_ATTACK_DEFENSE){
            System.out.println("Cast Defense Attack Spell");
            
        }
        else if (spell.getSpellType() == Constants.SPELL_MAGIC_DEFENSE){
            System.out.println("Cast Defense Magic Spell");
        }
    }
    
    private static void healthSpell(Spells spell, boolean battle) {
        Actor[][] actors = game.getActor();
        PlayerCharacter playerStats = ((PlayerCharacter) actors[0][0]);
        BattleScene battleStats = game.getBattle();
        
        if (!battle){
            playerStats.setCurrentHealthPoints(
                (int) (playerStats.getCurrentHealthPoints() + spell.getSpecialEffects()));
        }
        else{
            battleStats.setCurrentHealth(
                (int) (battleStats.getCurrentHealth() + spell.getSpecialEffects()));
        }

        if (playerStats.getCurrentHealthPoints() > playerStats.getHealthPoints()
        && battleStats.getCurrentHealth() > battleStats.getTotalHealth()){
            playerStats.setCurrentHealthPoints(playerStats.getHealthPoints());
            battleStats.setCurrentHealth(battleStats.getTotalHealth());
        }
    }
}
