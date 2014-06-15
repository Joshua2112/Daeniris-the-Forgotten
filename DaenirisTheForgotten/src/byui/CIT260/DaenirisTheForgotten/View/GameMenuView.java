/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Game;

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
                                  +"\n\tEnter \'b\' view bestiary"
                                  +"\n\tEnter \'q\' go back to adventure menu";

    public String getInGameMenu() {
        return inGameMenu;
    }
    
    @Override
    public void doAction(char choice){
        
         switch (choice){
            case 'M':
                System.out.println("display magic spells");
                break;
            case 'I':
                displayInventory();
                break;
            case 'G':
                System.out.println("gear menu stub");
                break;
            case 'C':
                System.out.println("craft menu stub");
                break;
            case 'B':
                this.displayActors();
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

    private void displayInventory() {
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        
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

    private void displayActors() {
        TabularMenu actorTab = new TabularMenu();
        actorTab.setDisplayName("Actor Display");
        actorTab.setColumnCount(Constants.INV_COL_COUNT);
        actorTab.setColumnWidth(Constants.INV_COL_WIDTH);
        actorTab.setRowCount(Constants.INV_ROW_COUNT);
        actorTab.setHideInventory(true);
        actorTab.setType(Constants.ACTOR);
        
        String[] header = new String[Constants.INV_COL_COUNT];
        header[0] = "Player Character";
        header[1] = "Enemies";
        header[2] = "0";
        header[3] = "0";
        
        actorTab.setHeader(header);
        
        GameControl.sort(game.getActor());
        displayTabular(game, actorTab);
    }
}

