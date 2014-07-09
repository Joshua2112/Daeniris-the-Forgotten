/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
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
        Gear[] weapons = game.getWeapons();
        Gear[] armors = game.getArmors();
        Gear[] helms = game.getHelms();
        Gear[] secondaries = game.getSecondaries();
        
        switch(value){
            case "O":
                Random randomGenerator = new Random();
                int random1 = randomGenerator.nextInt(2);
                int random2 = randomGenerator.nextInt(5);
                int random3 = randomGenerator.nextInt(5);
                if(random3 == 1){
                    inventory[0][random2].setQuantity(inventory[0][random2].getQuantity() + 1);
                    System.out.println("\n\tYou found a(n) " + inventory[0][random2].getName());
                    return 1;
                }
                else if(random3 == 2){
                    weapons[random2].setQuantity(weapons[random2].getQuantity() + 1);
                    System.out.println("\n\tYou found a(n) " + weapons[random2].getName());
                    return 1;
                }
                else if(random3 == 3){
                    armors[random2].setQuantity(armors[random2].getQuantity() + 1);
                    System.out.println("\n\tYou found a(n) " + armors[random2].getName());
                    return 1;
                }
                else if(random3 == 4){
                    helms[random2].setQuantity(helms[random2].getQuantity() + 1);
                    System.out.println("\n\tYou found a(n) " + helms[random2].getName());
                    return 1;
                }
                else if(random3 == 5){
                    secondaries[random2].setQuantity(secondaries[random2].getQuantity() + 1);
                    System.out.println("\n\tYou found a(n) " + secondaries[random2].getName());
                    return 1;
                }
                break;
            case "Q":
                return 1;
            default:
                System.out.println("\n\tInvalid selection, try again");
            break;
        }
        return 0;
    }
}