/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.EquippedGear;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class PlayerCharacterInfoView extends View{
    
    Game game = DaenirisTheForgotten.getCurrentGame();
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);
    EquippedGear playerGear = game.getEquippedGear();
    BattleScene stats = new BattleScene(1);

    public PlayerCharacterInfoView() {
        super("");
                System.out.println("\n\tPlayer Character Information"
                +"\n\tPlayer's Name " + player.getName()
                +"\n\tLevel " + player.getLevel()
                +"\n\tClass " + player.getJob()
                +"\n\tGender " + player.getGender()
                +"\n\tHealth Points " + player.getCurrentHealthPoints() + "/" + player.getHealthPoints()
                +"\n\tMagic Points " + player.getCurrentMagicPoints() + "/" + player.getMagicPoints()
                +"\n\tAttack " + player.getAttack() + "\tTotal Attack " + stats.getTotalAttack()
                +"\n\tDefense " + player.getDefense() + "\tTotal Defense " + stats.getTotalDefense()
                +"\n\tMagic Attack " + player.getMagicAttack() + "\tTotal Magic Attack " + stats.getTotalMagicAttack()
                +"\n\tMagic Defense " + player.getMagicDefense() + "\tTotal Magic Defense " + stats.getTotalMagicDefense()
                +"\n\tExperience Points " + player.getExperience() + "\tTo Next Level " + ((player.getLevel() * 100) - player.getExperience())
                +"\n\tGold " + player.getPlayerGold()
                +"\n\tEnter 'q' to Exit");
    }

    @Override
    public int doAction(String value) {
    switch(value){
        
        case "Q":
            return 1;
        default:
            System.out.println("\n\tInvalid input.  Try again.");
    }
        return 0;
    }
    
}
