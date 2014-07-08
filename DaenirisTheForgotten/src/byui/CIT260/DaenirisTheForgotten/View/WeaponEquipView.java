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
                    + "\n\tName = " + weapons[i].getName()
                    + "\n\tDescription = " + weapons[i].getDescription()
                    + "\n\tAttack Bonus = " + weapons[i].getAttackBonus()
                    + "\n\tDefense Bonus = " + weapons[i].getDefenseBonus()
                    + "\n\tMagic Attack Bonus = " + weapons[i].getMagicAttackBonus()
                    + "\n\tMagic Defense Bonus = " + weapons[i].getMagicDefenseBonus()
                    + "\n\tOther Effects = " + weapons[i].getSpecialEffects()
                    + "\n\tQuantity = " + weapons[i].getQuantity());
            }
        }
    }

    @Override
    public int doAction(String value) {
        switch(value){
            
        case "2":
                playerGear.setWeapon(weapons[0]);
                BattleScene stats = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[0].getName()
                        + "\n\tTotal Attack = " + stats.getTotalAttack()
                        + "\n\tTotal Defense = " + stats.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats.getTotalMagicDefense());
                break;
        case "3":
                playerGear.setWeapon(weapons[1]);
                BattleScene stats1 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[1].getName()
                        + "\n\tTotal Attack = " + stats1.getTotalAttack()
                        + "\n\tTotal Defense = " + stats1.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats1.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats1.getTotalMagicDefense());
                break;
        case "4":
                playerGear.setWeapon(weapons[2]);
                BattleScene stats2 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[2].getName()
                        + "\n\tTotal Attack = " + stats2.getTotalAttack()
                        + "\n\tTotal Defense = " + stats2.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats2.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats2.getTotalMagicDefense());
                break;
            case "5":
                playerGear.setWeapon(weapons[3]);
                BattleScene stats3 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[3].getName()
                        + "\n\tTotal Attack = " + stats3.getTotalAttack()
                        + "\n\tTotal Defense = " + stats3.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats3.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats3.getTotalMagicDefense());
                break;
            case "6":
                playerGear.setWeapon(weapons[4]);
                BattleScene stats4 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[4].getName()
                        + "\n\tTotal Attack = " + stats4.getTotalAttack()
                        + "\n\tTotal Defense = " + stats4.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats4.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats4.getTotalMagicDefense());
                break;
            case "7":
                playerGear.setWeapon(weapons[5]);
                BattleScene stats5 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[5].getName()
                        + "\n\tTotal Attack = " + stats5.getTotalAttack()
                        + "\n\tTotal Defense = " + stats5.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats5.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats5.getTotalMagicDefense());
                break;
            case "8":
                playerGear.setWeapon(weapons[6]);
                BattleScene stats6 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[6].getName()
                        + "\n\tTotal Attack = " + stats6.getTotalAttack()
                        + "\n\tTotal Defense = " + stats6.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats6.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats6.getTotalMagicDefense());
                break;
            case "9":
                playerGear.setWeapon(weapons[7]);
                BattleScene stats7 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[7].getName()
                        + "\n\tTotal Attack = " + stats7.getTotalAttack()
                        + "\n\tTotal Defense = " + stats7.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats7.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats7.getTotalMagicDefense());
                break;
            case "10":
                playerGear.setWeapon(weapons[8]);
                BattleScene stats8 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[8].getName()
                        + "\n\tTotal Attack = " + stats8.getTotalAttack()
                        + "\n\tTotal Defense = " + stats8.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats8.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats8.getTotalMagicDefense());
                break;
            case "11":
                playerGear.setWeapon(weapons[9]);
                BattleScene stats9 = new BattleScene(1);
                System.out.println("\n\tYou equipped " + weapons[9].getName()
                        + "\n\tTotal Attack = " + stats9.getTotalAttack()
                        + "\n\tTotal Defense = " + stats9.getTotalDefense()
                        + "\n\tTotal Magic Attack = " + stats9.getTotalMagicAttack()
                        + "\n\tTotal Magic Defense = " + stats9.getTotalMagicDefense());
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
