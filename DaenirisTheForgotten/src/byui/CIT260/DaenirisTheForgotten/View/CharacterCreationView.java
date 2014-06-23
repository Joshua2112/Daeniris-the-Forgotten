/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;


/**
 *
 * @author Joshua
 */
public class CharacterCreationView extends View {

    public CharacterCreationView() {
        super("Create Character");
    }
    
    
    
    public void newCharacterCreation() {  
        
        int points = 5;
        
        // New pointer to the current game
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        //Create a pointer to the actor array
        Actor[][] player = game.getActor();
        
        //Example of how to access the class.
        //player[0][0].setName("Thor The Dumb");
        
        EnterGenderView enterGender = new EnterGenderView();
        enterGender.displayMenu();
        
        EnterJobView enterJob = new EnterJobView();
        enterJob.displayMenu();
        
        DistributeBonusesView DB = new DistributeBonusesView();
        DB.display();
        
        IsThisCharacterOkay itco = new IsThisCharacterOkay();
        itco.characterInfo();
        
        AdventureView adventureView = new AdventureView();
        adventureView.display();
    }
}

