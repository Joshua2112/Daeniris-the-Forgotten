package byui.CIT260.DaenirisTheForgotten.Model;

/*********************************************************************
 * Game Class
 * Author: Nathan Wittmann
 * Class that contains basic information about the game. 
 *********************************************************************/

public class Game 
{
    private float gameTime;

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