/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;

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
                displayInventory(game);
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
    /*
    @Override
    public void display(Game game){

       int colWidth = Constants.INV_COL_WIDTH;
       int PotionName
        
       Inventory[][] inventory = game.getInventory();
       
        //Display Column Headers
       System.out.println("Inventory Display");
       System.out.printf( "%-" + colWidth + "s" +
                          "%-" + colWidth + "s" +
                          "%-" + colWidth + "s" +
                          "%-" + colWidth + "s %n" //creates 4 columns
                         , "Potions"
                         , "Armor"
                         , "Weapons"
                         , "Resources");
       
       //Display Column Header Lines
       System.out.printf( "%-" + colWidth + "s" +
                          "%-" + colWidth + "s" +
                          "%-" + colWidth + "s" +
                          "%-" + colWidth + "s %n" //creates 4 column lines
                         , "----------"
                         , "----------"
                         , "----------"
                         , "----------");

       //Loop through and display name of inventory item with its quantity
       for(int i = 0; i < (Constants.INV_ROW_COUNT - 1); i++){
           
           for (int j = 0; j < 4; j++){
               if (inventory[j][i].getQuantity() == )
           }
           
           System.out.printf( "%-" + colWidth + "s" +
                              "%-" + colWidth + "s" +
                              "%-" + colWidth + "s" +
                              "%-" + colWidth + "s %n" //creates 4 columns              
                              , inventory[0][i].getName() 
                                    + "(" + inventory[0][i].getQuantity() + ")"
                              , inventory[1][i].getName()
                                    + "(" + inventory[0][i].getQuantity() + ")"
                              , inventory[2][i].getName()
                                    + "(" + inventory[0][i].getQuantity() + ")"
                              , inventory[3][i].getName()
                                    + "(" + inventory[0][i].getQuantity() + ")"
                            );
           
       }
    }
    */

    private void displayInventory(Game game) {
        
        
        
        TabularMenu inventoryTab = new TabularMenu();
        inventoryTab.setDisplayName("Inventory Display");
        inventoryTab.setColumnCount(Constants.INV_COL_COUNT);
        inventoryTab.setColumnWidth(Constants.INV_COL_WIDTH);
        inventoryTab.setRowCount(Constants.INV_ROW_COUNT);
        inventoryTab.setHideInventory(true);
        inventoryTab.setType(Constants.INVENTORY);
        
        String[] header = new String[Constants.INV_COL_COUNT];
        header[0] = "Potions";
        header[1] = "Armor";
        header[2] = "Weapon";
        header[3] = "Resources";
        
        inventoryTab.setHeader(header);
        
        GameControl.sort(game.getInventory());
        displayTabular(game, inventoryTab);
    }
}
