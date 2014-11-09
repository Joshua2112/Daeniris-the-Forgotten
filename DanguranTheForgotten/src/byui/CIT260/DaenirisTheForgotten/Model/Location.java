/*********************************************************************
 * Location Sub Class  (Child of the World Class)
 * Author: Nathan Wittmann
 * Creates various locations that are located on the world map.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;


import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public abstract class Location implements Serializable 
{
    private String name;
    private char   symbol;
    private String description;
    private boolean discovered;

    //Constructor
    public Location(){}

    //Getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDiscovered() {
        return discovered;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    
    
    //Other Functions
    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", symbol=" + symbol + '}';
    }    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.symbol;
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.symbol != other.symbol) {
            return false;
        }
        return true;
    }
    
    
}
