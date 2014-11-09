/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import dangurantheforgotten.DanguranTheForgotten;

/**
 *
 * @author Joshua
 */
public class HealingPondScene extends View{
    
    
    

    public HealingPondScene() {
        super("\n\tYou stumble upon a magic pond.  The water refreshes you."
                + "\n\tEnter 'a' to proceed");
    }

    @Override
    public int doAction(String value) {
        Game game = DanguranTheForgotten.getCurrentGame();
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
        player.setCurrentHealthPoints(player.getHealthPoints());
        player.setCurrentMagicPoints(player.getMagicPoints());
        
        switch (value){
                
        case "A":
            return 1;
        default:
            System.out.println("\n\tInvalid selection, try again");
            break;
    }
        return 1;
    }
    
}
