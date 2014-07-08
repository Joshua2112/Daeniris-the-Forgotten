/*********************************************************************
 * AdventureView Menu
 * Author: Joshua & Nathan Wittmann
 * Menu that is displayed when you are moving through the world.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.MoveControl;
import byui.CIT260.DaenirisTheForgotten.Exception.MovedOffMapException;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.logging.Level;
import java.util.logging.Logger;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;




public class AdventureView extends View{

    public AdventureView() {
        super("\n\tEnter \'i\' interact"
             +"\n\tEnter \'m\' adventure menu"
             +"\n\tEnter \'l\' look at map"
             +"\n\tEnter \'w\' travel north"                                  
             +"\n\tEnter \'s\' travel south"
             +"\n\tEnter \'a\' travel west"
             +"\n\tEnter \'d\' travel east");
    }
    

    
    @Override
    public int doAction(String choice){
    
        switch (choice){
            case "I":
                System.out.println("Interact");
                break;
            case "M":
                GameMenuView inGameMenu = new GameMenuView();
                inGameMenu.display();
                break;
            case "L":
                displayMap();
                break;
            case "W":
                moveIt(-1, 0);
                displayMap();
                break;
            case "S":
                moveIt(1, 0);
                displayMap();
                break;
            case "A":
                moveIt(0, -1);
                displayMap();
                break;
            case "D":
                moveIt(0, 1);
                displayMap();
                break;
            case "B":
                BattleMenuView battle = new BattleMenuView();
                battle.display();
                break;
            case "Q":
                return 0;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
        return 0;
               
    }
    
    public static void moveIt(int x, int y){
        try{MoveControl.move(x, y);
        
        } catch (MovedOffMapException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    
    public static void displayMap(){

       Game game = DaenirisTheForgotten.getCurrentGame();
       World world = game.getWorld();
       
       Location[][] mapArray = game.getWorld().getMap();
       System.out.println("Game World Map");
        
        System.out.print(" ");
        for(int i = 0; i < (Constants.MAP_MAX_Y / 2) + 1; i++){
            System.out.print("- ");
        } 
        System.out.println(" ");
       
       for(int i = 0; i < Constants.MAP_MAX_X; i++)
       {
           System.out.print("| ");
           for(int j = 0; j < Constants.MAP_MAX_Y; j++)
           {               
               if (i == world.getxLoc() && j == world.getyLoc()){
                   //System.out.print("\033[0m| ");
                   System.out.print("\033[1;43m" + mapArray[i][j].getSymbol() + "\033[0m");
                   //System.out.print("\033[0m ");
               }
               else if (mapArray[i][j].isDiscovered()){
                   //System.out.print("\033[0m| ");
                   System.out.print("\033[0m" + mapArray[i][j].getSymbol());
                   //System.out.print("\033[0m ");
               }
               else{
                   //System.out.print("\033[0m| ");
                   System.out.print("\033[0m ");
                   //System.out.print("\033[0m ");
               }

           }
           
           System.out.print(" |");
           System.out.println();       
        }
       
        System.out.print(" ");
        for(int i = 0; i < (Constants.MAP_MAX_Y / 2) + 1; i++){
            System.out.print("- ");
        } 
        System.out.println(" ");
        System.out.println(mapArray[world.getxLoc()][world.getyLoc()].getDescription());
    }
}
