/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;

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
            
            BattleControl battle = new BattleControl();
        
         switch (choice){
            case "A":               
                battle.attackEnemy();
                battle.enemyAttack();
                break;
            case "M":
                MagicMenuView magicSpell = new MagicMenuView();
                magicSpell.display();
                break;
            case "D":
                battle.defend1();
                battle.enemyAttack();
                battle.defend2();
                break;
            case "U":
                UseItemMenuView useItem = new UseItemMenuView();
                useItem.displayItemMenu();
                break;
            case "E":
                battle.examineEnemy();
                break;
            case "R":
                battle.run1();

            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
    
}
