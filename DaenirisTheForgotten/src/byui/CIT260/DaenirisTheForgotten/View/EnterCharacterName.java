/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EnterCharacterName extends View{

    public EnterCharacterName() {
        super("Please enter the name of your character");
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            System.out.println("\n\tPlease choose option");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if (input.equals("Q")){
                return input;
            }                           
            else{
                valid = true;
            }
        }
        return input;
        }
    
    @Override
    public void doAction(String choice){
        
         switch (choice){
            case "Q":
                return;
            default:
                
                break;
        }
    

            
    
}
