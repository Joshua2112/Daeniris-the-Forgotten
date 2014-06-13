/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
class IsThisCharacterOkay {
    
    private final String IS_IT_OKAY;

    IsThisCharacterOkay() {
        this.IS_IT_OKAY = "\n\tName " 
                +  "\n\tGender " 
                +   "\n\tJob " 
                +   "\n\tHealth Points" 
                +   "\n\tMagic Points" 
                +   "\n\tAttack" 
                +   "\n\tDefense" 
                +   "\n\tMagic Attack"
                +   "\n\tMagic Defense"
                +   "\n"
                +   "\n\tIs this okay y/n?";
    }

    public void characterInfo() {

                
                char selection = ' ';
        do {
            
            System.out.println(IS_IT_OKAY);
            
            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        }while (selection != 'Y');
    }               

    public String getInput() {
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("\n\tPlease choose option");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            


            if (input.equals("Y")){

                return input;
            }
                           
            else{
                valid = true;
            }
        }
        return input;
        }
    public void doAction(char choice){       
         switch (choice){
            case 'N':
                CharacterCreationView newCharacter = new CharacterCreationView();
                //newCharacter.newCharacterCreation();
                break;
            case 'Y':
                return;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
            }
               
    }
}
    

