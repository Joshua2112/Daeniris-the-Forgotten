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
    
    private String target;
    private Double attackDamage;
    private Double magicCost;
    private String specialEffects;

    public Spells() {
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(Double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public Double getMagicCost() {
        return magicCost;
    }

    public void setMagicCost(Double magicCost) {
        this.magicCost = magicCost;
    }

    public String getSpecialEffects() {
        return specialEffects;
    }

    public void setSpecialEffects(String specialEffects) {
        this.specialEffects = specialEffects;
    }

    @Override
    public String toString() {
        return "Spells{" + "target=" + target + ", attackDamage=" + attackDamage + ", magicCost=" + magicCost + ", specialEffects=" + specialEffects + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.target);
        hash = 97 * hash + Objects.hashCode(this.attackDamage);
        hash = 97 * hash + Objects.hashCode(this.magicCost);
        hash = 97 * hash + Objects.hashCode(this.specialEffects);
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
        if (!Objects.equals(this.target, other.target)) {
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
