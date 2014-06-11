/*********************************************************************
 * AdventureView Menu
 * Author: Joshua & Nathan Wittmann
 * Menu that is displayed when you are moving through the world.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.MoveControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.View.ProgramStart;



public class AdventureView extends MenuView{
    
    
    
    private final String adventureMenu =    "\n\tEnter \'i\' interact"
                                  +"\n\tEnter \'m\' adventure menu"
                                  +"\n\tEnter \'l\' look at map"
                                  +"\n\tEnter \'n\' travel north"                                  
                                  +"\n\tEnter \'s\' travel south"
                                  +"\n\tEnter \'w\' travel west"
                                  +"\n\tEnter \'e\' travel east";

    public String getAdventureMenu() {
        return adventureMenu;
    }
    
    @Override
    public void doAction(char choice, Game game){
    
         switch (choice){
            case 'I':
                System.out.println("Interact");
                break;
            case 'M':
                GameMenuView inGameMenu = new GameMenuView();
                inGameMenu.displayMenu(inGameMenu.getInGameMenu(), game);
                break;
            case 'L':
                displayMap(game);
                break;
            case 'N':
                System.out.println("Travel North");
                break;
            case 'S':
                System.out.println("Travel South");
                break;
            case 'W':
                System.out.println("Travel West");
                break;
            case 'E':
                System.out.println("Travel East");
                break;
            case 'Q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
    
    private void displayMap(Game game){
               System.out.println("Game World Map");
       System.out.println(" - - - - - - - - - - - - - - - - - - - -  ");
       
       for(int i = 0; i < 10; i++)
       {
           Location[][] mapArray = game.getWorld().getMap();
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
