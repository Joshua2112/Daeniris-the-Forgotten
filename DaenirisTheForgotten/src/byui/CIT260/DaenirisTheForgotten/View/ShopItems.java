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
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
class ShopItems extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Spells[] items = game.getInventory();
    
    public ShopItems(){
        super("\n\tPlease choose a helmet to purchase"
                +"\n\tOr enter 'q' to exit");
        for(int i = 0; i < items.length; i++)
            if(items[i].getQuantity() > 0)
        System.out.println("\n\tEnter " + (i + 2) + " for this item"
                + "\n\tName " + items[i].getSpellName()
                            +"\n\tDescription " + items[i].getDescription()
                            +"\n\tNumber in your possesion " + items[i].getQuantity()
                            +"\n\tCost " + items[i].getCost());
    }
    
    @Override
    public int doAction(String value){
        
        try{
        int choice = (this.checkNum(value) - 2);
        
        
        ShopControl shop = new ShopControl();
        shop.buyItem(choice);
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
