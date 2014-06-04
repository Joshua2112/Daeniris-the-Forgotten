/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCJobControl;
import byui.CIT260.DaenirisTheForgotten.Control.PlayerCharacterGenderControl;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
class EnterJobView {
    
    String job = null;
    Scanner keyboard = new Scanner(System.in);
    
        private final String enterClass  ="\n\tPlease choose a class for your hero"
                                         +"\n\tWarrior, Mage, or Cleric"
                                         +"\n\t\'quit\' to exit";
        
    public void displayMenu() {
        
        String selection;
       
        do{
        System.out.println(enterClass);
        
        String input = this.getInput();
            selection = input;

            this.doAction(selection);

            }while (!selection.equals("QUIT"));
        }               
        

        public String getInput() {
        
            boolean valid = false;
            String input = null;
        
            while(!valid){
            
                System.out.println("\n\tPlease choose option");
            
                input = keyboard.nextLine();
                input = input.trim();
                input = input.toUpperCase();
            
                if (input.equals("QUIT")){
                    return null;
                }
                           
                else{
                    valid = true;
                }
            }
            return input;
        }
    
    public void doAction(String choice){
        
        switch (choice){
            case "WARRIOR":
                PCJobControl pcWarrior = new PCJobControl();
                pcWarrior.setJob();
                break;
            case "MAGE":
                PCJobControl pcMage = new PCJobControl();
                pcMage.setJob();
                break;
            case "Cleric":
                PCJobControl pcCleric = new PCJobControl();
                pcCleric.setJob();               
            case "QUIT":
                break;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
        }
               
    }
}
    

