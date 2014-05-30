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
    

    
              
    public void startProgram(){
            
        this.displayBanner();
            
            String playerCharactersName = this.getPlayerCharactersName();
            if (playerCharactersName == null)
                return;
            
            PlayerCharacter playerCharacter = ProgramControl.createPlayerCharacter(playerCharactersName);
            
            this.displayWelcomeMessage(playerCharacter);
            
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMenu();
            
            }

    
        public void displayBanner(){
        
        System.out.println("this is the display message");
    }
    
    public String getPlayerCharactersName(){
        boolean valid = false;
        String playerCharactersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Please enter player name");
            
            playerCharactersName = keyboard.nextLine();
            playerCharactersName = playerCharactersName.trim();
            
            if (playerCharactersName.toUpperCase().equals("Q")){
                return null;
            }
            
            if (playerCharactersName.length() < 2){
                System.out.println("Invalid name - the name must be greater than one character in length");
                
            }           
            else{
                valid = true;
            }
        }
        return playerCharactersName;
    }   
    
        public void displayWelcomeMessage(PlayerCharacter playerCharacter) {
        System.out.println("Welcome to the game" + playerCharacter.getName());
        
    }
    
    
}


