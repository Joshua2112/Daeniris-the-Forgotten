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
    private int currentHealthPoints;
    private int magicPoints;
    private int currentMagicPoints;

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

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getCurrentMagicPoints() {
        return currentMagicPoints;
    }

    public void setCurrentMagicPoints(int currentMagicPoints) {
        this.currentMagicPoints = currentMagicPoints;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", attack=" + attack + ", defense=" + defense + ", magicAttack=" + magicAttack + ", magicDefense=" + magicDefense + ", healthPoints=" + healthPoints + ", currentHealthPoints=" + currentHealthPoints + ", magicPoints=" + magicPoints + ", currentMagicPoints=" + currentMagicPoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.attack;
        hash = 43 * hash + this.defense;
        hash = 43 * hash + this.magicAttack;
        hash = 43 * hash + this.magicDefense;
        hash = 43 * hash + this.healthPoints;
        hash = 43 * hash + this.currentHealthPoints;
        hash = 43 * hash + this.magicPoints;
        hash = 43 * hash + this.currentMagicPoints;
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
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.magicAttack != other.magicAttack) {
            return false;
        }
        if (this.magicDefense != other.magicDefense) {
            return false;
        }
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.currentHealthPoints != other.currentHealthPoints) {
            return false;
        }
        if (this.magicPoints != other.magicPoints) {
            return false;
        }
        if (this.currentMagicPoints != other.currentMagicPoints) {
            return false;
        }
        return true;
    }

    
    
    
    
}
