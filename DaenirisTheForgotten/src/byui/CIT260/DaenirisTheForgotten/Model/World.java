/*********************************************************************
 * World Class
 * Author: Nathan Wittmann
 * Creates various locations that are located on the world map.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;

public class World implements Serializable{
    
    private Location[][] map = new Location[Constants.MAP_MAX_X][Constants.MAP_MAX_Y];
    private int xLoc;
    private int yLoc;
    private boolean visable;
    
    public World()
    {
       for(int i = 0; i < Constants.MAP_MAX_X; i++)
       {
           for(int j = 0; j < Constants.MAP_MAX_Y; j++)
           {
                map[i][j] = new Resource();
           }
       }
       
       GameControl.createMapLocations(map);
           
       //map[0][5] = new Dungeon();
       
       map[7][21] = new Dungeon();
       map[7][21].setSymbol('D');
       map[7][21].setDiscovered(Constants.MAP_DISCOVERED);
       
       map[32][50] = new Dungeon();
       map[32][50].setSymbol('d');
       map[32][50].setDiscovered(Constants.MAP_DISCOVERED);
       
       map[19][90] = new Dungeon();
       map[19][90].setSymbol('X');
       map[19][90].setDiscovered(Constants.MAP_DISCOVERED);
       
       map[Constants.MAP_START_X][Constants.MAP_START_Y] = new Shop();
       
       
        xLoc = Constants.MAP_START_X;
        yLoc = Constants.MAP_START_Y;
        visable = false;
    }

    //Getters
    public Location[][] getMap() {
        return map;
    }

    public int getxLoc() {
        return xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }
    
    //Setters
    public void setMap(Location[][] map) {
        this.map = map;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public boolean isVisable() {
        return visable;
    }

    public void setVisable(boolean visable) {
        this.visable = visable;
    }
    
    
    
    //Other Functions
    
    
    @Override
    public String toString() {
        return "World{xLoc=" + xLoc + ", yLoc=" + yLoc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.map);
        hash = 97 * hash + this.xLoc;
        hash = 97 * hash + this.yLoc;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final World other = (World) obj;
        if (!Arrays.deepEquals(this.map, other.map)) {
            return false;
        }
        if (this.xLoc != other.xLoc) {
            return false;
        }
        if (this.yLoc != other.yLoc) {
            return false;
        }
        return true;
    }

    
}
