/*********************************************************************
 * MenuView SuperClass for all menus
 * Author: Nathan Wittmann
 * Displays Menu and gets/returns input
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import java.util.Scanner;


public class MenuView {
    public void displayMenu(String menu, Game game){

        char selection = ' ';
        do {
            
            System.out.println(menu);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection, game);

        }while (selection != 'Q');
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
            


            if (input.equals("Q")){

                return input;
            }
                           
            else{
                valid = true;
            }
        }
        return input;
        }
    
    public void doAction(char choice, Game game){
        
    }
    
    public void display(Game game){}
    
}
