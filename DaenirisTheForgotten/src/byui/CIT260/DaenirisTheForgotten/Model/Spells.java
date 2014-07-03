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
public class Spells implements Serializable{
    
    private String spellName;
    private String description;
    private String message;
    private int spellType;
    private int attackDamage;
    private int magicCost;
    private double specialEffects;
    private boolean learned;

    public Spells() {
        
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String target) {
        this.description = target;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getMagicCost() {
        return magicCost;
    }

    public void setMagicCost(int magicCost) {
        this.magicCost = magicCost;
    }

    public double getSpecialEffects() {
        return specialEffects;
    }

    public void setSpecialEffects(double specialEffects) {
        this.specialEffects = specialEffects;
    }

    public int getSpellType() {
        return spellType;
    }

    public void setSpellType(int spellType) {
        this.spellType = spellType;
    }

    public boolean isLearned() {
        return learned;
    }

    public void setLearned(boolean learned) {
        this.learned = learned;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    

    
    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return                                                   newline
                + "Spell Name: "    + this.getSpellName()      + newline
                + "Description: "   + this.getDescription()    + newline
                + "magic Cost: "    + this.getMagicCost()      + newline
                + "Effects Value: " + this.getSpecialEffects() + newline;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.spellName);
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Objects.hashCode(this.attackDamage);
        hash = 61 * hash + Objects.hashCode(this.magicCost);
        hash = 61 * hash + Objects.hashCode(this.specialEffects);
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
        final Spells other = (Spells) obj;
        if (!Objects.equals(this.spellName, other.spellName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.attackDamage, other.attackDamage)) {
            return false;
        }
        if (!Objects.equals(this.magicCost, other.magicCost)) {
            return false;
        }
        if (!Objects.equals(this.specialEffects, other.specialEffects)) {
            return false;
        }
        return true;
    }


    
    

    
    
            
    
}
