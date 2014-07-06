/*********************************************************************
 * World Class
 * Author: Nathan Wittmann
 * Creates various locations that are located on the world map.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;



public class World implements Serializable{
    
    private Location[][] map = new Location[10][10];
    private int xLoc;
    private int yLoc;
    private boolean visable;
    
    public World()
    {
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
                   map[i][j] = new Resource();
           }
       }
       
       map[0][5] = new Dungeon();
       map[5][0] = new Dungeon();
       map[4][4] = new Dungeon();
       map[4][9] = new Dungeon();
       map[9][5] = new Shop();
       
        xLoc = 9;
        yLoc = 5;
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
