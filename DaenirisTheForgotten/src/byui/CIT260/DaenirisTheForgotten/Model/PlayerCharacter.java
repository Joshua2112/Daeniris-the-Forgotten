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
public class PlayerCharacter extends Actor{
    
    private String job;
    private String gender;
    private int playerGold;
    private int levelPoints;

    public PlayerCharacter() {
        levelPoints = 5;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getLevelPoints() {
        return levelPoints;
    }

    public void setLevelPoints(int levelPoints) {
        this.levelPoints = levelPoints;
    }
    
    
    
    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return "Character (Player):"                         + newline
                + "name= "         + this.getName()          + newline
                + "gender= "       + gender                  + newline
                + "job= "          + job                     + newline
                + "attack= "       + this.getAttack()        + newline
                + "defense= "      + this.getDefense()       + newline
                + "magicAttack= "  + this.getMagicAttack()   + newline
                + "magicDefense= " + this.getMagicDefense()  + newline
                + "healthPoints= " + this.getHealthPoints()  + newline
                + "magicPoints= "  + this.getMagicPoints()   + newline
                + "playerGold"  + this.getPlayerGold()  + newline
                + "levelPoints" + this.getLevelPoints() + newline;   
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.job);
        hash = 67 * hash + Objects.hashCode(this.gender);
        hash = 67 * hash + Objects.hashCode(this.playerGold);
        hash = 67 * hash + Objects.hashCode(this.levelPoints);
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
        final PlayerCharacter other = (PlayerCharacter) obj;
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }
    
    
    
}
