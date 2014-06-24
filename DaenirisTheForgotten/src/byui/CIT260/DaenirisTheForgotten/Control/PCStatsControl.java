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
            player.setLevelPoints(5);
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
            player.setLevelPoints(5);
        }
        else if (choice.compareToIgnoreCase("cleric")== 0){
        
            player.setDefense(10);
            player.setJob("Cleric");
            player.setAttack(0);
            player.setDefense(0);
            player.setMagicAttack(0);
            player.setMagicDefense(0);
            player.setHealthPoints(40);
            player.setMagicPoints(30);
            player.setLevelPoints(5);
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
        System.out.println("attack increased by 1 point");  
    }

    public static  void defenseUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setDefense(player.getDefense() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("defense increased by 1 point");        
    }

    public static  void mAttackUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setMagicAttack(player.getMagicAttack() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("magic attack increased by 1 point");  
    }

    public static  void mDefenseUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setMagicDefense(player.getMagicDefense() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("magic defense increased by 1 point");  
    }

    public static  void HPUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setHealthPoints(player.getHealthPoints() + 5);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("health increased by 5 point");
    }

    public static  void MPUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setMagicPoints(player.getMagicPoints() + 5);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("health increased by 5 point");
    }
    
    public static  void resetPoints(PlayerCharacter player){
        setJob(player, player.getJob());
    }
    
}
