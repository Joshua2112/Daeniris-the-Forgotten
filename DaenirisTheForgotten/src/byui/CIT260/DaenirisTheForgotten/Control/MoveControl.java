/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.Control.MoveChanceControl;
import daeniristheforgotten.DaenirisTheForgotten;


/**
 *
 * @author Nathan
 */
public class MoveControl {
    
    
    MoveControl(){}
    
    public static void move(int x, int y) {
        Game game = DaenirisTheForgotten.currentGame;
        World world = game.getWorld();
        Location[][] mapArray = DaenirisTheForgotten.getCurrentGame().getWorld().getMap();
          
        world.setxLoc(world.getxLoc() + x);
        world.setyLoc(world.getyLoc() + y);
        

        
        //System.out.println("xloc: " + world.getxLoc());
        //System.out.println("yloc: " + world.getyLoc());
        
        int curX = world.getxLoc();
        int curY = world.getyLoc();
        int offsetX;
        int offsetY;
                
        
        for (int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
               
                offsetX = curX + i;
                offsetY = curY + j;
                
                if (offsetX > -1 && offsetY > -1 && offsetX < 11 && offsetY < 11){
                    mapArray[offsetX][offsetY].setDiscovered(true);
                }
            }
        }
        
        
       MoveChanceControl.MoveChance();
    }
}
