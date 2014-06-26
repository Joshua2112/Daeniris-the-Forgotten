/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EnterCharacterName {
    
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actors = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    public void EnterPlayerCharactersName() {
        String playersName = this.getPlayerCharactersName();
        player.setName(playersName);
    }

    public String getPlayerCharactersName(){
        
        boolean valid = false;
        String playerCharactersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("\n\tPlease enter character's name");
            
            playerCharactersName = keyboard.nextLine();
            playerCharactersName = playerCharactersName.trim();
            
            if (playerCharactersName.toUpperCase().equals("Q")){
                return null;
            }
            
            if (playerCharactersName.length() < 2){
                System.out.println("\n\tInvalid name, must be greater than 2 characters in length");
            }
                           
            else{
                valid = true;
            }
        }
        return playerCharactersName;
        }    
}
