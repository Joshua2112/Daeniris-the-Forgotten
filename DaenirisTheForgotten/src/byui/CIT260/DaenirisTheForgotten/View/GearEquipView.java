/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import static byui.CIT260.DaenirisTheForgotten.Control.Constants.DEFAULT_INVENTORY_QUANTITY;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class GearEquipView extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Inventory[][] gear = game.getInventory();
    Gear theGear = ((Gear) gear[2][0]);

    public GearEquipView() {
        super("\n\tPlease select gear to equip"
                + "\n\tYou may equip one of each gear type(Weapon, Sheild, Helmet, Armor)");
        for(int i = 0; i < DEFAULT_INVENTORY_QUANTITY; i++){
            System.out.println("Name" + theGear[2][i].getName()
                    + "Description" + theGear[2][i].getDescription()
                    + "Gear type" + theGear[2][i]
                    + "Attack Bonus"
                    + "Defense Bonus"
                    + "Magic Attack Bonus"
                    + "Magic Defense Bonus"
                    + "Other Effects"
                    + "Quantity" + theGear[2][i].getQuantity());
        }
    }

    @Override
    public int doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
