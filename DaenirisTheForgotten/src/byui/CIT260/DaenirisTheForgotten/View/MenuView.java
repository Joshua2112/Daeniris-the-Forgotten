/*********************************************************************
 * MenuView SuperClass for all menus
 * Author: Nathan Wittmann
 * Displays Menu and gets/returns input
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import java.util.Scanner;


public class MenuView {
        
    public void displayMenu(String menu){

        char selection = ' ';
        do {
            
            System.out.println(menu);
            
            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

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
    
    public void doAction(char choice){
        
    }
    
    public void displayTabular(Game game, TabularMenu tab){
        
        Inventory[][] inventory = game.getInventory();
        Spells[][] spells = game.getSpells();
        CraftRecipe[][] crafts = game.getCraftRecipe();
        Actor[][] actors = game.getActor();
     
        //Display menu title
        System.out.println(tab.getDisplayName());
        
        //Display Column Headers
        for(int i = 0; i < tab.getColumnCount(); i++){
            System.out.printf( "%-" + tab.getColumnWidth() + "s"
                    , tab.getHeader()[i]);
        }
        System.out.print("\n");
        
        //Create header lines
        String line = "";
        for (int i = 0; i < (tab.getColumnWidth() / 2); i++){
            line = line.concat("-");
        }
        //Display Column Headers Lines
        for(int i = 0; i < tab.getColumnCount(); i++){
            System.out.printf( "%-" + tab.getColumnWidth() + "s", line);
        }
        System.out.print("\n");
        
        //Display the lists of inventory in their columns
        for(int i = 0; i < tab.getRowCount(); i++){
            for(int j = 0; j < tab.getColumnCount(); j++){
                if (tab.getType() == 1){
                    if (tab.isHideInventory() && inventory[j][i].getQuantity() == 0){
                        System.out.printf( "%-" + tab.getColumnWidth() + "s"
                                , "");
                    }
                    else{
                        System.out.printf( "%-" + tab.getColumnWidth() + "s"
                                , inventory[j][i].getName() 
                                  + "(" + inventory[j][i].getQuantity() + ")");
                    }
                }
                else if(tab.getType() == 2){
                    System.out.printf( "%-" + tab.getColumnWidth() + "s"
                                , spells[j][i].getSpellName()
                                  + "(" + spells[j][i].getMagicCost()+ ")");
                }
                else if(tab.getType() == 3){
                    System.out.printf( "%-" + tab.getColumnWidth() + "s"
                                , spells[j][i].getSpellName()
                                  + "(" + inventory[j][i].getQuantity() + ")");
                }
                else if(tab.getType() == 4){
                    System.out.printf("%-" + tab.getColumnWidth() + "s"
                                , actors[j][i].getName());
                }
            }
            System.out.print("\n");
        }
    }
    
}
