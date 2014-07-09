/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

/**
 *
 * @author Joshua
 */
public class ShopGear extends View{

    public ShopGear() {
        super("\n\tPlease choose a gear type to purchase"
                +"\n\tEnter 'w' for weapons"
                +"\n\tEnter 'a' for armors"
                +"\n\tEnter 'h' for helmets"
                +"\n\tEnter 's' for secondaries (shields, gloves, etc.)"
                +"\n\tEnter 'q' to exit");
    }

    @Override
    public int doAction(String value) {
        switch(value){
            
            case "W":
                ShopWeapons shopWeapons = new ShopWeapons();
                shopWeapons.display();
                break;
            case "A":
                ShopArmors shopArmors = new ShopArmors();
                shopArmors.display();
                break;
            case "H":
                ShopHelmets shopHelmets = new ShopHelmets();
                shopHelmets.display();
                break;
            case "S":
                ShopSecondaries shopSecondaries = new ShopSecondaries();
                shopSecondaries.display();
                break;
            case "Q":
                return 1;
            default:
                System.out.println("Please enter a valid option");
        }
        return 0;
    }
    
}
