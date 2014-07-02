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
        EquippedGear playerGear = game.getEquippedGear();

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
                playerGear.setWeapon(weapons[0]);
                break;
            case "3":
                playerGear.setWeapon(weapons[1]);
                break;
            case "4":
                playerGear.setWeapon(weapons[2]);
                break;
            case "5":
                playerGear.setWeapon(weapons[3]);
                break;
            case "6":
                playerGear.setWeapon(weapons[4]);
                break;
            case "7":
                playerGear.setWeapon(weapons[5]);
                break;
            case "8":
                playerGear.setWeapon(weapons[6]);
                break;
            case "9":
                playerGear.setWeapon(weapons[7]);
                break;
            case "10":
                playerGear.setWeapon(weapons[8]);
                break;
            case "11":
                playerGear.setWeapon(weapons[9]);
                break;
            case "12":
                playerGear.setWeapon(weapons[10]);
                break;
            case "13":
                playerGear.setWeapon(weapons[11]);
                break;
            case "14":
                playerGear.setWeapon(weapons[12]);
                break;
            case "15":
                playerGear.setWeapon(weapons[13]);
                break;
            case "16":
                playerGear.setWeapon(weapons[14]);
                break;
            case "17":
                playerGear.setWeapon(weapons[15]);
                break;
            case "18":
                playerGear.setWeapon(weapons[16]);
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
