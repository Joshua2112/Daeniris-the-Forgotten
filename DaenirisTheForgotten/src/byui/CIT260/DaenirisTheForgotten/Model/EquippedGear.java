/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;

import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class EquippedGear {
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Inventory[][] inventory = game.getInventory();
    
    Gear helmet = new Gear();
    Gear sword = new Gear();
    Gear armor = new Gear();
    Gear leftHand = new Gear();
    
}
