/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;

/**
 *
 * @author Joshua
 */
class GameMenuView extends MenuView {

    private final String inGameMenu = "\n\tEnter \'i\' interact"
                                  +"\n\tEnter \'m\' display magic"
                                  +"\n\tEnter \'i\' display items"
                                  +"\n\tEnter \'g\' display gear"                                  
                                  +"\n\tEnter \'c\' display crafts"
                                  +"\n\tEnter \'q\' go back to adventure menu";

    public String getInGameMenu() {
        return inGameMenu;
    }
    
    @Override
    public void doAction(char choice, Game game){
        
         switch (choice){
            case 'M':
                System.out.println("display magic spells");
                break;
            case 'I':
                this.display(game);
                break;
            case 'G':
                System.out.println("gear menu stub");
                break;
            case 'C':
                System.out.println("craft menu stub");
                break;
            case 'Q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }

    @Override
    public void display(Game game){
       
        Inventory[][] inventory = game.getInventory();
       
        
       System.out.println("Inventory Display");
       
       for(int i = 0; i <  Constants.NUMBER_OF_INVENTORIES; i++){
           for(int j = 0; j < Constants.NUMMBER_OF_INVENTORY_ITEMS; i++){
               System.out.println("Potions/tArmor/tWeapons/tResources ");
               
           }
       }
    }
    
}
