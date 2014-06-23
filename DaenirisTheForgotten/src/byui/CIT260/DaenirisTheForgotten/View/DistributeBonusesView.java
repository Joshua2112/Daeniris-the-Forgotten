/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCStatsControl;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class DistributeBonusesView extends View{

    public DistributeBonusesView() {
        super("\n\tPlease distribute your bonuses"
             +"\n\tEnter a letter to distribute one point"
            +"\n\t\'a\' for attack"
            +"\n\t\'d\' for defense"
            +"\n\t\'m\' for magic attack"
            +"\n\t\'f\' for magic defense"
            +"\n\t\'h\' for health points one point buys five health points"
            +"\n\t\'p\' for magic points  one point buys five magic points"
            +"\n\tYou start with 5 points"
            +"\n\t\'n\' to continue");
    }
    
    public void doAction(String choice){
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] player = game.getActor();
        
        
        PCStatsControl statsControl = new PCStatsControl();
        
        switch (choice){
            case "A": 
                statsControl.attackUp();
                break;
            case "D":
                statsControl.defenseUp();
                break;
            case "M":
                statsControl.mAttackUp();
                break;
            case "F":
                statsControl.mDefenseUp();
                break;
            case "H":
                statsControl.HPUp();
                break;
            case "P":
                statsControl.MPUp();
                break;
            case "R":
                statsControl.MPUp();
                break;
            case "Q":
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
                
            }
        System.out.println(player[0][0].toString());
        
    }       
}

    

