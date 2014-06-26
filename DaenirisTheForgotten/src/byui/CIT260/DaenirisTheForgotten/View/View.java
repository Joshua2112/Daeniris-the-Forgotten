/*********************************************************************
 * MenuView SuperClass for all menus
 * Author: Nathan Wittmann
 * Displays Menu and gets/returns input
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.View;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;


public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
        
    @Override
    public void display(){
 
        String value;
        do {
            System.out.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);

        }while (!value.equals("Q"));
    }               

    /*public void display(String menu){
        
        String selection = " ";
        String quit = "Q";
        
        boolean exit = false;
        do {
            
            System.out.println(menu);
            
            selection = this.getInput();

            this.doAction(selection);

            
            if(selection.compareToIgnoreCase(quit) == 0){
            exit = true;
        }
            
        }while (!exit);
    }    */
    
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
    
    //public void doAction(char choice){}
    public void doAction(String choice){}
    
    public void displayTabular(TabularMenu tab){
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        
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
                                , crafts[j][i].getCraftName());
                }
                else if(tab.getType() == 4){
                    System.out.printf("%-" + tab.getColumnWidth() + "s"
                                , actors[j][i].getName());
                }
                else if(tab.getType() == 5){
                    System.out.printf("%-" + tab.getColumnWidth() + "s"
                                , spells[j][i].getSpellName());
                }
            }
            System.out.print("\n");
        }
    }
    
}
