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
public class ShopMainView extends View{

    public ShopMainView() {
        super("\n\tChoose what you would like to do:"
                +"\n\tEnter '2' to buy items"
                +"\n\tEnter '3' to buy Gear"
                +"\n\tEnter '4' to rest at the inn"
                +"\n\tEnter '5' to speak with locals"
                +"\n\tEnter 'q' to exit");
    }

    @Override
    public int doAction(String value) {
        
    switch(value){
        
        case "2":
            ShopItems shopItems = new ShopItems();
            shopItems.display();
            break;
        case "3":
            ShopGear shopGear = new ShopGear();
            shopGear.display();
            break;
        case "4":
            ShopControl.rest();
            break;
        case "5":
            ConversationView converse = new ConversationView();
            converse.display();
        case "Q":
            return 1;
        default:
            System.out.println("Please choose a valid option");
    }
        return 0;
    }
    
}
