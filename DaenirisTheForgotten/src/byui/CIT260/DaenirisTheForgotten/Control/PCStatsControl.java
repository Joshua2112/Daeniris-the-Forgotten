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
        
            player.setJob("Warrior");
            player.setAttack(3);
            player.setDefense(3);
            player.setMagicAttack(1);
            player.setMagicDefense(2);
            player.setHealthPoints(50);
            player.setMagicPoints(20);
            player.setLevelPoints(5);
        }
        else if (choice.compareToIgnoreCase("mage")== 0){
        
            player.setJob("Mage");
            player.setAttack(1);
            player.setDefense(2);
            player.setMagicAttack(3);
            player.setMagicDefense(3);
            player.setHealthPoints(30);
            player.setMagicPoints(50);
            player.setLevelPoints(5);
        }
        else if (choice.compareToIgnoreCase("cleric")== 0){
        
            player.setJob("Cleric");
            player.setAttack(3);
            player.setDefense(2);
            player.setMagicAttack(2);
            player.setMagicDefense(2);
            player.setHealthPoints(40);
            player.setMagicPoints(30);
            player.setLevelPoints(5);
        }
    }
    
    public static boolean pointsCheck(PlayerCharacter player){
        if (player.getLevelPoints() == 0){
           System.out.println("\n\tYou are out of points, reset to start over");
        }
        else
           return true;
        
        return false;
    }

    public static void attackUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setAttack(player.getAttack() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\tattack increased by 1 point");  
    }

    public static  void defenseUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setDefense(player.getDefense() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\tdefense increased by 1 point");        
    }

    public static  void mAttackUp(PlayerCharacter player) {
        
        if (!pointsCheck(player)){return;}
        
        player.setMagicAttack(player.getMagicAttack() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\tmagic attack increased by 1 point");  
    }

    public static  void mDefenseUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setMagicDefense(player.getMagicDefense() + 1);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\tmagic defense increased by 1 point");  
    }

    public static  void HPUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setHealthPoints(player.getHealthPoints() + 5);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\thealth increased by 5 points");
    }

    public static  void MPUp(PlayerCharacter player) {
        if (!pointsCheck(player)){return;}
        
        player.setMagicPoints(player.getMagicPoints() + 5);
        player.setLevelPoints(player.getLevelPoints() - 1);
        System.out.println("\n\thealth increased by 5 point");
    }
    
    public static  void resetPoints(PlayerCharacter player){
        setJob(player, player.getJob());
    }
    
}
