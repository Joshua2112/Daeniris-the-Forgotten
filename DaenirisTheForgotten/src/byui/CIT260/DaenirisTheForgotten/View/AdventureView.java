/*********************************************************************
 * AdventureView Menu
 * Author: Joshua & Nathan Wittmann
 * Menu that is displayed when you are moving through the world.
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.MoveControl;
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
    public void doAction(char choice){
        
         switch (choice){
            case 'I':
                System.out.println("Interact");
                break;
            case 'M':
                System.out.println("access Game Menu");
                break;
            case 'L':
                System.out.println("Access Map");
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
    
    
    
}
