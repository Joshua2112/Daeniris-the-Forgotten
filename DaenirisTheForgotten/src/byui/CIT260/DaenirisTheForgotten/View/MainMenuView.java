/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
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
                                    +"\n\tEnter \'t\' to temporarily access adventure menu"
                                    +"\n\tEnter \'q\' to quit to the desktop";

        public String getMainMenu() {
            return mainMenu;
        }

        @Override
        public void doAction(char choice){       
         switch (choice){
            case 'N':
                this.StartNewGame(false);             
                break;
            case 'H':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu(helpMenu.getHelpMenu());
                break;
            case 'S':
                ProgramControl.saveGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'L':
                ProgramControl.loadGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case 'T':
                this.StartNewGame(true);
                AdventureView adventureView = new AdventureView();
                adventureView.displayMenu(adventureView.getAdventureMenu());
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
        }

    private void StartNewGame(Boolean test) {
        
        GameControl.CreateNewGame();
        
        if (!test){
            CharacterCreationView newCharacter = new CharacterCreationView();
            newCharacter.newCharacterCreation();
            }
    }
}


