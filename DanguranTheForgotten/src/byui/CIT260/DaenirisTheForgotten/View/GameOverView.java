/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import dangurantheforgotten.DanguranTheForgotten;

/**
 *
 * @author Joshua
 */
public class GameOverView {
    
    Game game = DanguranTheForgotten.getCurrentGame();
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    public void endGame() {
        
        System.out.println("\n\t" + player.getName() + " has died.  \n\tWe hope you saved recently.");
        MainMenuView menu = new MainMenuView();
        menu.display();
    }
    
}
