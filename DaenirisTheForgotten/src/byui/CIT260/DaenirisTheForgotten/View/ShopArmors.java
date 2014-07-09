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
public class ShopArmors extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] armors = game.getArmors();

    public ShopArmors() {
        super("\n\tPlease choose an armor to purchase"
                +"\n\tOr enter 'q' to exit");
        for(int i = 0; i < armors.length; i++)
            if(armors[i].getQuantity() > 0)
        System.out.println("\n\tEnter " + (i + 2) + " for this gear"
                            + "\n\tName " + armors[i].getName()
                            +"\n\tDescription " + armors[i].getDescription()
                            +"\n\tAttack Bonus " + armors[i].getAttackBonus()
                            +"\n\tDefense Bonus " + armors[i].getDefenseBonus()
                            +"\n\tMagic Attack Bonus " + armors[i].getMagicAttackBonus()
                            +"\n\tMagic Defense Bonus " + armors[i].getMagicDefenseBonus()
                            +"\n\tNumber in your possesion " + armors[i].getQuantity()
                            +"\n\tCost " + armors[i].getCost());
    }

    @Override
    public int doAction(String value) {
    
            try{
        int choice = (this.checkNum(value) - 2);
        
        
        ShopControl shop = new ShopControl();
        shop.buyArmor(choice);
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