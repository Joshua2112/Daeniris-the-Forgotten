/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.PCJobControl;
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
class EnterJobView {
    
    String job = null;
    Scanner keyboard = new Scanner(System.in);
    
        private final String ENTERCLASS  ="\n\tPlease choose a class for your hero"
                                         +"\n\tWarrior, Mage, or Cleric";
        
    public void display() {
        
        String selection;
       
        do{
        System.out.println(ENTERCLASS);
        
        String input = this.getInput();
            selection = input;

            this.doAction(selection);
            
            if (selection.equals("WARRIOR")){
                return;
            }
            if (selection.equals("MAGE")){
                return;
            }
            if (selection.equals("CLERIC")){
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
            
                if (input.equals("NEXT")){
                    return input;
                }
                           
                else{
                    valid = true;
                }
            }
            return input;
        }
    
    public void doAction(String choice){
        
            Game game = DaenirisTheForgotten.getCurrentGame();
            Actor[][] actor = game.getActor();
    
            PlayerCharacter player = ((PlayerCharacter) actor[0][0]);
        
        switch (choice){
            case "WARRIOR":
                PCStatsControl.setJob(player, choice);
                break;
            case "MAGE":
                PCStatsControl.setJob(player, choice);
                break;
            case "CLERIC":
                PCStatsControl.setJob(player, choice);               
            default:
                System.out.println("\n\tInvalid selection, try again");
                break;
        }
               
    }
}
    

