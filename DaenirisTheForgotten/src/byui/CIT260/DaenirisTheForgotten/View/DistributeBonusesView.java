/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCStatsControl;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
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
            +"\n\t\'r\' reset points"
            +"\n\t\'q\' Quit. Exit points distribution");
    }
    
    @Override
    public int doAction(String choice){
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actor = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actor[0][0]);
       
        //PCStatsControl statsControl = new PCStatsControl();
        
        switch (choice){
            case "A":
                PCStatsControl.attackUp(player);
                break;
            case "D":
                PCStatsControl.defenseUp(player);
                break;
            case "M":
                PCStatsControl.mAttackUp(player);
                break;
            case "F":
                PCStatsControl.mDefenseUp(player);
                break;
            case "H":
                PCStatsControl.HPUp(player);
                break;
            case "P":
                PCStatsControl.MPUp(player);
                break;
            case "R":
                PCStatsControl.resetPoints(player);
                break;
            case "Q":
                return 0;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
                
            }
        
        System.out.println("You have " + player.getLevelPoints() 
                           + " left to distribute");        
        
        System.out.println(player.toString());
        
        return 0;
        
    }       
}

    

