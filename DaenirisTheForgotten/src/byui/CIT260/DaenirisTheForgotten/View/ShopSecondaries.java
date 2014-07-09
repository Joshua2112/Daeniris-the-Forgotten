/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ShopControl;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class ShopSecondaries extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] secondaries = game.getSecondaries();

    public ShopSecondaries() {
        super("\n\tPlease choose a secondary gear to purchase"
                +"\n\tOr enter 'q' to exit");
        for(int i = 0; i < secondaries.length; i++)
            if(secondaries[i].getQuantity() > 0)
        System.out.println("\n\tEnter " + (i + 2) + " for this gear"
                + "\n\tName " + secondaries[i].getName()
                            +"\n\tDescription " + secondaries[i].getDescription()
                            +"\n\tAttack Bonus " + secondaries[i].getAttackBonus()
                            +"\n\tDefense Bonus " + secondaries[i].getDefenseBonus()
                            +"\n\tMagic Attack Bonus " + secondaries[i].getMagicAttackBonus()
                            +"\n\tMagic Defense Bonus " + secondaries[i].getMagicDefenseBonus()
                            +"\n\tNumber in your possesion " + secondaries[i].getQuantity()
                            +"\n\tCost " + secondaries[i].getCost());
    }

    @Override
    public int doAction(String value) {
    
            try{
        int choice = (this.checkNum(value) - 2);
        
        
        ShopControl shop = new ShopControl();
        shop.buySecondary(choice);
        }
        catch(illegalActionException ex){
            System.out.println(ex.getMessage());
        }
        
        return 0;
                }
    
    private int checkNum(String value) throws illegalActionException{
        
        try{
        int num = Integer.parseInt(value);
        return num;
        }
        catch(NumberFormatException ex){
            throw new illegalActionException("Must enter a number");
        }
    }
}