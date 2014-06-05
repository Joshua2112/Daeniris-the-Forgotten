/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;


/**
 *
 * @author Joshua
 */
public class CharacterCreationView {
    
        public void newCharacterCreation() {
                 
        EnterGenderView enterGender = new EnterGenderView();
        enterGender.displayMenu();
        
        EnterJobView enterJob = new EnterJobView();
        enterJob.displayMenu();
        
        DistributeBonusesView DB = new DistributeBonusesView();
        DB.displayMenu();
        
        System.out.println("Is this okay? y/n");
        
        }
    }

