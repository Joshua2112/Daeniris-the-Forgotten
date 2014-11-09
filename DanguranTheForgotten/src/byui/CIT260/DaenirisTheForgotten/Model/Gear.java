/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;

import java.util.Objects;

/**
 *
 * @author Joshua
 */
public class Gear extends Inventory{
    
    private String specialEffects;
    private int attackBonus;
    private int defenseBonus;
    private int magicAttackBonus;
    private int magicDefenseBonus;
    private String gearType;

    public Gear() {
    }

    public String getSpecialEffects() {
        return specialEffects;
    }

    public void setSpecialEffects(String specialEffects) {
        this.specialEffects = specialEffects;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    public int getMagicAttackBonus() {
        return magicAttackBonus;
    }

    public void setMagicAttackBonus(int magicAttackBonus) {
        this.magicAttackBonus = magicAttackBonus;
    }

    public int getMagicDefenseBonus() {
        return magicDefenseBonus;
    }

    public void setMagicDefenseBonus(int magicDefenseBonus) {
        this.magicDefenseBonus = magicDefenseBonus;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    @Override
    public String toString() {
        return "Gear{" + "specialEffects=" + specialEffects + ", attackBonus=" + attackBonus + ", defenseBonus=" + defenseBonus + ", magicAttackBonus=" + magicAttackBonus + ", magicDefenseBonus=" + magicDefenseBonus + ", gearType=" + gearType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.specialEffects);
        hash = 19 * hash + Objects.hashCode(this.attackBonus);
        hash = 19 * hash + Objects.hashCode(this.defenseBonus);
        hash = 19 * hash + Objects.hashCode(this.magicAttackBonus);
        hash = 19 * hash + Objects.hashCode(this.magicDefenseBonus);
        hash = 19 * hash + Objects.hashCode(this.gearType);
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
        if (!Objects.equals(this.gearType, other.gearType)) {
            return false;
        }
        return true;
    }

    
}
