/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class ProgramControl {
    
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    public static void saveGame(Game currentGame) {
        System.out.println("Save game function called");
    }

    public static void loadGame(Game currentGame) {
        System.out.println("Load game function called");
    }
    
    public class Player{       
    }

    public PlayerCharacter createPlayerCharacter(String playerCharactersName) {
        player.setName(playerCharactersName);
        
        DaenirisTheForgotten.setPlayerCharacter(player);
        
        return player;
    }
    
}
