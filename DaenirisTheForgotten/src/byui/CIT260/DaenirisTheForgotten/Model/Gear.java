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
public class Gear implements Serializable{
    
    private String name;
    private String specialEffects;
    private Double attackBonus;
    private Double defenseBonus;
    private Double magicAttackBonus;
    private Double magicDefenseBonus;
    private String description;

    public Gear() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialEffects() {
        return specialEffects;
    }

    public void setSpecialEffects(String specialEffects) {
        this.specialEffects = specialEffects;
    }

    public Double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(Double attackBonus) {
        this.attackBonus = attackBonus;
    }

    public Double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(Double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    public Double getMagicAttackBonus() {
        return magicAttackBonus;
    }

    public void setMagicAttackBonus(Double magicAttackBonus) {
        this.magicAttackBonus = magicAttackBonus;
    }

    public Double getMagicDefenseBonus() {
        return magicDefenseBonus;
    }

    public void setMagicDefenseBonus(Double magicDefenseBonus) {
        this.magicDefenseBonus = magicDefenseBonus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gear{" + "name=" + name + ", specialEffects=" + specialEffects + ", attackBonus=" + attackBonus + ", defenseBonus=" + defenseBonus + ", magicAttackBonus=" + magicAttackBonus + ", magicDefenseBonus=" + magicDefenseBonus + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.specialEffects);
        hash = 53 * hash + Objects.hashCode(this.attackBonus);
        hash = 53 * hash + Objects.hashCode(this.defenseBonus);
        hash = 53 * hash + Objects.hashCode(this.magicAttackBonus);
        hash = 53 * hash + Objects.hashCode(this.magicDefenseBonus);
        hash = 53 * hash + Objects.hashCode(this.description);
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
        final Gear other = (Gear) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.specialEffects, other.specialEffects)) {
            return false;
        }
        if (!Objects.equals(this.attackBonus, other.attackBonus)) {
            return false;
        }
        if (!Objects.equals(this.defenseBonus, other.defenseBonus)) {
            return false;
        }
        if (!Objects.equals(this.magicAttackBonus, other.magicAttackBonus)) {
            return false;
        }
        if (!Objects.equals(this.magicDefenseBonus, other.magicDefenseBonus)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
