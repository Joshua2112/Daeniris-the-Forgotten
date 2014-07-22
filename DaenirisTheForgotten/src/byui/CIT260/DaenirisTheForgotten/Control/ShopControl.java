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
    
    public void buyItem(int choice) throws illegalActionException{
        if (items[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - items[choice].getCost());
            items[choice].setQuantity(items[choice].getQuantity() + 1);
            System.out.println("\n\tYou purchased a " + items[choice].getSpellName());
        }
        else{
            throw new illegalActionException("\n\tNot enough gold");

    }
}
    
    public void buyWeapon(int choice) throws illegalActionException{
        if (weapons[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - weapons[choice].getCost());
            weapons[choice].setQuantity(weapons[choice].getQuantity() + 1);
            System.out.println("\n\tYou purchased a " + weapons[choice].getName());
        }
        else{
            throw new illegalActionException("\n\tNot enough gold");

    }
}

    public void buyHelmet(int choice) throws illegalActionException {
        if (helms[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - helms[choice].getCost());
            helms[choice].setQuantity(helms[choice].getQuantity() + 1);
            System.out.println("\n\tYou purchased a " + helms[choice].getName());
        }
        else{
            throw new illegalActionException("\n\tNot enough gold");

    }
}

    public void buyArmor(int choice) throws illegalActionException {
        if (armors[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - armors[choice].getCost());
            armors[choice].setQuantity(armors[choice].getQuantity() + 1);
            System.out.println("\n\tYou purchased a " + armors[choice].getName());
        }
        else{
            throw new illegalActionException("\n\tNot enough gold");

    }
}

    public void buySecondary(int choice) throws illegalActionException {
        if (secondaries[choice].getCost() < player.getPlayerGold()){
            player.setPlayerGold(player.getPlayerGold() - secondaries[choice].getCost());
            secondaries[choice].setQuantity(secondaries[choice].getQuantity() + 1);
            System.out.println("\n\tYou purchased a " + secondaries[choice].getName());
        }
        else{
            throw new illegalActionException("\n\tNot enough gold");

    }
}
}