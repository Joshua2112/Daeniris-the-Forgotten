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
public class CraftRecipe implements Serializable 
{
    private String craftName;
    private String resource1;
    private int resource1Amount;
    private String resource2;
    private int resource2Amount;
    private String resource3;
    private int resource3Amount;
    
    public CraftRecipe() {}

    public String getCraftName() {
        return craftName;
    }

    public String getResource1() {
        return resource1;
    }

    public int getResource1Amount() {
        return resource1Amount;
    }

    public String getResource2() {
        return resource2;
    }

    public int getResource2Amount() {
        return resource2Amount;
    }

    public String getResource3() {
        return resource3;
    }

    public int getResource3Amount() {
        return resource3Amount;
    }

    public void setCraftName(String craftName) {
        this.craftName = craftName;
    }

    public void setResource1(String resource1) {
        this.resource1 = resource1;
    }

    public void setResource1Amount(int resource1Amount) {
        this.resource1Amount = resource1Amount;
    }

    public void setResource2(String resource2) {
        this.resource2 = resource2;
    }

    public void setResource2Amount(int resource2Amount) {
        this.resource2Amount = resource2Amount;
    }

    public void setResource3(String resource3) {
        this.resource3 = resource3;
    }

    public void setResource3Amount(int resource3Amount) {
        this.resource3Amount = resource3Amount;
    }

    @Override
    public String toString() {
        return "Crafts:"
               + "craftName: "       + craftName + "\n"
               + "resource1: "       + resource1 + "\n"
               + "resource1Amount: " + resource1Amount + "\n"
               + "resource2: "       + resource2 + "\n"
               + "resource2Amount: " + resource2Amount + "\n"
               + "resource3:"        + resource3 + "\n"
               + "resource3Amount: " + resource3Amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.craftName);
        hash = 23 * hash + Objects.hashCode(this.resource1);
        hash = 23 * hash + this.resource1Amount;
        hash = 23 * hash + Objects.hashCode(this.resource2);
        hash = 23 * hash + this.resource2Amount;
        hash = 23 * hash + Objects.hashCode(this.resource3);
        hash = 23 * hash + this.resource3Amount;
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
        final CraftRecipe other = (CraftRecipe) obj;
        if (!Objects.equals(this.craftName, other.craftName)) {
            return false;
        }
        if (!Objects.equals(this.resource1, other.resource1)) {
            return false;
        }
        if (this.resource1Amount != other.resource1Amount) {
            return false;
        }
        if (!Objects.equals(this.resource2, other.resource2)) {
            return false;
        }
        if (this.resource2Amount != other.resource2Amount) {
            return false;
        }
        if (!Objects.equals(this.resource3, other.resource3)) {
            return false;
        }
        if (this.resource3Amount != other.resource3Amount) {
            return false;
        }
        return true;
    }
    
                
    
}
