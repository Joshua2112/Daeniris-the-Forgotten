/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PlayerCharacterGenderControl;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EnterGenderView {
    
    Scanner keyboard = new Scanner(System.in);
    
        private final String enterGender ="\n\tPlease choose a gender for your hero"
                                         +"\n\tMale or Female"
                                         +"\n\t\'quit\' to exit";
        
        public void displayMenu(){

            String selection;
            
            do {
            
            System.out.println(enterGender);

            String input = this.getInput();
            selection = input;

            this.doAction(selection);

            }while (!selection.equals("QUIT"));
        }               
        

        public String getInput() {
        
            boolean valid = false;
            String input = null;
        
            while(!valid){
            
                System.out.println("\tPlease choose option");
            
                input = keyboard.nextLine();
                input = input.trim();
                input = input.toUpperCase();
                
                if(input.toUpperCase().equals("QUIT")){
                    return null;
                }
                           
                else {valid = true;
                
                }
                
            }
            return input;
        }
    
    public void doAction(String choice){
        
        switch (choice){
            case "MALE":
                PlayerCharacterGenderControl pcMale = new PlayerCharacterGenderControl();
                pcMale.setPlayerCharacterGender();
                break;
            case "FEMALE":
                PlayerCharacterGenderControl pcFemale = new PlayerCharacterGenderControl();
                pcFemale.setPlayerCharacterGender();
                break;
            case "QUIT":
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
    
}
    

