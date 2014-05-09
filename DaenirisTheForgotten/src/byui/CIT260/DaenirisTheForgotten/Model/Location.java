/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;


import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Nathan
 */
public class Location implements Serializable 
{
    private String name;
    private char   symbol;

    public Location()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);
        
        if (randomInt == 1)
        {
            name = "Tree";
            symbol = 'T';
        }
        else if (randomInt == 2)
        {
            name = "Rock";
            symbol = 'R';
        }
        else
        {
            name = "Nothing";
            symbol = 'o';
        }
        
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
        public char getSymbol() 
    {
        return symbol;
    }

    public void setName(char symbol) 
    {
        this.symbol = symbol;
    }
}
