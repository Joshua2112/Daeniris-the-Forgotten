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
 * @author Joshua
 */
public class SingeUseItems extends Inventory{
    
    private String effects;
    

    public SingeUseItems() {
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }


    @Override
    public String toString() {
        return "SingeUseItems{" + "effects=" + effects +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.effects);
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
        final SingeUseItems other = (SingeUseItems) obj;
        if (!Objects.equals(this.effects, other.effects)) {
            return false;
        }
        
        return true;
    }
    
    
    
}
