/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class ShopControl {
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] weapons = game.getWeapons();
    Gear[] helms = game.getHelms();
    Gear[] armors = game.getArmors();
    Gear[] secondaries = game.getSecondaries();
    Spells[] items = game.getInventory();
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    public static void rest() {
        System.out.println("rest stub");
    }
    
    public String buyItem(int choice) {
        String buyMessage = " ";
        if (items[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - items[choice].getCost());
            items[choice].setQuantity(items[choice].getQuantity() + 1);
            buyMessage = "You purchased a(n) " + items[choice].getSpellName();
        }
        else{
            buyMessage = "You don't have enough gold";
    }
        return buyMessage;
}
    
    public String buyWeapon(int choice) {
        String buyMessage = " ";
        if (weapons[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - weapons[choice].getCost());
            weapons[choice].setQuantity(weapons[choice].getQuantity() + 1);
            buyMessage = "You purchased a(n) " + weapons[choice].getName();
        }
        else{
            buyMessage = "You don't have enough gold";

    }
        return buyMessage;
}

    public String buyHelmet(int choice) {
        String buyMessage = " ";
        if (helms[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - helms[choice].getCost());
            helms[choice].setQuantity(helms[choice].getQuantity() + 1);
            buyMessage = "You purchased a(n) " + helms[choice].getName();
        }
        else{
            buyMessage = "You don't have enough gold";
    }
        return buyMessage;
}

    public String buyArmor(int choice) {
        String buyMessage = " ";
        if (armors[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - armors[choice].getCost());
            armors[choice].setQuantity(armors[choice].getQuantity() + 1);
            buyMessage = "You purchased a(n) " + armors[choice].getName();
        }
        else{
            buyMessage = "You don't have enough gold";

    }
        return buyMessage;
}

    public String buySecondary(int choice)  {
        String buyMessage = " ";
        if (secondaries[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - secondaries[choice].getCost());
            secondaries[choice].setQuantity(secondaries[choice].getQuantity() + 1);
            buyMessage = "You purchased a(n) " + secondaries[choice].getName();
        }
        else{
            buyMessage = "You don't have enough gold";

    }
        return buyMessage;
}
    public String sellItem(int choice) {
        String sellMessage = " ";
        if (items[choice].getQuantity() > 0){
            player.setPlayerGold((int) (player.getPlayerGold() + (items[choice].getCost() * 0.5)));
            items[choice].setQuantity(items[choice].getQuantity() - 1);
            sellMessage = "You sold a(n) " + items[choice].getSpellName();
        }
        else{
            sellMessage = "You don't have enough of the item";
    }
        return sellMessage;
}
    
    public String sellWeapon(int choice) {
        String sellMessage = " ";
        if (weapons[choice].getQuantity() > 0){
            player.setPlayerGold((int) (player.getPlayerGold() + (weapons[choice].getCost() * 0.5)));
            weapons[choice].setQuantity(weapons[choice].getQuantity() - 1);
            sellMessage = "You sold a(n) " + weapons[choice].getName();
        }
        else{
            sellMessage = "You don't have enough of the item";
    }
        return sellMessage;
}

    public String sellHelmet(int choice) {
        String sellMessage = " ";
        if (helms[choice].getQuantity() > 0){
            player.setPlayerGold((int) (player.getPlayerGold() + (helms[choice].getCost() * 0.5)));
            helms[choice].setQuantity(helms[choice].getQuantity() - 1);
            sellMessage = "You sold a(n) " + helms[choice].getName();
        }
        else{
            sellMessage = "You don't have enough of the item";
    }
        return sellMessage;
}

    public String sellArmor(int choice) {
        String sellMessage = " ";
        if (armors[choice].getQuantity() > 0){
            player.setPlayerGold((int) (player.getPlayerGold() + (armors[choice].getCost() * 0.5)));
            armors[choice].setQuantity(armors[choice].getQuantity() - 1);
            sellMessage = "You sold a(n) " + armors[choice].getName();
        }
        else{
            sellMessage = "You don't have enough of the item";
    }
        return sellMessage;
}

    public String sellSecondary(int choice)  {
        String sellMessage = " ";
        if (secondaries[choice].getQuantity() > 0){
            player.setPlayerGold((int) (player.getPlayerGold() + (secondaries[choice].getCost() * 0.5)));
            secondaries[choice].setQuantity(secondaries[choice].getQuantity() - 1);
            sellMessage = "You sold a(n) " + secondaries[choice].getName();
        }
        else{
            sellMessage = "You don't have enough of the item";
    }
        return sellMessage;
}
}