/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;

public class BattleMenuView extends View{

    public BattleMenuView() {
        super("\n\ta - attack"
                                  +"\n\tm - magic"
                                  +"\n\td - defend"
                                  +"\n\tu - use item"
                                  +"\n\te - evaluate enemy"
                                  +"\n\tr - run");
    }


        @Override
        public void doAction(String choice){
        
         switch (choice){
            case "a":
                BattleControl attack = new BattleControl();
                attack.hit();
                break;
            case "m":
                MagicMenuView magicSpell = new MagicMenuView();
                magicSpell.displayMagicMenu();
                break;
            case "d":
                BattleControl defend = new BattleControl();
                defend.defend1();
                break;
            case "u":
                UseItemMenuView useItem = new UseItemMenuView();
                useItem.displayItemMenu();
                break;
            case "e":
                BattleControl examine = new BattleControl();
                examine.examineEnemy();
                break;
            case "r":
                BattleControl run = new BattleControl();
                run.run1();

            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
    
}
