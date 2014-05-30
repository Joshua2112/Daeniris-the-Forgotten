/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

/**
 *
 * @author Joshua
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        System.out.println("createPlayer function was called");
        Player player = new Player();
        player.setName(playersName);
        return player;
    }
    
    public class Player{
        
    }
    
}
