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
public class RawMaterial extends Inventory{
    private String resourceType;

    public RawMaterial() {}

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "RawMaterial{" + "resourceType=" + resourceType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.resourceType);
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
        final RawMaterial other = (RawMaterial) obj;
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }
    
}
