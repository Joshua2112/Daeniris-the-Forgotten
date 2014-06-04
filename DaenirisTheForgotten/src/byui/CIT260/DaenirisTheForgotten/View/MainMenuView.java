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
public class MainMenuView extends MenuView{
    
        private final String mainMenu ="\n\tEnter \'n\' to start new game"
                                  +"\n\tEnter \'h\' for the help menu"
                                  +"\n\tEnter \'s\' to save current game"
                                  +"\n\tEnter \'l\' to load previously saved game"                                  
                                  +"\n\tEnter \'q\' to quit to the desktop";

        public String getMainMenu() {
            return mainMenu;
        }

        @Override
        public void doAction(char choice){
        
         switch (choice){
            case 'n':
                CharacterCreationView newCharacter = new CharacterCreationView();
                newCharacter.newCharacterCreation();
                break;
            case 'h':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu(helpMenu.getHelpMenu());
                break;
            case 's':
                ProgramControl.saveGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'l':
                ProgramControl.loadGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 't':
                AdventureView adventureView = new AdventureView();
                adventureView.displayMenu(adventureView.getAdventureMenu());
                break;
            case 'q':
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }
}


