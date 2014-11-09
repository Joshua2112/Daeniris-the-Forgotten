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
    private int age;
    private int playerGold;
    private int levelPoints;
    private int experience;
    private int Level;


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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
           
    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getExperiencePoints() {
        return experience;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experience = experiencePoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.job);
        hash = 97 * hash + Objects.hashCode(this.gender);
        hash = 97 * hash + this.playerGold;
        hash = 97 * hash + this.levelPoints;
        hash = 97 * hash + this.Level;
        hash = 97 * hash + this.experience;
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
        if (this.playerGold != other.playerGold) {
            return false;
        }
        if (this.levelPoints != other.levelPoints) {
            return false;
        }
        if (this.Level != other.Level) {
            return false;
        }
        if (this.experience != other.experience) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return    "name = " + this.getName() + newline
                + "gender = " + gender + newline
                + "age = " + age + newline
                + "job = " + job + newline
                + "Level = " + Level + newline 
                + "health points = " + this.getHealthPoints() + newline
                + "magic points = " + this.getMagicPoints() + newline
                + "attack = " + this.getAttack() + newline
                + "defense = " + this.getDefense() + newline
                + "magic attack = " + this.getMagicAttack() + newline
                + "magic defense = " + this.getMagicDefense() + newline
                + "player Gold = " + playerGold + newline
                + "experience Points = " + experience
                + "level Points = " + levelPoints + newline;
    }

}
    
    
    
