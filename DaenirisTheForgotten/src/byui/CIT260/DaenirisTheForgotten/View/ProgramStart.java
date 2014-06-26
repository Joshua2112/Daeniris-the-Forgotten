/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ProgramStart{
    
    public void displayWelcomeMessage(PlayerCharacter playerCharacter) {
            System.out.println("Welcome to the game " + playerCharacter.getName());        
            }
    
              
    public void startProgram(){
            
        this.displayBanner();
            
            
            
            //this.displayWelcomeMessage(playerCharacter);
            
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
    }            
    
        public void displayBanner(){
        
        System.out.println("\n*************************************"
                          +"\n* Welcome to Daeniris the Forgotten *"
                          +"\n*                                   *"
                          +"\n* This will be the start of a great *"
                          +"\n* adventure.  Your hero will become *"
                          +"\n* a champion of the people.  You    *"
                          +"\n* will need to use your smarts to   *"
                          +"\n* save the people, and the people   *"
                          +"\n* will ever be gratefull.           *"
                          +"\n*                                   *"
                          +"\n*         Good luck to you          *");
    }
    
                     
}                        
