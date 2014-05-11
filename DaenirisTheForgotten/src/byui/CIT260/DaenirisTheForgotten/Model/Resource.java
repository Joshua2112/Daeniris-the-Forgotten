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
            this.setName("Tree");
            this.setSymbol('T');
            maxAmount = 4;
        }
        else if (randomInt == 2)
        {
            this.setName("Rock");
            this.setSymbol('R');
            maxAmount = 2;
        }
        else
        {
            this.setName("Nothing");
            this.setSymbol('o');
            maxAmount = 0;
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
