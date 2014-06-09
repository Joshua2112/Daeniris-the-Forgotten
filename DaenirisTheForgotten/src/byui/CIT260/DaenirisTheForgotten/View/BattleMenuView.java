/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.BattleControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class BattleMenuView extends MenuView{
    
    private final String BATTLEMENU ="\n\ta - attack"
                                  +"\n\tm - magic"
                                  +"\n\td - defend"
                                  +"\n\tu - use item"
                                  +"\n\te - evaluate enemy"
                                  +"\n\tr - run";

        public String getBATTLEMENU() {
            return BATTLEMENU;
        }

        @Override
        public void doAction(char choice){
        
         switch (choice){
            case 'a':
                //BattleControl.hit(PlayerCharacter.attack, PlayerCharacter.defense);
                //BattleControl.critical();
                //BattleControl.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
                break;
            case 'm':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu(helpMenu.getHelpMenu());
                break;
            case 'd':
                ProgramControl.saveGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'u':
                ProgramControl.loadGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'e':
                AdventureView adventureView = new AdventureView();
                adventureView.displayMenu(adventureView.getAdventureMenu());
                break;
            case 'r':
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
    
}
