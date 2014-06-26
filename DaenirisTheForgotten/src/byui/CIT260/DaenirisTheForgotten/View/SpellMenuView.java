/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.SpellControl;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class SpellMenuView extends View{

    public SpellMenuView() {
        super("Type name to select");
    }
    
    @Override
    public void doAction(String str){
             
        Game game = DaenirisTheForgotten.getCurrentGame();
        Spells[][] spells = game.getSpells();
        
        //displaySpells();
        
        int column = 0;
        int row = 0;
        
        for (int i = 0; i < Constants.SPELL_COL_COUNT; i++){
            row = GameControl.stringSearch(spells, str, i);
            column = i;
        }
        
        System.out.println(spells[column][row].toString());
        
        if (spells[column][row].getSpellType() == Constants.SPELL_HEALTH){
            displayCast(spells[column][row]);
        }
        else{
            System.out.println("Can only cast in a battle.");
        }
    }   

    private void displayCast(Spells spells) {
        
        String value;
        
        System.out.println("Select 'C' to cast spell or Select 'Q' to quit."); 
        
        do{ 
            value = getInput();
            
            if (value.equals("C")){
                SpellControl.castSpell(spells);
                return;
            }
            
        } while(!value.equals("Q"));
    }
   
}
