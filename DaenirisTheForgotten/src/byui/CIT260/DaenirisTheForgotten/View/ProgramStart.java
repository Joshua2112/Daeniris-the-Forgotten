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
public class ProgramStart{
    
    //public void displayWelcomeMessage(PlayerCharacter playerCharacter) {
            //System.out.println("Welcome to the game " + playerCharacter.getName());        
            //}
    
              
    public void startProgram(){
            
        this.displayBanner();
            
            
            
            //this.displayWelcomeMessage(playerCharacter);
            
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
    }            
    
        public void displayBanner(){
        
        System.out.println("\n\t*************************************"
                          +"\n\t* Welcome to Daeniris the Forgotten *"
                          +"\n\t*                                   *"
                          +"\n\t* This will be the start of a great *"
                          +"\n\t* adventure.  Your hero will become *"
                          +"\n\t* a champion of the people.  You    *"
                          +"\n\t* will need to use your smarts to   *"
                          +"\n\t* save the people, and the people   *"
                          +"\n\t* will ever be gratefull.           *"
                          +"\n\t*                                   *"
                          +"\n\t*         Good luck to you          *"
                          +"\n\t*************************************");
    }
    
                     
}                        
