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
public class Actor implements Serializable{
    
    private String name;
    private int attack;
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int healthPoints;
    private int magicPoints;

    public Actor() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", attack=" + attack + ", defense=" + defense + ", magicAttack=" + magicAttack + ", magicDefense=" + magicDefense + ", healthPoints=" + healthPoints + ", magicPoints=" + magicPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.magicAttack) ^ (Double.doubleToLongBits(this.magicAttack) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.magicDefense) ^ (Double.doubleToLongBits(this.magicDefense) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.magicPoints) ^ (Double.doubleToLongBits(this.magicPoints) >>> 32));
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defense) != Double.doubleToLongBits(other.defense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicAttack) != Double.doubleToLongBits(other.magicAttack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicDefense) != Double.doubleToLongBits(other.magicDefense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicPoints) != Double.doubleToLongBits(other.magicPoints)) {
            return false;
        }
        return true;
    }
    
    
    
}
