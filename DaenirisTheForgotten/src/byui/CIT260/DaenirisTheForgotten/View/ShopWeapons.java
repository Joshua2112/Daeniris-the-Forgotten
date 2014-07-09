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
public class ShopWeapons extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] weapons = game.getWeapons();

    public ShopWeapons() {
        super("\n\tPlease choose a weapon to purchase"
                +"\n\tOr enter 'q' to exit");
        for(int i = 0; i < weapons.length; i++)
            if(weapons[i].getQuantity() > 0)
        System.out.println("\n\tEnter " + (i + 2) + " for this gear"
                + "\n\tName " + weapons[i].getName()
                            +"\n\tDescription " + weapons[i].getDescription()
                            +"\n\tAttack Bonus " + weapons[i].getAttackBonus()
                            +"\n\tDefense Bonus " + weapons[i].getDefenseBonus()
                            +"\n\tMagic Attack Bonus " + weapons[i].getMagicAttackBonus()
                            +"\n\tMagic Defense Bonus " + weapons[i].getMagicDefenseBonus()
                            +"\n\tNumber in your possesion " + weapons[i].getQuantity()
                            +"\n\tCost " + weapons[i].getCost());
    }

    @Override
    public int doAction(String value) {
    
            try{
        int choice = (this.checkNum(value) - 2);
        
        
        ShopControl shop = new ShopControl();
        shop.buyWeapon(choice);
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