/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;


/**
 *
 * @author Joshua
 */
public class CharacterCreationView {

 
    public static void newCharacterCreation() {  
        
        System.out.println("Create Character");
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actor = game.getActor();
        PlayerCharacter player = ((PlayerCharacter) actor[0][0]);
        
        EnterCharacterName enterName = new EnterCharacterName();
        enterName.EnterPlayerCharactersName();
        
        EnterGenderView enterGender = new EnterGenderView();
        enterGender.displayMenu();
        
        EnterJobView enterJob = new EnterJobView();
        enterJob.display();
        
        DistributeBonusesView DB = new DistributeBonusesView();
        DB.display();
        
        IsThisCharacterOkay itco = new IsThisCharacterOkay();
        itco.characterInfo(player);
        
        AdventureView adventureView = new AdventureView();
        adventureView.display();
    }
}

