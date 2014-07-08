/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        public int doAction(String choice){       
         switch (choice){
            case "N":
         try {             
             this.StartNewGame(false);
         } catch (illegalActionException ex) {
             Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
         }
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
         try {
             this.StartNewGame(true);
         } catch (illegalActionException ex) {
             Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
         }
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
         try {
             this.StartNewGame(true);
         } catch (illegalActionException ex) {
             Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
         }
                BattleMenuView fight = new BattleMenuView();
                fight.display();
            case "Q":
                return 0;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
         return 0;
               
        }

    private void StartNewGame(Boolean test) throws illegalActionException {
        
        GameControl.CreateNewGame();
        
        if (!test){
            CharacterCreationView.newCharacterCreation();
            }
    }

}


