/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class MainMenuView {
    
        private final String MENU ="\n\tEnter \'n\' to start new game"
                                  +"\n\tEnter \'h\' for the help menu"
                                  +"\n\tEnter \'s\' to save current game"
                                  +"\n\tEnter \'l\' to load previously saved game"                                  
                                  +"\n\tEnter \'q\' to quit to the desktop";
                  
    public void displayMenu(){

        char selection = ' ';
        do {
            
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        }while (selection != 'q');
    }               

    public String getInput() {
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("Please choose option");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input.toUpperCase().equals("Q")){
                return null;
            }
                           
            else{
                valid = true;
            }
        }
        return input;
        }
    
    public void doAction(char choice){
        
         switch (choice){
            case 'n':
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();
                break;
            case 'h':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case 's':
                ProgramControl.saveGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'l':
                ProgramControl.loadGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
}


