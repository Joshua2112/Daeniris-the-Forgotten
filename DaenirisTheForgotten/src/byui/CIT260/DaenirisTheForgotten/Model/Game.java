package byui.CIT260.DaenirisTheForgotten.Model;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;

/*********************************************************************
 * Game Class
 * Author: Nathan Wittmann
 * Class that contains basic information about the game. 
 *********************************************************************/

public class Game 
{
    private float gameTime;
    private Inventory[] inventory;
    private Actor[] actor;
    private World world;
    private CraftRecipe[] craftRecipe;
    private Spells[] spells;

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public CraftRecipe[] getCraftRecipe() {
        return craftRecipe;
    }

    public void setCraftRecipe(CraftRecipe[] craftRecipe) {
        this.craftRecipe = craftRecipe;
    }

    public Spells[] getSpells() {
        return spells;
    }

    public void setSpells(Spells[] spells) {
        this.spells = spells;
    }
    
    
    
    public static void startNewGame(){
        
        GameControl.game = new Game();
        
        GameControl.createInventory();
        GameControl.createActor();
        GameControl.createWorld();
        GameControl.createCraftRecipe();
    }
    
    

    public Game() {}

    public float getGameTime() {
        return gameTime;
    }

    public void setGameTime(float gameTime) {
        this.gameTime = gameTime;
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
