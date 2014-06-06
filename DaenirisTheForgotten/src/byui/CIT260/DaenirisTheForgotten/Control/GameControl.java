/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.SingleUseItems;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;

/**
 *
 * @author Joshua
 */
public class GameControl {
    public static Game game;

    public static void createInventory() {
        Inventory[][] playerInventory =
                    new Inventory[Constants.NUMBER_OF_INVENTORIES][Constants.NUMMBER_OF_INVENTORY_ITEMS];
        
        SingleUseItems potion = new SingleUseItems();
        potion.setName("Potion");
        potion.setDescription("A healing item");
        potion.setEffects("Heals 20 health points");
        playerInventory[0][0] = potion;
        
        SingleUseItems antidote = new SingleUseItems();
        antidote.setName("Antidote");
        antidote.setDescription("Heals poison");
        antidote.setEffects("Heals poison");
        playerInventory[0][1] = antidote;
        
        SingleUseItems ether = new SingleUseItems();
        ether.setName("Ether");
        ether.setDescription("Resores magic");
        ether.setEffects("Restores 20 magic points");
        playerInventory[0][2] = ether;
        
        SingleUseItems greaterPotion = new SingleUseItems();
        greaterPotion.setName("Greater Potion");
        greaterPotion.setDescription("Restores more health");
        greaterPotion.setEffects("Restores 50 health points");
        playerInventory[0][3] = greaterPotion;
        
        
                }

    public static void createActor() {
        System.out.println("create Actor stub called");
    }

    public static void createWorld() {
        System.out.println("create World stub called");
    }

    public static void createCraftRecipe() {
        System.out.println("create Craft Recipe stub called");
    }
    
}
