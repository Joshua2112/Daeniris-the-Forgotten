/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import dangurantheforgotten.DanguranTheForgotten;
import byui.CIT260.DaenirisTheForgotten.Control.Constants;

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
    public int doAction(String choice){
     Game game = DanguranTheForgotten.currentGame;
     int kill = 0;          
     switch (choice){
        case "A": 
            System.out.println("\n\tYou attacked the enemy");
            BattleControl.attackEnemy();
            BattleControl.enemyAttack();
            break;
        case "M":
            BattleSpellMenuView spell = new BattleSpellMenuView();
            spell.display(TabularMenu.createTabularMenu());
            BattleControl.enemyAttack();

            kill = BattleControl.magicCast();
            break;
        case "D":
            System.out.println("\n\tYour defense increased by " + BattleControl.defend1() + " temporarily");
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
            String run = BattleControl.run1();
            if(run == "\n\tYou successfully ran from the enemy"){
                return 1;
            }
            else{
            BattleControl.enemyAttack();
            }
            break;
        default:
            System.out.println("\n\tInvalid selection, try again");
            break;
        }

        return kill;
    }
        
    public static void displayResults(int damage, boolean hit){
        if (hit){
            System.out.println("\n\tYou did " + damage + " damage to the enemy");
        }
        else{
            System.out.println("\n\tYour attack missed");
        }         
    }
    
    public static void displayResults(Spells spell, int resultValue){
        if (spell.getSpellType() == Constants.SPELL_ATTACK_HEALTH){
            System.out.println("\n\t" + spell.getMessage() 
                             + resultValue 
                             + " damage to the enemy.");
        }
        else if (spell.getSpellType() == Constants.SPELL_HEAL_HEALTH){
            System.out.println("\n\t" + spell.getMessage() 
                             + resultValue
                             + " points.");
        }
        else{
            System.out.println("\n\t" + spell.getMessage() 
                             + resultValue
                             + "%");
        }
    }
}
