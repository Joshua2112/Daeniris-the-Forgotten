/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class ProgramControl {

    public static void saveGame(Game currentGame) {
        System.out.println("Save game function called");
    }

    public static void loadGame(Game currentGame) {
        System.out.println("Load game function called");
    }
    
    public class Player{       
    }

    public static PlayerCharacter createPlayerCharacter(String playerCharactersName) {
        System.out.println("createPlayerCharacter function was called");
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.setName(playerCharactersName);
        
        DaenirisTheForgotten.setPlayerCharacter(playerCharacter);
        
        return playerCharacter;
    }
    
    public static World createWorld(){
        World gameWorld = new World();
        return gameWorld;
    }
}
