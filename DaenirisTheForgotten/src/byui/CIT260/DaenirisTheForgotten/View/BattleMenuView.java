/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;

public class BattleMenuView extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    


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
         Game game = DaenirisTheForgotten.currentGame;
                   
         switch (choice){
            case "A":               
                BattleControl.attackEnemy();
                BattleControl.enemyAttack();
                break;
            case "M":
                MagicMenuView magicSpell = new MagicMenuView();
                magicSpell.display();              
                break;
            case "D":
                BattleControl.defend1();
                BattleControl.enemyAttack();
                BattleControl.defend2();
               break;
            case "U":
                UseItemMenuView useItem = new UseItemMenuView();
                useItem.displayItemMenu();
                break;
            case "E":
                BattleControl.examineEnemy();
                BattleControl.enemyAttack();
                break;
            case "R":
                BattleControl.run1();

            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
    
}
