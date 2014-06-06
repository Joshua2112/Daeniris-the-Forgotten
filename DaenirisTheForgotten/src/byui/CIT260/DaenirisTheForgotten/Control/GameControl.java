/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;

/**
 *
 * @author Joshua
 */
public class GameControl {
    public static Game game;

    public static void createInventory() {
        Inventory[] playerInventory =
                    new Inventory[Constants.NUMMBER_OF_INVENTORY_ITEMS];
        
        Inventory potion = new Inventory();
        potion.setDescription("A healing item");
        playerInventory[0] = potion;
        
        
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
