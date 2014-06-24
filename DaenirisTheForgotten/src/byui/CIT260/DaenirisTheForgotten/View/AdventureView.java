/*********************************************************************
 * AdventureView Menu
 * Author: Joshua & Nathan Wittmann
 * Menu that is displayed when you are moving through the world.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.MoveControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;




public class AdventureView extends View{

    public AdventureView() {
        super("\n\tEnter \'i\' interact"
                                  +"\n\tEnter \'m\' adventure menu"
                                  +"\n\tEnter \'l\' look at map"
                                  +"\n\tEnter \'n\' travel north"                                  
                                  +"\n\tEnter \'s\' travel south"
                                  +"\n\tEnter \'w\' travel west"
                                  +"\n\tEnter \'e\' travel east");
    }
    

    
    @Override
    public void doAction(String choice){
    
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
                MoveControl.move(-1, 0);
                displayMap();
                break;
            case "S":
                MoveControl.move(1, 0);
                displayMap();
                break;
            case "A":
                MoveControl.move(0, -1);
                displayMap();
                break;
            case "D":
                MoveControl.move(0, 1);
                displayMap();
                break;
            case "Q":
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
    
    
    private void displayMap(){

       Game game = DaenirisTheForgotten.getCurrentGame();
       World world = game.getWorld();
       
       Location[][] mapArray = DaenirisTheForgotten.getCurrentGame().getWorld().getMap();
       System.out.println("\033[1;43mHello World");
       System.out.println("Game World Map");
       System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       
       for(int i = 0; i < 10; i++)
       {
           for(int j = 0; j < 10; j++)
           {               
               
               if (i == world.getxLoc() && j == world.getyLoc()){
                   System.out.print("\033[0m| ");
                   System.out.print("\033[1;43m" + mapArray[i][j].getSymbol() + "\033[0m");
                   System.out.print("\033[0m ");
               }
               else if (mapArray[i][j].isDiscovered()){
                    System.out.print("\033[0m| ");
                    System.out.print("\033[0m" + mapArray[i][j].getSymbol());
                    System.out.print("\033[0m ");
               }
               else{
                    System.out.print("\033[0m| ");
                    System.out.print("\033[0m ");
                    System.out.print("\033[0m ");
               }

           }
           
           System.out.print("|");
           System.out.println();
           System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
        }
       
    }
}
