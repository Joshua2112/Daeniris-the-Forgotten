/*********************************************************************
 * MenuView SuperClass for all menus
 * Author: Nathan Wittmann
 * Displays Menu and gets/returns input
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
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
    
    public void displayTabular(Inventory[][] listDisplay, TabularMenu inventoryTab){
        
        
        //Display menu title
        System.out.println(inventoryTab.getDisplayName());
        
        //Display Column Headers
        for(int i = 0; i < inventoryTab.getColumnCount(); i++){
            System.out.printf( "%-" + inventoryTab.getColumnWidth() + "s"
                    , inventoryTab.getHeader()[i]);
        }
        System.out.print("\n");
        
        //Create header lines
        String line = "";
        for (int i = 0; i < (inventoryTab.getColumnWidth() / 2); i++){
            line = line.concat("-");
        }
        //Display Column Headers Lines
        for(int i = 0; i < inventoryTab.getColumnCount(); i++){
            System.out.printf( "%-" + inventoryTab.getColumnWidth() + "s", line);
        }
        System.out.print("\n");
        
        //Display the lists of inventory in their columns
        for(int i = 0; i < inventoryTab.getRowCount(); i++){
            for(int j = 0; j < inventoryTab.getColumnCount(); j++){
                if (inventoryTab.isHideInventory() && listDisplay[j][i].getQuantity() == 0){
                    System.out.printf( "%-" + inventoryTab.getColumnWidth() + "s"
                            , "");
                }
                else{
                    System.out.printf( "%-" + inventoryTab.getColumnWidth() + "s"
                            , listDisplay[j][i].getName() 
                              + "(" + listDisplay[j][i].getQuantity() + ")");
                }
            }
            System.out.print("\n");
        }
    }
    
}
