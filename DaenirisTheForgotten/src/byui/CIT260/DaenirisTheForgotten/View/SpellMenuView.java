/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.SpellControl;
import byui.CIT260.DaenirisTheForgotten.Control.stringNotFoundException;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua
 */
public class SpellMenuView extends View{

    public SpellMenuView() {
        super("Type name to select");
    }
    
    @Override
    public int doAction(String str){
        
        try{
            System.out.println(SpellControl.getSpell(str).toString());
        }catch(stringNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        displayCast(str);
        
        return 0;
    }   

    private void displayCast(String str) {
        
        String value;
        
        System.out.println("Select 'C' to cast spell or Select 'Q' to quit."); 
        
        do{ 
            value = getInput();
            
            if (value.equals("C")){
                if(SpellControl.castSpell(str, false)){
                    System.out.println("Can only be cast in a battle");
                }
                return;
            }
            
        } while(!value.equals("Q"));
    }
   
}
