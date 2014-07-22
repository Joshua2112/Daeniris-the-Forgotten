package byui.CIT260.DaenirisTheForgotten.Model;

import java.awt.image.BufferedImage;
import java.net.URL;


/*********************************************************************
 * Game Class
 * Author: Nathan Wittmann
 * Class that contains basic information about the game. 
 *********************************************************************/

public class Game 
{
    private float gameTime;
    private Inventory[] inventory;
    private Actor[][] actor;
    private World world;
    private CraftRecipe[][] craftRecipe;
    private Spells[][] spells;
    private BattleScene battle;
    private Gear[] helms;
    private Gear[] armors;
    private Gear[] secondaries;
    public Gear[] weapons;
    public EquippedGear equippedGear;
    public URL[] picURL;

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Actor[][] getActor() {
        return actor;
    }

    public void setActor(Actor[][] actor) {
        this.actor = actor;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public CraftRecipe[][] getCraftRecipe() {
        return craftRecipe;
    }

    public void setCraftRecipe(CraftRecipe[][] craftRecipe) {
        this.craftRecipe = craftRecipe;
    }

    public Spells[][] getSpells() {
        return spells;
    }

    public void setSpells(Spells[][] spells) {
        this.spells = spells;
    }
    
    public Game() {}

    public float getGameTime() {
        return gameTime;
    }

    public void setGameTime(float gameTime) {
        this.gameTime = gameTime;
    }

    public BattleScene getBattle() {
        return battle;
    }

    public void setBattle(BattleScene battle) {
        this.battle = battle;
    }

    public Gear[] getHelms() {
        return helms;
    }

    public void setHelms(Gear[] helms) {
        this.helms = helms;
    }

    public Gear[] getArmors() {
        return armors;
    }

    public void setArmors(Gear[] armors) {
        this.armors = armors;
    }

    public Gear[] getSecondaries() {
        return secondaries;
    }

    public void setSecondaries(Gear[] secondaries) {
        this.secondaries = secondaries;
    }

    public Gear[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Gear[] weapons) {
        this.weapons = weapons;
    }

    public EquippedGear getEquippedGear() {
        return equippedGear;
    }

    public void setEquippedGear(EquippedGear equippedGear) {
        this.equippedGear = equippedGear;
    }

    public URL[] getPicURL() {
        return picURL;
    }

    public void setPicURL(URL[] picURL) {
        this.picURL = picURL;
    }
    
    
      
    @Override
    public String toString() {
        return "Game{" + "gameTime=" + gameTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Float.floatToIntBits(this.gameTime);
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
        final Game other = (Game) obj;
        if (Float.floatToIntBits(this.gameTime) != Float.floatToIntBits(other.gameTime)) {
            return false;
        }
        return true;
    }                  
}