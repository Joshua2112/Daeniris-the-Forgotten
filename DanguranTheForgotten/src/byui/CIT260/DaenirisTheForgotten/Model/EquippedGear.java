/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;

import dangurantheforgotten.DanguranTheForgotten;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joshua
 */
public class EquippedGear implements Serializable{
    
    Game game = DanguranTheForgotten.getCurrentGame();
    Gear[] helms = game.getHelms();
    Gear[] weapons = game.getWeapons();
    Gear[] armors = game.getArmors();
    Gear[] secondaries = game.getSecondaries();
    
    private Gear helmet = new Gear();
    private Gear weapon = new Gear();
    private Gear armor = new Gear();
    private Gear leftHand = new Gear();
    
    public int getTAB(){   
    int totalAttackBonus = helmet.getAttackBonus() + weapon.getAttackBonus() + armor.getAttackBonus() + leftHand.getAttackBonus();
        return totalAttackBonus;
    }
    public int getTDB(){
    int totalDefenseBonus = helmet.getDefenseBonus() + weapon.getDefenseBonus() + armor.getDefenseBonus() + leftHand.getDefenseBonus();
        return totalDefenseBonus;
    }
    public int getTMAB(){
    int totalMagicAttackBonus = helmet.getMagicAttackBonus() + weapon.getMagicAttackBonus() + armor.getMagicAttackBonus() + leftHand.getMagicAttackBonus();
        return totalMagicAttackBonus;
    }
    public int getTMDB(){       
    int totalMagicDefenseBonus = helmet.getMagicDefenseBonus() + weapon.getMagicDefenseBonus() + armor.getMagicDefenseBonus() + leftHand.getMagicDefenseBonus();
        return totalMagicDefenseBonus;
    }
    
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
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.helmet);
        hash = 97 * hash + Objects.hashCode(this.weapon);
        hash = 97 * hash + Objects.hashCode(this.armor);
        hash = 97 * hash + Objects.hashCode(this.leftHand);
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
        return "EquippedGear{" + "game=" + game + ", helms=" + helms + ", weapons=" + weapons + ", armors=" + armors + ", secondaries=" + secondaries + ", helmet=" + helmet + ", weapon=" + weapon + ", armor=" + armor + ", leftHand=" + leftHand;
    }

    
    
    
    
}
