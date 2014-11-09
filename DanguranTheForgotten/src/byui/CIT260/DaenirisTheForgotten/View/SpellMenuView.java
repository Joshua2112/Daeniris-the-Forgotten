/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Control.SpellControl;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Exception.stringNotFoundException;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import dangurantheforgotten.DanguranTheForgotten;


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
            Spells spell = SpellControl.getSpell(str);
            System.out.println(spell.toString());
            displayCast(spell);

            }catch(stringNotFoundException ex){
                System.out.println(ex.getMessage());
        }
        return 0;
    }   

    private void displayCast(Spells spell) {
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        String value;
        
        System.out.println("Select 'C' to cast spell or Select 'Q' to quit."); 
        
        do{ 
            value = getInput();
            
            if (value.equals("C")){
                try{
                    SpellControl.castSpell(spell, false);
                    PlayerCharacterInfoView playerInfo = new PlayerCharacterInfoView();
                    playerInfo.display();
                }
                catch(illegalActionException ex){
                      System.out.println(ex.getMessage());
                }
                return;
            }
            
        } while(!value.equals("Q"));
    }
   
}
