/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ProgramStart{
    
    public void displayWelcomeMessage(PlayerCharacter playerCharacter) {
            System.out.println("Welcome to the game " + playerCharacter.getName());        
            }
    
              
    public void startProgram(Game game){
            
        this.displayBanner();
            
            
            String playerCharactersName = this.getPlayerCharactersName();
            if (playerCharactersName == null)
                return;
            
            PlayerCharacter playerCharacter = ProgramControl.createPlayerCharacter(playerCharactersName);
            
            this.displayWelcomeMessage(playerCharacter);
            
            game.setInventory(GameControl.createInventory());
            game.setWorld(GameControl.createWorld());
            GameControl.createInventory();
            GameControl.createActor();
            GameControl.createWorld();
            GameControl.createCraftRecipe();
            
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMenu(mainMenuView.getMainMenu(), game);
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
    
    public String getPlayerCharactersName(){
        
        boolean valid = false;
        String playerCharactersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("\n\tPlease enter character's name");
            
            playerCharactersName = keyboard.nextLine();
            playerCharactersName = playerCharactersName.trim();
            
            if (playerCharactersName.toUpperCase().equals("Q")){
                return null;
            }
            
            if (playerCharactersName.length() < 2){
                System.out.println("\n\tInvalid name, must be greater than 2 characters in length");
            }
                           
            else{
                valid = true;
            }
        }
        return playerCharactersName;
        }                 
}                        