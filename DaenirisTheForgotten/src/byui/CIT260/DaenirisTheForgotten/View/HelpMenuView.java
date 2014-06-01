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
class HelpMenuView {

    private final String MENU ="\n\tg - goal of Daeniris the Forgotten"
                              +"\n\tp - how to play" 
                              +"\n\ti - general information"
                              +"\n\th - hints about the game"                                 
                              +"\n\tq - exit the help menu";
                  
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
            case 'g':
                System.out.println("You will create a hero and go on a quest with them to protect the innocent people of the land from an ancient evil.");
                break;
            case 'p':
                System.out.println("Instruction on how to play");
                break;
            case 'i':
                System.out.println("General information about the game");
                break;
            case 'h':
                System.out.println("Hints about the game and deeper gameplay mechanics");
                break;
            case 'q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
    
}
