/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl.Player;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ProgramStart{
    

    
              
    public void startProgram(){
            
        this.displayBanner();
            
            String playersName = this.getPlayersName();
            if (playersName == null)
                return;
            
            Player player = ProgramControl.createPlayer(playersName);
            
            this.displayWelcomeMessage(player);
            
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMenu();
            
            }

    public void displayWelcomeMessage(Player player) {
        System.out.println("Welcome to the game" + player.getName());
        
    }
    

        public void displayBanner(){
        
        System.out.println("this is the display message");
    }
    
    public String getPlayersName(){
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Please enter player name");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.toUpperCase().equals("Q")){
                return null;
            }
            
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must be greater than one character in length");
                
            }           
            else{
                valid = true;
            }
        }
        return playersName;
    }   
    
    
}


