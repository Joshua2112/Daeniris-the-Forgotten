/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class PCStatsControl {
    

    public static void setGender(PlayerCharacter player, String choice){
        player.setGender(choice);
    }
    
    
    
    public static void setJob(PlayerCharacter player, String choice){
        
        if (choice.compareToIgnoreCase("warrior")== 0){
        
            player.setDefense(10);
            player.setJob("Warrior");
            player.setAttack(0);
            player.setDefense(0);
            player.setMagicAttack(0);
            player.setMagicDefense(0);
            player.setHealthPoints(50);
            player.setMagicPoints(20);
        }
        else if (choice.compareToIgnoreCase("mage")== 0){
        
            player.setDefense(10);
            player.setJob("Mage");
            player.setAttack(0);
            player.setDefense(0);
            player.setMagicAttack(0);
            player.setMagicDefense(0);
            player.setHealthPoints(30);
            player.setMagicPoints(50);
        }
        else{
        
            player.setDefense(10);
            player.setJob("Cleric");
            player.setAttack(0);
            player.setDefense(0);
            player.setMagicAttack(0);
            player.setMagicDefense(0);
            player.setHealthPoints(40);
            player.setMagicPoints(30);
        }
    }
    
    public static boolean pointsCheck(PlayerCharacter player){
        if (player.getLevelPoints() == 0){
           System.out.println("You are out of points, reset to start over");
        }
        else
           return true;
        
        return false;
    }

    public static void attackUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setAttack(player.getAttack() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("defense increased by 1 point"
                           + "You have " + player.getLevelPoints() 
                           + " left to distribute");  
    }

    public static  void defenseUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setDefense(player.getDefense() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("defense increased by 1 point"
                           + "You have " + player.getLevelPoints() 
                           + " left to distribute");        
    }

    public static  void mAttackUp() {
        System.out.println("Magic attack increased by 1 stub");
    }

    public static  void mDefenseUp() {
        System.out.println("Magic defense increased by 1 stub");
    }

    public static  void HPUp() {
        System.out.println("Health points increased by 5 stub");
    }

    public static  void MPUp() {
        System.out.println("Magic points increased by 5 stub");
    }
    
    public static  void resetPoints(){
        System.out.println("Reset Points Distribution");
    }
    
}
