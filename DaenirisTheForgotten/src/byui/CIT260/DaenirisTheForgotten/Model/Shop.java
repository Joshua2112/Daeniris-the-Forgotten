/*********************************************************************
 * Shop Sub-Class  (Child of the Location Class)
 * Author: Nathan Wittmann
 * Class that contains a special Shop location on the map. 
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;

import java.io.Serializable;
import java.util.Arrays;


public class Shop extends Location
{
    private Inventory[][] shopInventory = new Inventory[4][10];

    public Shop() 
    {
            this.setName("Shop");
            this.setSymbol('S');        
    }

    public Inventory[][] getShopInventory() {
        return shopInventory;
    }

    public void setShopInventory(Inventory[][] shopInventory) {
        this.shopInventory = shopInventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Arrays.deepHashCode(this.shopInventory);
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
        final Shop other = (Shop) obj;
        if (!Arrays.deepEquals(this.shopInventory, other.shopInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shop{" + "shopInventory=" + shopInventory + '}';
    }
    
    
    
}
