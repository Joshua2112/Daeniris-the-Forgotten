/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.World;


/**
 *
 * @author Nathan
 */
public class MoveControl {
    MoveControl(){}
    
    public static void move(World gameWorld, int x, int y ) {
        gameWorld.setxLoc(gameWorld.getxLoc() + x);
        gameWorld.setyLoc(gameWorld.getxLoc() + y);
    }
}
