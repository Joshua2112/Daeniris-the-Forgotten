/*********************************************************************
 * Daeniris The Forgotten (Role Playing Game)
 * Author: Joshua & Nathan Wittmann
 * Game Main
 *********************************************************************/

package daeniristheforgotten;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.View.ProgramStart;

public class DaenirisTheForgotten {
    
    public static Game currentGame;
    public static PlayerCharacter playerCharacter;
    
    public static void main(String[] args){
        try{
            ProgramStart programStart = new ProgramStart();
            programStart.startProgram();
        }
        catch (Throwable e){
            System.out.println("An abnormal error occured."
                             + "Try running the program again."
                             + "\nIf the error persist contact support. ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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

