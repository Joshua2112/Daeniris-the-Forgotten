/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daeniristheforgotten;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.World;

/**
 *
 * @author Joshua
 */
public class DaenirisTheForgotten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Actor goblin = new Actor();
       
       goblin.setName("Uzulok");
       goblin.setAttack(2);
       goblin.setDefense(1);
       goblin.setMagicAttack(0);
       goblin.setMagicDefense(0);
       goblin.setHealthPoints(10);
       goblin.setMagicPoints(0);
       
       //String goblinInfo = goblin.toString();
       //System.out.println(goblin.getAttack());
       
       World gameWorld = new World();
  
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {
               System.out.print(gameWorld.map[i][j]);
               System.out.print(' ');
           }
           
           System.out.println();
       }
    }
    
}
