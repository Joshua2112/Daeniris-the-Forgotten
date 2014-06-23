/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCGenderControl;
import byui.CIT260.DaenirisTheForgotten.Control.PCStatsControl;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EnterGenderView {
    
    Scanner keyboard = new Scanner(System.in);
    
        private final String ENTERGENDER ="\n\tPlease choose a gender for your hero"
                                         +"\n\tMale or Female";
        
        public void displayMenu(){

            String selection;
            
            do {
            
            System.out.println(ENTERGENDER);

            String input = this.getInput();
            selection = input;

            this.doAction(selection);
            
            if (selection.equals("MALE")){
                return;
            }
            else if (selection.equals("FEMALE")){
                return;
            }

            }while (!selection.equals("NEXT"));
            
        }               
        

        public String getInput() {
        
            boolean valid = false;
            String input = null;
        
            while(!valid){
            
                System.out.println("\n\tPlease choose option");
            
                input = keyboard.nextLine();
                input = input.trim();
                input = input.toUpperCase();
                
                if(input.toUpperCase().equals("NEXT")){
                    return input;
                }
                           
                else {valid = true;
                
                }
                
            }
            return input;
        }
    
    public void doAction(String choice){
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        Actor[][] actor = game.getActor();
    
        PlayerCharacter player = ((PlayerCharacter) actor[0][0]);
        
        switch (choice){
            case "MALE":
                PCStatsControl.setGender(player, choice);
                break;
            case "FEMALE":
                PCStatsControl.setGender(player, choice);
                break;
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
        }
               
    }
    
}
    

