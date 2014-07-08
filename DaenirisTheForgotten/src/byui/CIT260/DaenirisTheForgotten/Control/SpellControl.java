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
import byui.CIT260.DaenirisTheForgotten.View.BattleMenuView;
import daeniristheforgotten.DaenirisTheForgotten;


public class SpellControl{
    
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
   
    public static int castSpell(Spells spell, boolean battle) throws illegalActionException{     
        Actor[][] actors = game.getActor();
        BattleScene battleStats = game.getBattle();
        int effectValue = 0;
        double effectPercent;
        
        //Verify spell is casting a legal spell.
        if (!battle && spell.getSpellType() != Constants.SPELL_HEAL_HEALTH){
                throw new illegalActionException("Can only cast in a battle.");
        }
        
        //Check to see if player has enough mana to cast spell.
        if(battle && battleStats.getTotalMagic() < spell.getMagicCost()){
            throw new illegalActionException("Not enough mana.");
        }
        
        if (spell.getSpellType() == Constants.SPELL_HEAL_HEALTH){
            effectValue = healHealthSpell(spell, battle);
        }
        else if (spell.getSpellType() == Constants.SPELL_ATTACK_HEALTH ){
            effectValue = attackHealthSpell(spell, battleStats);
        }
        else if (spell.getSpellType() == Constants.SPELL_ATTACK_DEFENSE       ||
                 spell.getSpellType() == Constants.SPELL_ATTACK_MAGIC_DEFENSE ||
                 spell.getSpellType() == Constants.SPELL_REDUCE_HEALTH        ||
                 spell.getSpellType() == Constants.SPELL_REDUCE_MANA){
            effectPercent = attackStatSpell(spell, battleStats);
            effectValue = statModifySpell(spell, battleStats, effectPercent);
        }
        else if (spell.getSpellType() == Constants.SPELL_INCREASE_DEFENCE       ||
                 spell.getSpellType() == Constants.SPELL_INCREASE_HEALTH        ||
                 spell.getSpellType() == Constants.SPELL_INCREASE_MAGIC_DEFENSE ||
                 spell.getSpellType() == Constants.SPELL_INCREASE_MANA){
            effectPercent = increaseStatSpell(spell, battleStats);
            effectValue = statModifySpell(spell, battleStats, effectPercent);
        }
        
        //Reduce mana from battle stats if spell is cast in a battle
        if (battle){
            reduceBattleMana(spell, battleStats);
        }
        
        return effectValue;
    }
    
    public static void reduceBattleMana(Spells spell, BattleScene battleStats){
        //Deduct mana from character.
            battleStats.setCurrentMagic(
            battleStats.getCurrentMagic() - spell.getMagicCost());
    }
    
    
    private static int healHealthSpell(Spells spell, boolean battle)throws illegalActionException{
        Actor[][] actors = game.getActor();
        PlayerCharacter playerStats = ((PlayerCharacter) actors[0][0]);
        BattleScene battleStats = game.getBattle();
        
        //Set effect Value
        int effectValue = (int) (spell.getSpecialEffects() + playerStats.getDefense());
        
        //Check to see if in a battle
        if (!battle){
            //Check to see if player has enough mana to cast spell.
            if(playerStats.getCurrentMagicPoints() < spell.getMagicCost()){
                throw new illegalActionException("Not enough mana.");
            }
            //Increase health points.
            playerStats.setCurrentHealthPoints(
                (int) (playerStats.getCurrentHealthPoints() 
                        + spell.getSpecialEffects()
                        + playerStats.getDefense()));
            //Check to see if health has exceeded total health.
            if (playerStats.getCurrentHealthPoints() > playerStats.getHealthPoints()){
            playerStats.setCurrentHealthPoints(playerStats.getHealthPoints());
            }
            //Deduct mana from character.
            playerStats.setCurrentMagicPoints(
                playerStats.getCurrentHealthPoints() - spell.getMagicCost());
        }
        //if in a battle
        else{
            battleStats.setCurrentHealth(
                (int) (battleStats.getCurrentHealth() 
                        + spell.getSpecialEffects()
                        + battleStats.getEnemyMagicDefense()));
            //Check to see if health has exceeded total health.
            if (battleStats.getCurrentHealth() > battleStats.getTotalHealth()){
            battleStats.setCurrentHealth(battleStats.getTotalHealth());
            }
        }
        return effectValue;
        
    }
    
    private static int attackHealthSpell(Spells spell, BattleScene battleStats) {
        
        //determine spell effect value
        int effectValue = (int) (spell.getSpecialEffects() + battleStats.getTotalMagicAttack());
        
        //reduce effect by enemies defence
        effectValue = effectValue - battleStats.getEnemyMagicDefense();
        
        //reduce health by spell effect total value
        battleStats.setEnemyCurrentHealth(battleStats.getEnemyCurrentHealth() - effectValue);
        
        //reduce mana by spell cost
        reduceBattleMana(spell, battleStats);
        
        return effectValue;
    }
    
    private static double attackStatSpell(Spells spell, BattleScene battleStats) {
        double effectValue;
        
        //determine effect value
        effectValue = (int)
                ((battleStats.getTotalMagicAttack() * Constants.SPELL_BONUS_PERCENT ) 
                  + spell.getSpecialEffects());
        
        //reduce effect value by enemies defence
        effectValue = (int)
                (effectValue - battleStats.getEnemyMagicDefense());
        
        //Validate effect value
        if (effectValue > 100){
            effectValue = 99;
        }
        else if (effectValue < 0){
            effectValue = 0;
        }
        
        //Turn effect value to a percent
        effectValue = 100 - effectValue;
        effectValue /= 100;
        
        //reduce enemies defence
        
              
        return effectValue; 
    }
    
    private static double increaseStatSpell(Spells spell, BattleScene battleStats) {
        double effectValue;
        
        //determine effect value
        effectValue = (int)
                ((battleStats.getTotalMagicAttack() * Constants.SPELL_BONUS_PERCENT ) 
                  + spell.getSpecialEffects());
   
        //Validate effect value
        if (effectValue > 100){
            effectValue = 99;
        }
        
        //Turn effect value to a percent
        effectValue /= 100;
        effectValue += 1;
 
        return effectValue; 
    }
    
    private static int statModifySpell(Spells spell, BattleScene battleStats, double effectPercent){
        int effectValue;
        
        
        
        switch (spell.getSpellType()){
            case Constants.SPELL_ATTACK_DEFENSE:
                battleStats.setEnemyDefense((int) (battleStats.getEnemyDefense() * effectPercent));
                break;            
            case Constants.SPELL_ATTACK_MAGIC_DEFENSE:
                battleStats.setEnemyMagicDefense((int) (battleStats.getEnemyMagicDefense() * effectPercent));
                break;
            case Constants.SPELL_REDUCE_HEALTH:
                battleStats.setCurrentHealth((int) (battleStats.getCurrentHealth() - effectPercent));
                break;
            case Constants.SPELL_REDUCE_MANA: 
                battleStats.setCurrentMagic((int) (battleStats.getCurrentMagic() * effectPercent));
                break;
            case Constants.SPELL_INCREASE_DEFENCE:
                battleStats.setTotalDefense((int) (battleStats.getTotalDefense() * effectPercent));
                break;
            case Constants.SPELL_INCREASE_MAGIC_DEFENSE:
                battleStats.setTotalMagicDefense((int) (battleStats.getTotalMagicDefense() * effectPercent));
                break;
            case Constants.SPELL_INCREASE_HEALTH:
                battleStats.setTotalHealth((int) (battleStats.getTotalHealth() * effectPercent));
                break;
            case Constants.SPELL_INCREASE_MANA:
                battleStats.setTotalMagic((int) (battleStats.getTotalMagic() * effectPercent));
                break;
        }
        
        
        effectValue = (int) (effectPercent * 100);
        
        if (effectValue > 100){
            effectValue -= 100;
        }
        
        return effectValue;
    }
}
