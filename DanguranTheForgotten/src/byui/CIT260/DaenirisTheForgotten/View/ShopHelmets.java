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
import dangurantheforgotten.DanguranTheForgotten;

/**
 *
 * @author Joshua
 */
public class ShopHelmets extends View{
    
    Game game = DanguranTheForgotten.getCurrentGame();
    Gear[] helms = game.getHelms();

    public ShopHelmets() {
        super("\n\tPlease choose a helmet to purchase"
                +"\n\tOr enter 'q' to exit");
        for(int i = 0; i < helms.length; i++)
            if(helms[i].getQuantity() > 0)
        System.out.println("\n\tEnter " + (i + 2) + " for this gear"
                + "\n\tName " + helms[i].getName()
                            +"\n\tDescription " + helms[i].getDescription()
                            +"\n\tAttack Bonus " + helms[i].getAttackBonus()
                            +"\n\tDefense Bonus " + helms[i].getDefenseBonus()
                            +"\n\tMagic Attack Bonus " + helms[i].getMagicAttackBonus()
                            +"\n\tMagic Defense Bonus " + helms[i].getMagicDefenseBonus()
                            +"\n\tNumber in your possesion " + helms[i].getQuantity()
                            +"\n\tCost " + helms[i].getCost());
    }

    @Override
    public int doAction(String value) {
    
        try{
        int choice = (this.checkNum(value) - 2);
        
        
        ShopControl shop = new ShopControl();
        shop.buyHelmet(choice);
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
