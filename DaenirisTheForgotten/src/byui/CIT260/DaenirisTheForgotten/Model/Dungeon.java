/*********************************************************************
 * Dungeon Class (Sub-Class of Location)
 * Author: Nathan Wittmann
 * Creates a special location for a dungeon on the map. 
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Model;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Nathan
 */
public class Dungeon extends Location
{
    private Inventory [] dungeonInventory = new Inventory [3];

    public Dungeon() 
    {
            this.setName("Dungeon");
            this.setSymbol('D');
    }

    public Inventory[] getDungeonInventory() {
        return dungeonInventory;
    }

    public void setDungeonInventory(Inventory[] dungeonInventory) {
        this.dungeonInventory = dungeonInventory;
    }

    @Override
    public String toString() {
        return "Dungeon{" + "dungeonInventory=" + dungeonInventory + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Arrays.deepHashCode(this.dungeonInventory);
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
        final Dungeon other = (Dungeon) obj;
        if (!Arrays.deepEquals(this.dungeonInventory, other.dungeonInventory)) {
            return false;
        }
        return true;
    }
    
     
}
