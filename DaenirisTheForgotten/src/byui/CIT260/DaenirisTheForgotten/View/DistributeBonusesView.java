/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCStatsControl;

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
        
        switch (choice){
            case "A":
                PCStatsControl attack1 = new PCStatsControl();
                attack1.attackUp();
                return;
            case "D":
                PCStatsControl defense1 = new PCStatsControl();
                defense1.defenseUp();
                return;
            case "M":
                PCStatsControl mAttack1 = new PCStatsControl();
                mAttack1.mAttackUp();
                return;
            case "F":
                PCStatsControl mDefense1 = new PCStatsControl();
                mDefense1.mDefenseUp();
                return;
            case "H":
                PCStatsControl HP5 = new PCStatsControl();
                HP5.HPUp();
                return;
            case "P":
                PCStatsControl MP5 = new PCStatsControl();
                MP5.MPUp();
                return;
            case "N":                
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
                
            }          
    }       
}

    

