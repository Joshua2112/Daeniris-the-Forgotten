/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Control.MoveChanceControl;
import byui.CIT260.DaenirisTheForgotten.Exception.MovedOffMapException;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;


/**
 *
 * @author Nathan
 */
public class MoveControl {
    
    
    MoveControl(){}
    
    public static int move(int x, int y) throws MovedOffMapException{
        Game game = DaenirisTheForgotten.currentGame;
        World world = game.getWorld();
        BattleScene battle = game.getBattle();
        Location[][] mapArray = DaenirisTheForgotten.getCurrentGame().getWorld().getMap();
        double sightValue = 2;
        
        
        if (world.getxLoc() + x > Constants.MAP_MAX_X -1 || world.getxLoc() + x < 0 || 
                world.getyLoc() + y > Constants.MAP_MAX_Y- 1 || world.getyLoc() + y < 0){
            throw new MovedOffMapException("Can't move past edge of map");
        }
         
        world.setxLoc(world.getxLoc() + x);
        world.setyLoc(world.getyLoc() + y);
        
        revealMap(sightValue);
        
        MoveChanceControl battleView = new MoveChanceControl();
        int option = battleView.MoveChance();
        return option;
    }
    
    public static void revealMap(double sightValue){
        Game game = DaenirisTheForgotten.currentGame;
        World world = game.getWorld();
        Location[][] mapArray = DaenirisTheForgotten.getCurrentGame().getWorld().getMap();
        int curX = world.getxLoc();
        int curY = world.getyLoc();
        int offsetX;
        int offsetY;     
        
        if (sightValue > 2){
            curX -= ((int) (sightValue / 2))-1;
            curY -= ((int) (sightValue / 2))-1;
        }

        for (int i = -1; i < sightValue; i++){
            for(int j = -1; j < sightValue; j++){
                
                offsetX = curX + i;
                offsetY = curY + j;
                
                if (offsetX > -1 && offsetY > -1 
                        && offsetX < Constants.MAP_MAX_X 
                        && offsetY < Constants.MAP_MAX_Y){
                    mapArray[offsetX][offsetY].setDiscovered(true);
                }
            }
        }
    }
}
