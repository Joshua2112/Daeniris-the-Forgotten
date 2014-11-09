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
public class EquipGearView extends View{

    public EquipGearView() {
        super("\n\tPlease select type of gear to equip"
                + "\n\tEnter 'a' for armor"
                + "\n\tEnter 'w' for weapon"
                + "\n\tEnter 'h' for helmet"
                + "\n\tEnter 's' for shield(or secondary)"
                + "\n\tEnter 'q' to return to previous menu");
    }

    @Override
    public int doAction(String value) {
        switch(value){
        
            case "A":
                ArmorEquipView equipArmor = new ArmorEquipView();
                equipArmor.display();
                break;
            case "W":
                EquipWeaponView equipWeapon = new EquipWeaponView();
                equipWeapon.display();
                break;
            case "H":
                EquipHelmetView equipHelmet = new EquipHelmetView();
                equipHelmet.display();
                break;
            case "S":
                EquipSecondaryView equipSecondary = new EquipSecondaryView();
                equipSecondary.display();
                break;
            case "Q":
                return 1;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
        }
        return 0;    
}
}
