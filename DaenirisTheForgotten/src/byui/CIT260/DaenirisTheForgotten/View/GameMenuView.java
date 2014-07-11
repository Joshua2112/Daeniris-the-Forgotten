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
        super("\n\tEnter \'p\' display character info"
                                  +"\n\tEnter \'m\' display magic"
                                  +"\n\tEnter \'i\' display items"
                                  +"\n\tEnter \'g\' display gear"                                  
                                  +"\n\tEnter \'c\' display crafts"
                                  +"\n\tEnter \'b\' view bestiary"
                                  +"\n\tEnter \'q\' go back to adventure menu");
    }

    
    @Override
    public int doAction(String choice){
        
         switch (choice){
            case "M":
                SpellMenuView spellMenuView = new SpellMenuView();
                spellMenuView.display(TabularMenu.createTabularMenu());
                break;
            case "I":
                this.displayInventory();
                break;
            case "G":
                EquipGearView equipGear = new EquipGearView();
                equipGear.display();
                break;
            case "C":
                this.displayCrafts();
                break;
            case "B":
                this.displayActors();
                break;
            case "P":
                PlayerCharacterInfoView viewPC = new PlayerCharacterInfoView();
                viewPC.display();
                break;
            case "Q":
                return 0;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
        return 0;       
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

        inventoryTab.setHeader(header);
        
        //GameControl.sort(game.getInventory());

        displayTabular(inventoryTab);
        
    }

    private void displayActors() {
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu actorTab = new TabularMenu();
        actorTab.setDisplayName("Actor Display");
        actorTab.setColumnCount(Constants.ACTOR_COL_COUNT);
        actorTab.setColumnWidth(Constants.ACTOR_COL_WIDTH);
        actorTab.setRowCount(Constants.ACTOR_ROW_COUNT);
        actorTab.setType(Constants.ACTOR);
        
        String[] header = new String[Constants.ACTOR_COL_COUNT];
        header[0] = "Player Character";
        header[1] = "Plains Enemies";
        header[2] = "Forest Enemies";
        header[3] = "Mountain Enemies";
        header[4] = "Dark Forest Enemies";

        actorTab.setHeader(header);
        
        //GameControl.sort(game.getActor());
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
    

}

