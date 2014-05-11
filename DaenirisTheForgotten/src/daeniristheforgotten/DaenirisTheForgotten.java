/*********************************************************************
 * Daeniris The Forgotten (Role Playing Game)
 * Author: Joshua & Nathan Wittmann
 * Game Main
 *********************************************************************/

package daeniristheforgotten;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;


public class DaenirisTheForgotten 
{  
    public static void main(String[] args) 
    {
       //Create Enemey Instance-------------------------------------------
        
       Enemy goblin = new Enemy();
       
       goblin.setName("Uzulok");
       goblin.setAttack(2);
       goblin.setDefense(1);
       goblin.setMagicAttack(0);
       goblin.setMagicDefense(0);
       goblin.setHealthPoints(10);
       goblin.setMagicPoints(0);
       goblin.setExperienceValue(20);
       goblin.setItemsDropped("Health Potion");
       
       String goblinInfo = goblin.toString();
       System.out.println(goblinInfo);
       
       //Create Player Instance----------------------------------------
       
       PlayerCharacter Chad = new PlayerCharacter();
       
       Chad.setName("Chad");
       Chad.setJob("Warrior");
       Chad.setAttack(4);
       Chad.setDefense(4);
       Chad.setHealthPoints(50);
       Chad.setMagicPoints(0);
       Chad.setMagicAttack(0);
       Chad.setMagicDefense(1);
       Chad.setGender("male");
       
       String PCInfo = Chad.toString();
       System.out.println(PCInfo);

       //Create gameworld instance -------------------------------------
       
       World gameWorld = new World();
       
       System.out.println("Game World Map");
       System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       
       for(int i = 0; i < 10; i++)
       {
           Location[][] mapArray = gameWorld.getMap();
           for(int j = 0; j < 10; j++)
           {
               System.out.print("| ");
               System.out.print(mapArray[i][j].getSymbol());
               System.out.print(' ');
           }
           
           System.out.print("|");
           System.out.println();
           System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       }  
    }    
}
