/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.EquippedGear;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class HelmetEquipView extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Gear[] helms = game.getHelms();
    EquippedGear playerGear = game.getEquippedGear();
    BattleScene stats = new BattleScene();


    public HelmetEquipView() {
        super("\n\tPlease select gear to equip"
                + "\n\tYou may equip one of each gear type(Weapon, Sheild, Helmet, Armor)");
        for(int i = 0; i < Constants.GEAR_LIST_COUNT; i++){
            if(helms[i].getQuantity() > 0){
            System.out.println("\n\tEnter " + (i+2)
                    + "\n\tName" + helms[i].getName()
                    + "\n\tDescription" + helms[i].getDescription()
                    + "\n\tGear type" + helms[i].getGearType()
                    + "\n\tAttack Bonus" + helms[i].getAttackBonus()
                    + "\n\tDefense Bonus" + helms[i].getDefenseBonus()
                    + "\n\tMagic Attack Bonus" + helms[i].getMagicAttackBonus()
                    + "\n\tMagic Defense Bonus" + helms[i].getMagicDefenseBonus()
                    + "\n\tOther Effects" + helms[i].getSpecialEffects()
                    + "\n\tQuantity" + helms[i].getQuantity());
            }
        }
    }

    @Override
    public int doAction(String value) {
        switch(value){
                   
            case "2":
                playerGear.setWeapon(helms[0]);
                System.out.println("\n\tYou equipped " + helms[0].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "3":
                playerGear.setWeapon(helms[1]);
                System.out.println("\n\tYou equipped " + helms[1].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "4":
                playerGear.setWeapon(helms[2]);
                System.out.println("\n\tYou equipped " + helms[2].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "5":
                playerGear.setWeapon(helms[3]);
                System.out.println("\n\tYou equipped " + helms[3].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "6":
                playerGear.setWeapon(helms[4]);
                System.out.println("\n\tYou equipped " + helms[4].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "7":
                playerGear.setWeapon(helms[5]);
                System.out.println("\n\tYou equipped " + helms[5].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "8":
                playerGear.setWeapon(helms[6]);
                System.out.println("\n\tYou equipped " + helms[6].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "9":
                playerGear.setWeapon(helms[7]);
                System.out.println("\n\tYou equipped " + helms[7].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "10":
                playerGear.setWeapon(helms[8]);
                System.out.println("\n\tYou equipped " + helms[8].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "11":
                playerGear.setWeapon(helms[9]);
                System.out.println("\n\tYou equipped " + helms[9].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "12":
                playerGear.setWeapon(helms[10]);
                System.out.println("\n\tYou equipped " + helms[10].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "13":
                playerGear.setWeapon(helms[11]);
                System.out.println("\n\tYou equipped " + helms[11].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "14":
                playerGear.setWeapon(helms[12]);
                System.out.println("\n\tYou equipped " + helms[12].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "15":
                playerGear.setWeapon(helms[13]);
                System.out.println("\n\tYou equipped " + helms[13].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "16":
                playerGear.setWeapon(helms[14]);
                System.out.println("\n\tYou equipped " + helms[14].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "17":
                playerGear.setWeapon(helms[15]);
                System.out.println("\n\tYou equipped " + helms[15].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
            case "18":
                playerGear.setWeapon(helms[16]);
                System.out.println("\n\tYou equipped " + helms[16].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
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

