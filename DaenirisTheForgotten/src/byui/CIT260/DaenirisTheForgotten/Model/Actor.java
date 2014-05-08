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
    private double attack;
    private double defense;
    private double magicAttack;
    private double magicDefense;
    private double healthPoints;
    private double magicPoints;

    public Actor() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(double magicAttack) {
        this.magicAttack = magicAttack;
    }

    public double getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(double magicDefense) {
        this.magicDefense = magicDefense;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(double magicPoints) {
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
