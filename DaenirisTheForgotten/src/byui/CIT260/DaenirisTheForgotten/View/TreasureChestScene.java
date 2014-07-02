/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Random;

/**
 *
 * @author Joshua
 */
public class TreasureChestScene extends View{

    public TreasureChestScene() {
        super("\n\tYou found a treasure chest"
                + "\n\tEnter 'o' to open it");
    }     
        
    @Override
    public int doAction(String value) {
        Game game = DaenirisTheForgotten.getCurrentGame();
        Inventory[][] inventory = game.getInventory();
        
        switch(value){
            case "O":
                Random randomGenerator = new Random();
                int random1 = randomGenerator.nextInt(2);
                int random2 = randomGenerator.nextInt(5);
                inventory[random1][random2].setQuantity(inventory[random1][random2].getQuantity() + 1);
                System.out.println("\n\tYou found a(n) " + inventory[random1][random2].getName());
                break;
            case "Q":
                return 1;
            default:
                System.out.println("\n\tInvalid selection, try again");
            break;
        }
        return 1;
    }
}