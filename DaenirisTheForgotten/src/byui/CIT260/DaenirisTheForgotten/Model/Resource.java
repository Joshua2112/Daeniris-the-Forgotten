/*********************************************************************
 * Resource Sub-Class  (Child of the Location Class)
 * Author: Nathan Wittmann
 * Class that contains data for resources that are located on the map
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;

import java.io.Serializable;
import java.util.Random;

public class Resource extends Location
{
    private int maxAmount;

    //Constructor
    public Resource()
    {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);
        if (randomInt == 1)
        {
            this.setName("Forrest");
            this.setSymbol('t');
            this.setDiscovered(false);
            maxAmount = 4;
        }
        else if (randomInt == 2)
        {
            this.setName("Mountains");
            this.setSymbol('^');
            this.setDiscovered(false);
            maxAmount = 2;
        }
        else
        {
            this.setName("Plains");
            this.setSymbol('_');
            this.setDiscovered(false);
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
    
    
}
