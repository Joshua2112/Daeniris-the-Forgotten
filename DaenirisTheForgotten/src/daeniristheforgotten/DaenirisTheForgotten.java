/*********************************************************************
 * Daeniris The Forgotten (Role Playing Game)
 * Author: Joshua & Nathan Wittmann
 * Game Main
 *********************************************************************/

package daeniristheforgotten;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.View.ProgramStart;

public class DaenirisTheForgotten {
    
    public static Game currentGame = null;
    public static PlayerCharacter playerCharacter = null;
    
    public static void main(String[] args){
        
        ProgramStart programStart = new ProgramStart();
        programStart.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DaenirisTheForgotten.currentGame = currentGame;
    }

    public static PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public static void setPlayerCharacter(PlayerCharacter playerCharacter) {
        DaenirisTheForgotten.playerCharacter = playerCharacter;
    }
    
    
}