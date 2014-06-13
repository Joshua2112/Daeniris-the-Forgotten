/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
//import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;


/**
 *
 * @author Joshua
 */
public class CharacterCreationView extends MenuView {
    
        public void newCharacterCreation() {                 
        
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
        DB.displayMenu();
        
        IsThisCharacterOkay itco = new IsThisCharacterOkay();
        itco.characterInfo();
        
        AdventureView adventureView = new AdventureView();
        adventureView.displayMenu(adventureView.getAdventureMenu());
    }
}

