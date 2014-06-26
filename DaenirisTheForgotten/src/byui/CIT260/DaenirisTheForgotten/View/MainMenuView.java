/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Joshua
 */
public class MainMenuView extends View{
        public MainMenuView(){
            super("\n\tEnter \'n\' to start new game"
            +"\n\tEnter \'h\' for the help menu"
            +"\n\tEnter \'s\' to save current game"
            +"\n\tEnter \'l\' to load previously saved game"
            +"\n\tEnter \'t\' to temporarily access adventure menu"
            +"\n\tEnter \'q\' to quit to the desktop");
        }


        @Override
        public void doAction(String choice){       
         switch (choice){
            case "N":
                this.StartNewGame(false);             
                break;
            case "H":
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case "S":
                ProgramControl.saveGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case "L":
                ProgramControl.loadGame(DaenirisTheForgotten.getCurrentGame());
                break;
            case "T":
                this.StartNewGame(true);
                AdventureView adventureView = new AdventureView();
                adventureView.display();
                break;
            case "W":
                MagicMenuView magicSpell = new MagicMenuView();
                magicSpell.display();
            case "R":
                ShopMenuView shopping = new ShopMenuView();
                shopping.display();
            case "B":
                this.StartNewGame(true);
                BattleMenuView fight = new BattleMenuView();
                fight.display();
            case "Q":
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


