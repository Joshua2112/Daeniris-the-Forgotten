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
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
class GameMenuView extends View {

    public GameMenuView() {
        super("\n\tEnter \'i\' interact"
                                  +"\n\tEnter \'m\' display magic"
                                  +"\n\tEnter \'i\' display items"
                                  +"\n\tEnter \'g\' display gear"                                  
                                  +"\n\tEnter \'c\' display crafts"
                                  +"\n\tEnter \'b\' view bestiary"
                                  +"\n\tEnter \'q\' go back to adventure menu");
    }

    
    @Override
    public void doAction(String choice){
        
         switch (choice){
            case "M":
                TabularMenu magicTabular = createMagicTabular();
                SpellMenuView spellMenuView = new SpellMenuView();
                spellMenuView.display(magicTabular);
                break;
            case "I":
                this.displayInventory();
                break;
            case "G":
                System.out.println("gear menu stub");
                break;
            case "C":
                this.displayCrafts();
                break;
            case "B":
                this.displayActors();
                break;
            case "Q":
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }

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
    }

    private void displayActors() {
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu actorTab = new TabularMenu();
        actorTab.setDisplayName("Actor Display");
        actorTab.setColumnCount(Constants.ACT_COL_COUNT);
        actorTab.setColumnWidth(Constants.INV_COL_WIDTH);
        actorTab.setRowCount(Constants.INV_ROW_COUNT);
        actorTab.setType(Constants.ACTOR);
        
        String[] header = new String[Constants.ACT_COL_COUNT];
        header[0] = "Player Character";
        header[1] = "Enemies";
        
        actorTab.setHeader(header);
        
        GameControl.sort(game.getActor());
        displayTabular(actorTab);
    }
    
    private void displayCrafts(){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu craftTab = new TabularMenu();
        craftTab.setDisplayName("Craft Display");
        craftTab.setColumnCount(Constants.CRAFT_COL_COUNT);
        craftTab.setColumnWidth(Constants.CRAFT_COL_WIDTH);
        craftTab.setRowCount(Constants.CRAFT_ROW_COUNT);
        craftTab.setType(Constants.CRAFTS);
        
        String[] header = new String[Constants.CRAFT_COL_COUNT];
        header[0] = "Sword";
        header[1] = "Armor";
        
        craftTab.setHeader(header);
        
        //GameControl.stringConvert(game.getInventory(), Constants.INV_POTION_COL);
        GameControl.sort(game.getCraftRecipe());
        displayTabular(craftTab);
        
        CraftMenuView craftMenuView = new CraftMenuView();
        craftMenuView.display();
    }
    
    private TabularMenu createMagicTabular(){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu craftTab = new TabularMenu();
        craftTab.setDisplayName("Craft Display");
        craftTab.setColumnCount(Constants.SPELL_COL_COUNT);
        craftTab.setColumnWidth(Constants.SPELL_COL_WIDTH);
        craftTab.setRowCount(Constants.SPELL_ROW_COUNT);
        craftTab.setType(Constants.SPELLS);
        
        String[] header = new String[Constants.SPELL_COL_COUNT];
        header[0] = "Black Magic";
        header[1] = "White Magic";
        
        craftTab.setHeader(header);
        
        //GameControl.stringConvert(game.getInventory(), Constants.INV_POTION_COL);
        //GameControl.sortCrafts(game.getSpells());      
        return craftTab;
        
    }
}

