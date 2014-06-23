/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ShopControl;

/**
 *
 * @author Joshua
 */
class ShopMenuView extends View{
    
    public ShopMenuView(){
        super("List of items available for purchase stub"
                +"\n\t1 for Iron Sword"
                +"\n\t2 for Cloth Cap");
    }
    
    @Override
    
    public void doAction(String choice){
        
         switch (choice){
            case "1":
                ShopControl buyIronSword = new ShopControl();
                buyIronSword.buyItem();
            case "2":
                ShopControl buyClothCap = new ShopControl();
                buyClothCap.buyItem();
         }
    }
}
