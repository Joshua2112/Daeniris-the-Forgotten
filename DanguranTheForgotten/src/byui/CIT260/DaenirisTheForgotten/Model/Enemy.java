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
public class Enemy extends Actor{

    public Enemy() {
    }
    
     private int experienceValue;
     private String itemsDropped;
     private int goldValue;
     private boolean magicAttacker;
     private String spellUsed;
     private int spellUseDamage;
     private int spellCost;


    public int getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(int experienceValue) {
        this.experienceValue = experienceValue;
    }

    public String getItemsDropped() {
        return itemsDropped;
    }

    public void setItemsDropped(String itemsDropped) {
        this.itemsDropped = itemsDropped;
    }

    public boolean isMagicAttacker() {
        return magicAttacker;
    }

    public void setMagicAttacker(boolean magicAttacker) {
        this.magicAttacker = magicAttacker;
    }

    public String getSpellUsed() {
        return spellUsed;
    }

    public void setSpellUsed(String spellUsed) {
        this.spellUsed = spellUsed;
    }

    public int getSpellUseDamage() {
        return spellUseDamage;
    }

    public void setSpellUseDamage(int spellUseDamage) {
        this.spellUseDamage = spellUseDamage;
    }

    public int getSpellCost() {
        return spellCost;
    }

    public void setSpellCost(int spellCost) {
        this.spellCost = spellCost;
    }
    
    

    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return "Character (Enemy):"                            + newline
                + "name= "            + this.getName()         + newline
                + "attack= "          + this.getAttack()       + newline
                + "defense= "         + this.getDefense()      + newline
                + "magicAttack= "     + this.getMagicAttack()  + newline
                +                       this.getMagicDefense()
                + "healthPoints= "    + this.getCurrentHealthPoints() + newline
                + "/"
                +                     + this.getMagicPoints() + newline
                + "magicDefense= "    + this.getCurrentMagicPoints() + newline
                + "/"                
                + "magicPoints= "     + this.getMagicPoints()  + newline
                + "experienceValue= " + experienceValue        + newline
                + "itemsDropped= "    + itemsDropped           + newline
                + "goldValue= "       + goldValue              + newline;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.experienceValue);
        hash = 37 * hash + Objects.hashCode(this.itemsDropped);
        hash = 37 * hash + Objects.hashCode(this.goldValue);
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
        final Enemy other = (Enemy) obj;
        if (!Objects.equals(this.experienceValue, other.experienceValue)) {
            return false;
        }
        if (!Objects.equals(this.itemsDropped, other.itemsDropped)) {
            return false;
        }
        return true;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }
    
     
     
}
