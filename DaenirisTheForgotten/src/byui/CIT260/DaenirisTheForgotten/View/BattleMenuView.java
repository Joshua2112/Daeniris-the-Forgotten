/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;

public class BattleMenuView extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    
    BattleControl battle = new BattleControl();

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
            case "A":               
                battle.attackEnemy();
                battle.enemyAttack();
                System.out.println("\n\tPlayer: " + battle.getPlayerName() + "\t\tEnemy: " + battle.getEnemyName()
                                +"\n\tCurrent Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth() + "\t\tEnemy Health: " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth()
                                +"\n\tCurrent Magic: "+ battle.getCurrentMagic() + "/" + battle.getTotalMagic() + "\t\tEnemy Magic: " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic());
                break;
            case "M":
                MagicMenuView magicSpell = new MagicMenuView();
                magicSpell.display();
                System.out.println("\n\tPlayer: " + battle.getPlayerName() + "\t\tEnemy: " + battle.getEnemyName()
                                +"\n\tCurrent Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth() + "\t\tEnemy Health: " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth()
                                +"\n\tCurrent Magic: "+ battle.getCurrentMagic() + "/" + battle.getTotalMagic() + "\t\tEnemy Magic: " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic());
                break;
            case "D":
                battle.defend1();
                battle.enemyAttack();
                battle.defend2();
                System.out.println("\n\tPlayer: " + battle.getPlayerName() + "\t\tEnemy: " + battle.getEnemyName()
                                +"\n\tCurrent Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth() + "\t\tEnemy Health: " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth()
                                +"\n\tCurrent Magic: "+ battle.getCurrentMagic() + "/" + battle.getTotalMagic() + "\t\tEnemy Magic: " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic());
                break;
            case "U":
                UseItemMenuView useItem = new UseItemMenuView();
                useItem.displayItemMenu();
                System.out.println("\n\tPlayer: " + battle.getPlayerName() + "\t\tEnemy: " + battle.getEnemyName()
                                +"\n\tCurrent Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth() + "\t\tEnemy Health: " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth()
                                +"\n\tCurrent Magic: "+ battle.getCurrentMagic() + "/" + battle.getTotalMagic() + "\t\tEnemy Magic: " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic());
                break;
            case "E":
                battle.examineEnemy();
                battle.enemyAttack();
                System.out.println("\n\tPlayer: " + battle.getPlayerName() + "\t\tEnemy: " + battle.getEnemyName()
                                +"\n\tCurrent Health: " + battle.getCurrentHealth() + "/" + battle.getTotalHealth() + "\t\tEnemy Health: " + battle.getEnemyCurrentHealth() + "/" + battle.getEnemyHealth()
                                +"\n\tCurrent Magic: "+ battle.getCurrentMagic() + "/" + battle.getTotalMagic() + "\t\tEnemy Magic: " + battle.getEnemyCurrentMagic() + "/" + battle.getEnemyMagic());
                break;
            case "R":
                battle.run1();

            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
    
}
