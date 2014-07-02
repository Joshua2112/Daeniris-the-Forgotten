/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;

import daeniristheforgotten.DaenirisTheForgotten;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joshua
 */
public class EquippedGear implements Serializable{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] helms = game.getHelms();
    Gear[] weapons = game.getWeapons();
    Gear[] armors = game.getArmors();
    Gear[] secondaries = game.getSecondaries();
    
    private Gear helmet = new Gear();
    private Gear weapon = new Gear();
    private Gear armor = new Gear();
    private Gear leftHand = new Gear();
    
    private int totalAttackBonus = helmet.getAttackBonus() + weapon.getAttackBonus() + armor.getAttackBonus() + leftHand.getAttackBonus();
    private int totalDefenseBonus = helmet.getDefenseBonus() + weapon.getDefenseBonus() + armor.getDefenseBonus() + leftHand.getDefenseBonus();
    private int totalMagicAttackBonus = helmet.getMagicAttackBonus() + weapon.getMagicAttackBonus() + armor.getMagicAttackBonus() + leftHand.getMagicAttackBonus();
    private int totalMagicDefenseBonus = helmet.getMagicDefenseBonus() + weapon.getMagicDefenseBonus() + armor.getMagicDefenseBonus() + leftHand.getMagicDefenseBonus();

    public Gear getHelmet() {
        return helmet;
    }

    public void setHelmet(Gear helmet) {
        this.helmet = helmet;
    }

    public Gear getArmor() {
        return armor;
    }

    public void setArmor(Gear armor) {
        this.armor = armor;
    }

    public Gear getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Gear leftHand) {
        this.leftHand = leftHand;
    }

    public Gear getWeapon() {
        return weapon;
    }

    public void setWeapon(Gear weapon) {
        this.weapon = weapon;
    }

    public int getTotalAttackBonus() {
        return totalAttackBonus;
    }

    public void setTotalAttackBonus(int totalAttackBonus) {
        this.totalAttackBonus = totalAttackBonus;
    }

    public int getTotalDefenseBonus() {
        return totalDefenseBonus;
    }

    public void setTotalDefenseBonus(int totalDefenseBonus) {
        this.totalDefenseBonus = totalDefenseBonus;
    }

    public int getTotalMagicAttackBonus() {
        return totalMagicAttackBonus;
    }

    public void setTotalMagicAttackBonus(int totalMagicAttackBonus) {
        this.totalMagicAttackBonus = totalMagicAttackBonus;
    }

    public int getTotalMagicDefenseBonus() {
        return totalMagicDefenseBonus;
    }

    public void setTotalMagicDefenseBonus(int totalMagicDefenseBonus) {
        this.totalMagicDefenseBonus = totalMagicDefenseBonus;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.helmet);
        hash = 97 * hash + Objects.hashCode(this.weapon);
        hash = 97 * hash + Objects.hashCode(this.armor);
        hash = 97 * hash + Objects.hashCode(this.leftHand);
        hash = 97 * hash + Objects.hashCode(this.totalAttackBonus);
        hash = 97 * hash + Objects.hashCode(this.totalDefenseBonus);
        hash = 97 * hash + Objects.hashCode(this.totalMagicAttackBonus);
        hash = 97 * hash + Objects.hashCode(this.totalMagicDefenseBonus);
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
        final EquippedGear other = (EquippedGear) obj;
        if (!Objects.equals(this.helmet, other.helmet)) {
            return false;
        }
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        if (!Objects.equals(this.armor, other.armor)) {
            return false;
        }
        if (!Objects.equals(this.leftHand, other.leftHand)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EquippedGear{" + "game=" + game + ", helms=" + helms + ", weapons=" + weapons + ", armors=" + armors + ", secondaries=" + secondaries + ", helmet=" + helmet + ", weapon=" + weapon + ", armor=" + armor + ", leftHand=" + leftHand + ", totalAttackBonus=" + totalAttackBonus + ", totalDefenseBonus=" + totalDefenseBonus + ", totalMagicAttackBonus=" + totalMagicAttackBonus + ", totalMagicDefenseBonus=" + totalMagicDefenseBonus + '}';
    }

    
    
    
    
}
