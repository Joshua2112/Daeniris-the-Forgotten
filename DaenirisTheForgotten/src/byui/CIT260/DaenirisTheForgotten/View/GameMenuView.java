/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Game;

/**
 *
 * @author Joshua
 */
class GameMenuView extends MenuView {

    private final String adventureMenu =    "\n\tEnter \'i\' interact"
                                  +"\n\tEnter \'m\' adventure menu"
                                  +"\n\tEnter \'l\' look at map"
                                  +"\n\tEnter \'n\' travel north"                                  
                                  +"\n\tEnter \'s\' travel south"
                                  +"\n\tEnter \'w\' travel west"
                                  +"\n\tEnter \'e\' travel east";


    
    @Override
    public void doAction(char choice, Game game){
        
         switch (choice){
            case 'm':
                System.out.println("display magic spells");
                break;
            case 't':
                System.out.println("item menu stub");
                break;
            case 'g':
                System.out.println("gear menu stub");
                break;
            case 'c':
                System.out.println("craft menu stub");
                break;
            case 's':
                System.out.println("Save Game Stub");
                break;
            case 'e':
                System.out.println("Go back to Adventure Menu");
                break;
            case 'q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
    
}
