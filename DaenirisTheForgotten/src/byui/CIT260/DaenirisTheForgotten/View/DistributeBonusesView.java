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
class DistributeBonusesView {
    
    Scanner keyboard = new Scanner(System.in);
    
    int points = 5;
    
        private final String DistributeBonuses ="\n\tPlease distribute your bonuses"
                                               +"\n\tEnter a letter to distribute one point"
                                               +"\n\t\'a\' for attack"
                                               +"\n\t\'d\' for defense"
                                               +"\n\t\'m\' for magic attack"
                                               +"\n\t\'f\' for magic defense"
                                               +"\n\t\'h\' for health points one point buys five health points"
                                               +"\n\t\'p\' for magic points  one point buys five magic points"
                                               +"\n\tYou have " + points + " points remaining"
                                               +"\n\t\'quit\' to exit";

    public void displayMenu() {
        
            char selection;
            
            do {
            
            System.out.println(DistributeBonuses);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

            }while (points > 0);
        }               
        

        public String getInput() {
        
            boolean valid = false;
            String input = null;
        
            while(!valid){
            
                System.out.println("\tPlease choose option");
            
                input = keyboard.nextLine();
                input = input.trim();                
                
                if(input.toUpperCase().equals("QUIT")){
                    return null;
                }
                           
                else {valid = true;
                
                }
                
            }
            return input;
        }
    
    public void doAction(char choice){
        
        switch (choice){
            case 'a':
                PlayerCharacterGenderControl pcMale = new PlayerCharacterGenderControl();
                pcMale.setPlayerCharacterGender();
                break;
            case 'd':
                PlayerCharacterGenderControl pcFemale = new PlayerCharacterGenderControl();
                pcFemale.setPlayerCharacterGender();
                break;
            case 'm':
            case 'q':
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
}
    

