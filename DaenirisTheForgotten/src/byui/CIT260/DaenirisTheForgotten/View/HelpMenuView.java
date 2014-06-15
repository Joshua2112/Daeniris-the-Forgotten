/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
class HelpMenuView extends MenuView{

    private final String helpMenu ="\n\tg - goal of Daeniris the Forgotten"
                              +"\n\tp - how to play" 
                              +"\n\ti - general information"
                              +"\n\th - hints about the game"                                 
                              +"\n\tq - exit the help menu";

    public String getHelpMenu() {
        return helpMenu;
    }
                  

    
    @Override
    public void doAction(char choice){
        
         switch (choice){
            case 'g':
                System.out.println("\n\tYou will create a hero and go on a quest with them \n\tto protect the innocent people of the land from an ancient evil.");
                break;
            case 'p':
                System.out.println("\n\tInstruction on how to play");
                break;
            case 'i':
                System.out.println("\n\tGeneral information about the game");
                break;
            case 'h':
                System.out.println("\n\tHints about the game and deeper gameplay mechanics");
                break;
            case 'q':
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
        }
               
    }
    
}
