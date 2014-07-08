/*********************************************************************
 * Resource Sub-Class  (Child of the Location Class)
 * Author: Nathan Wittmann
 * Class that contains data for resources that are located on the map
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import java.io.Serializable;
import java.util.Random;

public class Resource extends Location{
    
    private int maxAmount;

    //Constructor
    public Resource(){

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        if (randomInt > 3 && randomInt < 15)
        {
            this.setName("Forest");
            this.setSymbol('T');
            this.setDiscovered(Constants.MAP_DISCOVERED);
            this.setDescription("You are surrounded by large looming oak trees.");
            maxAmount = 4;
        }
        else if (randomInt > 2 && randomInt < 4)
        {
            this.setName("Mountains");
            this.setSymbol('^');
            this.setDiscovered(Constants.MAP_DISCOVERED);
            this.setDescription("You are dwarfed by mountains.");
            maxAmount = 2;
        }
        else if (randomInt < 2)
        {
            this.setName("Dark Forest");
            this.setSymbol('Y');
            this.setDiscovered(Constants.MAP_DISCOVERED);
            this.setDescription("Your are in the midst of a gloomy forest");
            maxAmount = 2;
        }
        else
        {
            this.setName("Plains");
            this.setSymbol('_');
            this.setDiscovered(Constants.MAP_DISCOVERED);
            this.setDescription("Grassy plains span before you.");
            maxAmount = 3;
        }
                
    }

    //Getter
    public int getMaxAmount() {
        return maxAmount;
    }
    
    //Setter
    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }
    
    //other functions
    @Override
    public String toString() {
        return "Resource{" + "maxAmount=" + maxAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.maxAmount;
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
        final Resource other = (Resource) obj;
        if (this.maxAmount != other.maxAmount) {
            return false;
        }
        return true;
    }
    
    public static void setForest(Location location){
        location.setName("Forrest");
        location.setSymbol('T');
        location.setDiscovered(Constants.MAP_DISCOVERED);
        location.setDescription("You are surrounded by large looming oak trees.");
    }
    
    public static void setMountains(Location location){
        location.setName("Mountains");
        location.setSymbol('^');
        location.setDiscovered(Constants.MAP_DISCOVERED);
        location.setDescription("You are dwarfed by mountains.");
    }
    
    public static void setDarkForest(Location location){
        location.setName("Dark Forest");
        location.setSymbol('Y');
        location.setDiscovered(Constants.MAP_DISCOVERED);
        location.setDescription("Your are in the midst of a gloomy forest");        
    } 
    
    public static void setPlains(Location location){
        location.setName("Plains");
        location.setSymbol('_');
        location.setDiscovered(Constants.MAP_DISCOVERED);
        location.setDescription("Grassy plains span before you.");
    }
}
