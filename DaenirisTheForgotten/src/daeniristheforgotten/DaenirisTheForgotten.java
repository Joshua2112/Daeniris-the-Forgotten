/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daeniristheforgotten;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;

/**
 *
 * @author Joshua
 */
public class DaenirisTheForgotten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Enemy goblin = new Enemy();
       
       goblin.setName("Uzulok");
       goblin.setAttack(2);
       goblin.setDefense(1);
       goblin.setMagicAttack(0);
       goblin.setMagicDefense(0);
       goblin.setHealthPoints(10);
       goblin.setMagicPoints(0);
       
       String goblinInfo = goblin.toString();
       System.out.println(goblinInfo);

       //Create gameworld instance
       World gameWorld = new World();
  
       System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
               System.out.print("| ");
               System.out.print(gameWorld.map[i][j].getSymbol());
               System.out.print(' ');
           }
           
           System.out.print("|");
           System.out.println();
           System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       }

       
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
       
    }
    
}
