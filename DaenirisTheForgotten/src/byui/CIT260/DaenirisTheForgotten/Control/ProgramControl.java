/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;

/**
 *
 * @author Joshua
 */
public class ProgramControl {
    
    public class Player{       
    }

    public static PlayerCharacter createPlayerCharacter(String playerCharactersName) {
        System.out.println("createPlayerCharacter function was called");
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.setName(playerCharactersName);
        return playerCharacter;
    }
    
    
    
}
