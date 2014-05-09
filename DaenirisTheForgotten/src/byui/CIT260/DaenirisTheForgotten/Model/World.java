/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Nathan
 */
public class World implements Serializable{
    
    public Location[][] map = new Location[10][10];
    private int xLoc;
    private int yLoc;
    
    public World()
    {
        /*
        map = new int[][]
        {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
            
        };
        */
        

       
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
               map[i][j] = new Location();
           }
       }        
        
        xLoc = 0;
        yLoc = 0;
    }
    
    public int getXloc() 
    {
        return xLoc;
    }
    
    public int getYloc() 
    {
        return yLoc;
    }
    
    public void setXloc(int xLoc) 
    {
        this.xLoc = xLoc;
    }
    
    public void setYloc(int yLoc) 
    {
        this.yLoc = yLoc;
    }

}
