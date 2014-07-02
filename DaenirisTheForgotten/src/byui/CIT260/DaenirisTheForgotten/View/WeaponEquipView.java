/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Model.EquippedGear;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class WeaponEquipView extends View{

        Game game = DaenirisTheForgotten.getCurrentGame();
        Gear[] weapons = game.getWeapons();

    public WeaponEquipView() {
        super("\n\tPlease select gear to equip"
                + "\n\tYou may equip one of each gear type(Weapon, Sheild, Helmet, Armor)");
        for(int i = 0; i < Constants.GEAR_LIST_COUNT; i++){
            if(weapons[i].getQuantity() > 0){
            System.out.println("\n\tEnter " + (i+2)
                    + "\n\tName" + weapons[i].getName()
                    + "\n\tDescription" + weapons[i].getDescription()
                    + "\n\tGear type" + weapons[i].getGearType()
                    + "\n\tAttack Bonus" + weapons[i].getAttackBonus()
                    + "\n\tDefense Bonus" + weapons[i].getDefenseBonus()
                    + "\n\tMagic Attack Bonus" + weapons[i].getMagicAttackBonus()
                    + "\n\tMagic Defense Bonus" + weapons[i].getMagicDefenseBonus()
                    + "\n\tOther Effects" + weapons[i].getSpecialEffects()
                    + "\n\tQuantity" + weapons[i].getQuantity());
            }
        }
    }

    @Override
    public int doAction(String value) {
        switch(value){
        
            case "2":
                EquippedGear.setWeapon(game.weapons[0]);
                break;
            case "3":
                EquippedGear.setWeapon(game.weapons[1]);
                break;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
                
    }
            return 0;
                
                }
}
